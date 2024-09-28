package io;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileReader fd = new FileReader("/home/xz/code/java_study/ing/Leetcode_Hot/fourth/src/io/example.txt")){
            int data;
            while((data = fd.read()) != -1){
                System.err.println((char) data);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
