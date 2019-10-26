package com.example.springdemo.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author johnyang
 * @date 2019/10/1
 */
public class BubbleSort {

    /**
     * 冒泡排序：两两比较，大者交换位置,则每一轮循环结束后最大的数就会移动到最后.
     * 时间复杂度为O(n²) 空间复杂度为O(1)
     * @param array
     * @return
     */
    private static int[] bubbleSort(int[] array){
        if(array.length==0){
            return array;
        }
        //外层循环length-1次
        for(int i=0;i<array.length-1;i++){
            //外层每循环一次最后都会排好一个数
            //所以内层循环length-1-i次
            for (int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array={3,65,3,8,70,1,65,444,890,3,2,6,7,88,99,32,66};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
