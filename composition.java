package Core;
class Cat{
	private String catName;
	private Human name2;  // composition
	public Cat(String name, Human na) {
		 catName = name;
		 name2 = na;
	 }
	 
	//converting to string so that it will directly prints its value to the main object
	public String toString() {  
		return String.format("My name is %s and I belong to my owner %s", catName, name2);
	}
}

class Human{
	private String humanName;
	
	public Human(String name1){
		humanName = name1;
	}
	public String toString() {
		return humanName;
	}
}
public class composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Human("Navya");
		Cat obj1 = new Cat("Tom", obj);
		System.out.println(obj1);

	}

}
