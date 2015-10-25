package com.company;

import java.io.*;

public class Problem1 {

    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("res/problem1.txt"))) {

            int counter = 0;
            while (true) {
                String line = fileReader.readLine();
                if (line == null) break;
                for(int i = 0; i < line.length(); i++)
                {
                    char c = line.charAt(i);
                    counter = counter + (int)c;

                }
                System.out.println(counter);
                counter = 0;
            }
        }
        catch (IOException ioex) {
            System.out.println("Cannot read file");
        }
    }
}
