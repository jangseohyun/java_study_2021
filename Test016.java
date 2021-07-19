/*=====================================
++++++++++자바 기본 프로그래밍++++++++++
-자바의 기본 입출력: printf()
=======================================
◎ Test016.java
=====================================*/


public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");

		// 서식 출력 메소드
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//--개행
		System.out.printf("12345678901234567890%n");	//--개행
		System.out.printf("%d+%d=%d\n", 10, 20, 30);

		System.out.printf("%d\n", 123);
		System.out.printf("%7d\n", 123);
		System.out.printf("%10d\n", 123);		//--10칸의 공백 확보, 숫자니까 우측 정렬, 7칸의 공백 생성
		System.out.printf("%010d\n", 123);

		System.out.printf("%d\n", 365);
		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);

		System.out.printf("%d\n", +365);
		System.out.printf("%d\n", -365);
		//System.out.printf("%-d\n", 365);		//--에러 발생(런타임 에러)
		System.out.printf("-%d\n", 365);

		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);

		//System.out.printf("%d\n", 'A');		//--에러 발생(런타임 에러)
		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");	//--에러 발생(런타임 에러)

		System.out.printf("%s\n", "ABCD");

		System.out.println();		//--개행

		System.out.printf("%h\n", 365);			//--16진수
		System.out.printf("%o\n", 24);			//--8진수
		
		System.out.println();		//--개행

		System.out.printf("%s\n", "true");		//--문자형 true
		System.out.printf("%b\n", true);		//--boolean형 true
		System.out.printf("%s\n", true);		//--자동으로 형 변환 돼서 문자형 true로 결과는 뜨지만 문법에는 맞지 않기 때문에 지양
		
		System.out.println();		//--개행

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236);
		System.out.printf("%.2f\n", 123.231);
		System.out.printf("%8.2f\n", 123.236);
		System.out.printf("%2.2f\n",123.1234);	//--표현해야 하는 것보다 좁은 범위가 확보되면 표현해야 하는 것 전부 표현됨
	}
}


/*
[실행 결과]
10+20=30
123
    123
       123
0000000123
365
+365
+365
365
-365
-365
(365)
365
A
ABCD

16d
30

true
true
true

123.230000
123.23
123.24
123.23
  123.24
123.12
계속하려면 아무 키나 누르십시오 . . .
*/