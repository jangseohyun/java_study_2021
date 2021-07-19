/*==============================
++++++����(Exception) ó��++++++
================================
�� Test144.java
==============================*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.IOException;


public class Test144
{
	private String[] data = new String[3];

	public void proc() //throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		try
		{
			System.out.print("�̸� �Է�(����: Ctrl+z): ");

			while ((str=br.readLine()) != null)
			{
				data[n++] = str;
				System.out.print("�̸� �Է�(����: Ctrl+z): ");			
			}

			System.out.println("�Էµ� ����...");
						 
			for (String s : data)
			{
				if(s != null)
					System.out.println(s);
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("���� �߻�");
			System.out.println("getMessage: "+e2.getMessage());
			System.out.println("toString: "+e2.toString());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) //throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}