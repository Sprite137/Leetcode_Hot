package io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FIleWriterExample {
    public static void main(String[] args) {
        String s = "hello, I am a test file, the concept on it is nothing. \nI change the row. \n你好阿";
        try (FileWriter fw = new FileWriter("/home/xz/code/java_study/ing/Leetcode_Hot/fourth/src/io/example.txt")){
//            System.err.println(Arrays.toString(s.getBytes()));
            fw.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
