package com.company;

import com.company.laba4.CCC;
import com.company.laba4.DDD;
import com.company.laba8.Class;
import com.company.laba8.Exception1;
import com.company.laba8.Exception2;
import com.company.laba8.Exception3;
import com.company.level1.A;
import com.company.level1.Inheritance;
import com.company.level1.level2.B;
import com.company.level1.level2.C;
import com.company.level1.level2.level3.D;
import com.company.level1.level2.level3.level4.*;
import com.company.level1x.level2x.B2;
import com.company.level1x.level2x.C2;
import com.company.level1x.level2x.level3x.D2;
import com.company.level1x.level2x.level3x.level4x.E2;
import com.company.level1x.level2x.level3x.level4x.F2;
import level1m.Am;
import level1m.level2m.Bm;
import level1m.level2m.level3m.Cm;
import level1m.level2m.level3m.level4m.Dm;


public class Main {

    public static void main(String[] args) {
        System.out.println("\nLaba 2: \n");
        laba2();
        System.out.println("\nLaba 3: \n");
        laba3();
        System.out.println("\nLaba 4: \n");
        laba4();
        System.out.println("\nLaba 5: \n");
        laba5();
        System.out.println("\nLaba 7: \n");
        laba7();
        System.out.println("\nLaba 8:you should search exceptions in console! \n");
        laba8();
        System.out.println("\nLaba 9: \n");
        laba9();
    }

    private static void laba2() {
        int a = 3;
        int b = 2;
        float c = 1.7F;
        float d = 1.4F;
        System.out.println("int: " + (int)Misc.lab2z1((double) a,(double) b,2));
        System.out.println("float: " + (float)Misc.lab2z1((double)c,(double)d,3));
        System.out.println("double: " + Misc.lab2z1(3.12321,2.12312, 4));

        char ch1  = 'a';
        char ch2 = 'b';
        System.out.println("char value of ch1:" + ch1);
        System.out.println("char value of ch2:" + ch2);
        System.out.println("int value of ch1:" + (int)ch1);
        System.out.println("int value of ch2:" + (int)ch2);
        System.out.println("char a + b: " + Misc.lab2z2(ch1, ch2));
        System.out.println("char a - b: " + Misc.lab2z3(ch1, ch2));

    }

    private static void laba3() {
    Misc.lab3z1();
    Misc.lab3z2();
    Misc.lab3z3();
    System.out.println("(a > b && a > 0 || a > 10? true : false): " +     Misc.lab3z4(3,2));
    Misc.lab3z5();
    System.out.println(Misc.text);
    }

    private static void laba4() {
        int a = 2;
        int b = 1;
        CCC obj1 = new CCC();
        System.out.println("CCC Constructor without parameters sum: " + obj1.sum());
        CCC obj2 = new CCC(a,b);
        System.out.println("CCC sum:" + obj2.sum());
        System.out.println("CCC ssub:" + CCC.ssub(a,b));
        DDD obj3 = new DDD();
        System.out.println("CCC Constructor without parameters sum: " + obj3.sum());
        DDD obj4 = new DDD(a,b,a,b);
        System.out.println("DDD calc methid: " + obj4.calc());
    }

    private static void laba5() {
    com.company.level1.level2.level3.level4.E obj1 = new com.company.level1.level2.level3.level4.E (1);
    com.company.level1.level2.level3.level4.F obj2 = new com.company.level1.level2.level3.level4.F (1);
    System.out.println(obj1.toString());
    System.out.println(obj2.toString());
    System.out.println(new A(2).toString());
        B b = new B(1);
        C c = new C(1);
        D d = new D(1);
        E e = new E(1);
        F f = new F(1);

        B2 b2 = new B2(1);
        C2 c2 = new C2(1);
        D2 d2 = new D2(1);
        E2 e2 = new E2(1);
        F2 f2 = new F2(1);

        System.out.println(new Inheritance(1).toString());
    }

    private static void laba7() {
        System.out.println((new Am(1)).toString());
        System.out.println((new Bm(1)).toString());
        System.out.println((new Cm(1)).toString());
        System.out.println((new Dm(1)).toString());
    }

    private static void laba8() {
        try {
            Class obj = new Class(null);
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }

        try {
            Class obj = new Class(1);
            obj.methode(0);
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        } catch (Exception3 exception3) {
            exception3.printStackTrace();
        } catch (Exception2 exception2) {
            exception2.printStackTrace();
        }
    }

    private static void laba9() {
        Misc.lab9z1();
        Misc.Planet planet = Misc.Planet.EARTH;

        switch (planet) {
            case MERCURY: {
                System.out.println("MERCURY");
                break;
            }
            case JUPITER:
                System.out.println("JUPITER");
                break;
            default:
                System.out.println("default");
        }

        Misc.Planet planet2 = Misc.Planet.NEPTUN;
        System.out.println(planet2.gravity);
        System.out.println(planet2.mass);
        System.out.println(planet2.radius);

        Misc.Fruits fruit = Misc.Fruits.Orange;
        System.out.println("Fruit calories: " + fruit.calories);
    }

}
