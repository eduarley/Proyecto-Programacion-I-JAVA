
package appproyectoeduardoarley;

public class Pregunta {
    private int numero;
    private String pregunta;
    private String []respuestas = new String [3]; //almacena las 3 posibles respuestas corresponde a la posición dónde está la respuesta correcta
    private int posicion;  //indica la posicion de la respuestacorrecta
    

    public Pregunta(int numero, String pregunta,String respuestas[],int posicion) {
        this.posicion = posicion;
        this.pregunta = pregunta;
        this.respuestas=respuestas;
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public void llenarRespuestas(){
//        
//        switch(/*leer categoria*/){
//            case 0:
//                switch(numero){ //ese numero es el numero de pregunta
//                    case 0:
//                        respuestas[0]="Costa Rica";
//                        respuestas[1]="Colombia";
//                        respuestas[2]="México";
//                        posicion=0;
//                        break;
//                }
//                break;
//        }
    }
    
    
    
    
}
