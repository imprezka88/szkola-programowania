package pl.coderslab.app;

import java.util.Scanner;

import static pl.coderslab.app.MenuAction.QUIT;

public class Main {
    public static void main(String[] args) {
        listAllUsers();

        Scanner scanner = new Scanner(System.in);
        MenuAction action = null;

        while (action != QUIT) {
            listMenu();
            try {
                action = getMenuAction(scanner.next());

                switch (action) {
                    case ADD: {
                        addUser();
                        break;
                    }
                    case EDIT: {
                        editUser();
                        break;
                    }
                    case DELETE: {
                        deleteUser();
                        break;
                    }
                    case QUIT: {
                        System.out.println("Żegnaj. Odejdź. Idź sobie");
                        break;
                    }
                    default:
                        System.out.println("Niepoprawna opcja");
                }
            } catch (Exception e) {
                System.out.println("Niepoprawna opcja");
            }
        }
    }

    private static MenuAction getMenuAction(String action) {
        return MenuAction.getByName(action);
    }

    private static void deleteUser() {

    }

    private static void editUser() {

    }

    private static void addUser() {

    }

    private static void listMenu() {
        System.out.println("Wybierz jedną z opcji:");
        System.out.println("add - dodanie użytkownika");
        System.out.println("edit - edycja użytkownika");
        System.out.println("delete - usunięcie użytkownika");
        System.out.println("quit - zakończenie programu");
    }

    private static void listAllUsers() {

    }

}
