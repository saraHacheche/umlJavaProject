package sarapackage;

class Truck extends Car {
    private int weight;

    public double getSalePrice() {
        if (weight > 2000) {
            return super.regularPrice * 0.9; // 10% discount
        } else {
            return super.regularPrice * 0.8; // 20% discount
        }
    }

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
    
}
