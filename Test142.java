/*==============================
++++++����(Exception) ó��++++++
================================
�� Test142.java
==============================*/

/*
�� ���α׷����� �߻��ϴ� ����(Error)��

   1. �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿���
      ��������ν� ������ �ܰ迡�� �߻��ϴ� ������ ����(Error)

   2. ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ����(Error) 
  
      - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
	    ������ ����� �������� �Ǵ� ������ ����(Error)��

	  - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error), �׸���

	  - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
	    ���ܻ���(Exception)�� �ִ�.

	    ���� ���,
		�� � ���� 0���� �����ų�...
		�� �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�...
		�� �������� �ʴ� ������ �����Ͽ� �о���δٰų�...

=> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
   ������ �����ϱ� ���� ������ �����ϵ��� ������ �����س��� ���� ����ó��


�� �����س��� ���� (Exception Ŭ����)

   - ���ܴ� ���α׷� ���� �� �߻��� �� �ִ�
     ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	 �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�.

   - ���α׷� ���� �߿� �޼ҵ� �ȿ��� ����(Error)�� �߻��ϰ� �� ���,
     �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	 �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� �������ش�.

   - �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
     Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.
	 ��, ��� throws �� �� �ִ�.

   - Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
     ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�.

   - Throwable Ŭ�������� �Ļ��� Ŭ����
     �� Exception Ŭ����
	    : Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
		  ������ �� �ִ� ���� ��Ȳ���� �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.

	 �� Error Ŭ����
	    : �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.


�� ����(Exception)�� ����

   -checked exception
    �޼ҵ� ������ ���ܰ� �߻��� ���
	�޼ҵ带 ������ �� ��throws������ �޼ҵ� ������ �߻��� �� �ִ�
	���ܵ��� ������ְų� �Ǵ�, �� ���ܸ� ��try~catch���ؼ�
	ó�����־�߸� �ϴ� �����̴�.
	�����Ϸ��� �������ϴ� �������� ��checked exception����
	��throws���Ǵ°��� ���γ� Ȥ�� ��try~catch���Ǵ����� ���θ� �Ǵ��Ͽ�
	���α׷����� ���ܸ� ó������ ������ ������ ��ü�� �Ұ����ϴ�.

   -unchecked exception
    ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�...
	��Ÿ�� �ÿ� �߻��ϴ� ����


�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�

   - String toString()	//--�������̵�
     : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.

   - void printStackTrace(PrintStream s)
   - void printStackTrace(PrintWriter w)
     : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.


�� �ֿ� ��Ÿ�� ���� Ŭ����

   - ArithmeticException
     : ��ġ ������ ���� (0���� ������ ��)

   - ArrayStoreException
     : �迭�� �߸��� ������ ���� �����Ϸ� ���� �� �߻��ϴ� ����

   - IndexOutOfBoundsException
     : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����

   - ClassCastException
     : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����

   - NullPointerException
     : �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����

   - SecurityException
     : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����
		|
		|
		| 
*/


import java.io.InputStreamReader;
import java.io.BufferedReader;

// ����ó�� ù ��° ��� ��
//import java.io.IOException;


public class Test142
{
	public static void main(String[] args) //throws IOException
	{
		//BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

		// �ֿ� ���� ����
		int a, b, c;
		
		/*
		System.out.print("ù ��° ���� �Է�: ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�: ");
		b = Integer.parseInt(br.readLine());
		c = a + b;
		System.out.println("���: "+c);	
		*/

		// ����ó�� �� ��° ��� ��
		/*
		try		//--try �� (���ܰ� �߻��� �� �ִ� ����)
		{
			System.out.print("ù ��° ���� �Է�: ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�: ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("���: "+c);	
		}
		catch (IOException e)	//--try ������ ���ܰ� �߻��� ���
		{
			// IOException: checked exception
			// �޼ҵ带 �����ϴ� �������� throws�� ����
			// ��Ƴ��ų� ������ �ʴ� ��� ������ ���� �߻�
			System.out.println(e.toString());
		}
		*/

		// ����ó�� �� ��° ��� ��
		/*
		try		
		{
			System.out.print("ù ��° ���� �Է�: ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�: ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("���: "+c);	
		}
		catch (IOException e)	
		{
			System.out.println(e.toString());
		}
		catch (NumberFormatException e2)
		{
			// NumberFormatException: unchecked exception
			// ��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
			// �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
			System.out.println(e2.toString());
			System.out.println("���� ������ �����͸� �Է��ϼ���");
		}
		*/

		// ����ó�� �� ��° ��� ��
		/*
		try		
		{
			System.out.print("ù ��° ���� �Է�: ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�: ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("���: "+c);	
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		*/

		// ����ó�� �ټ� ��° ��� ��
		/*
		try		
		{
			System.out.print("ù ��° ���� �Է�: ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�: ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("���: "+c);	
		}
		catch (Exception e)
		{
			System.out.println("���� ó��");
			System.out.println(e.toString());	//--java.lang.NumberFormatException: For input string: "a"
			System.out.println(e.getMessage());	//--For input string: "a"
			System.out.println("printStrackTrace...");
			e.printStackTrace();
			// java.lang.NumberFormatException: For input string: "a"
			// at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
			// at java.lang.Integer.parseInt(Integer.java:580)
			// at java.lang.Integer.parseInt(Integer.java:615)
		}
		*/

		// ����ó�� ���� ��° ��� ��
		try		
		{
			System.out.print("ù ��° ���� �Է�: ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�: ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("���: "+c);	
		}
		catch (IOException e)	
		{
			System.out.println(e.toString());
		}
		catch (NumberFormatException e2)
		{
			System.out.println("���� ������ �����͸� �Է��ϼ���");
		}
		finally
		{
			// ���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����
			System.out.println("��� �����̽��ϴ�. �����մϴ�.");
		}
	}
}