package com.sj.s1.phonebook;

import java.util.ArrayList;
import java.util.HashMap;

public class PhonebookMain {

	public static void main(String[] args) {
		PhoneMenu pm = new PhoneMenu();
		
		pm.phonebook();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>> ();
		
		map.put("a", al);
		map.put("b", al2);

	}

}
