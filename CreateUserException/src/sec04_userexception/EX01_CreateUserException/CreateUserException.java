package sec04_userexception.EX01_CreateUserException;

// 1. ����� �Ϲ� ����
class MyException extends Exception {
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
}

// 2. ����� ���� ����
class MyRTException extends RuntimeException {
	public MyRTException() {
		super();
	}
	public MyRTException(String message) {
		super(message);
	}
}

class A {
	// 3. ����� ���� ���� ��ü ����
	MyException me1 = new MyException();
	MyException me2 = new MyException("���� �޽���: MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("���� �޽���: MyRTException");
	
	// 4. ���� ������(throw): ���� �������� ���� �߻�
	// ��� (1) ���ܸ� ���� ó��
	void abc_1(int num) {
		try {
			if(num > 70)
				System.out.println("���� �۵�");
			else
				throw me1; // ���ܸ� ���� ������ ���� �߻�
		} catch (MyException e) {
			System.out.println("���� ó�� 1");
		}
	}
	void bcd_1() {
		abc_1(65);
	}
	// ��� (2) ���� ����
	void abc_2(int num) throws MyException {
		if(num > 70)
			System.out.println("���� �۵�");
		else
			throw me1; // ���ܸ� ���� ������ ���� �߻�
	}
	void bcd_2() {
		try {
			abc_2(65);
		}catch (MyException e) {
			System.out.println("���� ó�� 2");
		}
	}
}
public class CreateUserException {
	public static void main(String[] args) {
		A a = new A();
		a.bcd_1();
		a.bcd_2();
	}
}
