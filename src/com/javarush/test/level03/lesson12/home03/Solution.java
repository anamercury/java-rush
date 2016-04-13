package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader dollars = new BufferedReader(new InputStreamReader(System.in));

        String smoney = dollars.readLine();
        int mmoney = Integer.parseInt(smoney);

        System.out.println("Я буду зарабатывать $"+mmoney+" в час");
    }
}