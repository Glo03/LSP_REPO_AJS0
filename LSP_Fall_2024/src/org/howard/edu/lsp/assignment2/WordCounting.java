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
			String currentLine = reader.readLine().replaceAll("[^a-zA-Z]", " ");
						
			while(currentLine != null) {
				String words[] = currentLine.toLowerCase().split(" ");
				//currentLine = reader.replaceAll("[^a-zA-Z]", "");
				
				
				for(String word : words) {
					//String word1 = word.replaceAll("[^a-zA-Z]", "");
					if (!word.isBlank()) {
						String word1 = word.replaceAll("[^a-zA-Z]", "");
						if(wordMap.containsKey(word1)) {
							wordMap.put(word1, wordMap.get(word1)+1);
						}else {
							wordMap.put(word1, 1);
						}
					}
				}
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
		wordMap.forEach((k, v) -> System.out.println(k + "  " + v));

	}

}
