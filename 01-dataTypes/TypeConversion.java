public class TypeConversion {

	public static void main(String[] args) {

		// Automatic Type Casting

		byte b = 2;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

		// Explicit Type Casting

		double my_double = 233.33;

		// int my_int = my_double; will give an errorhence needed to be type casted

		int my_int = (int)my_double;	// floor value will be output
		System.out.println(my_int);

		float my_float = 258.99f;
		byte my_byte = (byte)my_float; // 258 % 256 will be output and decimal value will be lost
		System.out.println(my_byte);

	}

}
