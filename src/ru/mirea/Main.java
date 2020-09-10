package ru.mirea;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Task 3
        /*
        int [] arr = new  int [10];
        for( int i=0;i<9;i++){
            System.out.print("MASS"+ arr[i] + " ");
        }
        System.out.println();
        for( int i=0;i<9;i++){
            arr[i]=i+3;
        }
        int sum=0;
        for(int i=0;i<9;i++){
            sum= sum + arr[i];
        }
        System.out.println("FOR:" + sum);
        sum=0;
        int k =0;
        while(k<9){
            k++;
            sum=sum+arr[k];
        }
        System.out.println("WHILE:" + sum);
        k=0;
        sum=0;
        do {
            sum=sum+arr[k];
            k++;
        } while (k<9);
        System.out.println("DO WHILE:" + sum);
         */
        //Task 4
        /*
        for (string cmd : args) {
            System.out.println(cmd);
        }
         */
        //Task 5
        /*
        double a =0;
        for(double n=1;n<=10;n++) {
            a=(1/n);
            System.out.format("%.2f%n", a);
        */
        //Task 6
        /*
        //Math.random
        int [] arr = new  int [10];
        int num1 = 0;
        int num2 = 100;

        for ( int i=0;i<9;i++){
        int a = num1 + (int) (Math.random() * num2);
        arr[i]=a;
        }

        for( int i=0;i<9;i++){
            System.out.print(arr[i] + " ");
        }
System.out.println();
        // Сортировка
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        for( int i=0;i<9;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Class Random
        Random rnd = new Random();
        for(int i = 0; i < 9; i++){
            int number = rnd.nextInt(6) + 1;
            arr[i]=number;
        }
        for( int i=0;i<9;i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println();
        for( int i=0;i<9;i++){
            System.out.print(arr[i] + " ");
        }
        */
        //Task 7
        /*
        int result=1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <=n; i ++) {
            result = result * i;
        }
        System.out.println(result);
         */
    }
}