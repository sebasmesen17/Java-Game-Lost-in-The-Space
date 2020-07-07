
package controlador;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Stats;


public class Archivos_Stats {
    
    Stats stats;
      ObjectOutputStream archivoDeSalida;
    ObjectInputStream archivoDeEntrada;
    
   public Archivos_Stats()
        {
            if(!cargarArchivo())
            {
                crearArchivo();
            }
        }


public ArrayList<Stats> returnDatos(){        
ArrayList<Stats> estadistica =new ArrayList<Stats>();
    
try
{
    while(true)
    {
        estadistica.add((Stats)archivoDeEntrada.readObject());
    }
}

catch(EOFException e)
{
    System.out.println("Final del archivo.");
}
catch(Exception e)
{
    System.out.println("Error al leer infomacion del archivo");
}
return estadistica;
}



public void escribirInformacion(Stats estadistica)
{
    try
    {
        archivoDeSalida.writeObject(estadistica);
        System.out.println("Informacion escrita de forma correcta en el archivo");
        
    }
    catch(Exception e)
    {
        System.out.println("Error al escribir en el archivo");
    }
}

public void crearArchivo()
{
    try
    {
        archivoDeSalida=new ObjectOutputStream(new FileOutputStream("Estadisticas.dat"));
        System.out.println("Archivo se ha creado de forma correcta");
        
    }
    catch(Exception e)
    {
        System.out.println("Error al crear el archivo");
    }
}

public boolean cargarArchivo()
{
    boolean cargado= false;
    try
    {
        archivoDeEntrada=new ObjectInputStream(new FileInputStream("Estadisticas.dat" ));
        System.out.println("Archivo cargado de forma correcta");
        cargado=true;
    }
catch(Exception e)
{
System.out.println("Error cargando el archivo");
}
return cargado;
}

}
