/*===================================
++++++++++Ŭ������ �ν��Ͻ�++++++++++
-������(Constructor)
=====================================
�� Test075.java
===================================*/


class NumberTest2
{
	int num;
	
	/*
	NumberTest2()
	{
	}
	*/

	// ����� ���� ������ �� ���ڸ� ���޹޴� ������
	NumberTest2(int n)
	{
		num = n;

		// �ð����� Ȯ���� ������ ��� ���� ����
		System.out.println("���� ����: "+n);
	}
	
	int getNum()
	{
		return num;
	}
}


public class Test075
{
	public static void main(String[] args)
	{
		// NumberTest2 Ŭ���� ����� �ν��Ͻ� ����
		// NumberTest2 ob = new NumberTest2();
		// ����� ���� �����ڸ� ������ ���Ŀ��� ������ ���� �߻�
		// NumberTest2 Ŭ�������� ����� ���� �����ڰ� �����ϰ� �ִ� ��Ȳ�̱� ������
		// ��default �����ڡ� (NumberTest2())�� �ڵ����� ��������(���Ե���) �ʴ´�

		// NumberTest2 Ŭ���� ����� �ν��Ͻ� ����
		NumberTest2 ob = new NumberTest2(10);
		System.out.println("�޼ҵ� ��ȯ ��: "+ob.getNum());	//--10

		// NumberTest2 Ŭ���� ����� �ν��Ͻ� ����
		NumberTest2 ob2 = new NumberTest2(2456);
		System.out.println("�޼ҵ� ��ȯ ��: "+ob2.getNum());	//--2456
	}
}


/*
[���� ���]
���� ����: 10
�޼ҵ� ��ȯ ��: 10
���� ����: 2456
�޼ҵ� ��ȯ ��: 2456
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/