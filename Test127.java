/*==================================
++++++�ڹ��� �ֿ�(�߿�) Ŭ����++++++
- Wrapper Ŭ����
====================================
�� Test127.java
==================================*/


import java.math.BigInteger;


public class Test127
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;				//--���� �߻�
		//long b1 = 123456789123456789L;
		//long c1 = 123456789123456789123456789L;	//--���� �߻�

		BigInteger a = new BigInteger("123456789123456789123456789");
		BigInteger b = new BigInteger("123456789123456789123456789");

		//System.out.println(a+b);	//--���� �߻�
		//BigInteger c = a + b;		//--���� �߻�
		//System.out.println(c);	//--���� �߻�
		// �� �Ϲ����� ��������ڸ� ���� ���� �Ұ���

		// ���ϱ�
		BigInteger c = a.add(b);
		System.out.println(c);			//--246913578246913578246913578

		// ����
		BigInteger d = a.subtract(b);	//--0
		System.out.println(d);

		// ���ϱ�
		BigInteger e = a.multiply(b);	//--15241578780673678546105778281054720515622620750190521
		System.out.println(e);

		// ������
		BigInteger f = a.divide(b);
		System.out.println(f);			//--1

		// ������
		BigInteger g = new BigInteger("2");
		System.out.println("2�� 3��: "+g.pow(3));	//--2�� 3��: 8
	}
}