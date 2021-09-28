package co.eju.prj;

public abstract class Animal {
		//자기자신을 인스턴스로 생성못함 = Animal animal = new Animal(); << 이렇게 하면 안된다
		//추상 클래스 라는 뜻 //class만존재하고 본체가없는것 //하나 이상의 abstract메소드를 갖고있거나 몸체가 비어있는경우
	public abstract void run(); //인터페이스에서는 이렇게 선언하기 //원형만있고 뭄체{} 중괄호가없는경우
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
		
}
