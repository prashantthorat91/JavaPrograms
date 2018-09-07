package practice;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class pqr {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\Prashant\\Desktop\\ABC.txt"));
		String line = null;
		int wordCount=0;
		HashMap<String, Integer> map = new HashMap<>();
		while((line=buff.readLine())!=null) {
			System.out.println(line);
			String[] word = line.split(" ");
			for(int i=0;i<word.length;i++) {
				if(map.containsKey(word[i])) {
					map.put(word[i], map.get(word[i])+1);
				}
				else {
					map.put(word[i], 1);
				}
				wordCount++;
			}
			
		}
		System.out.println("count of word is :"+wordCount);
		System.out.println(map);
	
	
	}

}


	

