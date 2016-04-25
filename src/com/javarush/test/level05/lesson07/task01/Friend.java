package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String friendname = null;
    public void initialize(String name)
    {
        this.friendname = name;
    }
    public void initialize(int age, String name)
    {
        this.friendname = age + name;
    }
    public void initialize(String sex, int age, String name)
    {
        this.friendname = sex + age + name;
    }

}
