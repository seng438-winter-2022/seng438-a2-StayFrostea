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
For the RangeTest methods **getLowerBound**, **getUpperBound**, **getLength** and **shift**, 
we decided to test 6 different ranges to encompass negative, positive, zero, equal, and various 
decimal precisions. To do this we created 6 Range variables with the following lower and upper bounds:
-   (-3, 0) - negative to positive
-   (0, 3) - zero to positive
-   (-2.5, 2.5) - negative to positive, decimal accurate to tenth place
-   (3, 3) - equal
-   (0.111111111, 0.111111112) - positive to positive, decimal accurate to billionth place
-   (-6, -3) - negative to negative

<br>The provided Javadoc described the constructor and parameters for Range as follows:</br>
<br>public Range(double lower, double upper)</br>
<br>lower - the lower bound (must be <= upper bound).</br>
<br>upper - the upper bound (must be >= lower bound).</br>
<br>Thus, we felt that it was unnecessary to create test cases where the lower > upper,
as this would cause the constructor to fail, and our intention is to test the methods.</br>

<br>For the method **shift**, we decided to test the above ranges with the shift values -1, 0, and 1.

<br>For the method **scale**, we decided to test the above ranges with the scale values -2, 0, 0.5, 1, and 2,
as these represent negative scaling, zeroing, halving, maintaining the current values and doubling,
which each have different behaviours.

## DataUtilitiesTest

# 3 Test cases developed

Two test classes were developed: RangeTest and DataUtilitiesTest.

## RangeTest
### To test getLowerBound method
Names formatted as getLowerBoundXY() where X represents lower bound, and Y represents upper bound.
- getLowerBoundNegZero()
- getLowerBoundZeroPos()
- getLowerBoundNegPos()
- getLowerBoundEqual()
- getLowerBoundPosPos()
- getLowerBoundNegNeg()

### To test getUpperBound method
Names formatted as getUpperBoundXY() where X represents lower bound, and Y represents upper bound.
- getUpperBoundNegZero()
- getUpperBoundZeroPos()
- getUpperBoundnegPos()
- getUpperBoundEqual()
- getUpperBoundPosPos()
- getUpperBoundNegNeg()

### To test getLength method
Names formatted as getLengthXY() where X represents lower bound, and Y represents upper bound.
- getLengthNegZero()
- getLengthZeroPos()
- getLengthNegPos()
- getLengthEqual()
- getLengthPosPos()
- getLengthNegNeg()

### To test shift method
Names formatted as shiftXYZ() where X represents lower bound, Y represents upper bound, and Z represents shift amount.
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
    
### To test scale method
Names formatted as scaleXYZ() where X represents lower bound, Y represents upper bound, and Z represents scaling factor.
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

### To test calculateColumnTotal method
-   calculateColumnTotalForZero()
-   calculateColumnTotalForPos()
-   calculateColumnTotalForNeg()
-   calculateColumnTotalForEmpty()

### To test calculateRowTotal method
-   calculateRowTotalForZero()
-   calculateRowTotalForPos()
-   calculateRowTotalForNeg()
-   calculateRowTotalForEmpty()

### To test createNumberArray method

### To test createNumberArray2D method

### To test getCumulativePercentages method

### To test clone method
-   cloneZero()
-   clonePos()
-   cloneNeg()
-   cloneEmpty()

## Discussion of Benefits and Drawbacks of Mocking

The use of mocking allows for dependencies to be accounted for and abstracted. The mocking will allow th user/tester to account for the expected output of DOC classes. The call from the SUT will be to a fake class that has controlled output.

Pros:
- Allows for removal of dependency on the DOC. By doing so, the test can be intepreted to only depend on the functionality of the SUT and it's inner workings.
- Mocks can be a very useful way of organizing code and testing the outgoing related function calls and incoming return value integrations. This allows for much better I/O reliability and more extensive testing.

Cons:
- This is still an iterative approach which will have many cases.
- If the SUT is simple then this method is easy to implement, however as the number of outgoing calls rise, the size/number of mocks made must also increase which adds complexity to the testing code. The stubs as well may grow in size and complexity.
- Overall setting up the tests is more complex and difficult.

# 4 How the team work/effort was divided and managed

## Test Development

Two group sessions were planned where each of the group members were present. During the sessions each of the students were involved in a group/pair programming scenario with one student coding while others investigated the details of the test cases. In addition, each member was responsible for contributing to small portions of test cases which were not finished during these sessions.

## Report Writing

During the preperation of this report, each group member was able to provide there input section by section through group chat and meetings. The overall writing of the report was done as a group effort over the course of the last week with one formal meeting to finish up and solidify the report.

## Presentation of Findings (TA Presentation)

Each group member has prepared for 1 simple test case and 1 stub/mock test case. Each group member will be able to explain the workings of the test cases and the relevance of the stub/mock framework.

# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
