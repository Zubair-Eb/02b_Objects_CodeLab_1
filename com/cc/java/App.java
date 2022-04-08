package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Konto konto= new Konto(10000, 10000*2);
        Konto konto2= new Konto(10000, 10000*3);
        Konto konto3= new Konto(10000, 10000*10);


        output("-----Aufgabe-1-----");

        output("Anfangswert Konto 1:\t\t" + konto.Kontostand);
        output("Anfangswert Konto 2:\t\t" + konto2.Kontostand);
        output("Anfangswert Konto 3:\t\t" + konto3.Kontostand);

        output("-----Aufgabe-2-----");

        output("Verdoppelung Konto 1:\t\t" + konto.multiplier);
        output("Verdreifachung Konto 2:\t\t" + konto2.multiplier);
        output("Verzehnfachung5 Konto 3:\t\t" + konto3.multiplier);

        output("-----Aufgabe-2-----");

        output("Aktuellen Kontostand Konto 1:\t" + konto.multiplier);
        output("Aktuellen Kontostand Konto 2:\t" + konto2.multiplier);
        output("Aktuellen Kontostand Konto 3:\t" + konto3.multiplier);









        





        

     
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

