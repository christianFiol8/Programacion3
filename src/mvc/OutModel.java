package mvc;

public class OutModel {

	public OutModel() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean login(String username , String password) {
		
		if(username.equals("admin") && password.equals("123")) {
			return true;
		}
		
		return false;
		
	}

}
