import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s[]=br.readLine().split(" ");
		float price=Float.parseFloat(s[0]);
		float discount=Float.parseFloat(s[1]);
		float total=price;
		while(price>0)
		{
		    float temp_amount=price*(discount/100);
		    price=price-temp_amount;
		    total=total+price;
		}
		System.out.println((int)total);
		
	}
}
