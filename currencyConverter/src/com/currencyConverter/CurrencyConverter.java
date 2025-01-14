package com.currencyConverter;
import java.util.Scanner;
public class CurrencyConverter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Exchange rates (example rates, replace with actual values as needed)
	        double usdToInr = 82.50;
	        double eurToInr = 88.75;
	        double gbpToInr = 102.30;
	        double inrToUsd = 1 / usdToInr;
	        double inrToEur = 1 / eurToInr;
	        double inrToGbp = 1 / gbpToInr;

	        while (true) {
	            System.out.println("\nCurrency Converter");
	            System.out.println("1. USD to INR");
	            System.out.println("2. INR to USD");
	            System.out.println("3. EUR to INR");
	            System.out.println("4. INR to EUR");
	            System.out.println("5. GBP to INR");
	            System.out.println("6. INR to GBP");
	            System.out.println("7. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();

	            if (choice == 7) {
	                System.out.println("Exiting... Goodbye!");
	                break;
	            }

	            System.out.print("Enter the amount: ");
	            double amount = scanner.nextDouble();
	            double convertedAmount;

	            switch (choice) {
	                case 1: // USD to INR
	                    convertedAmount = amount * usdToInr;
	                    System.out.printf("%.2f USD = %.2f INR\n", amount, convertedAmount);
	                    break;
	                case 2: // INR to USD
	                    convertedAmount = amount * inrToUsd;
	                    System.out.printf("%.2f INR = %.2f USD\n", amount, convertedAmount);
	                    break;
	                case 3: // EUR to INR
	                    convertedAmount = amount * eurToInr;
	                    System.out.printf("%.2f EUR = %.2f INR\n", amount, convertedAmount);
	                    break;
	                case 4: // INR to EUR
	                    convertedAmount = amount * inrToEur;
	                    System.out.printf("%.2f INR = %.2f EUR\n", amount, convertedAmount);
	                    break;
	                case 5: // GBP to INR
	                    convertedAmount = amount * gbpToInr;
	                    System.out.printf("%.2f GBP = %.2f INR\n", amount, convertedAmount);
	                    break;
	                case 6: // INR to GBP
	                    convertedAmount = amount * inrToGbp;
	                    System.out.printf("%.2f INR = %.2f GBP\n", amount, convertedAmount);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        scanner.close();
	    }
	}



