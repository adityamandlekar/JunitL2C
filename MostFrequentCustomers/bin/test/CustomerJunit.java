import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.JMock1Matchers.equalTo;
import static org.hamcrest.Matchers.*;

public class CustomerJunit {

	CustomerBO customerBO;
	List<Commodity> cList;
	Customer c1,c2,c3,c4,c5;
	CommodityIdentification ci1,ci2,ci3,ci4,ci5;
	Commodity co1,co2,co3,co4,co5;
	String str1,str2,str3,str4,str5;
	String[] arr1,arr2,arr3,arr4,arr5;
	List<Customer> actual,expected;

	/*aditya M,adityamandlekar@gmail.com,Car,Toyota Corolla,LE,100.0,20.0
	Ketki M,kvdongre@gmail.com,Car,Toyota Corolla,LE,100.0,20.0
	Nihal M,adityamandlekar@gmail.com,Car,Toyota Corolla,LE,100.0,20.0
	Mahi M,adityamandlekar@gmail.com,Car,Toyota Corolla,LE,100.0,20.0
	adi M,aditya.mandlekar@cognizant.com,Car,Toyota Corolla,LE,100.0,20.0*/

	@Before
	public void init() {
		customerBO=new CustomerBO();
		cList = new ArrayList<Commodity>();
		expected= new ArrayList<>();

		str1="aditya M,adityamandlekar@gmail.com,Car,Toyota Corolla,LE,100.0,20.0";
		str2="Ketki M,kvdongre@gmail.com,Car,Toyota Corolla,LE,100.0,20.0";
		str3="Nihal M,adityamandlekar@gmail.com,Car,Toyota Corolla,LE,100.0,20.0";
		str4= "Mahi M,adityamandlekar@gmail.com,Car,Toyota Corolla,LE,100.0,20.0";
		str5="adi M,aditya.mandlekar@cognizant.com,Car,Toyota Corolla,LE,100.0,20.0";

		arr1 = str1.split(",");
		arr2 = str2.split(",");
		arr3 = str3.split(",");
		arr4 = str4.split(",");
		arr5 = str5.split(",");

		c1 = new Customer(arr1[0], arr1[1]);
		ci1 = new CommodityIdentification(arr1[2], arr1[3], arr1[4], c1);
		co1 = new Commodity(Double.parseDouble(arr1[5]), Double.parseDouble(arr1[6]), ci1);
		cList.add(co1);


		c2 = new Customer(arr2[0], arr2[1]);
		ci2 = new CommodityIdentification(arr2[2], arr2[3], arr2[4], c2);
		co2 = new Commodity(Double.parseDouble(arr2[5]), Double.parseDouble(arr2[6]), ci2);
		cList.add(co2);

		c3 = new Customer(arr3[0], arr3[1]);
		ci3 = new CommodityIdentification(arr3[2], arr3[3], arr3[4], c3);
		co3 = new Commodity(Double.parseDouble(arr3[5]), Double.parseDouble(arr3[6]), ci3);
		cList.add(co3);

		c4 = new Customer(arr4[0], arr4[1]);
		ci4 = new CommodityIdentification(arr4[2], arr4[3], arr4[4], c4);
		co4 = new Commodity(Double.parseDouble(arr4[5]), Double.parseDouble(arr4[6]), ci4);
		cList.add(co4);

		c5 = new Customer(arr5[0], arr5[1]);
		ci5 = new CommodityIdentification(arr5[2], arr5[3], arr5[4], c5);
		co5 = new Commodity(Double.parseDouble(arr5[5]), Double.parseDouble(arr5[6]), ci5);
		cList.add(co5);

		expected.add(0,c4);
	}

	@Test
	public void testFrequentCustomers() {
		actual = customerBO.findFrequentCustomers(cList);


		/*.assertThat(actual,
				containsInAnyOrder(expected));*/
		Assert.assertThat(actual, hasItem(hasProperty("email", is("adityamandlekar@gmail.com"))));

	}
	
	@After
	public void destroy() {
		cList=null;
		c1=c2=c3=c4=c5=null;
		ci1=ci2=ci3=ci4=ci5=null;
		co1=co2=co3=co4=co5=null;
		str1=str2=str3=str4=str5=null;
		arr1=arr2=arr3=arr4=arr5=null;
		actual=expected=null;
		customerBO=null;
	}

}
