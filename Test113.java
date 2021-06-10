/*======================================
���� Ŭ���� ���ޡ���
- �������̽�(Interface)
======================================*/

// �������̽�
interface ADemo
{
	public void write();
}


// �������̽�
interface BDemo
{
	public void print();
}


// Ŭ����
// class DemoImpl
// ��
// �� �������̽��� �����ϴ� �߻� Ŭ����
// abstract class DemoImpl implements ADemo, BDemo
// ��
// �� �������̽��� �����ϴ� Ŭ����
class DemoImpl implements ADemo, BDemo
{
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带 �������̵�(Overriding) �� ��
	// ��@Override�� ������̼�(annotation)�� ����� �� ����.
	// JDK 1.6 ���ĺ��� ���� ������ �����̴�.
	// ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵�(Overriding) �� ������
	// JDK 1.5������ ��@Override�� ������̼�(annotation) ����� �����ϴ�.
	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ�...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ�...");
	}
}



// main() �޼ҵ带 �����ϴ� �ܺ� Ŭ����
public class Test113
{
	public static void main(String[] args)
	{
	
		// ADemo ob = new ADemo();		//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		// BDemo ob = new BDemo();		//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		
		// ADemo, BDemo �������̽��� ����(implements) �� Ŭ���� (�� DemoImpl)
		// ����� �ν��Ͻ� ����
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		//--==>> ADemo �������̽� �޼ҵ�...
		//		 BDemo �������̽� �޼ҵ�...


		ADemo ob2 = new DemoImpl();		//-- �� ĳ����
		BDemo ob3 = new DemoImpl();		//-- �� ĳ����

		// ob2.print();
		// ob3.write();
		//--==>> ���� �߻�(������ ����)

		((BDemo)ob2).print();
		((ADemo)ob3).write();
		// DemoImpl�� ADemo�� BDemo ��� implements �� ���� �� ������ ����!
		//--==>> BDemo �������̽� �޼ҵ�...
		//		 ADemo �������̽� �޼ҵ�...

		// �� DemoImpl Ŭ������ ADemo, BDemo �� �������̽���
		//	  ��� �����߱� ������ �����ϴ�.
		//	  ����, DemoImpl Ŭ������ �� �������̽� �� �ϳ���
		//	  ������ ��Ȳ�̶�� ó���� �� ���� ������ �ȴ�.
		//	  ��� �ٿ� ĳ������ �ƴϴ�!
		

		((DemoImpl)ob2).print();			//-- �ٿ� ĳ����
		((DemoImpl)ob3).write();			//-- �ٿ� ĳ����
		//--==>> BDemo �������̽� �޼ҵ�...
		//		 ADemo �������̽� �޼ҵ�...

	}
}

/*
[������]
ADemo �������̽� �޼ҵ�...
BDemo �������̽� �޼ҵ�...
BDemo �������̽� �޼ҵ�...
ADemo �������̽� �޼ҵ�...
BDemo �������̽� �޼ҵ�...
ADemo �������̽� �޼ҵ�...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/