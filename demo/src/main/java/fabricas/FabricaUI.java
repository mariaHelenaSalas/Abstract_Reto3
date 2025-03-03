package fabricas;
import componentes.Boton;
import componentes.BarraNavegacion;

public interface FabricaUI {
    Boton crearBoton();
    BarraNavegacion crearBarraNavegacion(); 

}
