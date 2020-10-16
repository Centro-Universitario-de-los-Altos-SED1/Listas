/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author mariaobduliagonzalezfernandez
 */
public class Listas {
    static Nodo cabeza=null,ultimo=null;/*son punteros para manejar la parte de insertar y mostrar*/
    
    static boolean vacia(){
    if(cabeza==null)
        return true;
    else
        return false;
    
    }
    
    
    static public void insertar(int x){
        Nodo nuevo = new Nodo(x,null);
        if(vacia()==true){
            cabeza= nuevo;
            ultimo=nuevo;
        }
        else{
            nuevo.siguiente=cabeza;
            cabeza= nuevo;
           
        }
    }
    static public void mostrar(){
        Nodo aux= cabeza;
        if(!vacia()){
            while(aux!=null){
                System.out.println(aux.valor);
                aux= aux.siguiente;
        }
        }
        else{
            System.out.println("Lista vacia");
        }
        
    }
    
    
    
    
    
    
  
    
    public static void main(String[] args) {
        /*crear el primer nodo
        Nodo cabeza,cola;//punteros
        Nodo aux=new Nodo();//creación nodo
        aux.setValor(10);
        aux.setSiguiente(null);
        cabeza=aux;
        cola=aux;
        Nodo aux2=new Nodo(2,aux);
        cola.setSiguiente(aux2);
        cola=aux2;
        
        
        Nodo aux3=new Nodo(3,aux2);
        cola=aux3;
        
        System.out.println("primer elemento"+cola.valor+" segundo elemento "
                +cola.siguiente.valor+"tercer elemento"+cola.siguiente.siguiente.valor);
        cola.siguiente.setSiguiente(aux3);
        
        
      */
        
        insertar(5);
        insertar(10);
        insertar(11);
        mostrar();
         
        
        
        
        
        
    }
    
}
