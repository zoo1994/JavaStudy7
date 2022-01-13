package com.sj.s1.phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhonebookData {
	Scanner sc;
	
	public void phonebook() {
		ArrayList<PhonebookDTO> al = new ArrayList<>();
		PhoneMenu phonemenu = new PhoneMenu();
		boolean cheak = true;
		while (cheak) {
			this.sc = new Scanner(System.in);
			System.out.println("1. 전체명단 출력");
			System.out.println("2. 명단 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 명단 삭제");
			System.out.println("5. 프로그램 종료");
			int select = sc.nextInt();
			if (select == 1) {
				for(int i=0;i<al.size();i++) {
				System.out.println("이름 : " +al.get(i).getName());
				System.out.println("별명 : " +al.get(i).getNickname());
				System.out.println("이메일 : " +al.get(i).getEmail());
				System.out.println("전화번호 : " +al.get(i).getPhonenumber());
				System.out.println("생일 : " +al.get(i).getBirthday());
				System.out.println("-------------------------------------------");
				
				}
			} else if (select == 2) {
				System.out.println("검색할 명단의 이름을 입력하세요");
				String name = sc.next();
				boolean cheak1 = true;
				if(cheak) {
				for(int i=0;i<al.size();i++) {
					if(al.get(i).getName().equals(name)) {
						System.out.println("이름 : " +al.get(i).getName());
						System.out.println("별명 : " +al.get(i).getNickname());
						System.out.println("이메일 : " +al.get(i).getEmail());
						System.out.println("전화번호 : " +al.get(i).getPhonenumber());
						System.out.println("생일 : " +al.get(i).getBirthday());
						cheak1 = false;
						break;
					}
				}
				}else {System.out.println("입력된 번호가 없습니다.");}
			} else if (select == 3) {
				PhonebookDTO pd = phonemenu.addphonebook();
				al.add(pd);
				
			} else if (select == 4) {
				System.out.println("444444444");
			} else if (select == 5) {
				System.out.println("프로그램이 종료됩니다.");
				cheak = false;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}
	}
}
