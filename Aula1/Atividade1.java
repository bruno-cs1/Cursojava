package Aula1;

public class Atividade1 {

	public static void main(String[] args) {
	
	String product1 = "Computer", product2 = "Office desk";
	int age = 30, code = 5290;
	char gender = 'F';
	double price1 = 2100.0, price2 = 650.50, measure = 53.234567;

	System.out.println("products:");
	System.out.printf( product1 + ", which price is $"+ "%.2f%n", + price1 );
	System.out.printf( product2 +", which price is $" + "%.2f%n", + price2  );
	
	System.out.printf("%nRecord: " + age + " years old, code " + code + " and gender: " + gender + "%n");
	
	System.out.printf("Measue with eight decimal places: " + "%.8f%n", + measure);
	System.out.printf("Rouded(three decimal places): " + "%.3f%n", + measure);}

}
