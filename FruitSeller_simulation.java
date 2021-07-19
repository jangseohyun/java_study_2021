public class FruitSeller_simulation
{
	public static void main(String[] args)
	{
		class FruitSeller
		{
			final int APPLE_PRICE = 1000;	//--APPLE_PRICE ���� ���� ������ ����
			int numOfApple = 20;
			int myMoney = 0;
	
			public int saleApple(int money)	//--��������� ����, ���� �Ǹ� ����� ǥ��
			{
				int num = money/APPLE_PRICE;	//--����� ���� 1000���̶� ����
				numOfApple -= num;		//--����� ���� �پ���
				myMoney += money;		//--�Ǹ� ������ �����Ѵ�.
				return num;				//--���� ���Ű� �߻��� ����� ���� ��ȯ
			}

			public void showSaleResult()	//--�󸶳� �ȾҴ����� ���� Ȯ��
			{
				System.out.println("���� �ܾ�: "+myMoney);
				System.out.println("��� ����: "+numOfApple);
			}
		}	

		class FruitBuyer
		{
			int myMoney = 5000;	//--���� ����
			int numOfApple = 0;	//--���� ����
		
			public void buyApple(FruitSeller seller, int money)	//--���� ���� ������ ǥ��
			// FruitSeller seller = new FruitSeller();
			{
				numOfApple += seller.saleApple(money);
				myMoney -= money;
			}
	
			public void showBuyResult()	//--�󸶳� ������� ���� Ȯ��
			{
				System.out.println("���� �ܾ�: "+myMoney);
				System.out.println("��� ����: "+numOfApple);
			}
		}

		
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();

		// ��ü ���� �����ϴ� ������ ����
		seller.numOfApple = 20;
		// ��ü ���� �����ϴ� �޼ҵ忡 ����(ȣ��)
		buyer.buyApple(seller, 2000);

		System.out.println("���� �Ǹ����� ���� ��Ȳ: ");
		seller.showSaleResult();
	
		System.out.println("\n���� �������� ���� ��Ȳ: ");
		buyer.showBuyResult();
	}
}

/*
[���� ���]
���� �Ǹ����� ���� ��Ȳ:
���� �ܾ�: 2000
��� ����: 18

���� �������� ���� ��Ȳ:
���� �ܾ�: 3000
��� ����: 2
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/