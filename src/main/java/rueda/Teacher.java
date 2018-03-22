package rueda;

public class Teacher {

	private static final Teacher INSTANCE = new Teacher();

	// El constructor privado no permite que se genere un constructor por defecto.
	// (con mismo modificador de acceso que la definición de la clase)
	private Teacher() {
	}

	public static Teacher getInstance() {
		return INSTANCE;
	}
}