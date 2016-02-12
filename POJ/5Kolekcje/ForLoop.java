class ForLoop{
    public static void main(String args[]) {
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	int result = 0;

	// normalna petla for
	for(int i=0; i<a.length;i++)
	    result += a[i];
	System.out.println(result);

	// inna forma petli for
	result = 0;
	for (int i : a)
	    result += i;
	System.out.println(result);
	    
   }
}
