package CharAndString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static void main(String[] args) {
        char ch1 = 5;
        char ch2 = '5';
        char ch3 = '\u0035';
        char ch4 = '0'+5;
        char ch5 = (char)53;


        if(Character.isDigit(ch3));
        if(Character.isUpperCase(ch3));


        System.out.println(ch1==ch2);
        System.out.println(ch2==ch3);
        System.out.println(ch2==ch4);
        System.out.println(ch2==ch5);


        if(Character.isDigit(ch3));
        if(Character.isUpperCase(ch3));


        char chx = 'x';
        char chX = (char) (chx - 'a' + 'A');
        System.out.println(Character.toUpperCase(chx));


        char[] chrs = {'1','2','3'};
        char[] chrs2 = chrs;
        chrs[0] = 'A';
        System.out.println(chrs2);

        String s = "new String()";
        String s2 = "new String()";
        System.out.println(s==s2);

        char[] chars = {'A','B','C'};
        byte[] bytes = new byte[3];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) chars[i];
        }
        for (int j = 0; j <bytes.length ; j++) {
            System.out.println((char) bytes[j]);

        }

        String s1  = "asd".concat("qwe");
        System.out.println(s1);


        String s3 = "Hell";
        String s4 = s3.toUpperCase();
        System.out.println(s4);


        StringBuilder sb = new StringBuilder(s1);
        sb.append("das");
        String ss ="Hello" ;
        System.out.println(ss.contains("Hell"));
        System.out.println(ss.indexOf("Hell"));
        System.out.println(ss.lastIndexOf("Hell"));
        System.out.println(ss.endsWith("Hell"));
        System.out.println(ss.substring(0,2));
        System.out.println(ss.split("l"));
      //  System.out.println("Java is the best language".replaceAll("^Java", "C++"));
      //  System.out.println("Java is the best language Java".replaceAll("^Java$", "C++"));
        System.out.println("Java is the best language java".replaceAll("[J|j]ava", "C++"));


        Pattern pattern = Pattern.compile("[J|j]ava");
        Matcher m = pattern.matcher("Java is the best language java");
        while (m.find()){
            System.out.println(m.group());
        }







    }
}
