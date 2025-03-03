package fabricas;
import componentes.Boton;
import componentes.BotonOscuro;
import componentes.BarraNavegacion;
import componentes.BarraNavegacionClara; 



public class FabricaModoOscuro implements FabricaUI {
    @Override
    public Boton crearBoton() {
        return new BotonOscuro();
    }

    @Override
    public BarraNavegacion crearBarraNavegacion() {
        return new BarraNavegacionClara();
    }

}
