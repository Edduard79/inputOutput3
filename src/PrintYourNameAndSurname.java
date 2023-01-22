import java.util.Scanner;

public class PrintYourNameAndSurname {

    public static void main(String[] args){
        System.out.printf("Please insert you full name:\nName 1st - Surname 2nd!\n");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        System.out.printf("Name: %s \nSurname: %s", name, surname);



    }

}
