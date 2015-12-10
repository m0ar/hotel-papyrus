package implementation.impl;

public class Log {
	public static final boolean ENABLED = false;
	
	public static void log(String string) {
		if(ENABLED)
			System.out.println(string);
	}
}
