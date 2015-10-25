package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Xpucu on 10/25/2015.
 */
public class Problem2 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader("res/problem2.txt"))){

            while (true){
                String line = fileReader.readLine();
                if (line == null) break;
                lines.add(line.toUpperCase());
            }
        }
        catch (IOException ioex) {
            System.out.println("Cannot read file");
        }

        try (PrintWriter output = new PrintWriter(new FileWriter("res/problem2.txt"))){
            for (String s : lines) {
                output.write(new String(s) + "\n");
            }
        }
        catch (IOException ioex){
            System.out.println("Cannot write to file");
        }

    }
}

