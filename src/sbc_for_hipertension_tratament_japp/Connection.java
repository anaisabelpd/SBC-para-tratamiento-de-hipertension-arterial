package sbc_for_hipertension_tratament_japp;

import java.util.Map;
import javax.swing.JOptionPane;
import org.jpl7.Query;
import org.jpl7.Term;
import java.nio.charset.StandardCharsets;

/**
 * Se encarga de gestionar la consulta de las bases de conocimiento.
 */
public class Connection {

    private String consult;
    private Query query;
    private Map<String, Term> solution;

    public Connection(String[] name) {
        for (String f : name) {
            consult = "consult('" + f + "')";
            query = new Query(consult);
            if (!query.hasSolution()) {
                JOptionPane.showMessageDialog(null, "No encuentra la base de conocimiento:" + f, "ERROR", JOptionPane.ERROR);
            }
        }
    }

    // consultar tratamiento para la hipertension
    public String[] condition(int edad, double peso, double altura, String coord, String flex, int fortaleza, int resistencia) {
        String[] res = new String[2];
        consult = "prueba("+edad+","+peso+","+altura+",'"+coord+"','"+flex+"',"+fortaleza+","+resistencia+", Puntos, Msj).";
        query = new Query(consult);

        if (!query.hasSolution()) {
            res[0] += "No se encontraron\n";
        } else {
            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
                String puntos = solution.get("Puntos").toString();
                String msj = solution.get("Msj").toString();
                
                // Decodificar la cadena 
                byte[] bytes = msj.getBytes(StandardCharsets.ISO_8859_1);
                String mensaje = new String(bytes, StandardCharsets.UTF_8);
                
                res[0] = puntos;
                res[1] = mensaje;
            }
        }
        return res;
    }
}
