package stream.reader;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BufferedReader {
	public static void main1(String[] args) {
	try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
		char i;
		while ((i = in.read()) != "quit") {
		System.out.print(char(i));
		)
		
	}catch (IOException e) {
		System.out.print(e);
		}
	
	}
	
	public static void main(String[] args) {
		StringTokenizer st = new SringTokenizer(",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.countTokens());
		}
	}
	
	

}
