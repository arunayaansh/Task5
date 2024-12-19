package Task5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthDateString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate birthDate = LocalDate.parse(birthDateString, formatter);

        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);

        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        scanner.close();
    }
}


/* Output:
Enter your birthdate (yyyy-mm-dd): 2001-03-02
Your age is: 23 years, 9 months, and 17 days. */
