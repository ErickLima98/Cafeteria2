


package conexiones;

/**
 *
 * @author Luis
 */

public class Conexiones {


    public static void main(String[] args) {
       Metodos_SQL metodos_SQL = new Metodos_SQL();
     
       metodos_SQL.guardar_datos(1, "Luis Rodriguez", "Ciudad", "59083517", 12345);
       metodos_SQL.guardar_datos(2, "Jose Perez", "Ciudad", "12345678", 54321);
       metodos_SQL.guardar_datos(3, "Daniel Rodas", "Ciudad", "87654321", 23456);
       metodos_SQL.guardar_datos(4, "Karen Ivone", "Ciudad", "23456789", 65432);
       metodos_SQL.guardar_datos(5, "Paula Rodas", "Ciudad", "98765432", 34567);
       
    }
    
}
