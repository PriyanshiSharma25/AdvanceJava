package in.co.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class Test_marksheet {
public static void main(String[] args) throws Exception {
	//testinsert();
	//testdelete();
	//testUpdate();
	//testFindByRoll();
	testSearch();
	
	
}

private static void testSearch() throws Exception {
	Marksheet_bean bean = new Marksheet_bean();
	 //bean.setName("a");
	// bean.setId(1);
	// bean.setRollNo(101);

	Marksheet_Model model = new Marksheet_Model();
	String dob = ""
	List list = model.search(bean, 1, 5);
	Iterator it = list.iterator();
	while (it.hasNext()) {

		bean = (Marksheet_bean) it.next();
		System.out.print(bean.getId());
		System.out.print("\t" + bean.getName());
		System.out.print("\t" + bean.getRollNo());
		System.out.print("\t" + bean.getPhysics());
		System.out.print("\t" + bean.getChemistry());
		System.out.println("\t" + bean.getMaths());
		System.out.println("\t" + bean.);

	}

}

private static void testFindByRoll() throws Exception {
    Marksheet_Model model = new Marksheet_Model();      
	Marksheet_bean bean = model.findByRoll(101);
	if (bean != null) {
		
	System.out.print(bean.getId() +"   " + bean.getName()+"   " + bean.getRollNo() +"   "+ bean.getPhysics() +"   "+ bean.getChemistry() +"  "+ bean.getMaths() );
	
	
}else {
	System.out.println("roll no do not exist..!!!!");
}
}
private static void testUpdate() throws Exception {
Marksheet_bean bean = new Marksheet_bean();
bean.setName("nahi");
bean.setId(22);
Marksheet_Model mdl = new Marksheet_Model();
mdl.update(bean);
	
}

private static void testdelete() throws Exception {
	Marksheet_bean bean = new Marksheet_bean();

	bean.setId(23);
	
	 Marksheet_Model model = new Marksheet_Model();
	 model.delete(bean);
}

private static void testinsert() throws Exception {
	Marksheet_bean bean = new Marksheet_bean();
	//bean.setId(36);
	bean.setName("mun");
	bean.setRollNo(136);
	bean.setPhysics(77);
	bean.setChemistry(70);
	bean.setMaths(80);
	Marksheet_Model Model = new Marksheet_Model();
	Model.insert(bean);
}
}
