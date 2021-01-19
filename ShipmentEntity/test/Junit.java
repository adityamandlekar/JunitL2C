import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class Junit {

	ShipmentEntityBO shipmentEntityBO;
	ShipmentEntity shipmentEntity;
	ArrayList<ShipmentEntity> actual;
	ArrayList<ShipmentEntity> expected;
	@Before
	public void createObjectForShipmentEntity() {
		shipmentEntityBO = new ShipmentEntityBO();
		shipmentEntity = new ShipmentEntity();
		actual = new ArrayList<ShipmentEntity>();
		expected = new ArrayList<ShipmentEntity>();
	}

	@Test
	public void testListofShipmentEntity() {

		String str1 ="1,Aditya M,123456,1000,Fairfax";
		String[] strarr1 = str1.split(",");
		String str2 ="2,Ketki M,123456,2000,Fairfax";
		String[] strarr2 = str2.split(",");

		shipmentEntityBO.addShipmentEntityToList(actual, str1);
		shipmentEntityBO.addShipmentEntityToList(actual, str2);

		expected.add(new ShipmentEntity(new Integer(strarr1[0]), strarr1[1], strarr1[2], new Long(strarr1[3]), strarr1[4]));
		expected.add(new ShipmentEntity(new Integer(strarr2[0]), strarr2[1], strarr2[2], new Long(strarr2[3]), strarr2[4]));

		Assert.assertThat(actual,
				containsInAnyOrder(expected));
	}
}
