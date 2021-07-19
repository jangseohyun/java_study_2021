/*=========================
++++++++Ŭ���� ���++++++++
- ���(Inheritance)
===========================
�� Test109.java
=========================*/

/*
�� �޼ҵ� �������̵�(Method Overriding)�� Ư¡
   
   - �޼ҵ� �̸�, ���� Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
   - �ݵ�� ��� ���谡 �־�� �Ѵ�.
   - �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
     ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
     ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
     ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
     �������������ڴ� ��protected�� �Ǵ� ��public���̾�� �Ѵ�.
   - ��static��, ��final��, ��private�� �޼ҵ�� �������̵�(Overriding)�� �� ����.
   - Exception�� �߰��� �Ұ����ϴ�.
     ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ������ ���� ���׿�
	 ���ο� Exception�� �߰��ϴ� ���� �Ұ����ϴ�.
*/


// ���� Ŭ����, �θ� Ŭ����, super class
class SuperTest109
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ�: "+a+" : "+b+" : "+c);
	}
}


// ���� Ŭ����, �ڽ� Ŭ����, sub class
class SubTest109 extends SuperTest109
{
	protected int b = 100;

	public void print()
	{
		// System.out.println("Sub print() �޼ҵ�: "+a+" : "+b+" : "+c);	//--���� �߻�(������ ����)
		// ���� Ŭ����(SuperTest109)���� ����� ���� a(private)���� ������ �� ����.
		System.out.println("Sub print() �޼ҵ� : "+b+" : "+c);
		// Sub print() �޼ҵ� : 100 : 20

		System.out.println("Sub print() �޼ҵ� : "+super.b+" : "+c);
		// Sub print() �޼ҵ� : 10 : 20
		// ���� Ŭ����(SuperTest109)���� ����� ���� b�� �����ϱ� ���ؼ��� ��super�� Ű���� ���

		System.out.println("Sub print() �޼ҵ� : "+c);
		// Sub print() �޼ҵ� : 20
		System.out.println("Sub print() �޼ҵ� : "+this.c);
		// Sub print() �޼ҵ� : 20
		System.out.println("Sub print() �޼ҵ� : "+super.c);
		// Sub print() �޼ҵ� : 20
		//
	}

	@Override
	public void write()
	{
		// System.out.println("Sub print() �޼ҵ�: "+a+" : "+b+" : "+c);	//--���� �߻�(������ ����)
		// ���� Ŭ����(SuperTest109)���� ����� ���� a(private)���� ������ �� ����.
		System.out.println("Sub print() �޼ҵ� : "+b+" : "+c);
		// Sub print() �޼ҵ� : 100 : 20
	}
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test109
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest109) �ν��Ͻ� ����
		SubTest109 ob = new SubTest109();

		ob.print();
		// Sub print() �޼ҵ� : 100 : 20

		ob.write();
		// Sub print() �޼ҵ� : 5 : 10 : 20
		// �� write() �޼ҵ� �������̵� �� �� Sub print() �޼ҵ� : 100 : 20
		//    ���� Ŭ����(SuperTest109)���� ����� ���� a(private)���� ������ �� ����.
		//    ����, �̶� ������ ���� b�� �θ�κ��� �������� b�� �ƴ�
		//    �ڽ��� ���� b�� ���� Ȯ���� �� �ִ�.

		System.out.println("-------------------------------- ���м�");
		
		System.out.println(ob.b);
		System.out.println(((SuperTest109)ob).b);
		// �� ���� �θ�
		// �� �޼ҵ�� ������ �� �����Ͽ� �����ص� ��
		
		ob.write();
		((SuperTest109)ob).write();
		// ���⼭�� ���� �θ��� �� ��
	}
}


/*
[���� ���]
Sub print() �޼ҵ� : 100 : 20
Sub print() �޼ҵ� : 10 : 20
Sub print() �޼ҵ� : 20
Sub print() �޼ҵ� : 20
Sub print() �޼ҵ� : 20
Sub print() �޼ҵ� : 100 : 20
-------------------------------- ���м�
Sub print() �޼ҵ� : 100 : 20
100
10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/