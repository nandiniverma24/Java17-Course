package org.java17;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class javaUtilArraySortFillCopyOf {
    public static void main(String[] args) {
        int[] arr1=getRandomArray(10);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2=new int[10];
        Arrays.fill(arr2,10);
        System.out.println(Arrays.toString(arr2));

        int[] arr3=Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr3));

        int[] arr4=Arrays.copyOf(arr1,4);
        int[] arr5=Arrays.copyOf(arr1,15);
        int[] arr6=Arrays.copyOf(arr1,15);

        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        if(Arrays.binarySearch(arr5,97)>=0)
        {
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }

        if(Arrays.equals(arr5,arr6))
        {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }

    }

    public static int[] getRandomArray(int len)
    {
        Random random=new Random();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            //nextInt:exclusive upper bound for random numbers
            arr[i]=random.nextInt(100);
        }
        return arr;
    }
}