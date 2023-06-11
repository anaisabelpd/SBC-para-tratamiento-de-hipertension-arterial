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
            consult = "consult('" + "src/sbc_for_hipertension_tratament_japp/SBC.pl" + "')";
            query = new Query("consult('src/sbc_for_hipertension_tratament_japp/SBC.pl')");
            if (!query.hasSolution()) {
                JOptionPane.showMessageDialog(null, "No encuentra la base de conocimiento:" + f, "ERROR", JOptionPane.ERROR);
            }
        }
    }

    // consultar tratamiento para la hipertension
    public String categoria(int ta_diastolica, int ta_sistolica) {
        String res = new String();
        consult = "categoria("+ta_sistolica+","+ta_diastolica+", Msj).";
        query = new Query(consult);
        
//        if (!query.hasSolution()) {
//            res[0] += "No se encontraron\n";
//        } else {
//            //ciclo para concatenar todas las soluciones de la consulta
//            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
//                String puntos = solution.get("Puntos").toString();
        res = solution.get("Msj").toString();
//                
//                // Decodificar la cadena 
//                byte[] bytes = msj.getBytes(StandardCharsets.ISO_8859_1);
//                String mensaje = new String(bytes, StandardCharsets.UTF_8);
//                
//                res[0] = puntos;
//                res[1] = mensaje;
//            }
//        }
        return res;
    }
    public String rcv(String r_factor, String categoria) {
        String res = new String();
        consult = "rcv("+r_factor+","+categoria+", Msj).";
        query = new Query(consult);
        
//        if (!query.hasSolution()) {
//            res[0] += "No se encontraron\n";
//        } else {
//            //ciclo para concatenar todas las soluciones de la consulta
//            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
//                String puntos = solution.get("Puntos").toString();
                res = solution.get("Msj").toString();
//                
//                // Decodificar la cadena 
//                byte[] bytes = msj.getBytes(StandardCharsets.ISO_8859_1);
//                String mensaje = new String(bytes, StandardCharsets.UTF_8);
//                
//                res[0] = puntos;
//                res[1] = mensaje;
//            }
//        }
        return res;
    }
    public String propuesta_estrategia_terapeutica(String r_factor, String categoria) {
        String res = new String();
        consult = "propuesta_estrategia_terapeutica("+r_factor+","+categoria+", Msj).";
        query = new Query(consult);
        
//        if (!query.hasSolution()) {
//            res[0] += "No se encontraron\n";
//        } else {
//            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
//                String puntos = solution.get("Puntos").toString();
                res = solution.get("Msj").toString();
//                
//                // Decodificar la cadena 
//                byte[] bytes = msj.getBytes(StandardCharsets.ISO_8859_1);
//                String mensaje = new String(bytes, StandardCharsets.UTF_8);
//                
//                res[0] = puntos;
//                res[1] = mensaje;
//            }
        }
        return res;
    }
    public String contraind_a(String m_conditons) {
        String res = new String();
        consult = "contraind_a("+m_conditons+", Msj).";
        query = new Query(consult);
        
//        if (!query.hasSolution()) {
//            res[0] += "No se encontraron\n";
//        } else {
//            //ciclo para concatenar todas las soluciones de la consulta
//            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
//                String puntos = solution.get("Puntos").toString();
                res = solution.get("Msj").toString();
//                
//                // Decodificar la cadena 
//                byte[] bytes = msj.getBytes(StandardCharsets.ISO_8859_1);
//                String mensaje = new String(bytes, StandardCharsets.UTF_8);
//                
//                res[0] = puntos;
//                res[1] = mensaje;
//            }
//        }
        return res;
    }
    public String contraind_r(String m_conditons) {
        String msj;
        consult = "contraind_r("+m_conditons+", Msj).";
        query = new Query(consult);
        
        if (!query.hasSolution()) {
            msj = "No se encontraron\n";
        } else {
//            //ciclo para concatenar todas las soluciones de la consulta
//            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();                
//                String puntos = solution.get("Puntos").toString();
                msj = solution.get("Msj").toString();
//                
//                // Decodificar la cadena 
                byte[] bytes = msj.getBytes(StandardCharsets.ISO_8859_1);
                String mensaje = new String(bytes, StandardCharsets.UTF_8);
                msj = mensaje;
//                res[0] = puntos;
//                res[1] = mensaje;
//            }
        }
        return msj;
    }
//    public ResultModel condition(int edad, double peso, double altura, String coord, String flex, int fortaleza, int resistencia) {
//        ResultModel resultModel = new ResultModel();
//        consult = "prueba(" + edad + "," + peso + "," + altura + ",'" + coord + "','" + flex + "'," + fortaleza + "," + resistencia + ", Puntos, Pautas, Msj).";
//        query = new Query(consult);
//
//        if (!query.hasSolution()) {
//            resultModel.setStatus("No se encontró respuesta");
//        } else {
//            //ciclo para concatenar todas las soluciones de la consulta
//            while (query.hasMoreSolutions()) {
//                solution = query.nextSolution();
//
//                // Obtiene la lista de resultados
//                Term results = solution.get("Pautas");
//                // Convierte la lista de resultados a una lista de Java
//                List<String> listPautas = new ArrayList<>();
//                for (Term result : results.listToTermArray()) {
//                    String t = resultModel.decode(result.toString());
//                    listPautas.add(resultModel.inside(t));
//                }
//
//                String puntos = solution.get("Puntos").toString();
//                String msj = solution.get("Msj").toString();
//
//                resultModel.setPoints(puntos);
//                resultModel.setMessage(resultModel.decode(msj));
//                resultModel.setSuggestions(listPautas);
//                resultModel.setStatus("Se encontró respuesta");
//            }
//        }
//        return resultModel;
//    }
}
