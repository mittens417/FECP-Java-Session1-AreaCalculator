package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;


                System.out.println("\n--- Shape Area Calculator ---");
                System.out.println("1. Calculate area of a Circle");
                System.out.println("2. Calculate area of a Triangle");
                System.out.println("3. Calculate area of a Rectangle");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter the radius: ");
                            double radius = scanner.nextDouble();
                            System.out.printf("Area of the circle: %.2f1", calculateCircleArea(radius));
                            break;
                        case 2:
                            System.out.print("Enter the base: ");
                            double base = scanner.nextDouble();
                            System.out.print("Enter the height: ");
                            double height = scanner.nextDouble();
                            System.out.printf("Area of the triangle: %.2f", calculateTriangleArea(base, height));
                            break;
                        case 3:
                            System.out.print("Enter the length: ");
                            double length = scanner.nextDouble();
                            System.out.print("Enter the width: ");
                            double width = scanner.nextDouble();
                            System.out.printf("Area of the rectangle: %.2f", calculateRectangleArea(length, width));
                            break;
                        case 4:
                            System.out.println("Exiting program. Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine();
                    choice = 0;
                }
        }
        public static double calculateCircleArea(double radius) {
            if (radius < 0) {
                throw new IllegalArgumentException("Radius cannot be negative.");
            }
            return Math.PI * radius * radius;
        }
        public static double calculateTriangleArea(double base, double height) {
            if (base < 0 || height < 0) {
                throw new IllegalArgumentException("Base and height cannot be negative.");
            }
            return 0.5 * base * height;
        }
        public static double calculateRectangleArea(double length, double width) {
            if (length < 0 || width < 0) {
                throw new IllegalArgumentException("Length and width cannot be negative.");
            }
            return length * width;
        }
    }
