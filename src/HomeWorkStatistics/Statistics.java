package HomeWorkStatistics;

import java.util.*;

public class Statistics {
    public void textStatistic(String text){
        int count = 0;
        if(text.length() != 0){
            count++;
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("В тексте "+count+" слов");
        String text2=text.replaceAll("\\s+","");;
        int i = text2.length();
        System.out.println(i);

        ArrayList<String> reverseText = new ArrayList<>(Arrays.asList(text.split(" ")));
        Collections.reverse(reverseText);
        System.out.println(reverseText);
        Collections.sort(reverseText);
        int maxCount = 0, countt = 1;
        String maxWord = "";
        String word = "";
            for (String s : reverseText) {
                if (s.equals(word)) {
                    countt++;
                } else {
                    if (countt > maxCount) {
                        maxCount = countt;
                        maxWord = word;
                    }
                    word = s;
                    countt = 1;
                }
            }

            System.out.println("Самое повторяющееся слово: " + maxWord + " (встречается " + maxCount + " раз)");
        for (String s : reverseText) {
            if (s.equals(word)) {
                countt++;
            } else {
                if (countt < maxCount) {
                    maxCount = countt;
                    maxWord = word;
                }
                word = s;
                countt = 1;
            }
        }
        System.out.println("Самое неповторяющееся слово: " + maxWord + " (встречается " + maxCount + " раз)");


    }





}
