package test.java.com.aksonenko.sourceit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {
	private double expected;
	private double valueOne;
	private double valueTwo;
	
	@Parameters
	public static Collection dataParameters() {
		return Arrays.asList(new Object[][] {
			{2, 1, 1},
			{3, 2, 1},
			{4, 3, 1}});	
	}
	
	public ParameterizedTest(double expected, double valueOne, double valueTwo) {
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	
	@Test
	public void sum() {
//		Calculator calc = new Calculator();
//		assertEquals(expected, calc.add(valueOne, valueTwo),0);
	}
}
