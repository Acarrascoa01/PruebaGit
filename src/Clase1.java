
public class Clase1 {
	public static void main(String[] args) {
		int[] numeros = new int[1000];
		for (int i=0;i<numeros.length;i++)
			  numeros[i] = (int) (Math.random()*50)+1;
		int[] resultado = numeros;
		System.out.println(resultado);
		return;
	}
}
