package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class analisislex {
    public static void analizarCodigo(File archivo, JTable tabla, JTextArea areaComentarios) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        areaComentarios.setText(""); // Limpiar el JTextArea antes de empezar

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int numeroLinea = 0;

            while ((linea = br.readLine()) != null) {
                numeroLinea++;
                if (linea.trim().startsWith("//")) {
                    // Si la línea comienza con "//", mostrarla en el JTextArea de comentarios
                    areaComentarios.append(linea + "\n");
                } else {
                    // Si no, analizar el lexema y agregarlo a la JTable como antes
                    analizarLinea(linea, modelo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

private static void analizarLinea(String linea, DefaultTableModel modelo) {
    // Expresión regular para dividir la línea en lexemas
   String patron = "([\\s\\t]+|\\(|\\)|\\{|\\}|\\[|\\]|(?:'[^']*'|\"\\s*[^\"]*\\s*\")|,|;|:|\\+|\\-|\\*|/|%|=|&|\\||!|<|>|#|\\^|~)";

    // Dividir la línea en lexemas utilizando la expresión regular
    String[] lexemas = linea.split("(?=" + patron + ")|(?<=" + patron + ")");

    // Iterar sobre los lexemas y agregarlos al modelo de la tabla
    for (String lexema : lexemas) {
        // Eliminar espacios en blanco alrededor del lexema
        lexema = lexema.trim();
        if (!lexema.isEmpty()) { // Ignorar lexemas vacíos
            String categoria = obtenerCategoriaLexica(lexema);
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

    // Implementa los métodos para verificar si un lexema pertenece a una categoría léxica específica
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