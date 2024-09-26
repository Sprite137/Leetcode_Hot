package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("/home/xz/code/java_study/ing/Leetcode_Hot/fourth/src/io/example.txt")){
            int data;
            while((data = fileInputStream.read())!= -1){
                System.err.println((char)data);
            }
        }


    }
}
