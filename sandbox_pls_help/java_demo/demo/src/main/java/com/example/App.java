package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, URISyntaxException
    {
        String fileToReadPath = "fileToRead.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileToReadPath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String content = sb.toString();
            System.out.println(String.format("This is the content:\n\"%s\" ", content.strip()));
        } finally {
            br.close();
        }
    }
}
