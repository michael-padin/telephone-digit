import java.util.Scanner;

public class Main {
    public static void main(String [] args ) {
        char character, smallCharacter;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character using phone keypad structure: ");
        character =  scan.next().charAt(0);
        scan.close();

        /*Convert Character to lowercase*/
        smallCharacter = Character.toLowerCase(character);

        //new switch statement  expression of java
        switch (smallCharacter) {
            case '0' -> System.out.print(0);
            case '1' -> System.out.print(1);
            case 'a', 'b', 'c' -> System.out.println(2);
            case 'd', 'e', 'f' -> System.out.println(3);
            case 'g', 'h', 'i' -> System.out.println(4);
            case 'j', 'k', 'l' -> System.out.println(5);
            case 'm', 'n', 'o' -> System.out.println(6);
            case 'p', 'q', 'r', 's' -> System.out.println(7);
            case 't', 'u', 'v' -> System.out.println(8);
            case 'w', 'x', 'y', 'z' -> System.out.println(9);
            default -> System.out.println("Invalid input");
        }

    }
}
