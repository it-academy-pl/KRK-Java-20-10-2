package pl.itacademy.lesson13.exceptions;

import java.io.*;

public class CatchOrderDemo {
    public static void main(String[] args) {
        File file = new File("c:/tmp");
        try (InputStream is = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(is)) {

        } catch (FileNotFoundException e) {
            System.out.println("Hey user, please check the file name, because I can't find it!");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Hey user, I have found the file, but can't read it! Please, do something!");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Sorry, but something unexpected happens.");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

        try (InputStream is = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(is)) {

        } catch (FileNotFoundException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
