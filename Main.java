
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) {
		String timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
				.format(new java.util.Date());
		Block block0 = new Block("75.6 degrees Fahrenheit", 0);
		Block block1 = new Block("75.6 degrees Fahrenheit", block0.getHash());
		Block block2 = new Block("75.6 degrees Fahrenheit", block1.getHash());
		Block block3 = new Block("76.1 degrees Fahrenheit", block2.getHash());
		Block block4 = new Block("75.6 degrees Fahrenheit", block3.getHash());
		Block block5 = new Block("76.1 degrees Fahrenheit", block4.getHash());
		Block block6 = new Block("75.6 degrees Fahrenheit", block5.getHash());
		Block block7 = new Block("75.6 degrees Fahrenheit", block6.getHash());
		Block block8 = new Block("75.6 degrees Fahrenheit", block7.getHash());

		System.out.println("Block 0:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block0.getData() + "\n"
				+ "Previous Hash: " + block0.getPrevHash() + "\n" + "Hash: "
				+ block0.getHash() + "\n");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 1:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block1.getData() + "\n"
				+ "Previous Hash: " + block1.getPrevHash() + "\n" + "Hash: "
				+ block1.getHash() + "\n");

		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 1:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block1.getData() + "\n"
				+ "Previous Hash: " + block1.getPrevHash() + "\n" + "Hash: "
				+ block1.getHash() + "\n");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 2:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block2.getData() + "\n"
				+ "Previous Hash: " + block2.getPrevHash() + "\n" + "Hash: "
				+ block2.getHash() + "\n");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 3:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block3.getData() + "\n"
				+ "Previous Hash: " + block3.getPrevHash() + "\n" + "Hash: "
				+ block3.getHash() + "\n");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 1:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block3.getData() + "\n"
				+ "Previous Hash: " + block3.getPrevHash() + "\n" + "Hash: "
				+ block3.getHash() + "\n");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 4:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block4.getData() + "\n"
				+ "Previous Hash: " + block4.getPrevHash() + "\n" + "Hash: "
				+ block4.getHash() + "\n");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 5:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block5.getData() + "\n"
				+ "Previous Hash: " + block5.getPrevHash() + "\n" + "Hash: "
				+ block5.getHash() + "\n");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 6:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block6.getData() + "\n"
				+ "Previous Hash: " + block6.getPrevHash() + "\n" + "Hash: "
				+ block6.getHash() + "\n");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 7:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block7.getData() + "\n"
				+ "Previous Hash: " + block7.getPrevHash() + "\n" + "Hash: "
				+ block7.getHash() + "\n");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException ex) {
			
		}
		timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
		.format(new java.util.Date());

		System.out.println("Block 8:\n" + "Timestamp: " + timeStamp
				+ "\nTemperature: " + block8.getData() + "\n"
				+ "Previous Hash: " + block8.getPrevHash() + "\n" + "Hash: "
				+ block8.getHash() + "\n");

	}
}
