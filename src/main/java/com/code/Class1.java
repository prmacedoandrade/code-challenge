package com.code;

import java.util.HashMap;
import java.util.Map;


//Solve the problem [Java]
//Given a string str, create a function that returns the first repeating character.
//If such character doesn't exist, return the null character '\0'.
//
//Example 1:
//
//Input: str = "inside code"
//
//Output: 'i'
//
//Example 2:
//
//Input: str = "programming"
//
//Output: 'r'
//
//Example 3:
//
//Input: str = "abcd"
//
//Output: '\0'
//
//Example 4:
//
//Input: str = "abba"
//
//Output: 'b'
public class Class1 {

	public static void main(String[] args) {
	
		System.out.println(firstRepeatingCharacter("insidecode"));
		System.out.println(firstRepeatingCharacter("programming"));
		System.out.println(firstRepeatingCharacter("abcd"));
		System.out.println(firstRepeatingCharacter("abba"));
		

	}

	public static char firstRepeatingCharacter(String str){
        
		
        char [] chars = str.toCharArray();  
        Map<Character, Boolean> mapC = new HashMap();
        
        for(int i = 0; i < chars.length; i++){
            
            if(mapC.containsKey(chars[i])){
                return chars[i];
            }
            
            mapC.put(chars[i], true);
            
        }
        
        return '\0';
    }

}
