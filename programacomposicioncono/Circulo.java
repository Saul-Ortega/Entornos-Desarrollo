package programacomposicioncono;

public class Circulo {
	private float x, y;
	private float radio;
	
	/**
	 * Constructor para inicializar el objeto Circulo.
	 * @param cX
	 * @param cY
	 * @param r
	 */
	public Circulo(float cX, float cY, float r) {
		this.x = cX;
		this.y = cY;
		this.radio = r;
	}
	
	/**
	 * Método para obtener el valor de x.
	 * @return x
	 */
	public float getX() { return x; }
	
	/**
	 * Método para asignar un valor a x.
	 * @param x
	 */
	public void setX(float x) { this.x = x; }
	
	/**
	 * Método para obtener el valor de y.
	 * @return y
	 */
	public float getY() { return y; }
	
	/**
	 * Método para asignar un valor a y.
	 * @param y
	 */
	public void setY(float y) { this.y = y; }
	
	/**
	 * Método para obtener el valor del radio.
	 * @return radio
	 */
	public float getRadio() { return radio; }
	
	/**
	 * Método para asignar un valor al radio.
	 * @param radio
	 */
	public void setRadio(float radio) { this.radio = radio; }
	
	/**
	 * Método que obtiene el área de un círculo.
	 * @return area
	 */
	public float area() { return (float) Math.PI*radio*radio; }
	
	/**
	 * Método para imprimir todas las propiedades del objeto así como el área.
	 */
	public void imprimir() {
		System.out.println(" x=" + x);
		System.out.println(" y=" + y);
		System.out.println(" r=" + radio);
		System.out.println(" A=" + area());
	}
}
