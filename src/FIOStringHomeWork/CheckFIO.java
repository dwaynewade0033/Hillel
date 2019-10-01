package FIOStringHomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckFIO {
    public static void main(String[] args) {
        check("Ssadf Denis Valerievich");

    }

    public static boolean check(String fio) {
        ArrayList<String> reverseText = new ArrayList<>(Arrays.asList(fio.split(" ")));
        System.out.println(reverseText);
        String surname = reverseText.get(0);
        String name = reverseText.get(1);
        String patronymic = reverseText.get(2);
        int numberOfSurname = surname.length();
        int numberOfName = surname.length();
        int numberOfPatronymic = surname.length();
        if(numberOfSurname>2 & numberOfSurname<14)
        {
            System.out.println("ok");
            return true;
        }else {
            System.out.println("ds");
            return false;
        }

    }
}
