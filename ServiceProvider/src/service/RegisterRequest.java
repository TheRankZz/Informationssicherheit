package service;

public class RegisterRequest {

	private String salt_masterkey;
	
	private String pubkey;
	
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

	private String privkey_enc;
}
