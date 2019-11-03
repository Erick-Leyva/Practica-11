/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyfilesample;
import java.io.*;
/**
 *
 * @author poo02alu07
 */
public class CopyFileSample {

    /**
     * @param args the command line arguments
     */
    
    public static void copy (File source, File destination) throws IOException {

        try(InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream (destination)){
            int b;
            while((b = in.read()) != -1){
                out.write(b);
            }
        }
    }
    
    
    public static void main(String[] args) throws IOException{
        File fSource = new File("/Users/poo02alu07/Documents/Archivo1.txt");//Archivo a copiar en ruta absoluta
        File fDestiny = new File("/Users/poo02alu07/Downloads/Archivo2.txt");//Se creara un nuevo archivo que tendra el contenido de source
                                                                             //Con ruta absoluta
        File fDestiny2 = new File("Archivo3.txt");//Un archivo con contenido previo en ruta relativa
        File fDestiny3 = new File("Archivo4.txt");//Se creara un nuevo archivo con ruta relativa
        File fDestiny4 = new File("/Users/poo02alu07/Downloads/Archivo5.txt");//Un archivo con contenido previo con ruta absoluta
        File fDestiny5 = new File("CarpetaNueva/Archivo6.txt");//Una copia del archivo se creara en una carpeta con ruta relativa
        copy(fSource, fDestiny);
        copy(fSource, fDestiny2);
        copy(fSource, fDestiny3);
        copy(fSource, fDestiny4);
        copy(fSource, fDestiny5);
    }
    
}
