package lecture07;
import java.util.Map;
public class CheckAct {

	public void checkActOnMap(Map<String, String>customerMap) {
		if(customerMap.containsKey("Bilal_101100111")){
			String val = customerMap.remove("Bilal_101100111");
			if(val == null){
				System.out.println("Value for Bilal_101100111 was null");
			}else{
				customerMap.put("Bilal_101100111", "Dublin");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
//ID --> Address
