package com.liumou.homework3.BookSystem;

public class Book {
        private int id;    // 编号
        private String name;  // 书名
        private double price;  // 价格
        private int storage;   // 库存

        // 有参构造
        public Book(int id, String name, double price, int storage) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.storage = storage;
        }

        public Book() {
        }

        // 获取书号
        public int getId() {
            return id;
        }

        // 获取书名
        public String getName() {
            return name;
        }

        // 获取价格
        public double getPrice() {
            return price;
        }

        // 获取库存
        public int getStorage() {
            return storage;
        }

        /**
         * 设置
         * @param id
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * 设置
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 设置
         * @param price
         */
        public void setPrice(double price) {
            this.price = price;
        }

        /**
         * 设置
         * @param storage
         */
        public void setStorage(int storage) {
            this.storage = storage;
        }

        public String toString() {
            return "Book{id = " + id + ", name = " + name + ", price = " + price + ", storage = " + storage + "}";
        }
    }

