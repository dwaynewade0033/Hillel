package MyDB;

import java.util.Scanner;

import static MyDB.Menu.firstMenu;
import static MyDB.Menu.menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        firstMenu();
        menu(scanner);
    }

}
