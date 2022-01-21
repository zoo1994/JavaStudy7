package com.sj.s1.phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneMenu {
Scanner sc;
	
	public void phonebook() {
		ArrayList<PhonebookDTO> al = new ArrayList<>();
		PhonebookService ps = new PhonebookService();
		PhoneView pv = new PhoneView();
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
				pv.phoneviewAll(al);
				
			} else if (select == 2) {
				pv.phoneview(ps.searchDTO(al));
			} else if (select == 3) {
				PhonebookDTO pd = ps.addphonebook();
				al.add(pd);
				
			} else if (select == 4) {
				ps.removePhone(al);
			} else if (select == 5) {
				System.out.println("프로그램이 종료됩니다.");
				cheak = false;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}
	}
	
	
	


}

