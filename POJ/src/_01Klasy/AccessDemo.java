package _01Klasy;

class Access {
	int samplePackageField;
	public int samplePublicField;
	private int samplePrivateField;

	public void setSamplePrivateField(int value) {
		samplePrivateField = value * 2;
	}
	protected int getSamplePrivateField() {
		return samplePrivateField * 2;
	}
}

class AccessDemo {
	public static void main(String[] args) {
		Access ob = new Access();

		ob.samplePackageField = 10;
		ob.samplePublicField = 20;

//		ob.samplePrivateField = 100;
//		ob.sampleMissingField = 11;
		ob.setSamplePrivateField(100);
		System.out
				.println("a = " + ob.samplePackageField + " b = " + ob.samplePublicField + " c = " + ob.getSamplePrivateField());
	}
}
