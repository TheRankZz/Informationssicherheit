package service;

public class GetMessageResponse {
	
	private String sender;
	
	private String cipher;
	
	private String iv;
	
	private String key_recipient_enc;
	
	private String sig_recipient;

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
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
