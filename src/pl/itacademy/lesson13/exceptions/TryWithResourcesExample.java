package pl.itacademy.lesson13.exceptions;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        File file = null;
        InputStream is = null;
        BufferedInputStream bis = null;
        try {
            file = new File("c:/tmp");
            is = new FileInputStream(file);
            bis = new BufferedInputStream(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (InputStream inputStream = new FileInputStream(new File("c:/tmp"))) {
            int value = inputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
