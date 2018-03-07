package org.Ejersicios1;
import java.util.Scanner;

public class AppEjersicios1 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		int Menu=0; //guarda la opcion que ingrese el usuario del menu
		int opc=0;//guarda la opcion del usuario si quiere continuar con la opcion o no 
		int Repeat=0; //guarda la opcion del usuario si quiere terminar o repetir el prorama
		int Numero1=0; //Guarda el primer nuero ingresado por el usuario para usar en la funcion
		int Numero2=0; //Guarda el segundo nuero ingresado por el usuario para usar en la funcion
		String Dato=""; //Guarda la infromacion en cadena que ingrese el usuario para usar en la funcion
		
		
		do
		{
			//Imprimiendo el menu
			
			System.out.println("1-Ingresa tu nombre y lo muestra\n"); //Objeto correspondiente Mn
			System.out.println("2-Suma 2 Numeros"); //Objeto corespondien Suma2
			System.out.println("11-Salir");
			Menu=scan.nextInt();
			
			//Fin del menu
			
			//Creando los objetos para cada opcion del menu
			MuestraDatos Mn = new MuestraDatos();    
			
			//final de la creacion de objetos para cada menu
			switch(Menu)
			{
				//INICIO caso 1 Mostrar nombre-----------------------------------------------------------------------------
			 	case 1: 
			 		System.out.println("selecciono la opcion"+Menu+"desea continuar?\n");
			 		System.out.println("1-CONTINUAR\n");
			 		System.out.println("2-REGRESAR");
			 		opc=scan.nextInt();
			 		if(opc==1)
			 		{
			 			System.out.println("\n\n\n\nIngresa tu nombre");
			 			Dato=scan.next();
			 			Mn.Muestra1DatoF(Dato);
			 		}
			 		else
			 		{
			 			break;
			 		}
				 break;
				 //FIN caso 1 Mostrar nombre----------------------------------------------------------------------------
				 
				//INICIO Caso sumar 2 numeros---------------------------------------------------------------------------
			 	case 2:
			 		System.out.println("selecciono la opcion" +Menu+" desea continuar?\n");
			 		System.out.println("1-CONTINUAR\n");
			 		System.out.println("2-REGRESAR");
			 		opc=scan.nextInt();
			 		if(opc==1)
			 		{
			 			System.out.println("\n\n\n\nIngresa un numero\n");
			 			Numero1=scan.nextInt();
			 			System.out.println("Infresa el segundo numero\n");
			 			Numero2=scan.nextInt();
			 			
			 		}
			 		else
			 		{
			 			break;
			 		}
			 		break;
			 	//FIN Caso sumar 2 numeros---------------------------------------------------------------------------
			}
			if(opc==1)
			{
				System.out.println("desea terminar el programa?\n");
				System.out.println("1-SI\n");
				System.out.println("2-NO");
				Repeat=scan.nextInt();
			}
			if(Menu==11)
			{
				Repeat=1;
			}
		} while (Repeat != 1);

		scan.close();

	}

}
