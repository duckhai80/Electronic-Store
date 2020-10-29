package Models;

import java.sql.Date;

public class Product {
	
	private int id;
	private String name_product;
	private String type;
	private float price;
	private float price_sale;
	private int id_producer;
	private String name_producer;
	private Date date_of_manu;
	private int id_production;
	private String type_production;
	private String image;
	private String describe;
	
	public Product(int id, String name_product, int id_producer, int id_production, String type, float price, float price_sale, String image, String describe) {
		super();
		this.id = id;
		this.name_product = name_product;
		this.id_producer = id_producer;
		this.id_production = id_production;
		this.type = type;
		this.price = price;
		this.price_sale = price_sale;
		this.image = image;
		this.describe = describe;
	}
	
	/*/ public Product(String name_product, String type, float price, String name_producer, float price_sale, String type_production, String image, String describe) {
		super();
		this.name_product = name_product;
		this.type = type;
		this.price = price;
		this.name_producer = name_producer;
		this.price_sale = price_sale;
		this.type_production = type_production; 
		this.image = image;
		this.describe = describe;
	} /*/

	public Product(String name_product, int id_producer, int id_production, String type, float price, float price_sale, String image, String describe) {
		super();
		this.name_product = name_product;
		this.id_producer = id_producer;
		this.id_production = id_production;
		this.type = type;
		this.price = price;
		this.price_sale = price_sale;
		this.image = image;
		this.describe = describe;
	}

	public Product(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_product() {
		return name_product;
	}

	public void setName_product(String name_product) {
		this.name_product = name_product;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice_sale() {
		return price_sale;
	}

	public void setPrice_sale(float price_sale) {
		this.price_sale = price_sale;
	}

	public int getId_producer() {
		return id_producer;
	}

	public void setId_producer(int id_producer) {
		this.id_producer = id_producer;
	}

	public String getName_producer() {
		return name_producer;
	}

	public void setName_producer(String name_producer) {
		this.name_producer = name_producer;
	}

	public Date getDate_of_manu() {
		return date_of_manu;
	}

	public void setDate_of_manu(Date date_of_manu) {
		this.date_of_manu = date_of_manu;
	}

	public int getId_production() {
		return id_production;
	}

	public void setId_production(int id_production) {
		this.id_production = id_production;
	}

	public String getType_production() {
		return type_production;
	}

	public void setType_production(String type_production) {
		this.type_production = type_production;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}


	/*/ public Product(int id_product, String name_product, String type, int id_producer, String image, String describe,
			float price, float price_sale) {
		super();
		this.id_product = id_product;
		this.name_product = name_product;
		this.type = type;
		this.id_producer = id_producer;
		this.image = image;
		this.describe = describe;
		this.price = price;
		this.price_sale = price_sale;
	}/*/
		
}
