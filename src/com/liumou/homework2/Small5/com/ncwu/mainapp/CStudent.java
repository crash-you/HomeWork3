package com.liumou.homework2.Small5.com.ncwu.mainapp;

import com.liumou.homework2.Small5.com.ncwu.userdefinelib.CDate;

public class CStudent {

    private String sno;
    private String sname;
    private CDate sdate;
    private static int count = 0;   //统计学生对象个数

    //在空参和无参构造最后count++便可以统计出学生的个数
    public CStudent() {
        count++;
    }

    public CStudent(String sno, String sname, CDate sdate) {
        this.sno = sno;
        this.sname = sname;
        this.sdate = sdate;
        count++;
    }

    /**
     * 获取
     * @return count
     */
    public static int getCount() {
        return count;
    }

    /**
     * 获取
     * @return sno
     */
    public String getSno() {
        return sno;
    }

    /**
     * 设置
     * @param sno
     */
    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * 获取
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * 获取
     * @return sdate
     */
        public CDate getSdate() {
        return sdate;
    }

    /**
     * 设置
     * @param sdate
     */
    public void setSdate(CDate sdate) {
        this.sdate = sdate;
    }

    public String toString() {
        return "CStudent{sno = " + sno + ", sname = " + sname + ", sdate = " + sdate + ", count = " + count + "}";
    }
}
