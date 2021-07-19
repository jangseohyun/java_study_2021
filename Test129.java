/*==================================
++++++자바의 주요(중요) 클래스++++++
- Wrapper 클래스
====================================
◎ Test129.java
==================================*/


public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);			//--박싱
		Integer i2 = new Integer(i);	//--박싱

		System.out.println(b2);
		System.out.println(i2);

		print(b2);	//--오토 박싱 → 업 캐스팅
		print(i2);	//--오토 박싱 → 업 캐스팅
	}
	
	// Object: 어떤 객체든 받아올 수 있기 때문에 안전성이 보장되지 않음
	/*
	static void print(Object obj)
	{
		System.out.println(obj);
	}
	*/

	// Number
	// ※ java.lang.Number 클래스(추상 클래스)는
	//    모든 Wrapper 클래스들의 부모 클래스(슈퍼 클래스, 상위 클래스)이다.
	//    b2, i2 자료형이 Number n에 넘어오면서 오토 박싱-업 캐스팅이 일어나게 된다.
	static void print(Number n)
	{
		System.out.println(n);
	}
}