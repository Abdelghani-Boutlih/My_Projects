package bro_code;
import java.util.HashMap;

public class IdandPasswords {
	HashMap<String,String> logininfo=new HashMap<String,String>();
	public IdandPasswords() {
		logininfo.put("abdelghani","whynot");
		logininfo.put("mohamed","abd1234");
		logininfo.put("abd0","0000");
	}
	protected HashMap getlogininfo(){
		return logininfo;
	}
}


