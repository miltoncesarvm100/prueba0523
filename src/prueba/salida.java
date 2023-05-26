package prueba;

public class salida {
	
	public static String mensaje = "mensaje de salida";
	
	public static String primeros(String d,int m) {
		
		return d.substring(0,m);
	}
	
	public static String invertir(String d) {
		char [] inv = new char[d.length() ];
		int cont = 0;
		for(int i = d.length(); i >= 1; i--) {
			inv[cont] = d.charAt(i-1);
			cont++;
		}
		return String.copyValueOf(inv);
	}
	
	public static String ofuscar(String d,int m) {
		String corte1 = d.substring(m);
		String sale = "";
		String car = "*";
		for(int i = 0; i < m; i++) {
		  sale += car ;
		}
        return sale + corte1.substring(0, corte1.length() - m) + sale;
	}
	
	public static String ultimos(String d,int m) {
		int tamaño = d.length();
		return mensaje.substring(Math.max(0, tamaño - m));
	}
	
	public static Integer contador(String d) {
		int tam = d.length();
		int contador = 0;	
		for(int a = 0; a < tam; a++) {
			if(d.charAt(tam - 1) == d.charAt(a)) {		
				contador ++;
			}
		}
		return contador;
	}
	
	public static void main(String[] args) {


		System.out.println(mensaje.toUpperCase() + ": Mayusculas");
		System.out.println(mensaje.toLowerCase()+ ": Minusculas");
		System.out.println(salida.ultimos(mensaje,2) + " : Dos ultmas letras");
		System.out.println(salida.primeros(mensaje,2) + " : Dos primeras letras");
		System.out.println(salida.contador(mensaje) + ": Cantidad de concurrencias en el string");
		System.out.println(salida.ofuscar(mensaje, 2) + " : Remplazo de caracteres por asteriscos");
		System.out.println(salida.invertir(mensaje) + " : String se invierte");
	
		
		CuentaAhorros cuenta = new CuentaAhorros(124, 25000.0, 0.152);
		System.out.println(cuenta.incrementoInteres());
		
		CuentaCorriente ceuntaC = new CuentaCorriente("marco", "marin", 38, 500, 15000.0);
		System.out.println(ceuntaC.toString());

		
	}

}
