package co.eju.prj;

import co.eju.prj.friend.CompanyFriend;
import co.eju.prj.friend.Friend;
import co.eju.prj.friend.SchoolFriend;

public class MainApp {
//	public static void main(String[] args) {
	// DoWhileTest doWhileTest = new DoWhileTest();
	// doWhileTest.run(); //정보은폐라는 뜻

//		Animal man = new Man(); //초기화 시켜주는 것 동물중에 사람이 있는데 new Man으로 초기화하겟다
//		man.run();
//		man.sleep();

//		Animal bird = new Bird();
//		bird.run();
//		bird.sleep();

	// 하부객체는 직접선언도가능함
//		Man man2 = new Man();
//		man2.run();
	// man2.sleep();

//	}

	public static void main(String[] args) {

		Friend schoolFriend = new SchoolFriend();
		schoolFriend.name = "홍길동";
		schoolFriend.tel = "010-1111-1111";
		schoolFriend.address = "대구광역시 중구";
		schoolFriend.friendPrint();

		Friend comFriend = new CompanyFriend();
		comFriend.name = "홍길순";
		comFriend.tel = "010-2222-2222";
		comFriend.address = "서울시 종로구";
		comFriend.friendPrint();

	}

}
