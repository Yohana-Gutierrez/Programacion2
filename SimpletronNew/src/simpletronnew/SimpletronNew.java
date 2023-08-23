
package simpletronnew;
import java.util.Scanner;
/**
 *
 * @author Anny Yohana
 */
public class SimpletronNew {
	private int acumulador;	// registro para contener la instruccion actual que se esta ejecutando 
	private int [] memoria;	// contiene maximo 100 instrucciones 
	private int instruccionRegistro;	// contenedor temporal para la siguiente instruccion  
	private int ContadorInstrucciones;	// variable con la ubicacion 
	private int CodigoOperacion;	// Operacion en ejecucion 
	private int operando;	// Los dos digitos mas a la derecha de la instruccion que se esta ejecutando actualmente 
	
	public SimpletronNew ( ) 
	{
		MensajeEntrada ();
		iniciarVariables ();
		// runSimulator ();
	}	// end constructor for class Sipletron

	// Metodo para desplegar el mensaje Bienvenida
	public void MensajeEntrada ( ) 
	{
		System.out.printf ("\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s %s\n%s %s\n", 
			"***             BIENVENIDO A SIMPLETRON! ***",
			"***Por favor, introduzca en su programa una instruccion  ***",
			"***(o palabra de datos) a la vez. Yo le mostrare   ***",
			"***Entonces usted escribira la palabra para esa ubicacion.  ***",
			"*** el numero de ubicacion y un signo de interrogacion (?)  ***",
			"*** Entonces usted escribira la palabra para esa ubicacion.***",
			"*** Teclee -99999 para dejar de introducir su programa.  ***",
			" Loc", " Inst", "****", "*****");
	}	// Fin metodo del mensaje

	// Ejecutar el simulador
	public void CorrerSimulator () 
	{
		int InstruccionEnviada = 0;	// mantiene la instruccion dada  por el usuario
		int memoriaPuntero = 0;	// ayuda a llenar el contenido de la memoria correctamente 

		Scanner input = new Scanner ( System.in );

		do
		{
			System.out.printf ("%d %s  ", memoriaPuntero, "?" );
			InstruccionEnviada = input.nextInt ();
			if ( InstruccionEnviada != -99999 ) 
				memoria [ memoriaPuntero ] = InstruccionEnviada;
			memoriaPuntero++;	// Ir al siguiente espacio de memoria
			
		} while ( InstruccionEnviada != -99999 );	// fin do-while
		
	        System.out.printf ("\n%s%s", "*** Carga de programa completada ***\n", 
				"*** Comienza la ejecucion del programa  ***\n");	
		
		// recorrer las instrucciones cargando y ejecutando una a la vez
		for ( int code : memoria ) 
		{
			// System.out.println ("El valor de la ubicacion de memoria es "+ code.getData () );
			// int sentinel = code.getData ();
			if ( code != 0 )	// Omitir instrucciones Nulas
			{
				load ();
				execute ( operando, CodigoOperacion );
			}
		}

	}	// Fin del metodo ejecutar el simulador
	
	public void iniciarVariables ( )
	{
		memoria = new int [100];	// initialise the array to hold the program's data 
		ContadorInstrucciones = 0;	// make the instruction pointer referrence the first data item

	}	// Fin del metodo iniciar variables 

	// Metodo para cargar los contenidos a los que hace referencia el puntero de instruccion al acumulador 
	public void load ( ) 
	{
		
		// Cargar la primera instruccion al registro y comienza la ejecucion 
		CodigoOperacion = memoria [ ContadorInstrucciones ] / 100;
		operando = memoria [ ContadorInstrucciones ] % 100;

	}	// Fin metodo de carga	

	// Metodo a ejecutarse inmediatamente el programa encuentre el valor -99999
	public void execute (int operands, int operation ) 
	{
		// determinar cual operacion cargar primero
		switch ( operation ) 
		{
			case 10: // Leer una palabra del teclado en una ubicacion especifica en la memoria
				Scanner input = new Scanner ( System.in );
				System.out.print ( "Por favor ingresa un numero entero (positivo o negativo): " );
				memoria [ operands ] = input.nextInt ();	// colocar el resultado en la memoria especifica
				break;
			case 11:	// escribe una ubicacion especifica en memoria en la pantalla
				System.out.println ("The result of the operation is " + memoria [ operands] );
				break;
			case 20: // Carga una palabra desde una ubicacion especifica en el acumulador
				acumulador = memoria [ operands ];
				break;
			case 21: 	// Almacena una palabra del acumulador una ubicacion especifica en la memoria
				memoria [ operands ] = acumulador;
				break;
			case 30: // Agrega una palabra de una ubicacion especifica en la memoria a la palabra 
				// en el acumulador ( deja el resultado en el acumulador) 
				acumulador += memoria [ operands ];
				break;
			case 31: // Resta una palabra de una ubicacion especifica en la memoria a la
				// palabra en el acumulador ( deja el resultado en el acumulador) 
				acumulador -= memoria [ operands ];
				break;
			case 32:	// Divide una palabra de una ubicacion especifica en la memoria dentro de la 
			       // palabra en el acumulador ( deja el resultado en el acumulador) 
				acumulador /=  memoria [ operands ];
				break;
			case 33: // Multiplica una palabra de una ubicacion especifica en la memoria a la
			       // palabra en el acumulador ( deja el resultado en el acumulador) 
				acumulador *= memoria [ operands ];
				break;
			case 40:	// Ramifica una ubicacion especifica en la memoria
				ContadorInstrucciones = operands;
				break;
			case 41:	// Ramifica una ubicacion especifica en la memoria si el acumulador es negativo
				if ( acumulador < 0 )
					ContadorInstrucciones = operands;
				break;
			case 42:	//  Ramifica una ubicacion especifica en la memoria si el acumulador es cero
				if ( acumulador == 0 )
					ContadorInstrucciones = operands;
				break;
			case 43: 	// Alto.El programa se ha completado
				dumpTheCore ();	// do a "core dump"
				System.out.printf ("\n%s\n", "El programa ha Finalizado...");
				System.exit ( 0 );
				break;

		}	// fin switch 

		ContadorInstrucciones++;	
	}	

	// metodo para mostrar nombres y registros contenidos en el registro de memoria
	public void dumpTheCore ( )
	{
		System.out.printf ("\n%30s\n%30s\t%s%4d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n\n%30s\n", "REGISTROS:", 
				"accumulator", "+", acumulador, "Contador Instrucciones ", ContadorInstrucciones, "instruccion registro",
			       	ContadorInstrucciones, "Codigo Operacion", CodigoOperacion, "operando", operando, "MEMORIA:" );

		// Muestra la numeracion de las celdas de memoria en orden horizontsl
		for ( int i = 0; i < 10; i++ )
		{
			System.out.printf ( "%6d", i);
		}

		System.out.println ();
		int counter = 0;	// contador para asegurarnos que hacemos todo el ciclo

		// Mostrar las seldas de memoria en orden horizontal y vertical
		for (int i = 0; i < 10; i++ ) 
		{
			if ( counter %10 == 0 )
				System.out.printf ("%2d ", counter);
			for (int j = 0; j < 10; j++) 
			{	
				// Mejorar la visualizacion
				if ( memoria [ counter ] == 0 )
					System.out.printf ( "%s%s", "+", "0000 ");
				else 
					System.out.printf ("%s%4d ", "+", memoria [counter]);
				counter++;

			}	// Fin 
		       
		System.out.println ();	

		}	// fin 
	}	// Fin metodo 

}	// fin class Simpletron

