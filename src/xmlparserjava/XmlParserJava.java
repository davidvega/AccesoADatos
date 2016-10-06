/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparserjava;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.RecursiveAction;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author mañana
 */
public class XmlParserJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         try {
             System.out.println("hola");
             Document doc = DomUtil.parse("ejemplo.xml", false);
              RecursiveWalker rw=new RecursiveWalker(doc.getDocumentElement());
              System.out.println(rw.toString());
             
              } catch (ParserConfigurationException  |  IOException  | SAXException ex) {
                        System.out.println(ex.getLocalizedMessage());
        }
}
    
    
}
