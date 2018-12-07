package com.codes.strings;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lex<T> {
	
	private long factorial[];
	
    public Lex() {
    	factorial = new long[30];
    	long fact = 1;
		for (int i = 1; i <= 20; i++) {
			fact *= i;
			factorial[i] = fact;
		}
		factorial[0] = 1;
	}


	public void nthRank(List<T> itemList, Long rank, List<T> solution) {
        if (itemList.size() == 0) 
            return;
        int index = (int)Math.floor(rank/factorial[itemList.size()-1]);
        solution.add(itemList.remove(index));
        nthRank(itemList, rank % factorial[itemList.size()], solution);
    }
    

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Long rank = scanner.nextLong();
        
        char[] charArray = str.toCharArray();
        List<Character> strList = new LinkedList<Character>();
        for (char c: charArray)
        	strList.add(c);
        List<Character> sol = new LinkedList<Character>();
        
        Lex<Character> lex = new Lex<>();
        lex.nthRank(strList, rank, sol);
        System.out.println(sol);
        scanner.close();
       
    }
}
