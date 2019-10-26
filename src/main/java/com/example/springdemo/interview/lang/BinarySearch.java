package com.example.springdemo.interview.lang;

/**
 * 二分查找
 */
public class BinarySearch {
    /**
     * 循环二分查找
     * @param arr
     * @return
     */
    public int binarySearchLang(int[] arr,int k){
        int a=0;
        int b=arr.length;
        while (a<b){
            //可能会溢出
//            int m=(a+b)/2;
            int m=a+(b-a)/2;
            if(k<arr[m]){
                b=m;
            }else if(k>arr[m]){
                a=m+1;
            }else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search=new BinarySearch();
        System.err.println(search.binarySearchLang(new int[]{1,2,6,15,34,100},15));
    }
}
