

public class Videojuego {
	//Definimos las variables
	String titulo;
	String categoria;
	int codigo;
	double precio;

	/**
	 * Constructor con 4 parametros
	 * @param titulo
	 * @param categoria
	 * @param codigo
	 * @param precio
	 */
	public Videojuego(String titulo, String categoria, int codigo, double precio) {
		super();
		this.titulo = titulo;
		this.categoria = categoria;
		this.codigo = codigo;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Videojuego [titulo = " + titulo + ", categoria = " + categoria + ", codigo = " + codigo + ", precio = " + precio
				+ "]";
	}

}