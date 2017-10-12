package ij.util;

import java.util.*;

public class StringUtil {
	
	public static String[] split(String string, char sep) {
		String result[]=new String[count(string, sep)+1];
		int index=0; 
		int p=0;
		for(int i=0; i<string.length(); ++i) {
			if(string.charAt(i)==sep) {
				result[index++]=string.substring(p, i);
				p=i+1;
			}
		}
		result[index]=string.substring(p);
		return result;
	}
	
	public static int count(String string, char ch) {
		int n=0;
		for (int i=0; i<string.length(); ++i) {
			if (string.charAt(i) == ch) ++n;
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("a.bb.c.ddd",'.'));
		System.out.println(Arrays.toString(split("a.bb.c.ddd",'.')));
	}

}
