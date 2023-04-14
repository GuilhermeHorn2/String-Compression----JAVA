package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		String a = "aabcccccaaa";
		System.out.println(Compress(a));
		
	}
	
    private static String Compress(String a) {
    	
    	//
    	
    	String b = ""; 
    	String c = "";
    	
    	String past = "";
    	int count = 0;
    	for(int i = 0;i < a.length();i++){
    		String x = a.substring(i,i+1);
    			
    		if(i == 0) {
    			past = x;
    			count++;
    			continue;
    		}
    		if(x.equals(past)){
    			count++;
    			
    			if(i == a.length()-1) {
    				b+= past;
    				c+= count;
    			}
    			
    			continue;
    		}
    		if(!x.equals(past)) {
    			
    			b += past;
    			c += count;
    			count = 1;
    			past = x;
    		}
    	}
    	
    	
    	String s = "";
    	
    	int j = 0;
    	int k = 0;
    	for(int i = 0;i < 2*b.length();i++){
    		
    		String x = b.substring(k, k+1);
    		String y = c.substring(j, j+1);
    		
    		if(i % 2 == 0){
    			s += x;
    			if(k+1 < b.length()) {
    				k++;
    			}
    		}
    		
    		if(i % 2 != 0) {
    			s += y;
    			if(j+1 < c.length()) {
    				j++;
    			}
    		}
    	}
    	
    	if(s.length() < a.length()) {
    		return s;
    	}
    	
    	return a;
    	
    }
		
	}
	
	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

