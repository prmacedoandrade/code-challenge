package com.code;

import java.util.HashSet;
import java.util.Set;


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
	
		//System.out.println(findPairBrute(new int[] { 4, 5, 1, -3, 6 }, 11));
		

	}

	public static char firstRepeatingCharacter(String str){
        
        char [] chars = str.toCharArray();  
        Set<Character> setC = new HashSet<>();
        
        for(int i = 0; i < chars.length; i++){
            
            if(setC.contains(chars[i])){
                return chars[i];
            }
            
            setC.add(chars[i]);
            
        }
        
        return '\0';
    }

}
