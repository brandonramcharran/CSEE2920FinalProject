import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Block {

	protected String data;
	protected int prevHash;
	protected int hash;
	protected String timeStamp;
	LocalDateTime currentTime = LocalDateTime.now();

	public Block(String data, int prevHash) {
		this.data = data;
		this.prevHash = prevHash;
		this.timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date());
		String oldHash = Integer.toString(prevHash);
		String[] blockData = new String[] { oldHash, data };
		hash = blockData.hashCode();
	}

	public String getData() {
		return this.data;
	}

	public int getPrevHash() {
		return this.prevHash;
	}

	public int getHash() {
		return hash;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}

}