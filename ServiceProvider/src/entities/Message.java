package entities;

public class Message {
	
	private User sender;
	
	private User receiver;
	
	
	private String cipher;
	
	private String iv;
	
	private String key_recipient_enc;
	
	private String sig_recipient;

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public String getCipher() {
		return cipher;
	}

	public void setCipher(String cipher) {
		this.cipher = cipher;
	}

	public String getIv() {
		return iv;
	}

	public void setIv(String iv) {
		this.iv = iv;
	}

	public String getKey_recipient_enc() {
		return key_recipient_enc;
	}

	public void setKey_recipient_enc(String key_recipient_enc) {
		this.key_recipient_enc = key_recipient_enc;
	}

	public String getSig_recipient() {
		return sig_recipient;
	}

	public void setSig_recipient(String sig_recipient) {
		this.sig_recipient = sig_recipient;
	}
	

}
