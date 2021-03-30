package pac1;

public class Principalcla {

	public static void main(String[] args) {
//		System.out.println(numeroAntecede(9));
		System.out.println(mayorMenor(20, 20));

	}
	// Metodo que retorna numero anterior
	private static int numeroAntecede(int param) {
		return --param;
	}
	private static String mayorMenor(int param1, int param2) {
		String result = "";
		
		if(param1 > param2) {
			result = "El mayor es:" + param1;
		}else if (param2 > param1) {
			result = "El mayor es: " + param2;
		}else {
			result = "Ambos numeros son iguales";
		}
		return result;
	}

}
