package utilityClass;

public class Shirt implements Comparable<Shirt> {

	String brand_name;
	int size;
	double price;
	String colour;

	Shirt() {

	}

	Shirt(String brand_name, int size, double price, String colour) {
		this.brand_name = brand_name;
		this.size = size;
		this.price = price;
		this.colour = colour;
	}

//	@Override
//	public int compareTo(Shirt s) {
//		 
//		return this.brand_name.compareTo(s.brand_name);
//	}
//	

//    @Override
//	public int compareTo(Shirt s) {
//		 
//		return this.size-s.size;
//	}

	@Override
	public int compareTo(Shirt s) {

		return (int) (this.price - s.price);
	}

	public String toString() {
		return "Brand_name: " + brand_name + " Size: " + size + " Price: " + price + " Colour: " + colour;
	}

}
