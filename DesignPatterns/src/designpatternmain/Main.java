package designpatternmain;

import java.util.Scanner;

public class Main {

	public static void printMenu() {
		System.out.println("\t-----MENU-----");
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

	public static void callDesignPatternMain(String option) {
		switch (option) {
		case "1":
			DesignPatternCaller.abstractFactory();
			break;
		case "2":
			DesignPatternCaller.bridge();
			break;
		case "3":
			DesignPatternCaller.builder();
			break;
		case "4":
			DesignPatternCaller.chainOfResponsibility();
			break;
		case "5":
			DesignPatternCaller.composite();
			break;
		case "6":
			DesignPatternCaller.facade();
			break;
		case "7":
			DesignPatternCaller.flyweight();
			break;
		case "8":
			DesignPatternCaller.mediator();
			break;
		case "9":
			DesignPatternCaller.memento();
			break;
		case "10":
			DesignPatternCaller.prototype();
			break;
		case "11":
			DesignPatternCaller.proxy();
			break;
		case "12":
			DesignPatternCaller.visitor();
			break;
		default:
		}
	}

	public static void main(String[] args) {
		printMenu();
		callDesignPatternMain(getUserInput());
	}
}
