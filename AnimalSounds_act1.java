// Name: Ismael Jose Jumao-as BSIT-2B

import java.util.Scanner;

public class AnimalSounds {
public static void main(String[] args) {
AnimalSounds animalSounds = new AnimalSounds();
animalSounds.run();
}

private void run() {
Animal animal = new Animal();
Scanner scanner = new Scanner(System.in);
String option;

do {
int choice = theChoice(scanner);

switch (choice) {
case 1:
animal.cat();
break;
case 2:
animal.pig();
break;
case 3:
animal.monkey();
break;
case 4:
animal.donkey();
break;
}
System.out.println();
System.out.println("Type Yes If you want to try again");
option = scanner.next();
} while (option.equalsIgnoreCase("Yes"));

scanner.close();
}

private int theChoice(Scanner scanner) {
int choice;

System.out.println("========== Activity One: What does the animal say? ==========");
System.out.println("Choose an Animal");

do {
System.out.println();
System.out.println("1. Cat\n2. Pig\n3. Monkey\n4. Donkey");
System.out.println();
System.out.print("Enter the selected number: ");
choice = scanner.nextInt();
System.out.println("Animal: " + choice);

if (choice > 4 || choice < 1) {
System.out.println("Enter a number from 1 to 4 :D\nPlease try again.");
}
} while (choice > 4 || choice < 1);

return choice;
}

private class Animal {
public void cat() {
System.out.println("Meow! Meow! Meow!");
}

public void pig() {
System.out.println("Oink!");
}

public void monkey() {
System.out.println("Ooh! Ooh! Ooh!");
}

public void donkey() {
System.out.println("Hee! Haw!");
}
}
}