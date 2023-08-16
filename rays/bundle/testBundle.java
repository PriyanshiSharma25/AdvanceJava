package in.co.rays.bundle;

import java.util.ResourceBundle;

public class testBundle {
	public static void main(String[] args) {
		
	ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.app_hi");
    System.out.println(rb.getString("greeting"));
    
	ResourceBundle sb = ResourceBundle.getBundle("in.co.rays.bundle.app_sp");
	System.out.println(sb.getString("Greeting"));
	
	ResourceBundle ps = ResourceBundle.getBundle("in.co.rays.bundle.app");
	System.out.println(ps.getString("Greeting"));
	
	ResourceBundle op = ResourceBundle.getBundle("in.co.rays.bundle.app_JA_JP");
	System.out.println(ps.getString("greeting"));
	System.out.println();
	System.out.println("================================================");
	
	
	System.out.println(ps.getString("Driver"));
	System.out.println(ps.getString("url"));
	System.out.println(ps.getString("user"));
	System.out.println(ps.getString("password"));
	System.out.println(ps.getString("initial"));
	System.out.println(ps.getString("acquire"));
	System.out.println(ps.getString("max"));
	


}
}