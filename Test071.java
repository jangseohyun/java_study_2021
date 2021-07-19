/*===========================
+++++클래스와 인스턴스+++++
=============================
◎ Test071.java
===========================*/

// ○ 실습 문제
//    원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// 클래스명: CircleTest → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예시
// 반지름 입력: xx
// >> 반지름이 xx인 원의
// >> 넓이: xx.xx
// >> 둘레: xx.xx
// >> 계속하려면 아무 키나 누르십시오 . . .

// 같은 경로 내에 있기 때문에 따로 CircleTest를 import 하지 않아도 됨
// ex. import 경기도.고양시.CircleTest;


public class Test071
{
	public static void main(String[] args)
	{
		CircleTest ct = new CircleTest();

		ct.input();
		double area = ct.calArea();
		double len = ct.calLength();
		ct.print(area, len);
	}
}

/*
[강사님 풀이]
import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		CircleTest ob = new CircleTest();
		ob.input();		//--br.readLine()에서 생성되는 IOException을 throw하지 못해 오류 발생
		double area = ob.calArea();
		double length = ob.calLength();
		ob.print(area,length);
	}
}
*/


/*
[실행 결과]
반지름 입력: 1

>> 반지름이 1인 원의
>> 넓이: 3.14
>> 둘레: 6.28
계속하려면 아무 키나 누르십시오 . . .
*/