package clase1_tiposdatos;

public class Clase1_TiposDatos {

    public static void main(String[] args) {
     int num1, num2;
     int num3=0;
     //-128 hasta 127
     byte b = -128;
     short s = 32000;
     
     //tipos de datos flotante
     float flotante = 32.25f;
     float flotante2 = 15.25f;
     double doble = 32.56;
     float total = 0;
     total = flotante + flotante2;
     
        System.out.println("Sumatoria total:"+total);
        
    //tipos de datos de texto
    String nombre = "Rosario";
    char caracteres = '@';
    String apellido = "Perez";
        System.out.println("El empleado se llama: " + nombre + " " +apellido);
        System.out.println("Que letra es "+caracteres);
     
    }
    
}
