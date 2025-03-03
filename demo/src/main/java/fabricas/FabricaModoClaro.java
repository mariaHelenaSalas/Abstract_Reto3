package fabricas;
import componentes.Boton;
import componentes.BotonClaro;
import componentes.BarraNavegacion;
import componentes.BarraNavegacionClara;


public class FabricaModoClaro implements FabricaUI {
    @Override
    public Boton crearBoton() {
        return new BotonClaro();
    }

    @Override
    public BarraNavegacion crearBarraNavegacion() {
        return new BarraNavegacionClara();
    }

}
