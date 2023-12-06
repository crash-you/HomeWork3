package com.liumou.ModelHomework.model4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectAddEquation {
    public static void main(String[] args) {
        String className = "com.liumou.ModelHomework.model4.AddEquation";
        try {
            // 使用反射获取类对象
            Class<?> addEquationClass = Class.forName(className);

            // 输出类的字段信息
            System.out.println("Fields of AddEquation:");
            //获取实例字段
            Field[] fields = addEquationClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }

            // 输出类的方法信息
            System.out.println("\nMethods of AddEquation:");
            //获取方法名
            Method[] methods = addEquationClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            // 获取该类的构造方法，使用无参构造方法创建实例
            Constructor<?> constructor = null;
            try {
                constructor = addEquationClass.getDeclaredConstructor(short.class, short.class, char.class);
            } catch (NoSuchMethodException ex) {
                throw new RuntimeException(ex);
            }
            AddEquation addEquationInstance = (AddEquation) constructor.newInstance((short) 10, (short) 20, '+');

            // 调用 calculate 方法计算结果
            int result = addEquationInstance.calculate();
            System.out.println("\nCalculation Result: " + result);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

