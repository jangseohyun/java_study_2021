/*==================================
++++++++�ڹ� �⺻ ���α׷���++++++++
-�ڹ� �ҽ� �ڵ� �Է� �� ������ �ǽ�
-������ �ڷ���
====================================
�� Test003.java
==================================*/


public class Test003 
{
	public static void main(String[] args)
	{
		int a;				//���� ����
		a = 10;				//���� �ʱ�ȭ(���� a�� 10�� ����)
		int b = 20;			//���� ���� �� �ʱ�ȭ
		int c;
		c = a + b;			//���� �� ó��(a�� b�� ���� ������ ������� ���� c�� ����)

		System.out.println(c);		

		//System.out.println(a b c);		//���� �߻�(������ ����)

		System.out.println("a: "+a);
		//�� ���� ������(+) ��
		//�ǿ����� �� ��� �ϳ��� ���ڿ� ������ �����Ͱ� �����Ѵٸ�
		//��������ڷμ��� ����� �����ϴ� ���� �ƴ϶�
		//���ڿ� ���� �����ڷμ��� ����� �����ϰ� �ȴ�.

		System.out.println("a: "+a+", b: "+b+", c: "+c);
		//a: 10, b: 20, c:30

		System.out.println("���� a: "+a);
		System.out.println("���� b: "+b);
		System.out.println("a�� b�� ���� �����: "+c);
		/*
		���� a: 10
		���� b: 20
		a�� b�� ���� �����: 30
		*/

		System.out.println("���� a: "+a+"\n���� b: "+b+"\na�� b�� ���� �����: "+c);
		/*
		���� a: 10
		���� b: 20
		a�� b�� ���� �����: 30
		*/

	}
}


/*
[���� ���]
30
a: 10
a: 10, b: 20, c: 30
���� a: 10
���� b: 20
a�� b�� ���� �����: 30
���� a: 10
���� b: 20
a�� b�� ���� �����: 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/