package sec04_userexception.EX04_UserExceptionExample;

// 점수가 음수일 때 예외 발생
class MinusException extends Exception {
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}
// 점수가 100점을 초과할 때 예외 발생
public class UserExceptionExample {
	
}
