package org.java17;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[5]=50;
        double[] arr1= new double[10];
        arr1[2]=20.6;
        System.out.println(arr1[2]);
        //anonymous array initializer
        int[] arr2={1,2,3,4,5,6};
        System.out.println(arr2[2] + " " + arr2.length+" "+arr2[arr2.length-1]);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
        int[] arr4=new int[10];
        for(int i=0;i<arr4.length;i++)
        {
            arr4[i]=arr4.length-i;
            System.out.println(arr4[i]);
        }
        for(int x:arr4)
        {
            System.out.println("x = "+x);
        }
        System.out.println(Arrays.toString(arr4));
    }
}