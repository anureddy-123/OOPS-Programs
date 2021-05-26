package shirtMaterialChecker;

enum ShirtMaterial {

	Cotton, Linen, Polyester
}

class shirtMaterialTest {
	float collarSize;
	float length;
	ShirtMaterial material;

	shirtMaterialTest() {

		collarSize = 0;
		length = 0;
		material = ShirtMaterial.Cotton;
	}

	public shirtMaterialTest(float collarSize, float length, ShirtMaterial material) {
		super();
		this.collarSize = collarSize;
		this.length = length;
		this.material = material;
	}

	public float getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(float collarSize) {
		this.collarSize = collarSize;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public ShirtMaterial getMaterial() {
		return material;
	}

	public void setMeterial(ShirtMaterial material) {
		this.material = material;
	}

	public void display() {
		System.out.println("shirtMaterialTest [collarSize=" + " " + collarSize + ", length=" + " " + length
				+ ", material=" + " " + material + "]");
	}

}

class Shirt {

	public static void main(String[] args) {

		shirtMaterialTest s = new shirtMaterialTest();

		shirtMaterialTest s1 = new shirtMaterialTest(6.00f, 2.00f, ShirtMaterial.Cotton);
		s1.display();
	}
}
