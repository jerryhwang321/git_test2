package git_test2;

public class Hello {

<<<<<<< HEAD
	String message = '¾È³çÇÏ¼¼¿ä';
	public String say() {
		return message;
=======
	String message;
	
	public Hello() {
		this("¾È³çÇÏ¼¼¿ä");
	}
	public Hello(String message) {
		this.message = message;
	}
	public void say() {
		System.out.println(message);
>>>>>>> 1d3346684920fcf4950969cfc22694ac501733d9
	}
}
