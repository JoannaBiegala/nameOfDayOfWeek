package org.example;
/*
●     1 - 5 wówczas metoda powinna zwrócić dzień tygodnia, np. “Monday”,

●     6 lub 7 metoda powinna zwrócić “Weekend”

●     >7 metoda zwraca komunikat “There is no such a day!”


 */
public class Main {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        System.out.println("Dzień "+ dayOfWeek + " tygodnia to " + returnNameOfDayOfWeek(3));

    }
    public static String returnNameOfDayOfWeek (int dayOfWeek) {

        switch (dayOfWeek) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
            case 7:
                return "Weekend";
            default:
                return "There is no such a day!";
        }
   }
}