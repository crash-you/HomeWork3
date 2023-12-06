package com.liumou.examine.small7;

public class test {
    public static void main(String[] args) {
        SimulateQueues simulateQueues = new SimulateQueues();
        simulateQueues.put("1");
        simulateQueues.put("2");
        simulateQueues.put("3");
        simulateQueues.put("4");
        simulateQueues.put("5");
        simulateQueues.put("6");
        simulateQueues.put("7");
        simulateQueues.put("8");
        simulateQueues.put("9");
        simulateQueues.put("10");
        simulateQueues.put("11");
        simulateQueues.put("14");
        simulateQueues.put("41");
        simulateQueues.put("43");
//        simulateQueues.put("44");
        System.out.println(simulateQueues.size());
        System.out.println(simulateQueues.get());
    }
}
