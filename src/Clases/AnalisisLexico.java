package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class AnalisisLexico {

    public static void analizarCodigo(File archivo, JTable tabla, JTextArea areaComentarios) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        areaComentarios.setText(""); // Limpiar el JTextArea antes de empezar

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int numeroLinea = 0;

            while ((linea = br.readLine()) != null) {
                numeroLinea++;
                // Analizar la línea completa, incluyendo posibles comentarios
                analizarLinea(linea, modelo, areaComentarios);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void analizarLinea(String linea, DefaultTableModel modelo, JTextArea areaComentarios) {
        // Expresión regular para identificar lexemas, cadenas completas y comentarios
        String patron = "\"([^\"]*)\"|\\'([^\\']*)\\'|//.*|\\t|\\s|\\(|\\)|\\{|\\}|\\[|\\]|,|;|:|\\+|\\-|\\*|/|%|=|&|\\||!|<|>|#|\\^|~";

        // Crear el patrón y el matcher
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(linea);

        // Iterar sobre los lexemas encontrados por el matcher
        int start = 0;
        while (matcher.find()) {
            // Capturar el texto antes del patrón encontrado
            if (start < matcher.start()) {
                String lexema = linea.substring(start, matcher.start()).trim();
                if (!lexema.isEmpty()) {
                    String categoria = obtenerCategoriaLexica2(lexema);
                    modelo.addRow(new Object[]{lexema, categoria});
                }
            }

            // Capturar el patrón encontrado como lexema
            String lexema = matcher.group().trim();
            if (!lexema.isEmpty()) {
                // Si es un comentario, agregarlo al JTextArea
                if (lexema.startsWith("//")) {
                    areaComentarios.append(lexema + "\n");
                } else {
                    String categoria = obtenerCategoriaLexica2(lexema);
                    modelo.addRow(new Object[]{lexema, categoria});
                }
            }
            start = matcher.end();
        }

        // Capturar el último lexema si hay alguno después del último delimitador
        if (start < linea.length()) {
            String lexema = linea.substring(start).trim();
            if (!lexema.isEmpty()) {
                String categoria = obtenerCategoriaLexica2(lexema);
                modelo.addRow(new Object[]{lexema, categoria});
            }
        }
    }

    private static String obtenerCategoriaLexica(String lexema) {
        if (esPalabraClave(lexema)) {
            return "100"; // Palabra Clave
        } else if (esIdentificador(lexema)) {
            return "200"; // Identificador
        } else if (esOperador(lexema)) {
            return "300"; // Operador
        } else if (esConstanteNumerica(lexema)) {
            return "400"; // Constante Numérica
        } else if (esConstanteCaracterCadena(lexema)) {
            return "500"; // Constante de Carácter o Cadena
        } else if (esSimboloEspecial(lexema)) {
            return "600"; // Símbolo Especial
        } else {
            return ""; // No se reconoce como ninguna categoría léxica específica
        }
    }
    
    private static String obtenerCategoriaLexica2(String lexema) {
        if (esPalabraClave(lexema)) {
            return "Palabra Clave"; // Palabra Clave
        } else if (esIdentificador(lexema)) {
            return "Identificado"; // Identificador
        } else if (esOperador(lexema)) {
            return "Operador"; // Operador
        } else if (esConstanteNumerica(lexema)) {
            return "Constante Numérica"; // Constante Numérica
        } else if (esConstanteCaracterCadena(lexema)) {
            return "Constante de carácter o cadena"; // Constante de Carácter o Cadena
        } else if (esSimboloEspecial(lexema)) {
            return "Símbolos Especiales"; // Símbolo Especial
        } else {
            return ""; // No se reconoce como ninguna categoría léxica específica
        }
    }

    private static boolean esPalabraClave(String lexema) {
        // Lista de palabras clave en Java
        String[] palabrasClave = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto",
                "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package",
                "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized",
                "this", "throw", "throws", "transient", "try", "void", "volatile", "while"};

        // Verificar si el lexema está en la lista de palabras clave
        for (String palabra : palabrasClave) {
            if (lexema.equals(palabra)) {
                return true;
            }
        }
        return false;
    }

    private static boolean esIdentificador(String lexema) {
        // Verificar si el lexema tiene al menos un carácter y comienza con una letra o un guion bajo
        if (lexema.length() == 0 || !(Character.isLetter(lexema.charAt(0)) || lexema.charAt(0) == '_')) {
            return false;
        }

        // Verificar si el resto de los caracteres son letras, dígitos o guiones bajos
        for (int i = 1; i < lexema.length(); i++) {
            char caracter = lexema.charAt(i);
            if (!(Character.isLetterOrDigit(caracter) || caracter == '_')) {
                return false;
            }
        }

        // El lexema cumple con todas las reglas para ser un identificador
        return true;
    }

    private static boolean esOperador(String lexema) {
        // Lista de operadores en Java
        String[] operadores = {"+", "-", "*", "/", "%", "=", "==", "!=", ">", "<", ">=", "<=", "&&", "||", "!", "&", "|", "^", "~", "<<", ">>", ">>>", "++", "--", "+=", "-=", "*=", "/=", "%=", "<<=", ">>=", ">>>=", "&=", "|=", "^="};

        // Verificar si el lexema está en la lista de operadores
        for (String operador : operadores) {
            if (lexema.equals(operador)) {
                return true;
            }
        }
        return false;
    }

    private static boolean esConstanteNumerica(String lexema) {
        // Utilizamos expresiones regulares para definir los patrones de las constantes numéricas
        // Estos patrones representan números enteros, decimales, negativos y notación científica
        String patronEntero = "-?\\d+"; // Número entero opcionalmente precedido por un signo negativo
        String patronDecimal = "-?\\d+\\.\\d*|\\d*\\.\\d+"; // Número decimal opcionalmente precedido por un signo negativo
        String patronNotacionCientifica = "-?\\d+(\\.\\d+)?[eE][+-]?\\d+"; // Notación científica opcionalmente precedida por un signo negativo

        // Verificar si el lexema coincide con alguno de los patrones
        return lexema.matches(patronEntero) || lexema.matches(patronDecimal) || lexema.matches(patronNotacionCientifica);
    }

    private static boolean esConstanteCaracterCadena(String lexema) {
        // Verificar si el lexema comienza y termina con comillas simples o dobles
        if ((lexema.startsWith("'") && lexema.endsWith("'")) || (lexema.startsWith("\"") && lexema.endsWith("\""))) {
            // Verificar si el lexema tiene al menos dos caracteres (uno para la comilla inicial y otro para la final)
            if (lexema.length() >= 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean esSimboloEspecial(String lexema) {
        // Lista de símbolos especiales en C++
        String[] simbolosEspeciales = {"{", "}", "(", ")", "[", "]", ";", ",", ".", ":", "+", "-", "*", "/", "%", "=", ">", "<", "!", "&", "|", "^", "~", "?", "#", "@"};

        // Verificar si el lexema está en la lista de símbolos especiales
        for (String simbolo : simbolosEspeciales) {
            if (lexema.equals(simbolo)) {
                return true;
            }
        }
        return false;
    }
   
}    
