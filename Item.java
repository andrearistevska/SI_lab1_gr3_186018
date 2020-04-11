class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
        double A=18/100;
        double B=5/100;
	double C=0/100;
	//TODO constructor
	public Item(int id, String name, double price, double A, double B, double C){
		this.id=id;
		this.name=name;
		this.price=price;
		this.A=A;
		this.B=B;
		this.C=C;
	}

	//TODO setters and getters
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public double getA(){
		return A;
	}
	public double getB(){
		return B;
	}
	public double getC(){
		return C;
	}
	double taxReturn () {

		//TODO
		return price*A/100*15/100;
	}
}
