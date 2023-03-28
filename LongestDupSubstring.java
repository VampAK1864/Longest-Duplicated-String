// Author: Antonis Kyriakou
// Compilication command: LongestDupSubstring.java
// Execution command: java LongestDupSubstring

import java.util.Scanner;

public class LongestDupSubstring {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Load scanner.
		System.out.print("Give string: ");
		String word = scan.nextLine(); // User input.
		
		String substring = ""; // Empty Substring to keep the actual substring at the end of the program.
		
		int wordlength = word.length(); // Used to find out the numbers of the word that the user gave.
		
		for(int i = 0; i < wordlength; i++){    // The first "for" is used to check the letters of the string word that was given.
			
		    for(int j = i + 1; j < wordlength; j++){   // The second "for" checks the letters from the previous loop.              
		    	
		        String s = word.substring(i, wordlength); // The String "S" is used to find the word that was duplicated.
		        	String t = word.substring(j, wordlength); // The string "T" is used to add one more extra number to count the whole word.
		        		int minimumchar = Math.min(s.length(), t.length());  // The "Minimumchar" is used to found the minimum length of the strings "S" and "T". 
		        			String possibleSubstring = s.substring(0, minimumchar); // The string "PossibleSubstring" is used to save the possible substring of the word.
		        
		        	for(int search = 0; search < minimumchar; search++){  // This for checks if the possible substring of the word is actually the original duplicated word.
		        		
		        		if(s.charAt(search) != t.charAt(search)){  //Checks  if its not same letters.
		        			
		        			possibleSubstring = s.substring(0, search); //Then the possibleSubstring is the substring of string S.
		                break;
		        												}  
		        													}
		        
		        if(possibleSubstring.length() > substring.length()) // If this one is longest.
		        	substring = possibleSubstring; // Here you can count everything that you can.
		    										}  
											}  
		
		System.out.println("Longest sub is: " + substring); // Output of the duplicated word. 
		System.out.println("Longest sub size is: " + substring.length()); // Output word's length.
		
		scan.close(); // Closes the keyboard entry.
	}
}
