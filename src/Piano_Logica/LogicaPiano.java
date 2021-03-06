/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piano_Logica;
import Piano_Datos.Juego;
import Piano_Datos.Melodia;
import Piano_Datos.Nota;
import Piano_Visualizacion.*;       
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author El PcGamer
 */
public class LogicaPiano {
    
    private Juego juego;

    public LogicaPiano(Juego juego) throws IOException {
        this.juego = juego;
//        ArrayList<Melodia> m = this.cargar("c.txt");
//        System.out.println(m.get(0).getNombre());
//        this.juego.setIncluidas(m);
    }
     public static void main(String[] args) throws IOException{
         Juego j = new Juego(new ArrayList());
        LogicaPiano logica = new LogicaPiano(j);
        VentanaVisualizacion ventana = new VentanaVisualizacion(j);
        j.setVentana(ventana);
        ventana.add(ventana.getPanel_actual());
     }
     public ArrayList<Melodia> cargar(String ruta) throws IOException{
      
       File lectura = new File(ruta);
       Scanner flujoEntrada = null;
       ArrayList<Melodia> melodias = new ArrayList();
       if(lectura.exists()){
           try {
               flujoEntrada = new Scanner(lectura);
               flujoEntrada.useDelimiter(",");
               String tipo = null;
               while(flujoEntrada.hasNext()){
                   tipo = flujoEntrada.next().trim();
                   Melodia cancion = new Melodia();
                   boolean a = (tipo.equals("DO"))||(tipo.equals("RE"));
                   boolean b = (tipo.equals("MI"))||(tipo.equals("FA"));
                   boolean c = (tipo.equals("SOL"))||(tipo.equals("LA"));
                   boolean d = (tipo.equals("SI"));
                   boolean nota = (a||b)||(c||d);
                   while (nota){
                       switch(tipo){
                           case "DO":
                               cancion.agregarNota(this.juego.getDo_());
                               break;
                           case "RE":
                               cancion.agregarNota(this.juego.getRe_());
                               break;
                           case "MI":
                               cancion.agregarNota(this.juego.getMi_());
                               break;
                           case "FA":
                               cancion.agregarNota(this.juego.getFa_());
                               break;
                           case "SOL":
                               cancion.agregarNota(this.juego.getSol_());
                               break;
                           case "LA":
                               cancion.agregarNota(this.juego.getLa_());
                               break;
                           case "SI":
                               cancion.agregarNota(this.juego.getSi_());
                               break;
                       }
                   }
                   int numero = flujoEntrada.nextInt();
                   String nombre = flujoEntrada.next();
                   cancion.setNumero(numero);
                   cancion.setNombre(nombre);
                   melodias.add(cancion);
               }
           } catch (FileNotFoundException ex) {
               System.out.println("Archivo de datos no Encontrado");
           }
          
        
       }
       return melodias;
    }
}
