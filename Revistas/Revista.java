/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Revistas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.Date;
import java.io.Serializable;
import PatronVisitor.*;

/**
 * 
 */
public class Revista implements Serializable,Visitable {
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String titulo;

    /**
     * 
     */
    private Date fechaPublicacion;

    /**
     * 
     */
    private int numeroRevista;

    /**
     * 
     */
    private String estado;

    /**
     * 
     */
    private boolean publicada;

    /**
     * Aqui se esquematiza el contenido de una revista, va a estar separada por las
     * categorias: 
     *      - "Inteligencia Artificial" 
     *      - "Analisis de Sistemas de Software" 
     *      - "Bases de Datos" 
     *      - "Hardware" 
     * Todas estas categorias y separaciones seran manejadas por una instancia llamada "Contenido".
     */
    private Contenido contenido;


    /************************************
    *           CONSTRUCTORES           *
    *************************************/

    /**
     * 
     */
    public Revista() {

    }

    public Revista(String titulo) {
        this.titulo = titulo;
    }


    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/

    /**
     * 
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * 
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * 
     * @return
     */
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * 
     * @param fechaPublicacion
     */
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * 
     * @return
     */
    public int getNumeroRevista() {
        return numeroRevista;
    }

    /**
     * 
     * @param numeroRevista
     */
    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    /**
     * Este metodo hara posible saber si una revista tiene un estado de "publicada" o "sin publicar" mediante
     * una cadena de caracteres.
     * @return
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Con este metodo se puede asignar un nuevo estado "publicada" o "sin publicar" como CADENA DE CARACTERES.
     * @param estado Cadena de caracteres que hara referencia al nuevo estado de la revista.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * 
     * @return
     */
    public boolean estaPublicada() {
        return publicada;
    }

    /**
     * Mediante este metodo se puede asignar el estado de una revista.
     * True si se encuentra publicada.
     * False si no esta publicada.
     * @param publicada Valor booleano que expresara el nuevo estado de la revista.
     */
    public void setEstadoPublicada(boolean publicada) {
        this.publicada = publicada;
    }

    /**
     * 
     * @return
     */
    public Contenido getContenido() {
        return contenido;
    }

    /**
     * 
     * @param contenido
     */
    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public String toString() {
        return this.titulo;
    }
    
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
}
