package XML;
import Transport.*;
import java.io.File;
import org.simpleframework.xml.*;
import org.simpleframework.xml.core.Persister;

public class XMLparser {
	public static void toXML() throws Exception  {
		CollectionXML col = new CollectionXML(VehicleCollection.creationDate);
		VehicleCollection.collection.forEach((k,v) -> col.add(k, new VehicleXML(v)));
		Serializer serializer = new Persister();
		File out = new File("test.xml");
		serializer.write(col, out);
	}
	public static VehicleCollection fromXML(String path) {
		
		return new VehicleCollection();
	}
}
