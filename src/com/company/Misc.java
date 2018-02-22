package com.company;

/**
 * Created by User on 10.02.2018.
 */

public class Misc {

    public static final String text = "Static works!";

    public static <T extends Number> double lab2z1(T a, T b, int deg) {
        return Math.pow((Double) a,deg) - Math.pow((Double) b,deg);
    }

    public static int lab2z2(char a, char b) {
        return a + b;
    }

    public static int lab2z3(char a, char b) {
        return a - b;
    }

    public static void lab3z1() {
        int[] xx = new int[10];
        for (int i = 0; i < xx.length; i++) {
            xx[i] = i;
        }
        for (int i = 0; i < xx.length; i++) {
            System.out.println(xx[i]);
        }
    }

    public static void lab3z2() {
        int[][] xx = new int [5][5];
        for(int i = 0; i < xx.length; i++) {
            for (int j = 0; j < xx[i].length; j ++) {
                xx[i][j] = i + j;
            }
        }
        for (int i = 0; i < xx.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < xx[i].length; j++) {
                System.out.println(xx[i][j]);
            }
        }
    }

    public static void lab3z3() {
        int a = 1;
        int b = 2;
        System.out.println("a = " + a + "; b = " + b);
        System.out.println("Сдвиг вправо с заполнением нулями a>>>b: " + (a>>>b));
        System.out.println("Сдвиг влево с присваиванием a <<= b: " + (a <<= b));
        System.out.println("Побитовое исключающее ИЛИ (XOR) с присваиванием a ^= b:  " + (a ^= b));
        System.out.println("Побитовое И (AND) a & b: " +  (a & b));
        System.out.println("Побитовое унарное отрицание (NOT) ~a: " + (~a));
    }

    public  static  boolean  lab3z4 (int a , int b) {
       return a > b && a > 0 || a > 10? true : false;
    }

    public static void lab3z5() {
        int a = 2;
        if(a > 0) {
            System.out.println("if works");
        }
        for(int i = 0 ; i < a ; i++) {
            System.out.println("for works");
        }
        while(a > 0) {
            System.out.println("while works");
            a--;
        }

        do {
            a++;
            System.out.println("do while works");
        } while (a!= 2);

        switch (a) {
            case 0: {
                System.out.println("Switch case works and a == 0");
            }
            case 1: {
                System.out.println("Switch case works and a == 1");
            }
            case 2: {
                System.out.println("Switch case works and a == 2");
            }
            default: {
                System.out.println("Switch case works");
            }
        }
    }

    public static void lab9z1 () {
        String s01 = new String(); // empty String
        System.out.println("s01.length = " + s01.length());

        char[] cs = { '0', '1', '2', '3', '4', '5', '6', '7' };
        String s02 = new String(cs);
        System.out.println("s02.length = " + s02.length() + " s02 = " + s02);

        String s03 = new String(cs, 3, 5);
        System.out.println("s03.length = " + s03.length() + " s03 = " + s03);

        String s04 = "01234567";
        System.out.println("s04.length = " + s04.length() + " s04 = " + s04);

        String s05 = new String("01234567");
        System.out.println("s5.length = " + s05.length() + " s05 = " + s05);
        //-----
        System.out.println("\"01234567\".lenght = " + "01234567".length());
        //-----
        String s06 = new String("01234567");
        for (int i = 0; i < s06.length(); i++) {
            System.out.println(s06.charAt(i)
            + ((i < s06.length() -1) ? "-" : ""));
        }
        System.out.println("");
        char[] cs1 = new char[6 - 2];
        s06.getChars(2,6,cs1,0);
        for (int i = 0; i < cs1.length; i++) {
            System.out.println(cs1[i] + ((i < cs1.length - 1) ? "-" : ""));
        }
        //-----
        String s07 = new String("01234567");
        String s08 = new String("01234567");
        System.out.println("(s07 == s08) = " + (s07 == s08));
        System.out.println("(s07 == \"01234567\") = " + (s07 == "01234567"));
        System.out.println("s07.equals(s08) = " + s07.equals(s08));
        String s09 = s08;
        System.out.println("(s08 == s09) = " + (s08 == s09));
        //-----
        String s10 = new String("Человека невозможно чему-нибудь научить, его нужно убедить");
        System.out.println(s10.indexOf('j'));
        System.out.println(s10.indexOf('o'));
        System.out.println(s10.lastIndexOf('o'));
        System.out.println(s10.indexOf('o',5));
        System.out.println(s10.lastIndexOf('o',5));
        System.out.println(s10.lastIndexOf('o',14));
        //-----
        String s11 = new String("Лучший вид на этот город, если сесть в бомбардировщик");
        System.out.println(s11.substring(26));
        System.out.println(s11.substring(26,30));
        //-----
        String s12 = new String("Оффтопик - любое сетевое сообщение " +
                                    "выходящее за рамки ранее установленной темы");
        System.out.println(s12.replace('ф', 'f'));
        System.out.println(s12.toUpperCase());
        System.out.println(s12.toLowerCase());
        //-----
        StringBuffer s15 = new StringBuffer(100);
        s15.append("В городе Сочи темные ночи");
        System.out.println("s15.length() = " + s15.length());
        System.out.println("s15.capacity() = " + s15.capacity());
        s15.insert(21, "и теплые");
        System.out.println(s15);
        System.out.println("s15.length() = " + s15.length());
        System.out.println("s15.capacity() = " + s15.capacity());
        s15.delete(21,30);
        System.out.println(s15);
        s15.ensureCapacity(200);
        System.out.println("s15.capacity() = " + s15.capacity());
        String s16 = s15.toString();
        //------
        Byte x1 = 3;
        Short x2 = 256;
        Integer x3 = 1000;
        Float x4 = 3.14f;
        Double x5 = 2.9e10;
        Long x6 = 2000000L;
        Character x7 = 'f';
        Boolean x8 = true;
    }

    public enum Planet {
        MERCURY(1,1),
        VENUS(1,1),
        EARTH(1,1),
        MARS(1,1),
        JUPITER(1,1),
        SATURN(1,1),
        URANUS(1,1),
        NEPTUN(1.024e+26, 2.477e+07);
        final double mass;
        final double radius;
        final double gravity;
        static final double G = 6.673000e-11;
        Planet (double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
            this.gravity = G*mass/(radius*radius);
        }
    }

    public enum Fruits {
        Apple(256),
        Orange(123),
        Ananas(115),
        Banana(70);
        final int calories;
        Fruits(int calories) {
            this.calories = calories;
        }
    }



}
