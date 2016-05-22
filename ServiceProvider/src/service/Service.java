package service;

public class Service implements IService {

	@Override
	public LoginResponse login(String user, LoginRequest request) {
		LoginResponse response = new LoginResponse();
		// TODO Auto-generated method stub
		return response;
	}

	@Override
	public RegisterResponse register(String user, RegisterRequest request) {
		RegisterResponse reponse = new RegisterResponse();
		// TODO Auto-generated method stub
		return reponse;
	}

	@Override
	public PubkeyResponse pubkey(String user) {
		PubkeyResponse response = new PubkeyResponse();
		// TODO Auto-generated method stub
		return response;
	}

	@Override
	public SendMessageResponse sendMessage(String user, SendMessageRequest request) {
		SendMessageResponse response = new SendMessageResponse();
		// TODO Auto-generated method stub
		return response;
	}

	@Override
	public GetMessageResponse getMessage(String user, GetMessageRequest request) {
		GetMessageResponse response = new GetMessageResponse();
		// TODO Auto-generated method stub
		return response;
	}

}
