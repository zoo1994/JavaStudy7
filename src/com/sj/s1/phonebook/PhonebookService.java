package com.sj.s1.phonebook;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class PhonebookService {
	
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
		String s= sc.next();
		int year = Integer.parseInt(s.substring(0,4));
		int month = Integer.parseInt(s.substring(4,6));
		int date = Integer.parseInt(s.substring(6));
		Calendar calendar = Calendar.getInstance();
		calendar.set(year,month-1,date);
		pd.setBirthday(calendar);
		return pd;
	}
	
	public PhonebookDTO searchDTO(ArrayList <PhonebookDTO> al) {
		sc= new Scanner(System.in);
		PhonebookDTO pd = null;
		System.out.println("검색할 명단의 이름을 입력하세요.");
		String name = sc.next();
		for(int i = 0; i<al.size();i++) {
			if(al.get(i).getName().equals(name)) {
				pd = al.get(i);
				break;
			}
		}
		
		return pd;
	}
	
	public void removePhone(ArrayList<PhonebookDTO>al) {
		sc=new Scanner(System.in);
		System.out.println("삭제할 명단의 이름을 입력하세요");
		String name = sc.next();
		boolean cheak = true;
		for(int i = 0; i<al.size();i++) {
			if(name.equals(al.get(i).getName())) {
			System.out.println(al.get(i).getName()+"의 정보가 삭제되었습니다.");
			al.remove(i);
			cheak = false;
			break;
			}
		}
		if (cheak) {
			System.out.println("입력한 명단이 없습니다.");
		}
	}
}
