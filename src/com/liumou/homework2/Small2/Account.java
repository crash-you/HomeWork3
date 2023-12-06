package com.liumou.homework2.Small2;

public class Account {
    private String name;
    private String accountId;
    private double balance;
    private double annualInterestRate;

    //空参构造
    public Account() {
    }

    //有参构造
    public Account(String name, String accountId, double balance, double annualInterestRate) {
        this.name = name;
        this.accountId = accountId;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置
     * @param accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 获取
     * @return annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * 设置
     * @param annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String toString() {
        return "Account{name = " + name + ", accountId = " + accountId + ", balance = " + balance + ", annualInterestRate = " + annualInterestRate + "}";
    }

    //取钱方法
    public void withdraw(double amount){
        //进行判断能否取钱成功
        if (amount > balance){
            System.out.println("余额不足，取钱失败");
        }else {
            balance -=  amount;
            System.out.println("成功取出" + amount + "元");
        }
    }

    //存钱方法
    public void deposit(double amount){
        balance += amount;
        System.out.println("成功存入" + amount + "元");
    }
}
