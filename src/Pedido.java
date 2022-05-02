
public abstract class Pedido {
	protected String cod_pedido="P" +cont;
	protected int num_articulos;
	protected double precio;
	protected int cod_copia;
	static int cont=0;
	Pedido(int cod_copia, int num_articulos){
		this.cod_copia = cod_copia;
		cont++;
	}
	@Override
	public abstract String toString();
	
	
}
