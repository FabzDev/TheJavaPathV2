
package edu.fabzdev.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TextReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(TextReader.class.getResourceAsStream("quijote.txt")));
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
    
    }
    
}
