package edu.bsu.cs222;

import java.util.Scanner;

public class InputCollector {

    public static int intInputRetriever(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public static char charInputRetriever(){
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextLine()).charAt(0);
    }
}
