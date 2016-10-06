/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparserjava;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author mañana
 */
public class RecursiveWalker {
    Node raiz;

    public RecursiveWalker(Node raiz) {
        this.raiz = raiz;
    }

    public Node getRaiz() {
        return raiz;
    }
    public RecursiveWalker(){
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }
    private String recursiveWalker(Node actual){
        String resultado="";
        NodeList childNodes=actual.getChildNodes();
        //si tiene el nodo  hijos se ejecuta el if
        if(actual.hasChildNodes()){
            //este bucle te recorre lal ista de lso hijos
          for (int i = 0; i < actual.getChildNodes().getLength(); i++) {
              //se impplementa el metodo por lo que vuele a ejectutar psandole por parametro el siguiente nodo
              // que seria el hijo del nodo actual,asi hast a quen o tenga mas hijos
              //y se vuelve hacer este bucle si el siguiente tiene hijos
              //la recursividad sirve para recorrer arboles.
                resultado+= recursiveWalker(actual.getChildNodes().item(i));
               //System.out.println("Encuentra node : "+actual.getNodeName()+" CON VALOR: "+actual.getNodeValue());
                
                
            }
        }
        resultado+="TIPO NODO: "+actual.getNodeType()+" NOMBRE NODO: "+actual.getLocalName()+" VALOR NODO: "+actual.getNodeValue();
       if(actual.hasAttributes()){
           resultado+="\nATRIBUTOS  de "+actual.getNodeName()+": ";
            for (int i = 0; i < actual.getAttributes().getLength(); i++) {
                resultado+=" atributo: "+actual.getAttributes().item(i).getNodeName();
                    resultado+=" atributo: "+actual.getAttributes().item(i).getNodeValue();
           }
    }
       switch(actual.getNodeType()){
           case 1:
               resultado+=actual.getLocalName();
               break;
            case 2:
               resultado+=actual.getLocalName();
               break;
            case 3:
               resultado+=actual.getLocalName();
               break;
            case 4:
               resultado+=actual.getLocalName();
               break;
            case 5:
               resultado+=actual.getLocalName();
               break;
              case 6:
               resultado+=actual.getLocalName();
               break;
       
       }
           
                       
        
               
        return resultado;
    }

    @Override
    public String toString() {
        return recursiveWalker(this.raiz);
    }
    
    
    
}
