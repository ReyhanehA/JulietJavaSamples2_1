/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__random_subtract_11.java
Label Definition File: CWE191_Integer_Underflow.label.xml
Template File: sources-sinks-11.tmpl.java
*/
/*
* @description
* CWE: 191 Integer Underflow
* BadSource: random Set data to a random value
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: subtract
*    GoodSink: Ensure there will not be an underflow before performing the subtraction
*    BadSink : Unchecked subtraction can lead to underflow
* Flow Variant: 11 Control flow: if(IO.static_returns_t()) and if(IO.static_returns_f())
*
* */

package testcases.CWE191_Integer_Underflow;

import testcasesupport.*;

import java.sql.*;
import javax.servlet.http.*;

import java.security.SecureRandom;
import java.util.logging.Logger;

import java.security.SecureRandom;

public class CWE191_Integer_Underflow__random_subtract_11 extends AbstractTestCase
{

    public void bad() throws Throwable
    {
        int data;
        if(IO.static_returns_t())
        {
            Logger log_bad = Logger.getLogger("local-logger");
            SecureRandom r = new SecureRandom();
            data = r.nextInt();
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");

            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;

        }
        if(IO.static_returns_t())
        {
            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */
            /* POTENTIAL FLAW: if (data-valueToSub) < MIN_VALUE this will underflow */
            int result = (data - valueToSub);
            IO.writeLine("result: " + result);
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */
            int result = 0;

            /* FIX: Add a check to prevent an underflow from occurring */
            if (data >= (Integer.MIN_VALUE+valueToSub))
            {
                result = (data - valueToSub);
                IO.writeLine("result: " + result);
            }
            else {
                IO.writeLine("Input value is too small to perform subtraction.");
            }

        }

    }

    /* goodG2B1() - use goodsource and badsink by changing first IO.static_returns_t() to IO.static_returns_f() */
    private void goodG2B1() throws Throwable
    {
        int data;
        if(IO.static_returns_f())
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            Logger log_bad = Logger.getLogger("local-logger");
            SecureRandom r = new SecureRandom();
            data = r.nextInt();
        }
        else {

            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");

            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;

        }
        if(IO.static_returns_t())
        {
            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */
            /* POTENTIAL FLAW: if (data-valueToSub) < MIN_VALUE this will underflow */
            int result = (data - valueToSub);
            IO.writeLine("result: " + result);
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */
            int result = 0;

            /* FIX: Add a check to prevent an underflow from occurring */
            if (data >= (Integer.MIN_VALUE+valueToSub))
            {
                result = (data - valueToSub);
                IO.writeLine("result: " + result);
            }
            else {
                IO.writeLine("Input value is too small to perform subtraction.");
            }

        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    private void goodG2B2() throws Throwable
    {
        int data;
        if(IO.static_returns_t())
        {
            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");
            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            Logger log_bad = Logger.getLogger("local-logger");

            SecureRandom r = new SecureRandom();
            data = r.nextInt();

        }
        if(IO.static_returns_t())
        {
            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */
            /* POTENTIAL FLAW: if (data-valueToSub) < MIN_VALUE this will underflow */
            int result = (data - valueToSub);
            IO.writeLine("result: " + result);
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */
            int result = 0;

            /* FIX: Add a check to prevent an underflow from occurring */
            if (data >= (Integer.MIN_VALUE+valueToSub))
            {
                result = (data - valueToSub);
                IO.writeLine("result: " + result);
            }
            else {
                IO.writeLine("Input value is too small to perform subtraction.");
            }

        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second IO.static_returns_t() to IO.static_returns_f() */
    private void goodB2G1() throws Throwable
    {
        int data;
        if(IO.static_returns_t())
        {
            Logger log_bad = Logger.getLogger("local-logger");
            SecureRandom r = new SecureRandom();
            data = r.nextInt();
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");

            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;

        }
        if(IO.static_returns_f())
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */
            /* POTENTIAL FLAW: if (data-valueToSub) < MIN_VALUE this will underflow */
            int result = (data - valueToSub);
            IO.writeLine("result: " + result);
        }
        else {

            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */
            int result = 0;

            /* FIX: Add a check to prevent an underflow from occurring */
            if (data >= (Integer.MIN_VALUE+valueToSub))
            {
                result = (data - valueToSub);
                IO.writeLine("result: " + result);
            }
            else {
                IO.writeLine("Input value is too small to perform subtraction.");
            }

        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    private void goodB2G2() throws Throwable
    {
        int data;
        if(IO.static_returns_t())
        {
            Logger log_bad = Logger.getLogger("local-logger");
            SecureRandom r = new SecureRandom();
            data = r.nextInt();
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");

            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;

        }
        if(IO.static_returns_t())
        {
            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */
            int result = 0;
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data >= (Integer.MIN_VALUE+valueToSub))
            {
                result = (data - valueToSub);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("Input value is too small to perform subtraction.");
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            int valueToSub = (new SecureRandom()).nextInt(99)+1; /* subtracting at least 1 */

            /* POTENTIAL FLAW: if (data-valueToSub) < MIN_VALUE this will underflow */
            int result = (data - valueToSub);

            IO.writeLine("result: " + result);

        }
    }

    public void good() throws Throwable
    {
        goodG2B1();
        goodG2B2();
        goodB2G1();
        goodB2G2();
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}