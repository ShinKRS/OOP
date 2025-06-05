package test;

import inheritance.*;
import java.util.Date;

public class InheritanceTest {
    public static void main(String[] args){
        Employee employee1;
        employee1 = new Employee(1,82,"Antonio",'M',37,"Cali");
        System.out.println(employee1);
        Employee employee2 = new Employee(2,71,"Julian",'M',37,"Sogamoso");
        System.out.println(employee2);
        
        
        var fecha = new Date();
        
        Cliente cliente1 = new Cliente (fecha,true,"HBG",'M',27,"Paipa");
        System.out.println(cliente1);
        
        var fecha1 = new Date();
        
        Cliente cliente2 = new Cliente (fecha, false, "Yurleydi",'F',12,"Barrancabermeja");
        System.out.println(cliente2);
        
        Person persona1 = new Person("Gerardo",'M',24,"Maní");
        imprimir(persona1);
        
        System.out.println("Detalles cliente 1: " + cliente1.obtenerDetalles());
        System.out.println("Detalles empleado 1: " + employee1.obtenerDetalles());
    
        Person persona2 = new Employee(3, 37, "Alex", 'M', 37, "Teusaquillo");
        Employee empleado1 = (Employee) persona2;
        System.out.println(empleado1.obtenerDetalles());
        
        Person persona3 = empleado1;
        System.out.println(persona3.obtenerDetalles());                

}        
    public static void imprimir(Person persona) {
        System.out.println(persona.obtenerDetalles());
   
    }
        
}
