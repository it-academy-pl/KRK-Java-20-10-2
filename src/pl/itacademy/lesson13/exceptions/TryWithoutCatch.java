package pl.itacademy.lesson13.exceptions;

import java.io.*;

public class TryWithoutCatch {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:/tmp/file.txt");
            InputStream is = new FileInputStream(file);
        } finally {
            System.out.println("Hello!");
        }
    }
}
