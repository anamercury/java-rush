package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Taras";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Nastia";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Naastia";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Nasstia";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Nnastia";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Nnnastia";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Nastiiia";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Naustia";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Naskktia";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Nastkkpia";

        Protos protos1 = new Protos();
        protos1.name = "1";
        Protos protos2 = new Protos();
        protos2.name = "2";
        Protos protos3 = new Protos();
        protos3.name = "3";
        Protos protos4 = new Protos();
        protos4.name = "4";
        Protos protos5 = new Protos();
        protos5.name = "5";

        Terran terran1 = new Terran();
        terran1.name = "12";
        Terran terran2 = new Terran();
        terran2.name = "13";
        Terran terran3 = new Terran();
        terran3.name = "14";
        Terran terran4 = new Terran();
        terran4.name = "15";
        Terran terran5 = new Terran();
        terran5.name = "16";
        Terran terran6 = new Terran();
        terran6.name = "17";
        Terran terran7 = new Terran();
        terran7.name = "18";
        Terran terran8 = new Terran();
        terran8.name = "19";
        Terran terran9 = new Terran();
        terran9.name = "20";
        Terran terran10 = new Terran();
        terran10.name = "21";
        Terran terran11 = new Terran();
        terran11.name = "22";
        Terran terran12 = new Terran();
        terran12.name = "23";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}