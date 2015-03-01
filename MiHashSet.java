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
     * Introduce un elemento al conjunto de enteros
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
     * Elimina todos los elementos del conjunto
     */
    public void clear()
    {
        lista.clear();
    }
    
    /**
     * Devuelve si el conjunto contiene o no el elemento pasado como parametro
     * @param elemento El elemento a comprobar
     * @return True si contiene el elemento, false si no
     */
    public boolean contains(int elemento)
    {
        return lista.contains(elemento);
    }
    
    /**
     * Metodo que devuelve si el conjunto esta vacio o no
     * @return True si el hashset esta vacio, false si no
     */
    public boolean isEmpty()
    {
        return lista.isEmpty();
    }
    
    /**
     * Elimina el elemento del conjunto.
     * @param elemento El valor a eliminar
     * @return true si existia el valor, false si no
     */
    public boolean remove(int elemento)
    {
        boolean devolver = false;
        // Si la lista contiene el elemento, lo elimina y cambiamos el valor
        // del boolean devolver a true
        if(lista.contains(elemento))
        {
            lista.remove(elemento);
            devolver = true;
        }
        return devolver;
    }
    
    /**
     * Devuelve el número de elementos en el conjunto.
     * @return el número de elementos en el conjunto
     */
    public int size()
    {
        return lista.size();
    }
    
    /**
     * Devuelve una cadena conteniendo todos los elementos en el conjunto
     * entre corchetes, separados por comas.
     * @return Una cadena que contiene todos los elementos del conjunto
     */
    public String toString()
    {
        // Creamos el string a devolver
        String devolver = "[";
        int index = 0;
        // Con un bucle while vamos añadiendo cada elemento
        while(lista.size() > index)
        {
            if(index == 0)
            {
                devolver = devolver + lista.get(index);
            }
            else
            {
                devolver = devolver + ", " + lista.get(index);
            }
            index++;
        }
        // Cerramos el corchete, y lo devolvemos
        devolver = devolver + "]";
        return devolver;
    }
    
    /**
     * Devuelve si el conjunto es igual a otro que se le introduce
     * como parametro, falso si no
     * @param otroConjunto El conjunto con el que comparar
     * @return True si son iguales, false si no
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean devolver = true;
        // Primero comprobamos el tamaño, si es distinto no pueden ser iguales
        if(otroConjunto.size() == lista.size())
        {
            int index = 0;
            // Comprobamos si el otro conjunto contiene cada uno de los elementos
            // del conjunto pasado como parametro. En el momento que no contenga uno
            // sale del bucle
            while(index < lista.size() && devolver)
            {
                if(!(otroConjunto.contains(lista.get(index))))
                {
                    devolver = false;
                }
                index++;
            }
        }
        else
        {
            devolver = false;
        }
        return devolver;
    }
    
    
}
