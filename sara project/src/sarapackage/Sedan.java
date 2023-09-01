package sarapackage;

public class Sedan extends Car {
    int length;

    
    public Sedan() {
		super();
		
	}


	public double getSalePrice() {
        if (length > 20) {
            return super.regularPrice * 0.95; // 5% discount
        } else {
            return super.regularPrice * 0.9; // 10% discount
        }
    }
}
