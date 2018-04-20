package a.b.c.d.e.f;

/**
     * Clase de un nodo para una lista enlazada
     * 
     */
public class Node {
    /**
     * Atributo que guarda dato del nodo
     * 
     */
        public String data;

    /**
     * Siguiente nodo en la lista
     * 
     */
        public Node next;

     /**
     * Constructor de clase
     *@param data Dato que guarda el nodo
     * 
     */
        
        public Node(String data) {
            this.data = data;
        }
        
    /**
     * Invierte lista
     *
     * 
     */
        public Node gus() {

            //Si es nodo final , se regresa a si mismo
            if(next == null) return this;

            //Guarda siguiente nodo y borra referencia
            Node otro = next;
            next      = null;

            //Llama al metodo en el siguiente nodo
            Node tavo = otro.gus();

            //El que antes era siguiente nodo, ahora tiene a este nodo como siguiente
            otro.next = this;
            return tavo;
        }
      
        /**
         * Imprime en la consola la secuencia de Nodos que 
         * componen a esta lista. Por ejemplo, para la lista
         * que devuelve el mÃ©todo "build", la invocaciÃ³n de
         * este mÃ©todo escribe en la consola: 
         * 
         * A-->B-->C-->D-->E-->F-->
         * 
         * Lo anterior serÃ­a lo que se visualiza en la consola 
         * justo despuÃ©s de ejecutar las siguintes dos lineas:
         * 
         *         Node a = build();
         *         a.prn();
         *         
         */
        public void prn() {
            // Este mÃ©todo requiere sÃ³lo de 3 a 7 lineas de cÃ³digo para funcionar correctamente
            System.out.print(data+"-->");
            if(next != null){
                next.prn();
            }
        }
        
    }// ends Node class