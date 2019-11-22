package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int[] myArray; // объявление массива
        myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int

        int[] OrderArray; // объявление массива
        OrderArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int a = i+1;
            System.out.println("ВВедите "+ a);
            myArray[i] = scanner.nextInt();
        }





        for (int i = 0; i < 4; i++) {
            System.out.print(myArray[i] + " " );
        }
    }
}
