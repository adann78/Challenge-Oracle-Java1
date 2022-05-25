import javax.swing.JOptionPane;
public class conversorMoneda1 {
	public static void main( String args[] )
	 {
		byte opcion=0;
		do {
			opcion=Byte.parseByte(JOptionPane.showInputDialog(
					"MENU PRINCIPAL\n"
					+"1.PESOS A DOLARES\n"
					+"2.PESOS A EUROS\n"
					+"3.PESOS A YUANES\n"
					+"4.PESOS A RUBLOS\n"
					+"5.SALIR"));
			switch(opcion) {
			case 1:
				double cantidad =Double.parseDouble( JOptionPane.showInputDialog( "Escriba la cantidad a convertir:" ));
				double total =cantidad*19.85;
				;
				JOptionPane.showMessageDialog( null, "La cantidad en dolares es:"+total );
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"convirtiendo pesos a euros");
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"convirtiendo pesos a yuanes");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"convirtiendo pesos a rublos");
				break;
			case 5:opcion=5;
				break;
				default:JOptionPane.showMessageDialog(null,"opcion invalida!!");
					break;
			}
			
	 // pide al usuario que escriba su nombre
	 //String nombre = JOptionPane.showInputDialog( "Moneda a convertir:" );

		}while (opcion!=5);
		System.exit(0);

 
//String mensaje =String.format( "Bienvenido, %s, a la programacion en Java!",nombre);
//JOptionPane.showMessageDialog( null, mensaje );
}
}