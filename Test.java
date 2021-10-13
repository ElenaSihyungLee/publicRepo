public class Test {
	public static void main(String[] args) {
		System.out.println("Hello, my friends!");
		for (int i=0; i>=0; i++) {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				i++;
			}
		}
	}
}
