import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        do {
            showMenu();
            int choice = inputInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    int width = inputInt("Enter width: ");
                    int height = inputInt("Enter height: ");
                    drawRectangle(width, height);
                    break;
                case 2:
                    int rectChoice;
                    do {
                        showRectangleMenu();
                        rectChoice = inputInt("Enter type of the square rectangle: ");
                        int size;
                        switch (rectChoice) {
                            case 1:
                                size = inputInt("Enter size:");
                                drawBLRect(size);
                                break;
                            case 2:
                                size = inputInt("Enter size:");
                                drawBRRect(size);
                                break;
                            case 3:
                                size = inputInt("Enter size:");
                                drawTLRect(size);
                                break;
                            case 4:
                                size = inputInt("Enter size:");
                                drawTRRect(size);
                                break;
                            default:
                                System.out.println("No choice!");
                        }
                    } while (rectChoice != 5);
                    break;
                case 3:
                    int size = inputInt("Enter size:");
                    if (size % 2 == 0) {
                        System.out.println("Cant' draw isosceles triangle with size = " + size + " !");
                    } else {
                        drawIsoRect(size);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        } while (true);
    }

    public static int inputInt(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
    }

    public static void showRectangleMenu() {
        System.out.println("1. Bottom-left");
        System.out.println("2. Bottom-right");
        System.out.println("3. Top-left");
        System.out.println("4. Top-right");
        System.out.println("5. Back");
    }

    public static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawBLRect(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawBRRect(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void drawTLRect(int size) {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTRRect(int size) {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = size - 1; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawIsoRect(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size + i; j++) {
                if (j >= size - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
