package sec02_exceptionhandlingsyntax.EX01_TryCatchFinally;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		// 1. try-catch
		try {
			System.out.println(3 / 0); // ���� ���� (ArithmeticException)
			System.out.println("���α׷� ����");
		}
		catch (ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
			System.out.println("���α׷� ����");
		}
		
		// 2. try-catch-finally
		try {
			System.out.println(3 / 0); // ���� ����(ArithmeticException)
		}
		catch (ArithmeticException e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		finally { // �������� ������ ����Ǵ� ����
			System.out.println("���α׷� ����");
		}
	}
}
