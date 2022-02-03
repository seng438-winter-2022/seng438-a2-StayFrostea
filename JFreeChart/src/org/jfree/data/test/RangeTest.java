package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeTest {
    private Range exampleRangeNegZero;
    private Range exampleRangeZeroPos;
    private Range exampleRangeNegPos;
    private Range exampleRangeEqual;
    private Range exampleRangePosPos;
    private Range exampleRangeNegNeg;
    
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { 
    	exampleRangeNegZero = new Range(-3, 0);
        exampleRangeZeroPos = new Range(0, 3);
        exampleRangeNegPos = new Range(-2.5, 2.5);
        exampleRangeEqual = new Range(3, 3);
        exampleRangePosPos = new Range(0.111111111,0.111111112);
        exampleRangeNegNeg = new Range(-6, -3);
    }
    
    // Test getLowerBound function for all 6 cases
    @Test
    public void getLowerBoundNegZero() {
    	assertEquals("The lower bound of -3 and 0 should be -3", 
    			-3, exampleRangeNegZero.getLowerBound(), .000000001d);
    }
    
    @Test
    public void getLowerBoundZeroPos() {
    	assertEquals("The lower bound of 0 and 3 should be 0", 
    			0, exampleRangeZeroPos.getLowerBound(), .000000001d);
    }
    
    @Test
    public void getLowerBoundNegPos() {
    	assertEquals("The lower bound of -2.5 and 2.5 should be -2.5", 
    			-2.5, exampleRangeNegPos.getLowerBound(), .000000001d);
    }
    
    @Test
    public void getLowerBoundEqual() {
    	assertEquals("The lower bound of 3 and 3 should be 3", 
    			3, exampleRangeEqual.getLowerBound(), .000000001d);
    }
    
    @Test
    public void getLowerBoundPosPos() {
    	assertEquals("The lower bound of 0.111111111 and 0.111111112 should be 0.111111111", 
    			0.111111111, exampleRangePosPos.getLowerBound(), .000000001d);
    }
    
    @Test
    public void getLowerBoundNegNeg() {
    	assertEquals("The lower bound of -6 and -3 should be -6", 
    			-6, exampleRangeNegNeg.getLowerBound(), .000000001d);
    }
    
    // Test getUpperBound for all 6 test cases
    @Test
    public void getUpperBoundNegZero() {
        assertEquals("The upperbound of -3 and 0 should be 0",
        		0, exampleRangeNegZero.getUpperBound(), .000000001d);
    }
    
    @Test
    public void getUpperBoundZeroPos() {
    	assertEquals("The upper bound of 0 and 3 should be 3", 
    			3, exampleRangeZeroPos.getUpperBound(), .000000001d);
    }
    
    @Test
    public void getUpperBoundNegPos() {
    	assertEquals("The upper bound of -2.5 and 2.5 should be 2.5", 
    			2.5, exampleRangeNegPos.getUpperBound(), .000000001d);
    }
    
    @Test
    public void getUpperBoundEqual() {
    	assertEquals("The upper bound of 3 and 3 should be 3", 
    			3, exampleRangeEqual.getUpperBound(), .000000001d);
    }
    
    @Test
    public void getUpperBoundPosPos() {
    	assertEquals("The upper bound of 0.111111111 and 0.111111112 should be 0.111111112", 
    			0.111111112, exampleRangePosPos.getUpperBound(), .000000001d);
    }
    
    @Test
    public void getUpperBoundNegNeg() {
    	assertEquals("The upper bound of -6 and -3 should be -3", 
    			-3, exampleRangeNegNeg.getUpperBound(), .000000001d);
    }
    
    // Test getLength method for all 6 cases
    @Test
    public void getLengthNegZero() {
        assertEquals("The length of -3 and 0 should be 3",
        		3, exampleRangeNegZero.getLength(), .000000001d);
    }
    
    @Test
    public void getLengthZeroPos() {
    	assertEquals("The length of 0 and 3 should be 3", 
    			3, exampleRangeZeroPos.getLength(), .000000001d);
    }
    
    @Test
    public void getLengthNegPos() {
    	assertEquals("The length of -2.5 and 2.5 should be 5", 
    			5, exampleRangeNegPos.getLength(), .000000001d);
    }
    
    @Test
    public void getLengthEqual() {
    	assertEquals("The length of 3 and 3 should be 0", 
    			0, exampleRangeEqual.getLength(), .000000001d);
    }
    
    @Test
    public void getLengthPosPos() {
    	assertEquals("The length of 0.111111111 and 0.111111112 should be 0.000000001", 
    			0.000000001, exampleRangePosPos.getLength(), .000000001d);
    }
    
    @Test
    public void getLengthNegNeg() {
    	assertEquals("The length of -6 and -3 should be 3", 
    			3, exampleRangeNegNeg.getLength(), .000000001d);
    }
    
    
    // Test shift for (-3, 0)
    @Test
    public void shiftNegZeroNeg() {
    	Range testRangeNegZero = new Range(-4, -1);
        assertEquals("The new range should be -4 to -1", testRangeNegZero,
        Range.shift(exampleRangeNegZero, -1));
    }
    
    @Test
    public void shiftNegZeroZero() {
    	Range testRangeNegZero = new Range(-3, 0);
        assertEquals("The new range should be -3 to 0", testRangeNegZero,
        Range.shift(exampleRangeNegZero, 0));
    }
    
    
    @Test
    public void shiftNegZeroPos() {
    	Range testRangeNegZero = new Range(-2, 1);
        assertEquals("The new range should be -2 to 1", testRangeNegZero,
        Range.shift(exampleRangeNegZero, 1));
    }
    
    // Test shift for (0, 3)
    @Test
    public void shiftZeroPosNeg() {
    	Range testRangeZeroPos = new Range(-1, 2);
        assertEquals("The new range should be -1 to 2", testRangeZeroPos,
        Range.shift(exampleRangeZeroPos, -1));
    }
    
    @Test
    public void shiftZeroPosZero() {
    	Range testRangeZeroPos = new Range(0, 3);
        assertEquals("The new range should be 0 to 3", testRangeZeroPos,
        Range.shift(exampleRangeZeroPos, 0));
    }
    
    @Test
    public void shiftZeroPosPos() {
    	Range testRangeZeroPos = new Range(1, 4);
        assertEquals("The new range should be 1 to 4", testRangeZeroPos,
        Range.shift(exampleRangeZeroPos, 1));
    }
    
    // Test shift for (-2.5, 2.5)
    @Test
    public void shiftNegPosNeg() {
    	Range testRangeNegPos = new Range(-3.5, 1.5);
        assertEquals("The new range should be -3.5 to 1.5", testRangeNegPos,
        Range.shift(exampleRangeNegPos, -1));
    }
    
    @Test
    public void shiftNegPosZero() {
    	Range testRangeNegPos = new Range(-2.5, 2.5);
        assertEquals("The new range should be -2.5 to 2.5", testRangeNegPos,
        Range.shift(exampleRangeNegPos, 0));
    }
    
    @Test
    public void shiftNegPosPos() {
    	Range testRangeNegPos = new Range(-1.5, 3.5);
        assertEquals("The new range should be -1.5 to 3.5", testRangeNegPos,
        Range.shift(exampleRangeNegPos, 1));
    }
    
    // Test shift for (3, 3)
    @Test
    public void shiftEqualNeg() {
    	Range testRangeEqual = new Range(2, 2);
        assertEquals("The new range should be 2 to 2", testRangeEqual,
        Range.shift(exampleRangeEqual, -1));
    }
    
    @Test
    public void shiftEqualZero() {
    	Range testRangeEqual = new Range(3, 3);
        assertEquals("The new range should be 3 to 3", testRangeEqual,
        Range.shift(exampleRangeEqual, 0));
    }
    
    @Test
    public void shiftEqualPos() {
    	Range testRangeEqual = new Range(4, 4);
        assertEquals("The new range should be 4 to 4", testRangeEqual,
        Range.shift(exampleRangeEqual, 1));
    }
    
    
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
    
}
