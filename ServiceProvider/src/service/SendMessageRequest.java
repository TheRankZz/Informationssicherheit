package service;


public class SendMessageRequest {
	
	private InnerEnvelope inner_envelope;
	
	private String receiver;
	
	private String timestamp;
	
	private String sig_service;
	
	

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSig_service() {
		return sig_service;
	}

	public void setSig_service(String sig_service) {
		this.sig_service = sig_service;
	}

	public InnerEnvelope getInner_envelope() {
		return inner_envelope;
	}

	public void setInner_envelope(InnerEnvelope inner_envelope) {
		this.inner_envelope = inner_envelope;
	}
}
