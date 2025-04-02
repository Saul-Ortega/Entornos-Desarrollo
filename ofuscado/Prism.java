package ofuscado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Clase prisma que calcula el área de un prisma triangular.
 * @author Saúl Alberto Ortega Rodríguez
 */
public class Prism implements Comparable<Prism>{
	public static void main(String args[]) {
		Random r = new Random();
		
		Prism prism1 = new Prism(getRandomNumber(r), getRandomNumber(r));
		Prism prism2 = new Prism(getRandomNumber(r), getRandomNumber(r));
		Prism prism3 = new Prism(getRandomNumber(r), getRandomNumber(r));
		
		ArrayList<Prism> prism_list = new ArrayList<Prism>();
		
		prism_list.add(prism1);
		prism_list.add(prism2);
		prism_list.add(prism3);
		
		printMenuArrayList(prism_list);
		
		Collections.sort(prism_list);
		printSortedArrayList(prism_list);
	}
	//ATRIBUTOS O PROPIEDADES
	private int triangleBase;
	private int prismHeight;
	
	//CONSTRUCTORES
	public Prism() {
		
	}
	
	public Prism(int triangleBase, int prismHeight) {
		this.triangleBase = triangleBase;
		this.prismHeight = prismHeight;
	}

	//GETTERS
	public int getTriangleBase() {
		return triangleBase;
	}

	public int getPrismHeight() {
		return prismHeight;
	}

	//SETTERS
	public void setTriangleBase(int triangleBase) {
		this.triangleBase = triangleBase;
	}

	public void setPrismHeight(int prismHeight) {
		this.prismHeight = prismHeight;
	}
	
	
	
	@Override
	public String toString() {
		return "Prism [triangleBase=" + triangleBase + ", prismHeight=" + prismHeight + "]";
	}

	//MÉTODO COMPARE TO
	@Override
	public int compareTo(Prism o) {
		return (int) o.totalArea() - (int) this.totalArea();
	}

	//MÉTODOS PÚBLICOS
	/**
	 * Método que retorna un número aleatorio entre 1 y 10.
	 * @param r
	 * @return Número aleatorio comprendido entre 1 y 10.
	 */
	public static int getRandomNumber(Random r) {
		return r.nextInt(10) + 1;
	}
	/**
	 * Método que calcula la altura de un triángulo.
	 * @return La altura del triángulo.
	 */
	public float triangleHeight() {
		float sqrt = (float) Math.sqrt(3);
		float result_height = (sqrt / 2) * this.getTriangleBase();
		return result_height;
		
	}
	
	/**
	 * Método que calcula la base del área del triánglulo.
	 * @return La base del área de un triángulo.
	 */
	public float baseArea() {
		float result_base_area = (this.getTriangleBase() * this.triangleHeight()) / 2;
		return result_base_area;
	}
	
	/**
	 * Método que calcula el perímetro de un triángulo.
	 * @return El perímetro de un triángulo.
	 */
	public float perimeter() {
		float result_perimeter = 3 * this.getTriangleBase();
		return result_perimeter;
	}
	
	/**
	 * Método que calcula el área lateral de un prisma.
	 * @return El área lateral de un prisma.
	 */
	public float lateralArea() {
		float result_lateral_area = this.perimeter() * this.getPrismHeight();
		return result_lateral_area;
	}
	
	/**
	 * Método que calcula el área total de un prisma.
	 * @return El área total de un prisma.
	 */
	public float totalArea() {
		float result_total_area = (2 * this.baseArea()) + this.lateralArea();
		return result_total_area;
	}
	
	/**
	 * Método que imprime un menú y luego los objetos de un array list.
	 * @param prism_list
	 */
	public static void printMenuArrayList(ArrayList<Prism> prism_list) {
		StringBuffer sb = new StringBuffer("");
		
		sb.append("============================\n"
				+ "CREACIÓN DE OBJETOS PRISMA\n"
				+ "============================\n\n");
		
		for (int i = 0; i < prism_list.size(); i++) {
			sb.append("Creado el objeto Prisma" + (i + 1) + " con:\n");
			sb.append(" - Base: " + prism_list.get(i).getTriangleBase() + "\n");
			sb.append(" - Altura: " + prism_list.get(i).getPrismHeight() + "\n");
			sb.append(" - Area total: " + prism_list.get(i).totalArea() + "\n");
		}
		
		sb.append("\n\n============================\n\n");
		System.out.println(sb);
	}
	
	/**
	 * Método que imprime los elementos de un array list ordenado.
	 * @param prism_list
	 */
	public static void printSortedArrayList(ArrayList<Prism> prism_list) {
		StringBuffer sb = new StringBuffer("");
		
		sb.append("Ordenados de mayor a menor:\n\n");
		
		for (int i = 0; i < prism_list.size(); i++) {
			sb.append(" - Prisma: area total " + prism_list.get(i).totalArea() + "\n");
		}
		
		System.out.println(sb);
	}
}
