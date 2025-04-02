package programacomposicioncono;

public class Cono {
	private Circulo base;
	private float altura;
	private String color;

	/**
	 * Método para inicializar el objeto Cono.
	 * @param cX
	 * @param cY
	 * @param r
	 * @param h
	 * @param color
	 */
	public Cono (float cX, float cY, float r, float h, String color) {
		this.base = new Circulo(cX, cY, r);
		this.altura = h;
		this.color = color;
	}
	
	/**
	 * Método para obtener el valor de la base.
	 * @return base
	 */
	public Circulo getBase() {
		return base;
	}
	
	/**
	 * Método para asignar un valor a la base.
	 * @param base
	 */
	public void setBase(Circulo base) {
		this.base = base;
	}
	
	/**
	 * Método para obtener el valor de la altura.
	 * @return altura
	 */
	public float getAltura() {
		return altura;
	}
	
	/**
	 * Método para obtener el valor de la altura.
	 * @param altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	/**
	 * Método para obtener el valor del color.
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Método para asignar un valor al color.
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Método para imprimir las propiedades del objeto Cono.
	 */
	public void imprimir() {
		base.imprimir();
		System.out.println(" h=" + altura + " c=" + color);
	}
}
