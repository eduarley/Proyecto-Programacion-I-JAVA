
package appproyectoeduardoarley;

import java.util.Stack;

public class Juego {
    private Pregunta [][]preguntas;//se almacenan las preguntas correspondientes a cada categoría
    private int categoria;
    private int respuesta;
    private int random;
    boolean estadoRandom;
    private  int  repetidas[]=new int [5];
    private  Stack pila1 = new Stack();
    
    
    
    
    //private boolean[] estado=new boolean[5];
      
    
    
    
    
    
    private static Jugador jugadores[];//se debe almacenar cada jugador que gana un juego, 
                               //con el fin de mostrar luego las estadísticas (lista de jugadores ganadores en orden de puntaje). 
    private int contadorJugador=0;
    public Juego() {
      
        
        
        
        preguntas=new Pregunta[5][5];
        jugadores=new Jugador[10];
        
        //Deportes
        preguntas[0][0]=new Pregunta(1,"Cuál es la nacionalidad de James Rodriguez?",new String[]{"Costa Rica","Italia","Colombia"},2);
        preguntas[0][1]=new Pregunta(2,"En cuál equipo de baloncesto juega Stephen Curry",new String[]{"Los Angeles Lakers","Golden State Warriors","Houston Rockets"},1);
        preguntas[0][2]=new Pregunta(3,"Cuántas Copas de Europa posee el Real Madrid?",new String[]{"17","9","16"},2);
        preguntas[0][3]=new Pregunta(4,"En qué parte de Argentina nació Lionel Messi?",new String[]{"Rosario","Buenos Aires","Mendoza"},0);
        preguntas[0][4]=new Pregunta(5,"Cuál es el nombre del actual entrenador de la selección de Alemania",new String[]{"Joachim Löw","Franz Beckenbauer","Helmut Schön"},0);
        //Historia
        preguntas[1][0]=new Pregunta(1,"En qué año descubrió Colón a América?",new String[]{"1502","1492","1504"},1);
        preguntas[1][1]=new Pregunta(2,"Nacionalidad de Adolf Hitler?",new String[]{"Polonia","Alemania","Austria"},2);
        preguntas[1][2]=new Pregunta(3,"Primer presidente de Estados Unidos",new String[]{"George Washington","Abraham Lincoln","John Adams"},0);
        preguntas[1][3]=new Pregunta(4,"Cúal era la capital del imperio Inca?",new String[]{"Capaccuna","Cuzco","Machu Picchu"},1);
        preguntas[1][4]=new Pregunta(5,"Dónde se originó el Kung fu?",new String[]{"Corea","Japón","China"},2);
        //Ciencia
        preguntas[2][0]=new Pregunta(1,"Nombre del componente mínimo de un ser vivo",new String[]{"Átomo","Célula","ADN"},1);
        preguntas[2][1]=new Pregunta(2,"Nombre del proceso de la división celular",new String[]{"Metafase","Biserción","Mitosis"},2);
        preguntas[2][2]=new Pregunta(3,"Pocentaje aproximado de agua en la Tierra",new String[]{"60%","70%","75%"},1);
        preguntas[2][3]=new Pregunta(4,"Qué órgano utilizan las ballenas para respirar?",new String[]{"Branquias","Piel","Pulmones"},2);
        preguntas[2][4]=new Pregunta(5,"Cuál es, aproximadamente, la velocidad de la luz?",new String[]{"300,000 km/s","30,000 km/s","3,000,000 km/s"},0);
        //Arte
        preguntas[3][0]=new Pregunta(1,"Cuál es la nacionalidad de Leonardo da Vinci?",new String[]{"Italia","Francia","Florencia"},2);
        preguntas[3][1]=new Pregunta(2,"Quién fue el creador de la pintura \"La noche estrellada\"?",new String[]{"Da Vinci","Van Gogh","Miguel Ángel"},1);
        preguntas[3][2]=new Pregunta(3,"Qué otro nombre recibe la obra pictórica \"La Mona Lisa\"?",new String[]{"La Gioconda","Amilcare Ponchielli","Lisa Ponchielli"},0);
        preguntas[3][3]=new Pregunta(4,"Dónde se encuenta la famosa obra \"La última cena\"",new String[]{"Museo del Louvre","Santa Maria delle Grazie","Museo de Arte de Chianciano"},1);
        preguntas[3][4]=new Pregunta(5,"Quién es el creador de la obra \"El grito\"?",new String[]{"Miguel Ángel","Van Gogh","Edvard Munch"},2);
        //Geografía
        preguntas[4][0]=new Pregunta(1,"En cuál continente está ublicada la República de Seychelles?",new String[]{"Oceanía","África","Asia"},1);
        preguntas[4][1]=new Pregunta(2,"Cuál es la ciudad mas poblada del mundo?",new String[]{"Shangai","Mexico DF","Tokio"},2);
        preguntas[4][2]=new Pregunta(3,"Cuál es la capital de Canadá",new String[]{"Quebec","Toronto","Ottawa"},2);
        preguntas[4][3]=new Pregunta(4,"Cuántos países conforman el Reino Unido?",new String[]{"3","4","5"},1);
        preguntas[4][4]=new Pregunta(5,"Cuál es la capital de Brasil?",new String[]{"São Paulo","Brasilia","Rio de Janeiro"},1);
          
        
        
        
          
        
    }
    
    
    
    
    public String obtenerPregunta(){
        //obtenerRandom();
        
        
        
        
        
        
        
        
//        random=(int)(Math.random()*5);
//        while(estado[random]){
//            random=(int)(Math.random()*5);
//        }
//        estado[random]=true;
        
        
//        
        llenarArregloYPila();
        randomSinRepetir();
        return preguntas[categoria][random].getPregunta();
    }
    public String[] obtenerRespuestas() {
        return preguntas[categoria][random].getRespuestas();
    }

//    public Categoria[] getCategorias() {
//        return categorias;
//    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setPreguntas(Pregunta[][] preguntas) {
        this.preguntas = preguntas;
    }

//    public void setCategorias(Categoria[] categorias) {
//        this.categorias = categorias;
//    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
   
//   public boolean categoriasDistintas(int indice1, int indice2){
//            boolean estado=false;
//            if(indice1==indice2){
//                estado=true;
//            }
//            return estado;
//        }
    public String[] arregloRespuestas(){
        return preguntas[categoria][random].getRespuestas();
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    
    public boolean comprobar(){
        return respuesta==preguntas[categoria][random].getPosicion();
    }
    
    
//    public int obtenerRandom(){
// 
//        int i=0;
//        
//        int arreglo[]=new int[5];
//        
//    
//    arreglo[i]=(int)(Math.random()*5);
//    for ( i = 1; i < 5; i++) {
//        
//          random=arreglo[i]=(int)(Math.random()*5); 
//          for (int j = 0; j < i; j++) {
//            if(arreglo[i]==arreglo[j]){
//                i--;
//                
//            }
//            
//        } 
//          
//    }
//    return random;
//    }   
    
    
    
    public void introducirJugador(Jugador jugador){
        
            jugadores[contadorJugador]=jugador;
            contadorJugador++;
        
    }
    
    
    
    
    public String ganador(Jugador j1,Jugador j2){
        String nombre="";

        
 if(j1.getPuntaje()>j2.getPuntaje()){
        nombre=j1.getNickname();
    }else{
        if(j1.getPuntaje()<j2.getPuntaje()){
            nombre=j2.getNickname();
        }else{
            nombre="Hubo un empate";
        }
    }
           
        
        
      return nombre;  
    }
    
    
    
    
    //hacer metodo de estadisticas estatico para agarrarlo desde el menu y hacer el metodo con el arreglo jugadores
    
    
    
    public  void llenarArregloYPila(){
    
    int i=0;
    repetidas[i]=(int)(Math.random()*5);
    for ( i = 1; i < 5; i++) {
          repetidas[i]=(int)(Math.random()*5); 
          for (int j = 0; j < i; j++) {
            if(repetidas[i]==repetidas[j]){
                i--;
                
            }
            
        }
 
    }
    for (int j = 0; j < repetidas.length; j++) {
            pila1.add(repetidas[j]);
            
        }
    }
    
    
    
    
    
    
    public int randomSinRepetir(){
    
       if(!pila1.isEmpty()){
       random=(int)pila1.pop();
       }else{
           return -1;
       }
        
        return random;      

   }
    
    
    
    
    
    
    
    
    
    
    public String estadisticas(){
        Jugador nombres=null;
        String h="";
        Jugador aux;
        for (int i = 0; i < jugadores.length; i++) {
            for (int j = 0; j < jugadores.length-1; j++) {
                if(jugadores[j].getPuntaje()>jugadores[j+1].getPuntaje()){
                    aux=jugadores[j];
                    jugadores[j]=jugadores[j+1];
                    jugadores[j+1]=aux;
                }
            }
            
        }
        
        for (int i = 0; i < jugadores.length; i++) {
            h+=jugadores[i];
            
        }
        return h;
        
    }
    
    
    
    
    
}
   
    
    
    
    
    

    
    
    
    
    
    
    
    

