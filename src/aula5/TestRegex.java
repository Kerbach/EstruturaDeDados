package aula5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestRegex
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("(\\w+)=(\\d)");

        Matcher matcher = pattern.matcher("a=1    b=23    cd=823");

        boolean found = false;
        while (matcher.find()) {
            System.out.println("group 0: '" + matcher.group(0) + "'");
            System.out.println("group 1: '" + matcher.group(1) + "'");
            System.out.println("group 2: '" + matcher.group(2) + "'");
            found = true;
        }
        if (!found) {
            System.out.println("no match found!");
        }
    }
}

