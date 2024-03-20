package es.iesjandula.coches.xmlhelloworld;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParserXmlHomes2 
{

	public static void main(String[] args) 
	{
		
		DocumentBuilderFactory documentBuilderFactory= DocumentBuilderFactory.newInstance();
		
		try 
		{
			
			DocumentBuilder documentBuilder= documentBuilderFactory.newDocumentBuilder();
			Document document= documentBuilder.parse(new File("homes.xml"));
			Element rootElement= document.getDocumentElement();
			NodeList nodeListHome = rootElement.getElementsByTagName("casa");
			
			for(int i=0; i<nodeListHome.getLength();i++) 
			{
			
			Element nodeHome= (Element) nodeListHome.item(i);
			String ciudad= nodeHome.getAttribute("ciudad");
			String tipo= nodeHome.getAttribute("tipo");
			int metrosCuadrados= Integer.valueOf(nodeHome.getAttribute("metrosCuadrados"));
			int plantas= Integer.valueOf(nodeHome.getAttribute("plantas"));
			int habitaciones= Integer.valueOf(nodeHome.getAttribute("habitaciones"));
			boolean zonasComunes= Boolean.valueOf(nodeHome.getAttribute("zonasComunes"));
			
			System.out.println("Ciudad: " + ciudad +", tipo: " + tipo
					+", metrosCuadrados: " + metrosCuadrados +", plantas: " + plantas
					+", hanitaciones: " + habitaciones +", zonasComunes: " + zonasComunes);
			
			}
		} catch(ParserConfigurationException xmlException) 
		{
			xmlException.printStackTrace();
		}
		catch(SAXException xmlException) 
		{
			xmlException.printStackTrace();
		}
		catch(IOException xmlException) 
		{
			xmlException.printStackTrace();
		}
		
		
	}

}
