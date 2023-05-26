package prueba;

public class CuentaCorriente {
	
	private String nombre;
	private String apellidos;
	private Integer edad;
	private Integer numeroDeCuenta;
	private Double saldo;
	
	public CuentaCorriente(String nombre, String apellidos, Integer edad, Integer numeroDeCuenta, Double saldo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
	}
	public CuentaCorriente(Integer numeroDeCuenta, Double saldo) {
	
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
	}
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
	
	public void incrementoSaldo(Double saldo) {
		
		 saldo += saldo;
	}
	
	public void retirardeSaldo(Double saldo) {
		
		 saldo -= saldo;
	}
	@Override
	public String toString() {
		return "CuentaCorriente [numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + "]";
	}
	
	

	
}
