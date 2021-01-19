import java.util.List;

public class DateFormatBO {

	public void convertToCorrectDateFormat(List<String> date, List<String> userList)
	{
		String day,month,year;
		for(String d : userList)
		{
			day = d.substring(0,2);
		    month = d.substring(3,5);
		    year = d.substring(6,10);   
		    date.add(day+"-"+month+"-"+year);
		}
	}
	
}
