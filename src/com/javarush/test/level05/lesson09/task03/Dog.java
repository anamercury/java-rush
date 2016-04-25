package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;

        public Dog(String name)
        {
            this.name = name;
        }
        public Dog(String name, int height)
        {
            this.name = height + name;
        }
        public Dog(String name, int height, String color)
        {
            this.name = color + height + name;
        }

}
