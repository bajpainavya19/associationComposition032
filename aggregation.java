package Core;
 class Employee{
	private int id;
	private String name;
	private Address adr; //aggregation i.e. code reusability
	
	Employee(int i, String n, Address a){
		id = i;
		name = n;
		adr = a;
	}
	
	public void display() {
		System.out.println("Id is: " + id  + " " + ",name is: " + name + " " + ",then address of my home is: " + adr.Hno + " " + adr.City + " " + adr.Country);
	}
}

class Address{
	 int Hno;
	 String City;
	String Country;
	
	Address(int H, String C, String Cou){
		Hno = H;
		City = C;
		Country = Cou;
	}
}
public class aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address adrObj = new Address(34, "Lucknow", "India");
        Employee emp1 = new Employee(032, "Navya", adrObj);
        emp1.display();
        
	}

}
