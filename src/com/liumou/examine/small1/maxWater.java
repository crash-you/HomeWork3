package com.liumou.examine.small1;

public class maxWater {
    public static void main(String[] args) {
        // 示例输入
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        // 调用函数计算最大水量
        int result = maxArea(height);
        // 输出最大水量
        System.out.println("最大水量为：" + result);
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        // 采用双指针法，不断更新左右指针，直至相遇
        while (left < right) {
            // 计算当前容器能够容纳的水量
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // 更新最大水量
            maxArea = Math.max(maxArea, currentArea);
            // 更新指针
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }


}
