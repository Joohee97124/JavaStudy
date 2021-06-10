/*=================================
���� �ڹ��� �⺻ �����(I/O) ����
==================================*/

import java.io.IOException;

public class Test166
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		System.out.print("���ڿ� �Է�(����:Ctrl+z)  ");
		
		
		// read()    : InputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ ��Ʈ��)
		// System.in : �ڹ��� ǥ�� �Է� ��Ʈ��(��ü) �� ����Ʈ ��� ��Ʈ�� 
		while ((data = System.in.read()) != -1 )
		{
			ch = (char)data;

			// print() : ���� ��Ʈ��
			// System.out.print(ch);
			//--==>>
			/*
			���ڿ� �Է�(����:Ctrl+z)  1234
			1234
			abcd
			abcd
			�����ٶ�
			�Ƣ�������?��?
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/


			// write(): OutputStream �� ��ǥ���� �޼ҵ� (�� ����Ʈ ��Ʈ��)
			System.out.write(ch);
			//--==>> 
			/*
			���ڿ� �Է�(����:Ctrl+z)
			1234
			1234
			abcd
			abcd
			�����ٶ�
			�����ٶ�
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/
			

		}
	}
}
/*
*/