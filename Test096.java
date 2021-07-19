/*===============================================
+++++++메소드 중복정의(Method Overloading)+++++++
-메소드 오버로딩이 가능한 형태와 불가능한 형태
=================================================
◎ Test096.java
===============================================*/


public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);

		// double result = print(10.0);	//--대입연산자가 있으면 우항부터 확인함
		// print(10.0);					//--위의 print()메소드와 구분이 불가능하기 때문에 java:29, java:30 사용 불가
	}

	public static void print(){}
	public static void print(int i){}
	// public static void print(int j){}		//--(X)
	public static void print(char c){}			//--(O) 단, 자동 형 변환 규칙 확인해서 사용
	public static void print(int i, int j){}
	public static void print(int i, double d){}	//--(O) 단, 자동 형 변환 규칙 확인해서 사용
	public static void print(double d, int k){} //--(O) 단, 자동 형 변환 규칙 확인해서 사용
	public static double print(double d){return 3.14;}	//--(O) 단, 자동 형 변환 규칙 확인해서 사용
	
	// public static void print(double d){}		//--(X)
	// public static String print(double d){}	//--(X)
}