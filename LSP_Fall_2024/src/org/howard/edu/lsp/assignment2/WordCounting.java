package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class WordCounting {

	public static void main(String[] args) {
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("words.txt"));
			String currentLine = reader.readLine();
			
			while(currentLine != null) {
				String words[] = currentLine.toLowerCase().split(" ");
				
				for(String word : words) {
					
					if(wordMap.containsKey(word)) {
						wordMap.put(word, wordMap.get(word+1));
					}else {
						wordMap.put(word, 1);
					}
				}
				currentLine = reader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
