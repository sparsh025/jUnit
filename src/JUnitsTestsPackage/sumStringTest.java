package JUnitsTestsPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import jUnitTestPackage.jUnitFunctions;

public class sumStringTest {

	@Test
	public void test() {
		JUnitsFunctions obj = new JUnitsFunctions();
		String output = obj.sumString("Sparsh ", "Sharma");
		assertEquals ("Sparsh Sharma", output);
	}

}
