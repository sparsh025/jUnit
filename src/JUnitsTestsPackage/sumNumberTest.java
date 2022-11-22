// Name: Sparsh Sharma
// Enrolment No. E21CSEU0052
// Batch: EB06

package JUnitsTestsPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumNumberTest {

	@Test
	public void test() {
		JUnitsFunctions obj = new JUnitsFunctions();
		int output = obj.sumNumber(2, 3);
		assertEquals (5, output);
	}

}
