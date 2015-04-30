package listas;

public class Menu{

	public static void main(String[] args) {
			int b=5;
			int c=10;
			int d=15;
			int e=20;
			int f=25;
		ListaDobleEnlazada a=new ListaDobleEnlazada();
			a.alta(b);
			a.alta(c);
			a.alta(d);
			a.alta(e);
			a.alta(f);
			a.imprimir2();
			a.delete(25); // se borra el ultimo dato
			a.imprimir2();
	}
}

	
	
	

	


