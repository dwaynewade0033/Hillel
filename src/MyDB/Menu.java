package MyDB;

import java.util.Scanner;

public class Menu {
    public static void firstMenu(){
        String s = "1 - Меню поиска.\n" +
                "    1 - Поиск по VIN коду машины.\n" +
                "    2 - Поиск по регистрационному номеру машины\n" +
                "    3 - Поиск по марки и модели\n" +
                "    4 - Поиск по году выпуска от ...до\n" +
                "    5 - Поиск по пробегу от ... до\n" +
                "    6 - Поиск по цене от .. до\n" +
                "    7 - Отобразить список всех машин .\n" +
                "    0 - назад.\n" +
                "2 - Занести в базу данные по новой машине.\n" +
                "3 - Редактирование информации о машине по VIN коду\n" +
                "4 - Удалить машину с базы по VIN коду.\n" +
                "0 - Назад\n" +
                "-1 - Выход из программы.";
        System.out.println(s);
    }
    public static void secondMenu(){
        String s = "1 - Поиск по VIN коду машины.\n" +
                "2 - Поиск по регистрационному номеру машины\n" +
                "3 - Поиск по марки и модели\n" +
                "4 - Поиск по году выпуска от ...до\n" +
                "5 - Поиск по пробегу от ... до\n" +
                "6 - Поиск по цене от .. до\n" +
                "7 - Отобразить список всех машин .\n" +
                "0 - назад.";
        System.out.println(s);
    }
    public static void menu(Scanner scanner) {
        switch (scanner.next()) {
            case "1": {
                secondMenu();
                search(scanner);
                break;
            }
            case "2": {

                break;
            }
            case "3": {
                break;
            }
            case "4": {
                break;
            }
            case "0": {
                menu(scanner);
            }
            case "-1": {
                break;
            }
        }
    }
    public static void search(Scanner scanner) {
        switch (scanner.next()) {
            case "1": {
                System.out.println("Введите VIN машины. Для возврата в предыдущее меню введите цифру 0. \n");
                String s = scanner.next();
                if(s.equals("0")){
                    secondMenu();
                    search(scanner);
                }else {
                    System.out.println("Машина с VIN " + s +" существует в базе. \n" +
                            "Для поиска другой машины по Vin введите 1. Для возврата в предыдущее меню введите цифру 0.");

                }
                search(scanner);
                break;

            }
            case "2": {
                System.out.println("Введите регистрационный номер машины. Для возврата в предыдущее меню введите цифру 0. \n");
                String s = scanner.next();
                if(s.equals("0")){
                    secondMenu();
                    search(scanner);
                }else {
                    System.out.println("Машина с регистрационным номером " + s +" существует в базе. \n" +
                            "Для поиска другой машины по регистрационному номеру введите 2. Для возврата в предыдущее меню введите цифру 0.");
                }
                search(scanner);
                break;
            }
            case "3": {
                break;
            }
            case "4": {
                break;
            }
            case "5": {
                break;
            }
            case "6": {
                break;
            }
            case "7": {
                break;
            }
            case "0": {
                firstMenu();
                menu(scanner);
                break;
            }

        }
    }

}
