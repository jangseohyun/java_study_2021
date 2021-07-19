/*==================================
++++++자바의 주요(중요) 클래스++++++
- Wrapper 클래스
====================================
◎ Test130.java
==================================*/


public class Test130
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);	// 2147483647
		System.out.println(Integer.MIN_VALUE);	// -2147483647

		System.out.println(Long.MAX_VALUE);		// 9223372036854775807
		System.out.println(Long.MIN_VALUE);		// -9223372036854775807

		System.out.println(Double.MAX_VALUE);	// 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);	// 4.9E-324

		// e 표기법 (IEEE 754)

		System.out.println();

		//System.out.println("1: "+3/0);		// 에러 발생 (java.lang.ArithmeticException)
		System.out.println("2: "+3.0/0);		// 2: Infinity
		System.out.println("3: "+-3.0/0);		// 3: -Infinity
		System.out.println("4: "+(3.0/0 == 3.0/0));		// 4: true (Infinity와 Infinity 간의 크기 비교)
		System.out.println("5: "+(3.0/0 == -3.0/0));	// 5: false

		// 『Double.isInfinite()』
		System.out.println("6: "+Double.isInfinite(3.0/0));		// 6: true
		System.out.println("7: "+Double.isInfinite(-3.0/0));	// 7: true

		System.out.println("8: "+(3.0/0 + -3.0/0));		// 8: NaN (Not a Number)
		System.out.println("9: "+0.0/0);				// 9: NaN
		System.out.println("10: "+-0.0/0);				// 10: NaN
		System.out.println("11: "+(0.0/0 == 0.0/0));	// 11: false (NaN과 NaN 간의 크기 비교)
		System.out.println("12: "+(0.0/0 != 0.0/0));	// 12: true

		// ※ NaN(Not a Number) 값과 임의의 수를
		//    『==』 연산자를 통해 비교 연산을 수행하게 되면
		//    결과는 언제나 『false』를 반환한다.

		System.out.println("13: "+Double.isNaN(0.0/0));	// 13: true
	}
}