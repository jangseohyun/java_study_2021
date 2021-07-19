/*==============================
++++++예외(Exception) 처리++++++
- 다른 예외 다시 던지기
================================
◎ Test148.java
==============================*/


public class Test148
{
	public int getValue(int value) throws Exception	//--예외 던지기(b 유형)
	{
		int a;
		
		try
		{
			a = getData(-4);	//--던져진 예외(a 유형)
		}
		catch (Exception e)		//--예외 잡아내기(a 유형)
		{
			// 예외 처리(a 유형)
			System.out.println("printStackTrace...");
			e.printStackTrace();

			// 예외 발생(b 유형)
			throw new Exception("value가 음수입니다.");
		}
		

		return a;
	}

	public int getData(int data) throws Exception	//--예외 던지기(a 유형)
	{
		if (data < 0)
			throw new Exception("data가 0보다 작습니다.");	//--예외 발생 (a 유형)

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-4);	//--던져진 예외(b 유형)
			System.out.println(a);
		}
		catch (Exception e)		//--예외 잡아내기(b 유형)
		{
			// 예외 처리(b 유형)
			System.out.println("printStackTrace...(main)");
			e.printStackTrace();
		}
		
	}
}