/*====================================
+++++�޼ҵ� ���ȣ��(��� �޼ҵ�)+++++
======================================
�� Test067.java
====================================*/


public class Test067
{
	public static void main(String[] args) // �Ű����� �Ķ����
	{
		showHi(3);
	}

	/*
	public static void showHi(int cnt) // ��ȯ �ڷ��� ���� �ڷ���
	{
		System.out.println("Hi");
		// postfix�̱� ������ showHi(3) ���� �ݺ�
		// ������ �տ� �־� if�� �������� ����
		showHi(cnt--);
		if (cnt==1)
			return;
	}
	*/

	public static void showHi(int cnt) // ��ȯ �ڷ��� ���� �ڷ���
	{
		System.out.println("Hi");
		if (cnt==1)
			return;
		showHi(--cnt);
	}
}


class FruitSeller
{
	final int APPLE_PRICE = 1000;	//--APPLE_PRICE ���� ���� ������ ����
	int numOfApple = 20;
	int myMoney = 0;

	Int saleApple(int money)	//--��������� ����, ���� �Ǹ� ����� ǥ��
	{
		int num = money/1000;	//--����� ���� 1000���̶� ����
		numOfApple -= num;		//--����� ���� �پ���
		myMoney += money;		//--�Ǹ� ������ �����Ѵ�.
		return num;				//--���� ���Ű� �߻��� ����� ���� ��ȯ
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

	public void showBuyResult()	//--�󸶳� �ȾҴ����� ���� Ȯ��
	{
		System.out.println("���� �ܾ�: "+myMoney);
		System.out.println("��� ����: "+numOfApple);
	}
}


class FruitSalesMain1
{
	public static void main(String[] args)
	{
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		buyer.buyApple(seller, 2000);

		System.out.println("���� �Ǹ����� ���� ��Ȳ: ");
		seller.showSaleResult();

		System.out.println("���� �������� ���� ��Ȳ: ");
		buyer.showBuyResult();
	}
}

