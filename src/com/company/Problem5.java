package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Xpucu on 10/25/2015.
 */
public class Problem5 {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<Double>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            double randomValue = 0.00 + 666.00 * r.nextDouble();
            //System.out.println(randomValue);
            doubles.add(randomValue);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/doubles.list"))) {
            for (Double d : doubles) {
                oos.writeDouble(d);
            }


        } catch (IOException ioex) {
            System.out.println(ioex.toString());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/doubles.list"))) {
            for (int i = 0; i < doubles.size(); i++) {
                System.out.printf("%.2f\n", ois.readDouble());
            }
        } catch (IOException ioex) {
            System.out.println(ioex.toString());
        }
    }
}