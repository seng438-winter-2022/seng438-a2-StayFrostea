**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |     |
| -------------- | --- |
| Student Names: |  Agampreet Aulakh   |
|                |  Melanie Nguyen   |
|                |  Jeff Roszell   |
|                |  Heidi Schaefer   |

# 1 Introduction

The purpose of this lab was to learn the process of developing tests using JUnit and Eclipse with a focus on requirements. Before implementing tests, black-box strategies, test cases, and equivalence classes were outlined. Mock objects and Javadocs were utilized in the implementation of tests.

# 2 Detailed description of unit test strategy

## RangeTest
For the RangeTest methods **getLowerBound** (1), **getUpperBound** (2), **getLength** (3), **shift** (4), and **scale** (5) we decided to test different equivalence classes to encompass negative, positive, zero, equal, and various decimal precisions. To do this, we created 6 Range variables with the following lower and upper bounds:
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
<br>Thus, we felt that it was unnecessary to create test cases where the lower > upper, as this would cause the constructor to fail, and our intention is to test the methods.</br>

<br>For the method **shift** (4), we decided to test the above ranges with the shift values -1, 0, and 1. This tests the three general cases of use for this method: shifting by a negative number, positive number, and by zero.

<br>For the method **scale** (5), we decided to test the above ranges with the scale values 0, 0.5, 1, and 2, as these represent zeroing, halving, maintaining the current values and doubling-- all of which require different method behaviour. We did not test negative scaling factors, as the Javadocs denoted scaling factor must be "non-negative".

## DataUtilitiesTest
Five methods from the DataUtilities class were tested, namely: **calculateColumnTotal** (1), **calculateRowTotal** (2), **clone** (3), **createNumberArray** (4), and **createNumberArray2D** (5). In calculating column and row totals, we tested cases where the methods returned both negative and positive totals, as well as zero. We also considered the case of empty inputs, where the methods were expected to also return zero, and the case of null inputs, where the methods were expected to throw an error. Mock Values2D objects with the following structure were used:
-   First row [-5.5  5.5 -5.5  5.5 -5.5  5.5] and column [-5.5  5.5 -5.5  5.5 -5.5  5.5] summing to zero
-   First row [100 100 100] and column [100 100 100] summing to positive number
-   First row [-100 -100 -100] and column [-100 -100 -100] summing to negative number
-   No rows or columns, resulting in zero
-   Null rows and columns, resulting in an IllegalArugmentException error

We ensured that each mock object was properly created during the setup as were not testing the interfaces Values2D and KeyedValues, but rather the ability of DataUtilities methods to handle different inputs. This includes having each mock object return correct values through simulated getters and setters.


The **clone()** (3) method was tested using similar positive, negative and zero-partitioning. (... continue ...)
The IllegalArugmentException error should be thrown when cloning a null array.

The **createNumberArray()** (4) and **createNumberArray2D()** (5) methods tested the creation of positive, negative and empty Numbers arrays of various sizes from corresponding double arrays.

The **createNumberArray()** method tested the creation of a Number array from a primitive double array. The creation of an empty array, a one value array, and various three value arrays were tested. Of the three value arrays, we tested one for negative numbers, one for all positive numbers, one for numbers with three decimal places, one for large numbers, and one with null input. The null array should throw an IllegalArgumentException error.  

For the **createNumberArray2D()** method, we decided to test for arrays of varying sizes (1x1, 3x3, 3x5) and of varying inputs. Three-by-three arrays were used to test negative arrays, positive arrays, and arrays with small numbers (1E-13) and multiple decimal places.

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
- scaleNegZeroZero()
- scaleZeroPosZero()
- scaleNegNegZero()
- scalePosPosZero()
- scaleNegPosZero()


- scaleNegZeroFrac()
- scaleZeroPosFrac()
- scaleNegNegFrac()
- scalePosPosFrac()
- scaleNegPosFrac()

- scaleNegZeroOne()
- scaleZeroPosOne()
- scaleNegNegOne()
- scalePosPosOne()
- scaleNegPosOne()


- scaleNegZeroPos()
- scaleZeroPosPos()
- scaleNegNegPos()
- scalePosPosPos()
- scaleNegPosPos()

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
- createNumberArrayEmpty()
- createNumberArrayOneValue()
- createNumberArrayThreeValues()
- createNumberArrayThreeValuesNeg()
- createNumberArrayThreeValues3Decs()
- createNumberArrayThreeValuesBigNum()
- createNumberArrayNull()

### To test createNumberArray2D method
- createNumberArray2DEmpty()
- createNumberArray2DByOnePos()
- createNumberArray2DByThreePos()
- createNumberArray2DByThreeNeg()
- createNumberArray2DByThreeSmallNum()
- createNumberArray2DThreeByFive()

### To test clone method
-   cloneZero()
-   clonePos()
-   cloneNeg()
-   cloneEmpty()

## Discussion of Benefits and Drawbacks of Mocking

The use of mocking allows for dependencies to be accounted for and abstracted. The mocking will allow the user/tester to account for the expected output of DOC classes. The call from the SUT will be to a fake class that has controlled output. In our test cases, we ensured that the mocked output of these objects was correctly implemented to ensure only one element was being tested.

Pros:
- This allows for the removal of dependency on the DOC. Specifically, the test can be intepreted to only depend on the functionality of the SUT and its inner workings.
- Mocks can be a very useful way of organizing code and testing the outgoing related function calls and incoming return value integrations. This allows for much better I/O reliability and more extensive testing.

Cons:
- This is still an iterative approach which will have many cases.
- Each iteration requires the proper implementation of a mocked class. Tests should not be failing due to the incorrect mocking of objects.
- If the SUT is simple then this method is easy to implement, however as the number of outgoing calls rise, the size/number of mocks made must also increase which adds complexity to the testing code. The stubs may also grow in size and complexity.
- Overall setting up the tests is more complex and difficult.

# 4 How the team work/effort was divided and managed

## Test Development

Two group sessions were planned where each of the group members were present. During the sessions each of the students were involved in a group/pair programming scenario with one student coding while others investigated the details of the test cases. In addition, each member was responsible for contributing to small portions of test cases which were not finished during these sessions.

## Report Writing

During the preperation of this report, each group member was able to provide there input section by section through group chat and meetings. The overall writing of the report was done as a group effort over the course of the last week with one formal meeting to finish up and solidify the report.

## Presentation of Findings (TA Presentation)

Each group member has prepared for 1 simple test case and 1 stub/mock test case. Each group member will be able to explain the workings of the test cases and the relevance of the stub/mock framework.

# 5 Difficulties encountered, challenges overcome, and lessons learned

## Test Creation Issues

- Creating the mocks in such a fashion that they could be reused for multiple test cases and test multiple functions without overcomplicating the values.
- Minimizing test cases while providing adequate code coverage. Hard to know when to stop writing test cases.
- Initially during setup there were some issues and differences between those of us who were using Mac vs. Windows vs. Linux. Some required an additional (non-included) jar file in order for even the example test case to run.

### Errors Found Through Tests
- Through our range class tests, we noticed that we had to include a specific decimal precision in our assert statements when using decimal ranges. Without this precision, the decimal ranges would round to unintended values and the assert would fail.
- Through our range class tests, we also noticed that the shift() method would not allow ranges to shift below zero, unless the third parameter was set to true.

## Theoretical Issues

- Mockery was difficult to implement without any prior experience. The mockery portion of the notes was only covered for 1 lecture by the middle of the assignment, therefore some of the learning on the subject was done on the fly.
- The explanation of what exactly clone() was used for in context with the rest of the DataUtilities class was somewhat lacking.

## Significant Learning Points

- Integration of JMock and JUnit testing into software development.
- Creation of Mocks.
- Creation of Stubs.
- DOC concepts

# 6 Comments/feedback on the lab itself
This lab was an enjoyable way of practicing black box testing strategies. Our team benefitted from laying out a distinct strategy at the start the lab. The use of mocking was a new concept and it inspired a curiosity for alternative approaches.
