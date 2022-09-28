package sec02_exceptionhandlingsyntax.EX03_MultiCatch_2;

public class MultiCatch_2 {
	public static void main(String[] args) {
		/*
		 // 1. catch ����� ������ �߸����� ��
		  * try {
		  * 	System.out.println(3 / 1);
		  * 	int num = Integer.parseInt("10A");
		  * }
		  * catch (Exception e) {
		  * 	System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		  * }
		  * catch (NumberFormatException e) {
		  * 	System.out.println("���ڷ� �ٲ� �� �����ϴ�.");
		  * finally {
		  * 	System.out.println("���α׷� ����");
		  * }
		 */
		// 2.catch ����� �ùٸ� ����
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		}
		catch (NumberFormatException e) {
			System.out.println("���ڷ� �ٲ� �� �����ϴ�.");
		}
		catch (Exception e) {
			System.out.println("���ڷ� 0�� ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
	}
}
