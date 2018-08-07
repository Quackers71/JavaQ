package com.pluralsight.nestedifs;

public class Main {

    public static void main(String[] args) {
	    int students = 150;
	    int rooms = 15;

        if(rooms > 0 && students/rooms > 30)
            System.out.println("Crowded!!");
        else
            System.out.println("Plenty of Room");

	    System.out.println();
	    System.out.println("** end program **");
    }
}
