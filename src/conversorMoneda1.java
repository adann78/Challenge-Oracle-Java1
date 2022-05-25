import javax.swing.JOptionPane;
public class conversorMoneda1 {
	public static void main( String args[] )
	 {
	 // pide al usuario que escriba su nombre
	 String nombre = JOptionPane.showInputDialog( "Moneda a convertir:" );



 
String mensaje =String.format( "Bienvenido, %s, a la programacion en Java!",nombre);
JOptionPane.showMessageDialog( null, mensaje );
}
}