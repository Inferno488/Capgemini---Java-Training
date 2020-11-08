package lab3;
import java.util.*;
import java.time.*;
public class ZoneID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter timezone");
		String str = sc.next();
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(str));
		Date currentDate = calendar.getTime();
		System.out.println(currentDate);
	}

}
