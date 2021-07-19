/*=============================
+++++++클래스와 인스턴스+++++++
-정보 은닉과 접근 제어 지시자
===============================
◎ Test091.java
=============================*/


class CircleTest2
{
	// 정보 은닉(Information Hiding)
	// 멤버 변수, 인스턴스 변수, 전역 변수
	// 『private』 이라는 접근 제어 지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	// int형 변수 0으로 초기화 지원
	private int r;
	
	/*
	// 초기화할 수 있는 별도의 메소드를 생성해줘야 함
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		r = sc.nextInt();
		// 이때 this.r이라고 표기해도 같은 변수를 가리킴
	}
	*/

	// 세터 메소드
	void setR(int r)
	{
		// r = r; 이와 같은 형태로 표기하게 되면
		// 멤버 변수와 지역 변수가 같은 이름을 갖고 있는 상황이기 때문에
		// 둘 다 같은 지역 변수로 인식하여 처리한다.

		// 『this』는 자기 자신을 나타내는 예약어
		// 멤버 변수를 지역 변수와 구분하기 위하여
		// 클래스의 멤버 변수 앞에 『this』를 표기한다
		this.r = r;
	}
	
	double calArea()
	{
		return r * r * 3.141592;
	}

	void write(double a)
	{
		System.out.println("반지름: "+r);
		System.out.println("넓  이: "+a);
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test091
{
	public static void main(String[] args)
	{
		// CircleTest2 클래스 기반 인스턴스 생성
		CircleTest2 ob1 = new CircleTest2();
		CircleTest2 ob2 = new CircleTest2();

		// 넓이 연산 결과를 담을 변수 선언
		double result;

		// ※ 『private』변수는 외부에서 접근이 불가능하다
		// ob1.r = 10;					//--에러 발생(컴파일 에러)
		// System.out.println(ob1.r);	//--에러 발생(컴파일 에러)

		// 두 번째 인스턴스(ob2)의 반지름을 20으로 초기화
		// ob2.r = 20;
		ob2.setR(20);
		result = ob2.calArea();
		ob2.write(result);

		/*
		반지름: 20
		넓  이: 1256.6368
		계속하려면 아무 키나 누르십시오 . . .
		*/
	}
}