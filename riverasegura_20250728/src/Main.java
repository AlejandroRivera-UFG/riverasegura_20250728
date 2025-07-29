/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author UFG
 */
public class Main {
        /*Variables globales*/
        public static String nombres = "Alejandro Rivera";
        public static String apellidos = "Rivera Segura";
        public static int anio_nacimiento = 2002;
        public static int mes_nacimiento = 11;
        public static float estatura = 1.45f; //ESTATURA EN METROS
        public static float peso = 579.7f; //PESO EN LIBRAS
        public static char genero = 'M';
        public static String estado_familiar = "soltero";
        public static double salario_mensual = 2.50d;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double imc = 0.0d;
        float tasa_kilogramos = 0.453592f; //1 LIBRA EQUIVALE A 0.453592 KILOGRAMOS
        int dias_laborales = 22; //22 DIAS MENSUALES
        int horas_laborales = 8; //8 HORAS DIARIAS
        
        //PESO EN LIBRAS A KILOGRAMOS
        float peso_kilogramos = Main.peso * tasa_kilogramos;
        
        //ELEVANDO EL VALOR DE LA ESTATURA AL CUADRADO
        float estatura_al_cuadrado = Main.estatura * Main.estatura;
        
        //CALCULAR EL IMC 
        imc = peso_kilogramos / estatura_al_cuadrado;
        
        //CALCULANDO SALARIO DIARIO 
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        //CALCULANDO SALARIO POR HORA
        double salario_hora = salario_diario/horas_laborales;
        
        
        //SALIDA DE DATOS
        System.out.println("Saludos " + Main.nombres + " " + Main.apellidos);
        System.out.println("Su peso en libras es " + Main.peso + " pero en kilogramos es " + peso_kilogramos);
        System.out.println("Su indice de masa corporal es: " + imc);
        System.out.println("Su salario mensual es: " + Main.salario_mensual);
        System.out.println("Su salario diario es: " + salario_diario);
        System.out.println("Su salario por hora es: " + salario_hora);
    
    }
    
}
