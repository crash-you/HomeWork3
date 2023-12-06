package com.liumou.homework2.Small5.com.ncwu.userdefinelib;

public class CDate {

    private int year;
    private int month;
    private int day;


    public CDate() {
    }

    public CDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * 获取
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * 设置
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * 获取
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * 设置
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * 获取
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * 设置
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return "CDate{year = " + year + ", month = " + month + ", day = " + day + "}";
    }
}
