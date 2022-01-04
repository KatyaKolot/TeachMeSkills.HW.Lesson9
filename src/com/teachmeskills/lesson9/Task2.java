package com.teachmeskills.lesson9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string");
        String str = in.nextLine();

        String[] words = str.split(" ");

        String smallest = words[0];
        String longest = words[0];
        for (int i = 0; i < words.length; i++) {
            if (smallest.length() < words[i].length()) {
                smallest = words[i];
            }else if (longest.length() > words[i].length()) {
                    longest = words[i];
                }
            }
            System.out.println(smallest);
            System.out.println(longest);

        }

    }
