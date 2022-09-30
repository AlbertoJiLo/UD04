package UD04;

public class ex5 {
	public static void main (String[] args) {
		int A=2;
		int B=5;
		int C=7;
		int D=11;
		
		System.out.println("A = "+A+" B= " +B+" C= "+C+" D = "+D);
		B=C;
		System.out.println("B toma el valor de C");
		System.out.println("A = "+A+" B= " +B+" C= "+C+" D = "+D);
		C=A;
		System.out.println("C toma el valor de A");
		System.out.println("A = "+A+" B= " +B+" C= "+C+" D = "+D);
		A=D;
		System.out.println("A toma el valor de D");
		System.out.println("A = "+A+" B= " +B+" C= "+C+" D = "+D);
		System.out.println("D toma el valor de B");
		D=B;
		System.out.println("A = "+A+" B= " +B+" C= "+C+" D = "+D);
		
		
	}
		
}
