package Shildt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Эта программа поможет Вам перевести галлоны в литры.");
	System.out.println("Введите количество галлонов:");
        Scanner scanner = new Scanner(System.in);
        double gallons = scanner.nextDouble();
        double litters = gallons * 3.7854;
        System.out.println(gallons + " галлонов = " + litters + " литров");
        scanner.close();
    }
}
