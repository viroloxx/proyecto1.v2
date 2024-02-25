/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

/**
 *
 * @author Diego A. Vivolo
 */
public class Basedatos {
    
    private static final String STORES_SECTION = "Almacenes;";
    private static final String ROUTES_SECTION = "Rutas;";
    private static final String STORE_PREFIX = "Almacen ";
    private static final int READING_NULL = 0;
    private static final int READING_CIUDAD = 1;
    private static final int READING_STOCK = 2;
    private static final int READING_ROUTE = 3;

    private Basedatos() {}  

    public static Grafo readBasedatos(File file) throws IOException {
        return readBasedatos(new FileReader(file));
    }
        
        
    public static Grafo readBasedatos(Reader baseReader) throws IOException {
        Grafo grafo = new Grafo();        
        
        try (BufferedReader reader = new BufferedReader(baseReader)) {

            int mode = READING_NULL;
            Ciudad ciudad = null; 
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                if (line.startsWith(STORES_SECTION)) {
                    mode = READING_STORE;
                } else if (line.startsWith(ROUTES_SECTION)) {
                    mode = READING_ROUTE;
                } else if (mode == READING_STORE) {
                    String name = line.split(":")[0].replace(STORE_PREFIX, "");
                    store = graph.createStore(name);
                    if (!line.endsWith(";")) {
                        mode = READING_STOCK;            
}  
    
    
    
    
    
        public static StoreGraph readDatabase(Reader baseReader) throws IOException {
        StoreGraph graph = new StoreGraph();

        try (BufferedReader reader = new BufferedReader(baseReader)) {
    
    
    
    
    
    
    public class AjusteParametros{
        public static double alpha = 1.0;
        
        public static double beta = 2.0;
        
        
        
        public static int HomigasCan =;
    }
}
