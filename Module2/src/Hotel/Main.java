package Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1:To insert person for rent");
            System.out.println("Enter 2:To remove person by passport");
            System.out.println("Enter 3:To calculator price by passport");
            System.out.println("Enter 4:To show info");
            System.out.println("Enter 5:To exit");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Enter name:");
                    String name = scanner.nextLine();
                    System.out.print("Enter age:");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter passport");
                    String passport = scanner.nextLine();
                    System.out.print("Type a to choose type A \n" +
                            "Type b to choose type B and c to choose C ");
                    String choise = scanner.nextLine();
                    Room room;
                    if (choise.equals("a")) {
                        room = new RoomA();
                    } else if (choise.equals("b")) {
                        room = new RoomB();
                    } else if (choise.equals("c")) {
                        room = new RoomC();
                    } else {
                        continue;
                    }
                    System.out.print("Enter number day for rent: ");
                    int numberRent = scanner.nextInt();
                    Person person = new Person(name, age, passport, room, numberRent);
                    hotel.add(person);
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Enter passport");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                    break;
                }
                case "3": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    System.out.println("Price: " + hotel.calculator(passport));
                    break;
                }

                case "4":
                {
                    hotel.show();
                    break;
                }
                case "5":
                {
                    return;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
