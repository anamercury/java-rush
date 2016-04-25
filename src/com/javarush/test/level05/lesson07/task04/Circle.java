package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private String circle;

    public void initialize (String centerX, String  centerY, int radius)
    {
        this.circle = centerX + centerY + radius;
    }
    public void initialize (String centerX, String centerY, int radius, int width)
    {
        this.circle = centerX + centerY + radius + width;
    }
    public void initialize (String centerX, String centerY, int radius, int width, String color)
    {
        this.circle = centerX + centerY + radius + width + color;
    }


}
