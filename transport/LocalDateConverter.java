package transport;
import java.time.LocalDate;
import org.simpleframework.xml.convert.*;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import java.time.format.DateTimeFormatter;

public class LocalDateConverter implements Converter<LocalDate> {

	@Override
	public LocalDate read(InputNode arg0) throws Exception {
		   String name = arg0.getValue();
		   return LocalDate.parse(name, DateTimeFormatter.ISO_DATE);
	}

	@Override
	public void write(OutputNode arg0, LocalDate arg1) throws Exception {
		 String value = arg1.format(DateTimeFormatter.ISO_DATE);
		 arg0.setValue(value);
		
	}



	}


