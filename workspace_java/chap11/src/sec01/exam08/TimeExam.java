package sec01.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {
		
		long before = System.currentTimeMillis();
		
		for(int i = 0; i<100000000; i++) {
			
		}
		long after = System.currentTimeMillis();
		System.out.println(after);
		long tt = after-before;
		System.out.println(tt);
		System.out.println(Long.MAX_VALUE);
		
		Date date = new Date();
		System.out.println(date);
		
		String format = "yyyy³â MM¿ù ddÀÏ HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String srtDate = sdf.format(date);
		System.out.println(srtDate);
		
		
	}

}
