package com.teachmeskills.lesson9;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String str = "4637-ahl-4746-wuz-3s1v";
        System.out.println("We will assume that this is the document number: " + str);

        System.out.println("The first two blocks of 4 digits: " + str.substring(0, 5) + str.substring(9, 13));

        String str1 = str.replace("ahl", "each letter will be replaced by");
        String str2 = str1.replace("wuz", "each letter will be replaced by");
        System.out.println("Swap three letter blocks: " + str2);

        String str3 = str.replace("-", "/");
        String str4 = str3.replace("1", "/");
        String str5 = str4.replace("3", "");
        String str6 = str5.substring(5, 8) + str5.substring(13, 20);
        System.out.println("Only letters from the document number: " + str6.toLowerCase());

        String str7 = str.replace("-", "/");
        String str8 = str7.replace("1", "/");
        String str9 = str8.replace("3", "");
        String str10 = str9.substring(4, 8) + str9.substring(13, 20);
        StringBuilder sb = new StringBuilder("Letters: " + str10);
        System.out.println(sb);

        if (str.contains("abc")) {
            if (str.contains("ABC"))
                System.out.println("Document number contains sequence ABC");
        } else {
            System.out.println("Document number doesnt contain sequence ABC ");
        }

        if (str.startsWith("555")) {
            System.out.println("Document number starts with 555");
        } else {
            System.out.println("Document number doesnt start with 555 ");

        }
        if (str.endsWith("1a2b")) {
            System.out.println("Document number starts with 1a2b");
        } else {
            System.out.println("Document number doesnt start with 1a2b ");
        }
    }
}