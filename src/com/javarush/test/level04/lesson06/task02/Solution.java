package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        String number4 = reader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int d = Integer.parseInt(number4);

    if (a > b && a > c && a > d) {
        System.out.println(a);
    }
        else if (b > a && b > c && b > d) {
        System.out.println(b);
    }
        else if (c > b && c > a && c > d) {
        System.out.println(c);
    }
        else if (d > a && d > c && d > b) {
        System.out.println(d);
    }
    }


}
