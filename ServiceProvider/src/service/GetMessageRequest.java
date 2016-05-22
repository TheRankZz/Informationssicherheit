package service;

public class GetMessageRequest {
	private String timestamp;
	
	private String dig_sig;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getDig_sig() {
		return dig_sig;
	}

	public void setDig_sig(String dig_sig) {
		this.dig_sig = dig_sig;
	}
	
}
