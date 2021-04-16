package gpi_p4;

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
     * @return the suite of the tests being tested
     */
    public static Test suite()
    {
    	return new TestSuite (AppTest.class );
    }

    String helloWorld = "Hello World";
    /**
     * Rigorous Test :-)
     */

    public void testHelloWorld(){

	assertEquals(helloWorld, App.getHelloWorld());
    }
}
