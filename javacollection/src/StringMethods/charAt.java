package StringMethods;

import java.util.ArrayList;

public class charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charat();
	}

	public static void charat(){
	
		String s = "Hariprasath";
	
		//returns the char value at the 4th index  
		char ch = s.charAt(3);
		System.out.println(ch);
	
	
		//StringIndexOutOfBoundsException at run time. when we call out of Char
		
//		char ch1 = s.charAt(11); // Will give an Error because the n-1 is the concept
//		System.out.println(ch1);
	
		 // Fetching first character 
	
		int s1 = s.length();
		System.out.println("\nCharacter at 0 index is: "+ s.charAt(0));
		
	    // The last Character is present at the string length-1 index  
		System.out.println("\nCharacter at last index is: "+s.charAt(s1-1));
		//or
		System.out.println("\nCharacter at last index is: "+s.charAt(s.length()-1));
		
	
		//Presented at Odd Positions by Using the charAt() Method
		
		for(int i=0; i<=s.length()-1; i++) {
			if(i%2!=0) {
				System.out.println("Char at "+i+" place "+s.charAt(i));
			}
			
		}
	
		//Counting Frequency of a character in a String by Using the charAt() Method
		String str = "Welcome to Javatpoint portal";  
        int count = 0;  
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 't') {  
                count++;  
            }  
        }  
        System.out.println("Frequency of t is: "+count);  
	          
        
	}
	
	
	
	//Counting the Number of Vowels in a String by Using the chatAt() Method

	   ArrayList<Character> s10;


	   charAt(){
		  s10 = new ArrayList<Character>();
		  s10.add('A'); s10.add('E'); s10.add('I'); s10.add('O'); s10.add('U');
		  s10.add('a'); s10.add('e'); s10.add('i'); s10.add('o'); s10.add('u');
		  
	   }
		
	// a method that checks whether the character c is a vowel or not     
	   	private boolean isVowel(char c) {
	   		
	   		for(int i=0; i<s10.size(); i++) {
	   			if(c == s10.get(i)) {
	   		return true;
	   			} 		
	   			}
	   		return false; 		
	   		}
	   
	 // a method that calculates vowels in the String s  
	   	public int countVowels(String s) {
	   		int vowelCount =0;// store total number of vowels  
	   		int size = s.length();// size of string
	   		for (int j=0; j<size; j++) {
	   			char c =s.charAt(j);
	   			if(isVowel(c)) {
	   			// vowel found!  
	   			// increase the count by 1  
	   				vowelCount = vowelCount + 1;  
	   			}
	   		}
	   		
	   		return vowelCount;
	   	}
	   
	   
	   
		  
	   }























}
