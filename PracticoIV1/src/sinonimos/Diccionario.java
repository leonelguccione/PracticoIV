package sinonimos;

import java.util.ArrayList;

public class Diccionario
{

    private ArrayList<Sinonimo> ListaSinonimos = new ArrayList();

    public Diccionario()
    {
        super();
    }

    public void agregar_sinonimo(Sinonimo sin)
    {
        ListaSinonimos.add(sin);
    }

    public void eliminar_sinonimo(Sinonimo sin)
    {
        ListaSinonimos.remove(sin);
    }

    public ArrayList<Sinonimo> busqueda_sinonimo(String Palabra)
    {
        ArrayList<Sinonimo> salida = new ArrayList();
        ListaSinonimos.forEach(sinonimo -> { if (sinonimo.getPalabra_clave().equals(Palabra))
            {
                salida.add(sinonimo);
            } });
        return salida;
    }


    public ArrayList<Sinonimo> getListaSinonimos()
    {
        return ListaSinonimos;
    }
}
