

package prueba;

public class CuentaAhorros {
	private String nombre;
	private String apellidos;
	private Integer edad;
	private Integer numeroDeCuenta;
	private Double saldo;
	private Double interes;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	public void setNumeroDeCuenta(Integer numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getInteres() {
		return interes;
	}
	public CuentaAhorros(Integer numeroDeCuenta, Double saldo, Double interes) {
		super();
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
		this.interes = interes;
	}
	
	public double incrementoInteres() {
      double rata = saldo * interes;		 
	  return saldo += rata;
		 
	}
	
	
}
