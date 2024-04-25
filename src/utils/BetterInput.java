package utils;

import java.util.Scanner;

import interfaces.OptionsType;

public class BetterInput {
    private static Scanner scanner = new Scanner(System.in);

    public static Object input(String text) {
        OptionsType optionsType = OptionsType.String;
        return constructScanner(optionsType);
    }
    
    public static Object input(String text, OptionsType optionsType) {
        return constructScanner(optionsType);
    }

    private static Object constructScanner(OptionsType optionsType) {
        Object value = null;
        switch (optionsType) {
            case String:
                value = scanner.nextLine();
                break;
            case Double:
                value = scanner.nextDouble();
                break;
            case Float:
                value = scanner.nextFloat();
                break;
            case Integer:
                value = scanner.nextInt();
                break;
            default:
                break;
        }
        return value;
    }

}
