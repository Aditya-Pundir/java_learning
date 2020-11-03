package com.company;

public class Practice_Set_6 {
    public static void main(String[] args) {

//  Q1.   Create an array of 5 floats and calculate their sum

//  Ans.  float[] marks = {67.2f, 38.4f, 69.9f, 98.1f,};
//        float sum = 0;
//        for (float element : marks) {
//            sum = sum + element;
//        }
//        System.out.println("The value of sum is " + sum);

//  Q2.   Write a program to find out whether a given integer is present in an array or not

// Ans.   float[] marks = {67.2f, 38.4f, 69.9f, 98.1f,};
//        float num = 67.2f;
//        boolean isInArray = false;
//        for (float element : marks) {
//            if (num == element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("Yes, the value is present in the array");
//        }
//        else {
//            System.out.println("No, the value is not present in the array");
//        }

// Q3.    Calculate the average marks from an array containing marks of all students in physics using foreach loop

// Ans.   float[] marks = {67.2f, 38.4f, 69.9f, 98.1f,};
//        float sum = 0;
//        for (float element : marks) {
//            sum = sum + element;
//        }
//        System.out.println("The value of average marks is " + sum/ marks.length);

// Q4.    Create a java program to add 2 matrices of size 2x3

// Ans.   int [][] mat1 = {{1,2,3},
//                          {4,5,6}};
//
//        int [][] mat2 = {{1,0,-1},
//                          {-1,-2,-3}};
//
//        int [][] result = {{0,0,0},
//                            {0,0,0}};
//        Printing the elements of a 2-D Array:
//
//        for (int i = 0; i< mat1.length; i++){ // Row number of times
//            for (int j = 0; j<mat1[i].length; j++){ // Column number of times
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println("");
//        }

//        Similarly 3x3 Matrices:

//        int [][] mt1 = {{12, 56, 84},
//                        {12, 56, 4},
//                         {39, 74, 5}};
//
//        int [][] mt2 = {{12, 56, 84},
//                        {12, 56, 4},
//                         {39, 74, 5}};
//
//        int [][] result = {{0,0,0},
//                            {0,0,0},
//                             {0,0,0}};
//
//        for (int i = 0; i<mt1.length; i++){ // Row number of times
//            for (int j = 0; j<mt1[i].length; j++){ // Column number of times
//                result[i][j] = mt1[i][j] + mt2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }

// Q5.    Write a java program to reverse an array

// Ans.   int [] arr = {1, 2, 3, 4, 5, 6};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        for (int i = 0; i<n; i++){
//
////            Swap a[i] and a[l-1-i]
//
//            int temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for (int element: arr) {
//            System.out.print(element + " ");
//        }

// Q6.    Write a java program to find the maximum element in an array

//        int [] arr = {12,21,53,340,56,73,89};
//        int max = 0;
//        for (int element:arr) {
//            if (element>max){
//                max = element;
//            }
//        }
//        System.out.println(max);

// Q7.    Write a java program to find the minimum element in an array

//        int [] arr = {2,21,53,123,56,73,89};
//        int min = Integer.MAX_VALUE;
//        for (int element:arr) {
//            if (element<min){
//                min = element;
//            }
//        }
//        System.out.println(min);

// Q8.    Write a java program to find whether an array is sorted or not

//        boolean isSorted = true;
//        int [] arr = {1,2,3,4,5,6,7};
//        for (int i = 0; i<arr.length-1; i++){
//            if (arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted){
//            System.out.println("The array is sorted");
//        }
//        else{
//            System.out.println("The array is not sorted");
//        }
    }
}
