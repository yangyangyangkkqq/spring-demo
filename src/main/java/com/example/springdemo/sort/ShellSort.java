package com.example.springdemo.sort;

import java.util.Arrays;

/**
 * 哈希排序
 * @author johnyang
 * @date 2019/10/1
 */
public class ShellSort {
    /**
     *希尔排序
     * 时间复杂度O(n²) 空间复杂度O(1)
     * @param array
     * @return
     */
    public static int[] shellSort(int[] array){
        int gap=array.length/2;
        for(;gap>0;gap=gap/2){
            //不断缩小gap，直到1为止
            for (int j=0;(gap+j)<array.length;j++){
                //使用当前gap进行组内插入排序
                for(int k=0;(k+gap)<array.length;k+=gap){
                    if(array[k]>array[k+gap]){
                        //交换操作
                        int temp=array[k];
                        array[k]=array[k+gap];
                        array[k+gap]=temp;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array={3,65,3,8,70,1,65,444,890,3,2,6,7,88,99,32,66};
        System.out.println(Arrays.toString(shellSort(array)));
    }
}
