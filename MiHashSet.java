import pkg.ArrayListInt;

/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // lista de enteros
    private ArrayListInt lista;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        lista = new ArrayListInt();
    }

    /**
     * Introduce un elemento al hashSet de enteros
     * @param  valor El elemento a introducir en la lista
     * @return True si no esta y ha podido añadirlo, false si esta.
     */
    public boolean add(int valor)
    {
        boolean devolver = true;
        // Comprobamos si la lista ya contiene el valor, sino lo añadimos
        if((lista.contains(valor)))
        {
            devolver = false;
        }
        else
        {
            lista.add(valor);
        }
        return devolver;
    }
    
    /**
     * Elimina todos los elementos de la lista
     */
    public void clear()
    {
        lista.clear();
    }
    
    /**
     * Devuelve si el hashSet contiene o no el elemento pasado como parametro
     * @param elemento El elemento a comprobar
     * @return True si contiene el elemento, false si no
     */
    public boolean contains(int elemento)
    {
        return lista.contains(elemento);
    }
    
    
}
