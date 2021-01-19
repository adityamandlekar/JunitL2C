import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JunitCheck {

	DateFormatBO dateFormatBO;

	@Before
	public void createObject() {
	dateFormatBO = new DateFormatBO();
	}

	@Test
	public void testDateFormat() {

		//DateFormatBO dateFormatBO = new DateFormatBO();
		List<String> actual = new ArrayList<String>();
		List<String> d = new ArrayList<String>();
		List<String> expected= new ArrayList<String>();

		d.add("0101002020");
		d.add("0202002021");

		dateFormatBO.convertToCorrectDateFormat(actual,d);
		Assert.assertThat(actual, Matchers.containsInAnyOrder("01-10-2020", "02-20-2021"));
	}
	
}
