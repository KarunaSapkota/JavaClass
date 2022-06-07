package core.jdbc.usingDao;

public class Product {
	int id;
	String pName;
	String sku;
	String manufacturer;
	String description;
	float price;
	boolean isAvailable;

	public Product() {
		super();
	}

	public Product(int id, String pName, String sku, String manufacturer, String description, float price,
			boolean isAvailable) {
		super();
		this.id = id;
		this.pName = pName;
		this.sku = sku;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	public Product(String pName, String sku, String manufacturer, String description) {
		super();
		this.pName = pName;
		this.sku = sku;
		this.manufacturer = manufacturer;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getsku() {
		return sku;
	}

	public void setsku(String sku) {
		this.sku = sku;
	}

	public String getmanufacturer() {
		return manufacturer;
	}

	public void setmanufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getmdescription() {
		return description;
	}

	public void setdescritpion(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", pName=" + pName + ", sku=" + sku + ", manufacturer=" + manufacturer
				+ ", description=" + manufacturer + ",]";
	}

}