package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);

        if (a < b)
        {
            if (b < c)
                System.out.println(c + " " + b + " " + a);
            else
            {
                if (a > c)
                    System.out.println(b + " " + a + " " + c);
                else
                    System.out.println(b + " " + c + " " + a);
            }
        } else
        {
            if (b > c)
                System.out.println(a + " " + b + " " + c);
            else
            {
                if (a > c)
                    System.out.println(a + " " + c + " " + b);
                else
                    System.out.println(c + " " + a + " " + b);
            }

        }

    }
}