package com.liumou.homework5.small3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class idCard2 {
    public static void main(String[] args) {
        String id = "412726200310080074"; // 请将其替换为实际的身份证号码

        Map<String, String> info = parseID(id);
        if (info != null) {
            System.out.println("出生年月日：" + info.get("出生年月日"));
            System.out.println("性别：" + info.get("性别"));
            System.out.println("省份：" + info.get("省份"));
        } else {
            System.out.println("无法解析身份证号码信息！");
        }
    }

    private static Map<String, String> parseID(String id) {
        Map<String, String> info = new HashMap<>();

        // 正则表达式提取信息
        String regex = "(\\d{6})(\\d{8})(\\d{4})(\\d{1})(\\d{1})(\\d{2})(\\d{1})([0-9Xx])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);

        if (matcher.matches()) {
            String birthday = matcher.group(2);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            try {
                Date date = dateFormat.parse(birthday);
                SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
                info.put("出生年月日", newDateFormat.format(date));
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }

            int genderCode = Integer.parseInt(matcher.group(4));
            String gender = (genderCode % 2 == 0) ? "女" : "男";
            info.put("性别", gender);

            String provinceCode = id.substring(0, 2);
            String province = getProvinceByCode(provinceCode);
            info.put("省份", province);

            return info;
        } else {
            return null;
        }
    }

    private static String getProvinceByCode(String code) {
        // 简单示例，实际中需使用完整的省份对照表
        Map<String, String> provinces = new HashMap<>();
        provinces.put("11", "北京");
        provinces.put("12", "天津");
        provinces.put("13", "河北");
        provinces.put("14", "山西");
        provinces.put("15", "内蒙古");
        // 添加更多省份...

        return provinces.get(code);
    }
}
