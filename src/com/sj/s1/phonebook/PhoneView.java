package com.sj.s1.phonebook;

import java.util.ArrayList;

public class PhoneView {
	public void phoneviewAll(ArrayList<PhonebookDTO> al) {
		for (int i = 0; i < al.size(); i++) {
			System.out.println("이름 : " + al.get(i).getName());
			System.out.println("별명 : " + al.get(i).getNickname());
			System.out.println("이메일 : " + al.get(i).getEmail());
			System.out.println("전화번호 : " + al.get(i).getPhonenumber());
			System.out.println("생일 : " + al.get(i).getBirthday());
			System.out.println("-------------------------------------------");
		}
	}

	public void phoneview(PhonebookDTO pd) {
		if (pd != null) {
			System.out.println("이름 : " + pd.getName());
			System.out.println("별명 : " + pd.getNickname());
			System.out.println("이메일 : " + pd.getEmail());
			System.out.println("전화번호 : " + pd.getPhonenumber());
			System.out.println("생일 : " + pd.getBirthday());
			System.out.println("-------------------------------------------");
		} else {
			System.out.println("정보가 없습니다.");
		}
	}

}
