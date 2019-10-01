package FIOStringHomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckFIO {
    public static void main(String[] args) {
        check("Shevchenko Denis Valerievich");
        System.out.println(isFullname("Shevchenko Denis Valerievich"));
    }

    public static boolean check(String fio) {
        ArrayList<String> mainFIO = new ArrayList<>(Arrays.asList(fio.split(" ")));
        System.out.println(mainFIO);

        String surname = mainFIO.get(0);
        String name = mainFIO.get(1);
        String patronymic = mainFIO.get(2);

        int numberOfSurname = surname.length();
        int numberOfName = name.length();
        int numberOfPatronymic = patronymic.length();

        if(numberOfSurname>2 & numberOfSurname<14 & numberOfName>2 & numberOfName < 8 & numberOfPatronymic >5 & numberOfPatronymic<16)
        {
            System.out.println("ok");
            return true;
        }else {
            System.out.println("ne ok");
            return false;
        }

    }
    public static boolean isFullname(String str) {
        String expression = "^[a-zA-Z\\s]*$";
        return str.matches(expression);
    }
    }
