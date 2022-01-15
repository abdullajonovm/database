package service;

import repository.CategoryRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class CRUD {
    public static final Scanner SCANNER_NUM = new Scanner(System.in);
    public static final Scanner SCANNER_STR = new Scanner(System.in);

    public static void run() throws SQLException {
        System.out.println("1.Category CRUD");
        System.out.println("2.Client CRUD");
        System.out.println("3.Currency CRUD");
        System.out.println("4.Measurement CRUD");
        System.out.println("5.Supplier CRUD");
        System.out.print("Select :");
        int operation1 = SCANNER_NUM.nextInt();
        switch (operation1) {


            case 1:
                categoryCrudMenu();
                break;
            case 2://currencyCrudMenu();
                break;
            case 3://currency_crud
                break;
            case 4://measurement_crud
                break;
            case 5://supplier_crud
                break;
            default:
                System.out.println("Wrong selection!😣");
                System.out.println("Select again");
                run();
        }
    }

    private static void categoryCrudMenu() throws SQLException {
        System.out.println("1.Category Show");
        System.out.println("2.Category Add");
        System.out.println("3.Category Update");
        System.out.println("4.Category Delete");
        System.out.println("0.Back");
        System.out.print("Select :");
        int operation2 = SCANNER_NUM.nextInt();

        switch (operation2) {
            case 1:
                CategoryRepository.categoryShow();
                break;
            case 2:
                CategoryRepository.categoryAdd();
                break;
            case 3:
                CategoryRepository.categoryUpdate();
                break;
            case 4:
                CategoryRepository.categoryDelete();
                break;
            case 0:
                run();
                break;
            default:
                System.out.println("Wrong selection!😣");
                System.out.println("Select again");
                categoryCrudMenu();

        }
        categoryCrudMenu();
    }


}
