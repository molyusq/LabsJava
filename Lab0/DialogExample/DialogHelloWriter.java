public class DialogHelloWriter {
	private String hello;

	public DialogHelloWriter(String hello) {
		this.hello = hello;
	}

	public DialogHelloWriter() {
		hello = "Yo";
	}

	public String sayHello(String name) {
		return hello + ", " + name;
	}
}
