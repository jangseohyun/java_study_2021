/*==================================
++++++�ڹ��� �ֿ�(�߿�) Ŭ����++++++
- Wrapper Ŭ����
====================================
�� Test129.java
==================================*/


public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);			//--�ڽ�
		Integer i2 = new Integer(i);	//--�ڽ�

		System.out.println(b2);
		System.out.println(i2);

		print(b2);	//--���� �ڽ� �� �� ĳ����
		print(i2);	//--���� �ڽ� �� �� ĳ����
	}
	
	// Object: � ��ü�� �޾ƿ� �� �ֱ� ������ �������� ������� ����
	/*
	static void print(Object obj)
	{
		System.out.println(obj);
	}
	*/

	// Number
	// �� java.lang.Number Ŭ����(�߻� Ŭ����)��
	//    ��� Wrapper Ŭ�������� �θ� Ŭ����(���� Ŭ����, ���� Ŭ����)�̴�.
	//    b2, i2 �ڷ����� Number n�� �Ѿ���鼭 ���� �ڽ�-�� ĳ������ �Ͼ�� �ȴ�.
	static void print(Number n)
	{
		System.out.println(n);
	}
}