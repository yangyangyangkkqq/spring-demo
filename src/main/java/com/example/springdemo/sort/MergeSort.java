package com.example.springdemo.sort;

import java.util.Arrays;

/**
 * 归并排序
 * @author johnyang
 * @date 2019/10/2
 */
public class MergeSort {

    public static int[] mergeSort(int[] array){
        if(array.length<2){
            return array;
        }
        int mid=array.length/2;
        int[] left=Arrays.copyOfRange(array,0,mid);
        int[] right=Arrays.copyOfRange(array,mid,array.length);
        return merge(mergeSort(left),mergeSort(right));
    }

    /**
     * 归并排序--将两段排序好的数组结合成一个排序数组
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left,int[] right){
        int[] result=new int[left.length+right.length];
        for (int index=0,i=0,j=0;index<result.length;index++){
            if(i>=left.length){
                result[index]=right[j++];
            }else if(j>=right.length){
                result[index]=left[i++];
            }else if(left[i]>right[j]){
                result[index]=right[j++];
            }else{
                result[index]=left[i++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array={3,65,3,8,70,1,65,444,890,3,2,6,7,88,99,32,66};
        System.out.println(Arrays.toString(mergeSort(array)));
    }
}
