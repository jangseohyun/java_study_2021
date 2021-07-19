/*===================================
++++++++++Ŭ������ �ν��Ͻ�++++++++++
-������(Constructor)
=====================================
�� Test074.java
===================================*/

/*
�� ������(Constructor)�� ����
   1. �޸� �Ҵ�
   2. �ʱ�ȭ

�� ������(Constructor)�� Ư¡
   1. �����ڴ� �޼ҵ������� �Ϲ� �޼ҵ�ó�� ȣ��� �� ������,
      ��ȯ �ڷ����� ���� �� ����.
	  (��void������ ���� �� ������ ���� ��ȯ�� ���� ����.
   2. �����ڴ� Ŭ������ �̸��� ������ �̸��� ������ �Ѵ�.
      (��ҹ��ڱ����� ��Ȯ�� ��ġ�ؾ� �Ѵ�.)
   3. �����ڴ� ��ü�� �����ϴ� ��������(�ν��Ͻ� ���� ����)
      ��new ������()���� ���·� ȣ��ȴ�.
	  (�ν��Ͻ� ���� �� �� �� ���� ȣ��ȴ�.)
*/


class NumberTest
{
	int num;

	// �ڵ����� ���ԵǴ� default ������
	//  -������ �������� �ڵ����� �����Ǵ� �� �����ڴ�
	//   ����� ���� �����ڰ� �������� ���� ��쿡�� ���������.
	/*
	NumberTest()
	{
		// �� ����ִ� ����
	}
	*/

	// ����� ���� �����ڸ� ������ָ� default �����ڰ� �ڵ� �������� ����
	NumberTest()
	{
		num = 10;
		System.out.println("����� ���� ������ ȣ��");
	}
		
	int getNum()
	{
		return num;
	}
}


// �� ��� Ŭ�������� �����ڰ� �����Ѵ�.
//    (����� ���� �����ڸ� ���� ������ ���� ���
//     ������ �������� default �����ڰ� �ڵ����� ���Եȴ�.)

public class Test074
{
	public static void main(String[] args)
	{
		// NumberTest Ŭ���� ��� �ν��Ͻ� ����
		NumberTest nt1 = new NumberTest();
		// �ν��Ͻ��� �����Ǵ� ��������
		// �̿� ���ÿ� ������ ȣ���� �̷������.

		/*
		NumberTest nt1 = new NumberTest();
								  +
							 NumberTest();
		*/

		System.out.println(nt1.getNum());	//--10

		nt1.num = 100;
		System.out.println(nt1.getNum());	//--100


		System.out.println("-----------------------");


		NumberTest nt2 = new NumberTest();
		
		System.out.println(nt2.getNum());	//--10
	}
}

/*
[���� ���]
����� ���� ������ ȣ��
10
100
-----------------------
����� ���� ������ ȣ��
10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/