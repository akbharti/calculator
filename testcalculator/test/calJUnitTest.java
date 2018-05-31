
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

 //* @author ABHISHEK BHARTI
 
public class calJUnitTest {

    private testCalculator calTest;
    
    public calJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.calTest = new testCalculator();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void add(){
            assertEquals(3, calTest.add(1 , 2));
    }
    
    @Test
    public void sub(){
            assertEquals(2, calTest.sub(3 , 1));
    }
    
    @Test
    public void mul(){
            assertEquals(2, calTest.mul(1 , 2));
    }
    
    @Test
    public void div(){
            assertEquals(2, calTest.div(4 , 2));
    }
}
