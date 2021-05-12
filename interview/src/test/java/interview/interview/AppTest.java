package interview.interview;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testGivenArrayOfInt_WhenArrayReceived_PrintPrettyNumbers()
    {
    	int numbers[] = {2,4,6,1}; 
    	int expectedPrettyOccurances = 3;
        App interviewApp = new App();
        int actualPrettyOccurances = interviewApp.findOccurancesOfModNumbers(numbers,2);
        
        assertEquals(expectedPrettyOccurances, actualPrettyOccurances);
    }
 
    
    public void testGivenArrayOfInt_WhenArrayReceived_PrintSpecialNumbers()
    {
    	int numbers[] = {2,4,6,1}; 
    	int expectedSpecialOccurances = 1;
        App interviewApp = new App();
        int actualSpecialOccurances = interviewApp.findOccurancesOfModNumbers(numbers,3);
        
        assertEquals(expectedSpecialOccurances, actualSpecialOccurances);
    }
}