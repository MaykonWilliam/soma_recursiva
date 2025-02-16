package soma_recursiva;

public class SomaRecursiva {
	
	public static int somar(int numero) {
		// Se o numero for menor ou igual a zero, retorna zero, assim, definido a condição de parada
		if(numero<=0) {
			return 0;
		}
		
		/*
		 * a chamada dos passos foi devinido na relação n-1, pois, dessa forma, irá ser executado até o numero informado
		 * ser maior que zero, caso contrario, entrará na condição de parada.
		 */
		return numero + somar(numero-1);
	}
}
