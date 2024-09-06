package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class WordCounting {

	public static void main(String[] args) {
		//creating variables
		Map<String, Integer> wordHash = new HashMap<String, Integer>();
		BufferedReader reader = null;
		
		try {
			//reading the words.txt file
			reader = new BufferedReader(new FileReader("src/org/howard/edu/lsp/assignment2/words.txt"));
			//removing any special characters on the first line of the text file
			String currentLine = reader.readLine().replaceAll("[^a-zA-Z]", " ");
						
			while(currentLine != null) {
				//make all the words lower case
				//Easier to compare words regardless if it's upper case or lower case
				String words[] = currentLine.toLowerCase().split(" ");
				//currentLine = reader.replaceAll("[^a-zA-Z]", "");
				
				
				for(String word : words) {
					//String word1 = word.replaceAll("[^a-zA-Z]", "");
					if (!word.isBlank()) {
						//each word is being looked at to see if there's any special characters
						String word1 = word.replaceAll("[^a-zA-Z]", "");
						if(wordHash.containsKey(word1)) {
							//if the word exist in the wordHash, then the count goes up.
							wordHash.put(word1, wordHash.get(word1)+1);
						}else {
							//if this is the first time the word is being up, just add 1 to the count
							wordHash.put(word1, 1);
						}
					}
				}
				//again to the next line in the text file
				currentLine = reader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//printing out the word and the count
		wordHash.forEach((k, v) -> System.out.println(k + "  " + v));

	}

}
