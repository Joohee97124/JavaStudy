/* ===============================================
■■■ 클래스와 인스턴스 ■■■
- 생성자 (Constructor)
================================================*/


public class Test077
{
	int x;

	// ※ 생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며
	//	  필요할 경우 인수를 받아들이는 것도 가능하고,
	//	  같은 이름의 메소드를 정의하는 중복 정의가 가능하지만 (메소드 오버로딩)
	//	  리턴 값(반환 값)은 가질 수 없다. 

	// ※ 생성자는 다른 일반 메소드들처럼 호출 될 수 없고,
	//	  『new』연산자를 이용하여 객체를 생성하기 위해 호출되며,
	//	  각 클래스의 인스턴스인 객체를 생성한 후에
	//	  생성된 객체의 멤버를 초기화시키는 작업을 수행한다.


	Test077()
	{
		// ※ 생성자 내부에서 다른 생성자를 호출하는 것은 가능하다
		//	  단,   ① 호출 방법에는 일반적인 메소드의 호출 구문과 차이를 보인다.
		//	  또한, ② 생성자 내부에서 가장 먼저 실행(호출) 되어야 한다. 

		// Test077(100);		여기서는 가능 근데 다른데서 문법 선점,,
		this(100);				// 이렇게 가능

		x = 10;
		System.out.println("생성자 호출 - 인자가 없는 생성자");

		// Test077(100);	뒤에서는 안돼
	}

	Test077(int x)	// 100
	{

		// x = x;
		// 문법적으로는 가능
		// 여기서 보여지는 x는 모두 지역변수 x (바로 위에 int x  이거)
		// X 전역보다 지역이 앞선다 는 의미 X

		// Test077.x = x;	문법선점
		this.x = x;

		System.out.println("생성자 호출 - 인자가 하나인 생성자");
	}

	public static void main(String[] args)
	{
		// Test077 클래스의 인스턴스 생성
		Test077 ob1 = new Test077();
		Test077 ob2 = new Test077(100);
		// ※ 생성자는 『new』 연산자를 이용하여 객체를 생성하기 위해 호출되며
		//	  클래스 객체에 대한 인스턴스가 생성되면
		//	  이 객체는 비로소 메모리를 할당받게 된다.

		System.out.println("main에서 ob1.x : " + ob1.x);
		System.out.println("main에서 ob2.x : " + ob2.x);

	}
}
/*
[실행 결과]
생성자 호출 - 인자가 하나인 생성자
생성자 호출 - 인자가 없는 생성자
생성자 호출 - 인자가 하나인 생성자
main에서 ob1.x : 10
main에서 ob2.x : 100
*/