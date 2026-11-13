package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// 1. Creación de instancias con diferentes constructores
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		// 2. Visualización inicial
		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		Cuenta cuenta4 = new Cuenta("00001","B",1000.0);
		Cuenta cuenta5 = new Cuenta("00002");
		cuenta5.setTipo("D");
		cuenta5.setSaldo(10.50);
		Cuenta cuenta6 = new Cuenta("00003");
		cuenta6.setSaldo(589.12);
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();

	}

}
