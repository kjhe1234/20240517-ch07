package com.kjhe1234.member;

public class MainClass_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member_s member1 = new Member_s();
		member1.setId("tiger");
		member1.setPw("12345");
		member1.setName("홍길동");
		member1.setEmail("hong@abc.com"); 
		member1.setAge( 27);
		
		Member_s member2 = new Member_s();
		member2.setId("lion");
		member2.setPw("12345");
		member2.setName("이순신");
		member2.setEmail("lee@abc.com"); 
		member2.setAge( 32);

		
		Member_s member3 = new Member_s("whitecat","8888", "김유신", "white@abc.com", 41);
		// 생성자를 사용하여 필드값이 초기화된 객체 생성
		
	System.out.println("회원1이름:"+member1.getName());  // 홍길동
	System.out.println("회원1아이디:"+member1.getId());  
	System.out.println("회원2이름:"+member2.getName()); // 이순신
	System.out.println("회원3 이메일"+member3.getEmail());
	}




}
