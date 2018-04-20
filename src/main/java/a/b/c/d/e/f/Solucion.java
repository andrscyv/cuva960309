package a.b.c.d.e.f;

/**
     * Clase principal para el segundo examen parcial
     * del curso de Analisis y Diseño de Sistemas Informáticos.
     * Contiene ejecución que utiliza la clase Node.java
     * 
     */
public class Solucion {
    
    
    /**
     * 
     * 
     * Construye lista de nodos de las primeras
     * 6 letras del abecedario
     * 
     * @return Node Regresa el primero que se crea
     */
    private Node build() {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    /**
     * Prueba la funcionalidad de el mÃ©todo "gus" con distintos casos de prueba
     */
    public void ok() {
        Node a = build();
        a.prn();
        a = a.gus();
        a.prn();
        a = a.gus();
        a.prn();
        
        Node b = new Node("X");
        b = b.gus();
        b.prn();
        
        Node c = new Node("X");
        Node d = new Node("Y");
        c.next = d;
        c = c.gus();
        c.prn();   
    }

    public static void main(String...argv) {
        //new Solucion().ok();
        Solucion s = new Solucion();
        Node a = s.build();
        a.prn();
    }

}