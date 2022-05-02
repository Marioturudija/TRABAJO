import java.util.ArrayList;
public class Catalogo {
	//creamos un array de objetos donde guardaremos los videojuegos
	ArrayList  <Videojuego> lista = new ArrayList();
	public Catalogo() {
		Rellenar();
	}
	/**
	 * Este metodo nos permitira rellenar el array de videojuegos
	 */
	void Rellenar() {
		Videojuego vid = new Videojuego("Fifa 22","Deportes",1234,23);
		Videojuego vid1 = new Videojuego("Tetris","Deportes",1235,25);
		Videojuego vid2 = new Videojuego("Isra the game","Deportes",1236,28);
		Videojuego vid3 = new Videojuego("Fran the game","Deportes",1237,29);
		Videojuego vid4 = new Videojuego("Moha the game","Deportes",1238,21);
		Videojuego vid5 = new Videojuego("Mario the game","Deportes",1239,20);
		lista.add(vid);
		lista.add(vid1);
		lista.add(vid2);
		lista.add(vid3);
		lista.add(vid4);
		lista.add(vid5);
	}
	//uaremos un metodo para printear el catalogo
	void MostrarCatalogo(){
		for (Videojuego videojuego : lista) {
			System.out.println(videojuego);
		}
		System.out.println("");
	}
	/**
	 * 
	 * @param la consola pedira que introduzcas el codigo del juego
	 * @return el precio del videojuego
	 */
	double getPrecio(int cod) {
		double aux=-4;
		for (Videojuego vi : lista) {
			if(vi.codigo ==cod) {
				aux = vi.precio;
			}
		}
		return aux;
	}
}
