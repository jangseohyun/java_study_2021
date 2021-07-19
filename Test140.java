/*==================================
++++++�ڹ��� �ֿ�(�߿�) Ŭ����++++++
- Math Ŭ����
====================================
�� Test140.java
==================================*/

/*
�� java.lang.Math Ŭ������

   ����(Mathematics)�� ���õ� ������ �Ӽ��� �޼ҵ���� �����ϴ� Ŭ������
   �����ڰ� �ֱ� ������ . . . �� �����ڰ� ��private������ ����Ǿ� �ֱ� ������
   �ܺο��� ��ü(�ν��Ͻ�)�� ������ �� ����.

   ��, ��Math ob = new Math();�� �̿� ���� ������ ����� �� ����.

   ��, ��� �޼ҵ尡 ��static������ ���ǵǾ� �����Ƿ�
   ��ü�� �������� �ʰ� �ٷ� �����Ͽ� ����ϴ� ���� �����ϴ�.

�� java.lang.Math Ŭ������ �ֿ� ��� �� �޼ҵ�
 
   public static final double E = 2.71... : �ڿ� �α� ���
   
   public static final double PI = 3.141592... : ������(��)
   
   public static final double sin(double a) 
   public static fianl double cos(double a)
   public static final double tan(double a) : sin(a), cos(a), tan(a) �� ��ȯ(�ﰢ�Լ�)

   public static final double asin(double a)
   public static final double acos(double a)
   public static final double atan(double a) : asin(a), acos(a), atan(a) �� ��ȯ (�ﰢ�Լ��� ���Լ�)

   public static double toRadians(double angdeg) : ����(angdeg)�� ����(radian)���� �ٲپ� ��ȯ
   public static double toDegrees(double angrad) : ����(angrad)�� ������ �ٲپ� ��ȯ
   
   public static double log(double a) : �α�(log) �� ���Ͽ� ��ȯ

   public static double sqrt(double a) : a�� ������ ���Ͽ� ��ȯ

   public static double ceil(double a) : a���� ũ�ų� ���� ������ �Ǽ� ���·� ��ȯ (�ø�)
   public static double floor(double a): a���� �۰ų� ���� ������ �Ǽ� ���·� ��ȯ (����)

   public static double pow(double a, double b) : a�� b ���� ���Ͽ� ��ȯ

   public static int round(float a)
   public static long round(double a) : a�� �ݿø��� ����� ��ȯ

   public static double random() : 0.0 ~ 1.0 ������ ����(������ �Ǽ�)�� �߻���Ų �� ��ȯ
   
*/


public class Test140
{
	public static void main(String[] args)
	{
		System.out.println("������: "+Math.PI);		
		//--������: 3.141592653589793
		System.out.println("2�� ������: "+Math.sqrt(2));
		//--2�� ������: 1.4142135623730951

		System.out.println("���̿� ���� Degree: "+Math.toDegrees(Math.PI));
		//--���̿� ���� Degree: 180.0
		System.out.println("2���̿� ���� Degree: "+Math.toDegrees(2.0*Math.PI));
		//--2���̿� ���� Degree: 360.0

		double radian45 = Math.toRadians(45);

		System.out.println("����   45: "+Math.sin(radian45));
		System.out.println("�ڽ��� 45: "+Math.cos(radian45));
		System.out.println("ź��Ʈ 45: "+Math.tan(radian45));
		/*
		����   45: 0.7071067811865475
		�ڽ��� 45: 0.7071067811865476
		ź��Ʈ 45: 0.9999999999999999
		*/

		System.out.println("�α� 25: "+Math.log(25));
		//--�α� 25: 3.2188758248682006

		System.out.println("2�� 4��: "+Math.pow(2,4));
		//--2�� 4��: 16.0

		int n = 0;
		while (n<10)
		{
			System.out.println("0.0 ~ 1.0 ������ ����: "+Math.random());
			n++;
		}

		/*
		0.0 ~ 1.0 ������ ����: 0.884145234300294
		0.0 ~ 1.0 ������ ����: 0.17299636060111923
		0.0 ~ 1.0 ������ ����: 0.7377492755200904
		0.0 ~ 1.0 ������ ����: 0.2849308978744569
		0.0 ~ 1.0 ������ ����: 0.0039696026024483855
		0.0 ~ 1.0 ������ ����: 0.1330324123110641
		0.0 ~ 1.0 ������ ����: 0.21254263889089497
		0.0 ~ 1.0 ������ ����: 0.020234557877166326
		0.0 ~ 1.0 ������ ����: 0.9366469673486029
		0.0 ~ 1.0 ������ ����: 0.27913967638538173
		*/
	}
}