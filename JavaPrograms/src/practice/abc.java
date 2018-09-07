package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class abc {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\Prashant\\Desktop\\ABC.txt"));
		String line = null;
		int wordCount =0;
		int charCount = 0;
		int lineCount=0;
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map1 = new HashMap<>();
		while((line= buffer.readLine())!=null) {
			System.out.println(line);
			String[] word = line.split(" ");
			char[] ch = line.toCharArray();
			for(Character ch2: ch) {
				if(map.containsKey(ch2)) {
					map1.put(ch2, map.get(ch2)+1);
				}else {
					map1.put(ch2, 1);
				}
				charCount++;
			}
			for(String words: word) {
				if(map.containsKey(words)) {
					map.put(words, map.get(words)+1);
				}
				else {
					map.put(words, 1);
				}
				wordCount++;
			}
			lineCount++;
		}
		System.out.println("Count of all word is : "+map);
		System.out.println("Count of all character is : "+map1);
		System.out.println("total no. of words is : "+wordCount);
		System.out.println("total no. of chaeacter is : "+charCount);
		System.out.println("total no. of lines is : "+lineCount);
	}

}
