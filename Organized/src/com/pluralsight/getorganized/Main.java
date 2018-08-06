package com.pluralsight.getorganized;

public class Main {

    public static void main(String[] args) {

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;

        int result2 = (valA - valB) / valC;

	    System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;

        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result = (short) byteVal;
        short result0 = (short) (byteVal - longVal);
        double result10 = longVal - doubleVal;
        long result11 = (long) (shortVal - longVal + floatVal + doubleVal);

        System.out.println("Success");
    }
}
