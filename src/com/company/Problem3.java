package com.company;

import java.io.*;

/**
 * Created by Xpucu on 10/25/2015.
 */
public class Problem3 {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        try (BufferedReader fileReader = new BufferedReader(new FileReader("res/words.txt"))){

            while (true){
                String line = fileReader.readLine();
                if (line == null) break;

                for(int i = 0; i < line.length(); i++)
                {
                    char c = Character.toLowerCase(line.charAt(i));
                    //System.out.println(c);
                   // counter = counter + (int)c;
                    if ("aeiou".indexOf(c) != -1) {
                        // handle vowel case
                        vowels++;
                    } else if ("!,.?".indexOf(c) != -1) {
                        punctuation++;
                    } else if ("0123456789@#$% ".indexOf(c) != -1) {
                        // do nothing
                    } else {
                        consonants++;
                    }
                }
            }
        }
        catch (IOException ioex) {
            System.out.println("Cannot read file");
        }


        try (PrintWriter output = new PrintWriter(new FileWriter("res/count-chars.txt", true))){

            output.write("Vowels: " + vowels + "\n");
            output.write("Consonants: " + consonants + "\n");
            output.write("Punctuation: " + punctuation + "\n");
        }
        catch (IOException ioex){
            System.out.println("Cannot write to file");
        }
    }
}
