/*====================================
+++++메소드 재귀호출(재귀 메소드)+++++
======================================
◎ Test067.java
====================================*/


public class Test067
{
	public static void main(String[] args) // 매개변수 파라미터
	{
		showHi(3);
	}

	/*
	public static void showHi(int cnt) // 반환 자료형 리턴 자료형
	{
		System.out.println("Hi");
		// postfix이기 때문에 showHi(3) 무한 반복
		// 순서가 앞에 있어 if문 수행하지 않음
		showHi(cnt--);
		if (cnt==1)
			return;
	}
	*/

	public static void showHi(int cnt) // 반환 자료형 리턴 자료형
	{
		System.out.println("Hi");
		if (cnt==1)
			return;
		showHi(--cnt);
	}
}


class FruitSeller
{
	final int APPLE_PRICE = 1000;	//--APPLE_PRICE 값은 절대 변하지 않음
	int numOfApple = 20;
	int myMoney = 0;

	Int saleApple(int money)	//--과일장수의 행위, 과일 판매 기능의 표현
	{
		int num = money/1000;	//--사과가 개당 1000원이라 가정
		numOfApple -= num;		//--사과의 수가 줄어들고
		myMoney += money;		//--판매 수익이 증가한다.
		return num;				//--실제 구매가 발생한 사과의 수를 반환
	}
}

class FruitBuyer
{
	int myMoney = 5000;	//--소유 현금
	int numOfApple = 0;	//--보유 과일

	public void buyApple(FruitSeller seller, int money)	//--과일 구매 행위의 표현
	// FruitSeller seller = new FruitSeller();
	{
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult()	//--얼마나 팔았는지에 대한 확인
	{
		System.out.println("현재 잔액: "+myMoney);
		System.out.println("사과 개수: "+numOfApple);
	}
}


class FruitSalesMain1
{
	public static void main(String[] args)
	{
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		buyer.buyApple(seller, 2000);

		System.out.println("과일 판매자의 현재 상황: ");
		seller.showSaleResult();

		System.out.println("과일 구매자의 현재 상황: ");
		buyer.showBuyResult();
	}
}

