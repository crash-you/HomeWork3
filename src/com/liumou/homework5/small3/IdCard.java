package com.liumou.homework5.small3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdCard {
    public static void main(String[] args) {
        String idCardNumber = "412726200310080074"; // 请替换成你要验证的身份证号码
        parseIDCard(idCardNumber);
    }

    public static void parseIDCard(String idCard) {
        // 正则表达式用于匹配身份证号码的不同部分
        String regex = "([1-9]\\d{5})" +        //表示第一个不能是0，后面5个为任意数字。整体表示身份证的前6位
                "((18|19|20)\\d{2})" +          //年的前两位，18年或19年或20年之后出生的  年的后两位，为任意数字
                "((0[1-9])|(1[0-2]))" +         //月份 ->01-09  10 11 12
                "(0[1-9]|[12]\\d|3[01])" +      //日期 ->01-09 10-29 30 31
                "(\\d{3})[0-9Xx]";                //后四位：前三位为任意，最后一位为0-9或大小写x
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(idCard);

        //find 方法将在文本字符串中查找所有与模式 "regex" 匹配的子字符串，并打印出每个匹配的起始位置和结束位置。
        if (matcher.find() && idCard.length() == 18) {
            String provinceCode = idCard.substring(0, 2); // 截取省份代码
            // 这里省份代码的解析可以根据你的实际需求来处理
            String province = getProvinceByCode(provinceCode);

            //group 方法用于获取与最后一次匹配操作相匹配的子序列。在 Matcher 类中定义的。
            //当在 Matcher 对象上调用 find 方法之后，如果找到了匹配项，可以使用 group 方法来检索匹配项
            //group索引规则，以小括号为一组，大括号大于小括号，
            //如((0[1-9])|(1[0-2]))中，group（1）为整个式子整体 group（2）为(0[1-9]) 同理可推
            String birthday = matcher.group(2) + "-" + matcher.group(4) + "-" + matcher.group(7); // 出生年月日
            String gender = Integer.parseInt(matcher.group(8)) % 2 == 0 ? "女" : "男"; // 性别，奇数为男性，偶数为女性

            System.out.println("省份: " + province);
            System.out.println("出生年月日: " + birthday);
            System.out.println("性别: " + gender);
        } else {
            System.out.println("无效的身份证号码。");
        }
    }

    public static String getProvinceByCode(String code) {
        // 省份代码解析可以根据具体需求实现
        // 这里仅提供一个简单的示例
        switch (code) {
            case "11":
                return "北京市";
            case "12":
                return "天津市";
            case "13":
                return "河北省";
            case "41":
                return "河南省";
            // 其他省份的映射
            default:
                return "未知省份";
        }
    }
}
