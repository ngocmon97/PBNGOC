package Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT {
    public static void main(String[] args) {
        Khupho town = new Khupho();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            //địa chỉ
            System.out.println("Enter address:");
            scanner.nextLine();
            String address = scanner.nextLine();
            //số ng
            List<Nguoi> persons = new ArrayList<>();
            System.out.println("Enter number person");
            int number = scanner.nextInt();

            for (int j = 0; j < number; j++) {
            }

            town.addFamily(new Hogiadinh(persons, address));


        }
    }
}
