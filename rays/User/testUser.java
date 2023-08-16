package in.co.rays.User;

import java.text.SimpleDateFormat;

 public class testUser {
	
	public static void main(String[] args) throws Exception {
		testAdd();
		testUpdate();
	}

	private static void testUpdate() {
		
		
	}

	private static void testAdd() throws Exception{
		String dob = "1999-05-29";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		userBean bean = new userBean();
		bean.setId(3);
		bean.setFirst_name("Sunayna");
		bean.setLast_name("Sahu");
		bean.setLogin_id("SunaynaSahu100@gmail.com");
		bean.setPassword("87654321");
		bean.setDob(sdf.parse(dob));
		bean.setAddress("Indore");
		userModel model = new userModel();
		model.add(bean);
	}

}
