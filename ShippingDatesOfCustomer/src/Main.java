import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class Main {    
    public static void main(String args[]) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    DateFormatBO dateFormatBO = new DateFormatBO();
    int noOfDates = 0,i;
    System.out.println("Enter the number of shipping dates");
    noOfDates=Integer.parseInt(br.readLine());
    List<String> d = new ArrayList<String>();;
    List<String> date = new ArrayList<String>();
    System.out.println("Enter the shipping dates");
    for(i=0;i<noOfDates;i++){  
     d.add(br.readLine());
    }
    dateFormatBO.convertToCorrectDateFormat(date, d);
    System.out.println("Corrected shipping dates");
    for(String s : date)
    	System.out.println(s);
    }
}