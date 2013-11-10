import javax.swing.*;

public class DialogHelloWriterTest {
	public static void main(String[] args) {
		DialogHelloWriter writer = new DialogHelloWriter();
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, writer.sayHello(name));
		System.exit(0);
	}
}
