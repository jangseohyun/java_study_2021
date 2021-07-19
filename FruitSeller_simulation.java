public class FruitSeller_simulation
{
	public static void main(String[] args)
	{
		class FruitSeller
		{
			final int APPLE_PRICE = 1000;	//--APPLE_PRICE 값은 절대 변하지 않음
			int numOfApple = 20;
			int myMoney = 0;
	
			public int saleApple(int money)	//--과일장수의 행위, 과일 판매 기능의 표현
			{
				int num = money/APPLE_PRICE;	//--사과가 개당 1000원이라 가정
				numOfApple -= num;		//--사과의 수가 줄어들고
				myMoney += money;		//--판매 수익이 증가한다.
				return num;				//--실제 구매가 발생한 사과의 수를 반환
			}

			public void showSaleResult()	//--얼마나 팔았는지에 대한 확인
			{
				System.out.println("현재 잔액: "+myMoney);
				System.out.println("사과 개수: "+numOfApple);
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
	
			public void showBuyResult()	//--얼마나 샀는지에 대한 확인
			{
				System.out.println("현재 잔액: "+myMoney);
				System.out.println("사과 개수: "+numOfApple);
			}
		}

		
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();

		// 객체 내에 존재하는 변수에 접근
		seller.numOfApple = 20;
		// 객체 내에 존재하는 메소드에 접근(호출)
		buyer.buyApple(seller, 2000);

		System.out.println("과일 판매자의 현재 상황: ");
		seller.showSaleResult();
	
		System.out.println("\n과일 구매자의 현재 상황: ");
		buyer.showBuyResult();
	}
}

/*
[실행 결과]
과일 판매자의 현재 상황:
현재 잔액: 2000
사과 개수: 18

과일 구매자의 현재 상황:
현재 잔액: 3000
사과 개수: 2
계속하려면 아무 키나 누르십시오 . . .
*/