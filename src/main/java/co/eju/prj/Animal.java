package co.eju.prj;

public abstract class Animal {
		//�ڱ��ڽ��� �ν��Ͻ��� �������� = Animal animal = new Animal(); << �̷��� �ϸ� �ȵȴ�
		//�߻� Ŭ���� ��� �� //class�������ϰ� ��ü�����°� //�ϳ� �̻��� abstract�޼ҵ带 �����ְų� ��ü�� ����ִ°��
	public abstract void run(); //�������̽������� �̷��� �����ϱ� //�������ְ� ��ü{} �߰�ȣ�����°��
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
		
}
