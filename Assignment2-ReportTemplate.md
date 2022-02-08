**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |     |
| -------------- | --- |
| Student Names: |  Agampreet Aulakh   |
|                |  Melanie Nguyen   |
|                |  Jeff Roszell   |
|                |  Heidi Schaefer   |

# 1 Introduction

The purpose of this lab was to learn to develop tests using JUnit and Eclipse
with a focus on requirements. Before implementing tests, test strategies and test
cases were developed. Mock objects and Javadocs were utilized.

# 2 Detailed description of unit test strategy

## RangeTest
For the RangeTest methods **getLowerBound**, **getUpperBound**, **getLength** and **shift**, we decided to test 6 different ranges to encompass
negative, positive, zero, equal, and various decimal precisions. To do this
we created 6 Range variables with the following lower and upper bounds:
-   (-3, 0) - negative to positive
-   (0, 3) - zero to positive
-   (-2.5, 2.5) - negative to positive, decimal accurate to tenth place
-   (3, 3) - equal
-   (0.111111111, 0.111111112) - positive to positive, decimal accurate to billionth place
-   (-6, -3) - negative to negative

The provided Javadoc described the constructor and parameters for Range as follows:
public Range(double lower, double upper)
lower - the lower bound (must be <= upper bound).
upper - the upper bound (must be >= lower bound).
Thus, we felt that it was unnecessary to create test cases where the lower > upper,
as this would cause the constructor to fail, and our intention is to test the methods.

## DataUtilitiesTest


# 3 Test cases developed

Two test classes were developed: RangeTest and DataUtilitiesTest.

## RangeTest
// To test getLowerBound method
- getLowerBoundNegZero()
- getLowerBoundZeroPos()
- getLowerBoundNegPos()
- getLowerBoundEqual()
- getLowerBoundPosPos()
- getLowerBoundNegNeg()

// To test getUpperBound method
- getUpperBoundNegZero()
- getUpperBoundZeroPos()
- getUpperBoundnegPos()
- getUpperBoundEqual()
- getUpperBoundPosPos()
- getUpperBoundNegNeg()

// To test getLength method
- getLengthNegZero()
- getLengthZeroPos()
- getLengthNegPos()
- getLengthEqual()
- getLengthPosPos()
- getLengthNegNeg()

// To test shift method
- shiftNegZeroNeg()
- shiftNegZeroZero()
- shiftNegZeroPos()

- shiftZeroPosNeg()
- shiftZeroPosZero()
- shiftZeroPosPos()

- shiftNegPosNeg()
- shiftNegPosZero()
- shiftNegPosPos()

- shiftEqualNeg()
- shiftEqualZero()
- shiftEqualPos()

- shiftPosPosNeg()
- shiftPosPosZero()
- shiftPosPosPos()

- shiftNegNegNeg()
- shiftNegNegZero()
- shiftNegNegPos()
    
// To test scale method
- scaleNegNegFrac()
- scalePosPosFrac()
- scaleNegPosFrac()

- scaleNegNegPos()
- scalePosPosPos()
- scaleNegPosPos()

- scaleNegNegZero()
- scalePosPosZero()
- scaleNegPosZero()

## DataUtilitiesTest


// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

## Discussion of benefits and drawbacks of mocking

The use of mocking allows for dependencies to be accounted for and abstracted. The mocking will allow th user/tester to account for the expected output of DOC classes. The call from the SUT will be to a fake class that has controlled output.

Pros:
- Allows for removal of dependency on the DOC. By doing so, the test can be intepreted to only depend on the functionality of the SUT and it's inner workings.
- Mocks can be a very useful way of organizing code and testing the outgoing related function calls and incoming return value integrations. This allows for much better I/O reliability and more extensive testing.

Cons:
- This is still an iterative approach which will have many cases.
- If the SUT is simple then this method is easy to implement, however as the number of outgoing calls rise, the size/number of mocks made must also increase which adds complexity to the testing code. The stubs as well may grow in size and complexity.
- Overall setting up the tests is more complex and difficult.

# 4 How the team work/effort was divided and managed

Text…

# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
