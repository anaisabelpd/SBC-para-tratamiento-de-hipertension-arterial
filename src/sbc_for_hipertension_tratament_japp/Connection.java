package sbc_for_hipertension_tratament_japp;

import java.util.Map;
import javax.swing.JOptionPane;
//import jpl.*;
import org.jpl7.*;
//import org.*;
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

    // consultar tratamiento para la hipertensión
    public String categoria(int ta_diastolica, int ta_sistolica) {
        String res = new String();
        consult = "categoria("+ta_sistolica+","+ta_diastolica+", Msj).";
        query = new Query(consult);
        
        if (!query.hasSolution()) {
            res += "No se encontraron\n";
        } else {
            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
                String res_t = solution.get("Msj").toString();
                
                // Decodificar la cadena 
                byte[] bytes = res_t.getBytes(StandardCharsets.ISO_8859_1);
                String mensaje = new String(bytes, StandardCharsets.UTF_8);
                
                res += mensaje+", ";
            }
            res = res.substring(0, res.length()-2);
        }
        return res;
    }
    public String rcv(String r_factor, String categoria) {
        String res = new String();
        consult = "rcv("+r_factor+","+categoria+", Msj).";
        query = new Query(consult);
        
        if (!query.hasSolution()) {
            res += "No se encontraron\n";
        } else {
            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
                String res_t = solution.get("Msj").toString();
                
                // Decodificar la cadena 
                byte[] bytes = res_t.getBytes(StandardCharsets.ISO_8859_1);
                String mensaje = new String(bytes, StandardCharsets.UTF_8);
                
                res += mensaje+", ";
            }
            res = res.substring(0, res.length()-2);
        }
        return res;
    }
    public String propuesta_estrategia_terapeutica(String r_factor, String categoria) {
        String res = "";
        consult = "propuesta_estrategia_terapeutica("+r_factor+","+categoria+", Msj).";
        query = new Query(consult);
        
        if (!query.hasSolution()) {
            res += "No se encontraron\n";
        } else {
            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
                String res_t = solution.get("Msj").toString();
                
                // Decodificar la cadena 
                byte[] bytes = res_t.getBytes(StandardCharsets.ISO_8859_1);
                String mensaje = new String(bytes, StandardCharsets.UTF_8);
                
                res += mensaje+", ";
            }
            res = res.substring(0, res.length()-2);
        }
        return res;
    }
    public String contraind_a(String m_conditons) {
        String res = new String();
        consult = "contraindicaciones_absolutas("+m_conditons+", Msj).";
        query = new Query(consult);
        
        if (!query.hasSolution()) {
            res = "No se encontraron.";
        } else {
            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
                String res_temp = solution.get("Msj").toString();
                
                // Decodificar la cadena 
                byte[] bytes = res_temp.getBytes(StandardCharsets.ISO_8859_1);
                String mensaje = new String(bytes, StandardCharsets.UTF_8);
                
                res = mensaje+", ";
            }
            res = res.replace("[", "");
            res = res.replace("]", "");
            res = res.replace("(", "");
            res = res.replace(")", "");
            res = res.replace("|", "");
            res = res.substring(0, res.length()-2);
        }
        return res;
    }
    public String contraind_r(String m_conditons) {
        String res = "";
        consult = "contraindicaciones_relativas("+m_conditons+", Msj).";
        query = new Query(consult);
        
        if (!query.hasSolution()) {
            res = "No se encontraron\n";
        } else {
            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
                String msj_t = solution.get("Msj").toString();
                // Decodificar la cadena 
                byte[] bytes = msj_t.getBytes(StandardCharsets.ISO_8859_1);
                String mensaje = new String(bytes, StandardCharsets.UTF_8);
                res = mensaje+", ";
            }
            res = res.replace("[", "");
            res = res.replace("]", "");
            res = res.replace("(", "");
            res = res.replace(")", "");
            res = res.replace("|", "");
            res = res.substring(0, res.length()-2);
        }
        return res;
    }
}
