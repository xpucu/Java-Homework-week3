package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Xpucu on 10/25/2015.
 */
public class Problem4 {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("res/pic.jpg");
                FileOutputStream fos = new FileOutputStream("res/my-copied-picture.jpg")){
                byte[] buffer = new byte[4096];
                while (true) {
                    int i = fis.read(buffer, 0, buffer.length);
                    if(i <= 0) break;
                    fos.write(buffer, 0, i);
            }
        }
        catch (IOException ioex) {
            System.out.println(ioex.toString());
        }

    }
}
