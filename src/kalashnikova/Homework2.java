/**
 * Homework 2
 * @author Kalashnikova Aleksandra
 * @version 06.11.2021
 */
public class Homework2 {

    public static void main(String[] args) {
	    within10and20(5, 10);
        isPositiveOrNegative(-9);
        isNegative(0);
        printWordNTimes("Word", 5);
        isLeapYear(2212);
    }

    static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        return sum >= 10 && sum <= 20;
    }

    static void isPositiveOrNegative(int x) {
        System.out.println(x >= 0 ? "Положительное число" : "Отрецательное число");
    }

    static boolean isNegative(int x) {
        return x < 0;
    }

    static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    static boolean isLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return year % 4 == 0 || year % 400 == 0;
    }
}

