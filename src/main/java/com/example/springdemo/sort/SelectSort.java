package com.example.springdemo.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @author johnyang
 * @date 2019/10/1
 */
public class SelectSort {

    /**
     * 选择排序
     * 时间复杂度O(n²) 空间复杂度O(1)
     * @param array
     * @return
     */
    public static int[] selectSort(int[] array){//循环次数
        for(int i=0;i<array.length;i++){
            int min=array[i];//等会用来放最小值
            int index=i;//用来放最小值的索引
            for(int j=i+1;j<array.length;j++){//找到最小值
                if(array[j]<min){
                    min=array[j];
                    index=j;
                }
            }
            //内层循环结束后进行交换
            array[index]=array[i];//当前值放到最小值所在位置
            array[i]=min;//当前位置放最小值
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array={3,65,3,8,70,1,65,444,890,3,2,6,7,88,99,32,66};
        System.out.println(Arrays.toString(selectSort(array)));
    }
}
