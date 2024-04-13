package app008;

public class Operacoes {
	
	static int soma(int a, int b) {
		int s = a + b;
		return(s);
	}
	
	static String contador(int i, int f) {
		String s = "";
		for(int c = i; c <= f; c++) {
			s += c + " ";
		}
		return s;
	}
}
