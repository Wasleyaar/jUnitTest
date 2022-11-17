package jUnitTestPackage;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({testAddNumbera.class, testAddStrings.class})
public class testSuite1 {

}
