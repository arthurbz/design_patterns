package designpatternmain;

import java.util.Scanner;

public class Main {

	public static void printMenu() {
		System.out.println("\t-----MENU-----");
		System.out.println("0 - Quit program");
		System.out.println("1 - Abstract Factory");
		System.out.println("2 - Bridge");
		System.out.println("3 - Builder");
		System.out.println("4 - Chain of Responsibility");
		System.out.println("5 - Composite");
		System.out.println("6 - Facade");
		System.out.println("7 - Flyweight");
		System.out.println("8 - Mediator");
		System.out.println("9 - Memento");
		System.out.println("10 - Prototype");
		System.out.println("11 - Proxy");
		System.out.println("12 - Visitor");
		System.out.println("Select your option:");
	}

	public static String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public static void waitForUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\n\nPress any key to proceed...");
		scanner.nextLine();
	}

	public static void callDesignPatternMain(String option) {
		switch (option) {
		case "0":
			System.exit(0);
			break;
		case "1":
			System.out.println(DesignPatternConcept.AbstractFactory);
			DesignPatternCaller.abstractFactory();
			break;
		case "2":
			System.out.println(DesignPatternConcept.Bridge);
			DesignPatternCaller.bridge();
			break;
		case "3":
			System.out.println(DesignPatternConcept.Builder);
			DesignPatternCaller.builder();
			break;
		case "4":
			System.out.println(DesignPatternConcept.ChainOfResponsibility);
			DesignPatternCaller.chainOfResponsibility();
			break;
		case "5":
			System.out.println(DesignPatternConcept.Composite);
			DesignPatternCaller.composite();
			break;
		case "6":
			System.out.println(DesignPatternConcept.Facade);
			DesignPatternCaller.facade();
			break;
		case "7":
			System.out.println(DesignPatternConcept.Flyweight);
			DesignPatternCaller.flyweight();
			break;
		case "8":
			System.out.println(DesignPatternConcept.Mediator);
			DesignPatternCaller.mediator();
			break;
		case "9":
			System.out.println(DesignPatternConcept.Memento);
			DesignPatternCaller.memento();
			break;
		case "10":
			System.out.println(DesignPatternConcept.Prototype);
			DesignPatternCaller.prototype();
			break;
		case "11":
			System.out.println(DesignPatternConcept.Proxy);
			DesignPatternCaller.proxy();
			break;
		case "12":
			System.out.println(DesignPatternConcept.Visitor);
			DesignPatternCaller.visitor();
			break;
		default:
			System.out.println("Invalid option!");
		}
	}

	public static void main(String[] args) {
		String option = "";
		
		while (option != "0") {
			printMenu();
			option = getUserInput();
			callDesignPatternMain(option);
			waitForUserInput();
		}
	}
}
