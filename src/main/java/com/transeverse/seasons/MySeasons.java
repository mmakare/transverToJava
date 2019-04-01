package com.transeverse.seasons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MySeasons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Write a month to find out to what season time it belongs:");
        String input = br.readLine();

        switch (input.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println("WINTER"); //
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("SPRING");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("SUMMER");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("This is not a month!");
        }
    }
}
