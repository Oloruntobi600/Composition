package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Case theCase = new Case("220B", "Dell", "240", new Dimensions(20, 20, 5));

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2450, 1440));

        MotherBoard theMotherboard = new MotherBoard("Bj-200","Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500, 1200, "Red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
        }
    }
