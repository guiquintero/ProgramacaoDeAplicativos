package lista1_3;

public class IngressoTeste {
	public static void main(String[] args) {
		Ingresso ingressoNormal = new IngressoNormal(25.00, "Normal");
		Ingresso ingressoCamaroteInferior = new CamaroteInferior(25.00, "Vip", 13.00, "Camarote Inferior");
		Ingresso ingressoCamaroteSuperior = new CamaroteSuperior(25.00, "Vip", 20.00, "Camarote Superior");
		
		ingressoNormal.imprimirDadosImgresso();
		ingressoCamaroteSuperior.imprimirDadosImgresso();
		ingressoCamaroteInferior.imprimirDadosImgresso();
	}
}
