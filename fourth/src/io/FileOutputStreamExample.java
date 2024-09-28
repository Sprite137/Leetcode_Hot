package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String s = "hello, I am a test file, the concept on it is nothing. \n I change the row.";
        try (FileOutputStream fos = new FileOutputStream("/home/xz/code/java_study/ing/Leetcode_Hot/fourth/src/io/example.txt")){
            System.err.println(Arrays.toString(s.getBytes()));
            fos.write(s.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
