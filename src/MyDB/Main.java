package MyDB;

import java.util.Scanner;

import static MyDB.Menu.firstMenu;
import static MyDB.Menu.menu;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(123,"123","dasd","",2,3,1);
        Scanner scanner = new Scanner(System.in);
        firstMenu();
        menu(scanner);
    }

}
