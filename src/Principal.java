import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = Integer.MIN_VALUE;
		Catalogo obj = new Catalogo();
		ListaPedidos lis = new ListaPedidos();
		//Le pedimos al usuario que elija una opción del menu para luego
		while(opcion!=0) {
			System.out.println("Introduce una opcion \n"
					+ "1.Mostrar Catalogo \n"
					+ "2.Hacer un pedido \n"
					+ "3.Arreglar una consola \n"
					+ " \n"
					+ "Introduce 0 para salir.");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Has elegido mostrar catalogo \n");
				obj.MostrarCatalogo();
				 /**
			     * Método que devuelve el número de videojuegos que se encuentran en el catalogo
			     * @return Titulo,categoria,codigo,precio de cada videojuego del catalogo
			     */
				break;
			case 2:
				System.out.println("introduce que tipo de pedido \n"
						+ "1.Compra\n"
						+ "2.Alquiler\n");
				int ped = sc.nextInt();
				//Aqui le pediremos al usuario que introduzca el codigo del juego que quiere comprar
				if(ped ==1) {
					System.out.println("introduce el codigo del videojuego");
					int codi = sc.nextInt();
					double auxpr = obj.getPrecio(codi); 
					if(auxpr == -4) {
						System.out.println("Este codigo no existe \n");
						break;
					}
					System.out.println("Introduce el numero de articulos");
					int codii = sc.nextInt();
					Compra co = new Compra(codi,codii,auxpr);
					lis.listapedidos.add(co);
				}
				//El usuario elige alquilar (METODO EN PROCESO)
				else if(ped ==2) {
					System.out.println("introduce el codigo del videojuego");
					int codi = sc.nextInt();
					double auxpr = obj.getPrecio(codi); 
					if(auxpr == -4) {
						System.out.println("Este codigo no existe \n");
						break;
					}
					System.out.println("Introduce el numero de articulos");
					int codii = sc.nextInt();
					System.out.println("introduce el numero de dias");
					int dias = sc.nextInt();
					//Alquiler al = new Alquiler(codi,codii,dias,auxpr);
					//lis.listapedidos.add(al);

				}
				break;
			case 3:
				/**
				 * Esta opción te llevará a la clase consola rota 
				 */
				//Arreglar arr = new Arreglar();
				System.out.println("Has elegido arreglar consola \n");
				break;
			case 0:
				System.out.println("Muchas gracias por su estancia, esperamos que el servicio haya cumplido sus necesidades.\n"
						+ "  \n"
						+ "Esperamos verte pronto!!");
				break;
			default:
				System.out.println("numero incorrecto, vuelva a introducir otro numero \n");;
			}
		}
	}
}