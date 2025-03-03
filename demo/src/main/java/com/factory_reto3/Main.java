package com.factory_reto3;

import java.util.Scanner;

import componentes.BarraNavegacion;
import componentes.Boton;
import fabricas.FabricaModoClaro;
import fabricas.FabricaModoOscuro;
import fabricas.FabricaUI;

public class Main {
    public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);

      System.out.println("Ingrese el modo de la interfaz de usuario (claro/oscuro): ");
      String modo = teclado.nextLine();

      FabricaUI fabrica = null;

      if (modo.equals("claro")) {
        fabrica = new FabricaModoClaro();

      } else if (modo.equals("oscuro")) {
        fabrica = new FabricaModoOscuro();
      } else {
        System.out.println("Modo no soportado");
        System.exit(0);
      }
      
      Boton boton = fabrica.crearBoton();
      BarraNavegacion barraNavegacion = fabrica.crearBarraNavegacion();
      boton.render();
      barraNavegacion.render(); 


    }


}