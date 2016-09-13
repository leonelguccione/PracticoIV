package sinonimos;

import java.util.ArrayList;

public class diccionario {
    
    private ArrayList<sinonimo> ListaSinonimos = new ArrayList();
    
    public diccionario() {
        super();
    }
    
    public void agregar_sinonimo(sinonimo sin) throws Exception
    {
        if ((sin.getPalabra_clave()==null)||(sin.getSinonimo_clave()==null)) 
        {
            throw new Exception("Sinonimo Invalido");
        }
        else
        {    
            if (ListaSinonimos.contains(sin)) 
               {
                   throw new Exception("Sinonimo Repetido");       
               }
             else          
                ListaSinonimos.add(sin);
        }    
    }  
    
    public void eliminar_sinonimo(sinonimo sin) throws Exception
    {  
      if (ListaSinonimos.isEmpty())
          {
              throw new Exception("Diccionario Vacio");
          }
      else
          { 
            if ((sin.getPalabra_clave()==null)||(sin.getSinonimo_clave()==null)) 
                {
                    throw new Exception("Sinonimo Invalido");
                }
            else
                {    
                if (!ListaSinonimos.contains(sin)) 
                    {
                    throw new Exception("Sinonimo Inexistente");       
                    }
                else 
                    ListaSinonimos.remove(sin);        
                }
          }
    }
    
    public ArrayList<sinonimo> busqueda_sinonimo(String Palabra) throws Exception
    {
        ArrayList<sinonimo> salida = new ArrayList();
        if (ListaSinonimos.isEmpty())
        {
            throw new Exception("Diccionario Vacio");
        }
        else
        {    
            ListaSinonimos.forEach(sinonimo -> {if (sinonimo.getPalabra_clave().equals(Palabra)){salida.add(sinonimo); }});
            if (salida.isEmpty()) 
                {
                    throw new Exception("Busqueda Infructuosa");
                }
            else
               return salida;
        }    
    }


    public ArrayList<sinonimo> getListaSinonimos() {
        return ListaSinonimos;
    }
}
