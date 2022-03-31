package xml;

import java.time.LocalDate;

import transport.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.lang.StringBuilder;

public class XMLwriter {
	
	private CollectionManager collection;
	public XMLwriter() {
		collection = CollectionManager.getInstance();
	}
	public void write() {
		StringBuilder str = new StringBuilder("<VehicleCollection creationDate=\""+collection.getCreationDate()+"\">\n");
		collection.getCollection().forEach((k,v)-> str.append("\t<Vehicle key=\""+k+"\">\n\t\t"+
		"<id>"+v.getID()+"</id>\n\t\t<name>"+v.getName()+"</name>\n\t\t<Coordinates>\n\t\t\t<x>"+v.getCoordinates().getX()+
		"</x>\n\t\t\t<y>"+v.getCoordinates().getY()+"</y>\n\t\t</Coordinates>\n\t\t<creationDate>"+v.getCreationDate()+"</creationDate>\n\t\t<enginePower>"+
		v.getEnginePower()+"</enginePower>\n\t\t<type>"+v.getType()+"</type>\n\t\t<fuelType>"+v.getFuelType()+"</fuelType>\n\t</Vehicle>\n"));
		str.append("</VehicleCollection>");
		System.out.println(str.toString());
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("test1.xml"));
			writer.write(str.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
