package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private String rectangle;
        int width = 0;
        int heigth = 0;
        String top = "FA";


        public Rectangle (String left, String  top, int width, int heigth)
        {
            this.rectangle = left + top + width + heigth;
        }
        public Rectangle (String left, String top)
        {
            this.rectangle = left + top + width + heigth;
        }
        public Rectangle (String left, String top, int width)
        {
            int heigth = width;
            this.rectangle = left + top + width + heigth;
        }
        public Rectangle (String left, int width, int heigth )
        {
            this.rectangle = left + top + width + heigth;
        }

}
