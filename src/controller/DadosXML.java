package controller;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DadosXML {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documentoXML = db.newDocument();

            Element root = documentoXML.createElement("root");
            documentoXML.appendChild(root);

            Element pessoa = documentoXML.createElement("pessoa");
            Attr id = documentoXML.createAttribute("id");
            id.setValue("1");

            pessoa.setAttributeNode(id);

            root.appendChild(pessoa);

            Element nome = documentoXML.createElement("nome");

            nome.appendChild(documentoXML.createTextNode("Itamar"));
            pessoa.appendChild(nome);

            Element idade = documentoXML.createElement("idade");

            idade.appendChild(documentoXML.createTextNode("18"));

            pessoa.appendChild(idade);
            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            
            DOMSource documentoFonte = new DOMSource(documentoXML);
            
            StreamResult documentoFinal = new StreamResult(new File ("teste.xml"));
            
            transformer.transform(documentoFonte, documentoFinal);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DadosXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DadosXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DadosXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
