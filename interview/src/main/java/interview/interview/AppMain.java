package interview.interview;

public class AppMain {
	
    public static void main( String[] args )
    {
    	App thisApp = new App();
    	int numbers[] = {3,2,6,1,5,18};
    	int prettyOccurances = thisApp.findOccurancesOfModNumbers(numbers,2);
    	int specialOccurances = thisApp.findOccurancesOfModNumbers(numbers,3);
    	int totalOccurances = prettyOccurances + specialOccurances;
    	System.out.println("There were " + prettyOccurances + " pretty occurances in the array.");
    	System.out.println("There were " + specialOccurances + " special in the array.");
    	System.out.println("There were " + totalOccurances + " total occurances in the set");
    }
	

}
