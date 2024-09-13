
package org.howard.edu.lsp.assignment2;

import java.io.IOException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Word_Counting {
	
	public static void main(String[] args) throws IOException {
        //Create relative file path, input scanner 
	
	
        FileInputStream fin = new FileInputStream("src/Words.txt");
        Scanner FileInput = new Scanner(fin, "UTF-8");
        // .useDelimiter method allows the creation of separate tokens for non-word characters
        FileInput.useDelimiter("\\W+");
        
        
        
        //Create ArrayList
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        
        //Read through .txt and find the words
        while(FileInput.hasNext()) 
        {
            //Get the next word
            String nextWord = FileInput.next();
            //Determine if the word is in array
            if(words.contains(nextWord))
            {
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index) + 1);
            }
            else
            {
                words.add(nextWord);
                count.add(1);
            }
            
        }
        //close method ensures file is no longer opened so results can be printed.
        FileInput.close();
        fin.close();
        System.out.println("Word Count:");
        //Print results
        for(int i = 0; i < words.size(); i++)
        {
            System.out.print(words.get(i) + ": " + count.get(i) + " occurence \n");
        }
       
    }
}