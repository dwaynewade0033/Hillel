package Streams;

import java.io.Console;
import java.nio.file.AccessDeniedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConsoleTest {
    private static final Map<String, char[]> users = new HashMap<>();

    public static void main(String[] args) throws AccessDeniedException {
        users.put("Alex", "god".toCharArray());

        Console console = System.console();
        if(console==null) return;
        String login = console.readLine("Enter login...");

        char[] password = console.readPassword("Enter password...");
        if(!users.containsKey(login)) throw new AccessDeniedException("usera takogo nema");
        if(!Arrays.equals(users.get(login), password)) throw new AccessDeniedException("wrong password");



    }
}
