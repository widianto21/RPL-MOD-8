package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int jum = scn.nextInt();
        fibo(jum);
    }
    
    public static void fibo(int jum){
        int arr[] = new int[jum];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < jum; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        for(int i = 0; i < jum; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
