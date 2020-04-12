class Item {
	int id;
	String name;
	double price;
	int taxType;

	public Item(int id, String name, double price, int taxType) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getTaxType() {
		return taxType;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTaxType(int taxType) {
		this.taxType = taxType;
	}

	double taxReturn () {
		return price * 0.15;
	}
}


class Receipt{

	List<Item> itemList;

	public Receipt() {
		this.itemList = new ArrayList();
	}
	
	itemList.add();
}