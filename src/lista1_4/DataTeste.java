package lista1_4;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data(4);
		Data data2 = new Data(3, 2013);
		Data data3 = new Feriado("Carnavel");
		Data data4 = new Feriado();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}
}
