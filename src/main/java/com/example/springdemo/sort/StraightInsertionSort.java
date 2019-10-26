package com.example.springdemo.sort;

import java.util.Arrays;

/**
 * 直接插入排序
 * @author johnyang
 * @date 2019/10/1
 */
public class StraightInsertionSort {

    /**
     * 直接插入排序
     * 时间复杂度O(n²) 空间复杂度O(1)
     * @param array
     * @return
     */
    public static int[] straightInsertion(int [] array){
        //要插入的数
        int current;
        //从1开始 第一次一个数不需要排序
        for(int i=1;i< array.length;i++){
            current=array[i];
            //序列元素个数
            int j=i-1;
            while (j>=0&&array[j]>current){//从后往前循环，将大于当前插入数的向后移动
                //元素向后移动
                array[j+1]=array[j];
                j--;
            }
            //找到位置，插入当前元素
            array[j+1]=current;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array={3,65,3,8,70,1,65,444,890,3,2,6,7,88,99,32,66};
        System.out.println(Arrays.toString(straightInsertion(array)));
    }
}
