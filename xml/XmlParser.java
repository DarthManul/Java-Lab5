package xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import transport.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.time.LocalDate;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;

public class XmlParser {
	public static void getData() {
		SAXParserFactory factory = SAXParserFactory.newInstance(); 
		SAXParser parser;
		try {
			parser = factory.newSAXParser();

        XMLReader xmlReader = parser.getXMLReader();

        XMLHandler handler = new XMLHandler();
        xmlReader.setContentHandler(handler);
        xmlReader.parse("test1.xml");
		} catch (ParserConfigurationException | IOException| SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

    private static class XMLHandler extends DefaultHandler {
        private String lastElementName, key;
        private Vehicle vehicle;
        private Coordinates coordinates;
        private CollectionManager collection = CollectionManager.getInstance();
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
            if (lastElementName.equals("VehicleCollection")) {
            	collection.setDate(LocalDate.parse(attributes.getValue("creationDate")));
            }
            if (lastElementName.equals("Vehicle")) {
            	key = attributes.getValue("key");
            	vehicle = new Vehicle();
            }
            if (lastElementName.equals("Coordinates")) {
            	coordinates = new Coordinates();
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String text = new String(ch, start, length);
            
            if (text.contains("<") || lastElementName == null || text.contains("\t") ||text.contains("\n")) {
                return;
            }

            switch (lastElementName) {
            case "id":
            	long id = Long.parseLong(text);
            	vehicle.setID(id);

            case "name":
            	vehicle.setName(text);
            	break;
            case "x":
            	long x = Long.valueOf(text).longValue();
            	coordinates.setX(x);
            	break;
            case "y":
            	coordinates.setY(Long.valueOf(text));
            	break;
            case "creationDate":
            	vehicle.setCreationDate(LocalDate.parse(text));
            	break;
            case "enginePower":
            	vehicle.setEnginePower(Double.valueOf(text).doubleValue());
            	break;
            case "type":
            	vehicle.setType(VehicleType.setEnum(text));
            	break;
            case "fuelType":
            	vehicle.setFuelType(FuelType.setEnum(text));
            	break;
            }
        }

        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (vehicle.getFuelType() != null) {
                vehicle.setCoordinates(coordinates);
                collection.add(key, vehicle);
                
            }
        }
        public void endDocument() { 
          CollectionManager.setInstance(collection);
        } 
    }
}