package MyDB;

import java.util.Scanner;

public class Menu {
    public static void firstMenu(){
        String s = "1 - Меню поиска.\n" +
                "от    1 - Поиск по VIN коду машины.\n" +
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
                System.out.println("Введите марку машины. Для возврата в предыдущее меню введите цифру 0. \n");
                String o = scanner.next();
                if(o.equals("0")){
                    secondMenu();
                    search(scanner);
                    break;
                }
                System.out.println("Введите модель машины. Для возврата в предыдущее меню введите цифру 0. \n");
                String d = scanner.next();
                if(d.equals("0")){
                    secondMenu();
                    search(scanner);
                    break;
                }else {
                    System.out.println("Машина марки " + o + "  и модели " + d + " существует в базе. \n" +
                            "Для поиска другой марки машины введите 3. Для возврата в предыдущее меню введите цифру 0.");
                }
                search(scanner);
                break;
            }
            case "4": {
                System.out.println("Введите год выпуска от... до. Для возврата в предыдущее меню введите цифру 0. \n");
                String o = scanner.next();
                if(o.equals("0")){
                    secondMenu();
                    search(scanner);
                    break;
                }
                String d = scanner.next();
                if(d.equals("0")){
                    secondMenu();
                    search(scanner);
                    break;
                }else {
                    System.out.println("Машина с годом выпуска от " + o + " до " + d + " существует в базе. \n" +
                            "Для поиска другой машины с пробегом от....до введите 4. Для возврата в предыдущее меню введите цифру 0.");
                }
                search(scanner);
                break;
            }
            case "5": {
                    System.out.println("Введите пробег от... до (Минимальный пробег 1 км.). Для возврата в предыдущее меню введите цифру 0. \n");
                String o = scanner.next();
                if(o.equals("0")){
                    secondMenu();
                    search(scanner);
                    break;
                }
                String d = scanner.next();
                if (d.equals("0")) {
                    secondMenu();
                    search(scanner);
                    break;
                }else {
                    System.out.println("Машина с пробегом от " + o + " до " + d + " существует в базе. \n" +
                            "Для поиска другой машины с пробегом от....до введите 5. Для возврата в предыдущее меню введите цифру 0.");
                }
                search(scanner);
                break;
            }
            case "6": {
                System.out.println("Введите цену от... до. Для возврата в предыдущее меню введите цифру 0. \n");
                String o = scanner.next();
                if(o.equals("0")){
                    secondMenu();
                    search(scanner);
                    break;
                }
                String d = scanner.next();
                if (d.equals("0")) {
                    secondMenu();
                    search(scanner);
                    break;
                }else {
                    System.out.println("Машина с ценой от " + o +" до "+ d  +" существует в базе. \n" +
                            "Для поиска другой с ценой от....до введите 6. Для возврата в предыдущее меню введите цифру 0.");
                }
                search(scanner);

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
