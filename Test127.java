/*==================================
++++++자바의 주요(중요) 클래스++++++
- Wrapper 클래스
====================================
◎ Test127.java
==================================*/


import java.math.BigInteger;


public class Test127
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;				//--에러 발생
		//long b1 = 123456789123456789L;
		//long c1 = 123456789123456789123456789L;	//--에러 발생

		BigInteger a = new BigInteger("123456789123456789123456789");
		BigInteger b = new BigInteger("123456789123456789123456789");

		//System.out.println(a+b);	//--에러 발생
		//BigInteger c = a + b;		//--에러 발생
		//System.out.println(c);	//--에러 발생
		// ※ 일반적인 산술연산자를 통한 연산 불가능

		// 더하기
		BigInteger c = a.add(b);
		System.out.println(c);			//--246913578246913578246913578

		// 빼기
		BigInteger d = a.subtract(b);	//--0
		System.out.println(d);

		// 곱하기
		BigInteger e = a.multiply(b);	//--15241578780673678546105778281054720515622620750190521
		System.out.println(e);

		// 나누기
		BigInteger f = a.divide(b);
		System.out.println(f);			//--1

		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승: "+g.pow(3));	//--2의 3승: 8
	}
}