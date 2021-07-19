/*=========================
++++++++클래스 고급++++++++
- 상속(Inheritance)
===========================
◎ Test106.java
=========================*/

/*
○ 상속(Inheritance)이란
   새로 설계(생성)하고자 하는 클래스가
   이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
   이미 설계된 클래스의 일부분이나 전체 구조를
   공유할 수 있도록 하는 기능을 의미한다.

   즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
   고수준의 재사용성(reusability)을 확보하고
   객체 간의 관계를 구성함으로써
   객체 지향의 또다른 큰 특징 중 하나인 『다형성』의 문법적 토대가 된다.

   상속은 기존 프로그램의 클래스 내용을 공유함으로써
   중복된 코드들을 다시 작성할 필요 없이
   반복적이고 세부적인 작업을 처리하지 않기 때문에
   프로그램을 작성하는 시간을 절약할 수 있고
   유지보수를 편리하게 할 수 있으며.
   프로그램의 길이도 짧아지게 된다.

   또한, 이미 작성된 프로그램들은 앞서 테스트되었기 때문에
   오류를 줄일 수 있어 현재 작성중인 프로그램에만 전념할 수 있다.

※ 주의할 점
   자바는 『다중 상속』을 지원하지 않기 때문에 단일상속만 허용한다.
   (두 개 이상의 클래스에서 상속받을 수 없다-자식 입장에서 한 명의 어머니)
*/


// 부모 클래스, 상위 클래스, Super Class, 기초(기반) 클래스, 조상 클래스
class SuperTest106
{
	// 『protected』: 상속받는 클래스, 동일 패키지에서 접근 가능한 접근제어지시자
	protected double area;

	// 생성자 - 사용자 정의 생성자(부모 클래스 생성자)
	SuperTest106()
	{
		System.out.println("SuperTest . . .");
	}

	// 부모 클래스가 갖고 있는 출력 메소드
	void write(String title)
	{
		System.out.println(title+" - "+area);
	}
}


// 자식 클래스, 하위 클래스, Sub Class, 유도 클래스, 자손 클래스
public class Test106 extends SuperTest106
{
	// SuperTest106의 코드
	// ...
	// 단, 생성자는 상속 대상에서 제외됨

	// 생성자 - 사용자 정의 생성자(자식 클래스 생성자)
	Test106()
	{
		// super();		//--SuperTest106(); 인스턴시 생성 시 제일 위에 삽입됨
		System.out.println("Sub Class . . .");
	}

	public void circle()
	{
		int r = 10;
		area = r * r * 3.141592;	//--area = SuperTest106.area
		write("원");
	}

	public void rect()
	{
		int w = 20, h = 5;
		super.area = (double)w * h;	//--super.area = SuperTest106.area
		super.write("사각형");
	}

	public static void main(String[] args)
	{
		// 자식 클래스(Test106)의 인스턴스 생성
		// 이때 부모 클래스도 메모리에 할당하여 실체화함
		Test106 ob = new Test106();

		ob.circle();
		ob.rect();
	}
}

/*
[실행 결과]
SuperTest . . .
Sub Class . . .
원 - 314.1592
사각형 - 100.0
계속하려면 아무 키나 누르십시오 . . .
*/