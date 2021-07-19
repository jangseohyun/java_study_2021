/*==================================
++++++�ڹ��� �ֿ�(�߿�) Ŭ����++++++
- Wrapper Ŭ����
====================================
�� Test128.java
==================================*/


//import java.math.BigDecimal;
//import java.math.MathContext;
import java.math.*;


public class Test128
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		// movePointLeft(): �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println("��� Ȯ��: "+b);	//--��� Ȯ��: 123456.789123456789

		BigDecimal t1 = new BigDecimal("400.0");
		BigDecimal t2 = new BigDecimal("6.0");

		BigDecimal t3 = t1.divide(t2, 3);
		BigDecimal t4 = t1.divide(t2, 2);
		System.out.println("t3: "+t3);	//--t3: 66.6
		System.out.println("t4: "+t4);	//--t4: 66.7

		// ������(��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´�. �� ����)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		// �� BigDecimal c = a.divide(b, 1);
		System.out.println("c: "+c);	//--c: 1000.000000000

		System.out.println(BigDecimal.ROUND_DOWN);	//--1
		// ROUND_DOWN(Ŭ����-static, ���ȭ-final ����)

		BigDecimal d = a.divide(b, 5);
		System.out.println("d: "+d);	//--d: 1000.000000000
		
		// ��ȿ�� �ڸ�: �Ҽ��� ���� 5��° �ڸ�(�� ��° ���ڰ� 5)
		BigDecimal e = a.divide(b, 5, BigDecimal.ROUND_DOWN);
		// �� BigDecimal e = a.divide(b, 5, 1);
		System.out.println("e: "+e);	//--e: 1000.00000

		System.out.println(BigDecimal.ROUND_CEILING);	//--2
		System.out.println(BigDecimal.ROUND_FLOOR);		//--3
		// ROUND_*: ��ü�� Ȱ���ϴ� �������� �������� ���� ���� ������ �����ص� ��


		//�߰� ���� ����
		//BigDecimal result = t1.divide(t2);
		//System.out.println("result: "+result);	//--���� �߻�(java.lang.ArithmeticException)

		// t1.divide(t2);			//-- t1�� t2�� ���� �� �� ������ (��, ���� �������� ���� ��� ���� �߻�)
		// t1.divide(t2, b);		//-- t1�� t2�� ���� �� �� ������ (��, b ���(���)���� ó���ض�)
									//-- �ø� / ����(����) / �ݿø�
		// t1.divide(t2, a, b);

		System.out.println("BigDecimal.ROUND_UP: "+BigDecimal.ROUND_UP);					//--BigDecimal.ROUND_UP: 0
		System.out.println("BigDecimal.ROUND_DOWN: "+BigDecimal.ROUND_DOWN);				//--BigDecimal.ROUND_DOWN: 1
		System.out.println("BigDecimal.ROUND_CEILING: "+BigDecimal.ROUND_CEILING);			//--BigDecimal.ROUND_CEILING: 2
		System.out.println("BigDecimal.ROUND_FLOOR: "+BigDecimal.ROUND_FLOOR);				//--BigDecimal.FLOOR: 3
		System.out.println("BigDecimal.ROUND_HALF_UP: "+BigDecimal.ROUND_HALF_UP);			//--BigDecimal.HALF_UP: 4
		System.out.println("BigDecimal.ROUND_HALF_DOWN: "+BigDecimal.ROUND_HALF_DOWN);		//--BigDecimal.HALF_DOWN: 5
		System.out.println("BigDecimal.ROUND_HALF_EVEN: "+BigDecimal.ROUND_HALF_EVEN);		//--BigDecimal.HALF_EVEN: 6
		System.out.println("BigDecimal.ROUND_UNNECESSARY: "+BigDecimal.ROUND_UNNECESSARY);	//--BigDecimal.UNNECESSARY: 7

		System.out.println(MathContext.DECIMAL32);	//--precision=7 roundingMode=HALF_EVEN
		System.out.println(MathContext.DECIMAL64);	//--precision=16 roundingMode=HALF_EVEN
		System.out.println(MathContext.DECIMAL128);	//--precision=34 roundingMode=HALF_EVEN

		BigDecimal result = t1.divide(t2, MathContext.DECIMAL32);
		System.out.println(result);
	}
}