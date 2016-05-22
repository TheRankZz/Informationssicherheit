package entities;

import java.util.List;

public class User {
	
	private String username;

	private String salt_masterkey;
	
	private String pubkey;
	
	private String privkey_enc;
	
	private List<Message> messages;
	
	
	public String getSalt_masterkey() {
		return salt_masterkey;
	}

	public void setSalt_masterkey(String salt_masterkey) {
		this.salt_masterkey = salt_masterkey;
	}

	public String getPubkey() {
		return pubkey;
	}

	public void setPubkey(String pubkey) {
		this.pubkey = pubkey;
	}

	public String getPrivkey_enc() {
		return privkey_enc;
	}

	public void setPrivkey_enc(String privkey_enc) {
		this.privkey_enc = privkey_enc;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	
}
