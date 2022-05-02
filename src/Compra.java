

public class Compra extends Pedido{
	/**
	 * 
	 * @param cod_copia
	 * @param num_articulos
	 * @param precio
	 */
	Compra(int cod_copia, int num_articulos,double precio) {
		super(cod_copia, num_articulos);
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Compra [cod_pedido=" + cod_pedido + ", num_articulos=" + num_articulos + "cod_copia = " + cod_copia + " precio= " + precio + "]";
	}


}