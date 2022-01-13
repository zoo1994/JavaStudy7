package com.sj.s1.phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneMenu {
	private Scanner sc;
	public PhonebookDTO addphonebook() {
		sc= new Scanner(System.in);
		PhonebookDTO pd = new PhonebookDTO();
		System.out.println("추가할 명단의 이름을 입력하세요.");
		pd.setName(sc.next());
		System.out.println("추가할 명단의 별명을 입력하세요.");
		pd.setNickname(sc.next());
		System.out.println("추가할 명단의 이메일을 입력하세요.");
		pd.setEmail(sc.next());
		System.out.println("추가할 명단의 전화번호를 입력하세요.");
		pd.setPhonenumber(sc.next());
		System.out.println("추가할 명단의 생일을 입력하세요.");
		pd.setBirthday(sc.next());
		return pd;
	}

	public void phoneshow() {
		
	}
	
}
