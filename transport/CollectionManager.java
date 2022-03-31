package transport;


import java.util.HashMap;
import java.io.File;
import java.time.LocalDate;


public class CollectionManager {

	private LocalDate creationDate = LocalDate.now();

	HashMap<String, Vehicle> collection = new HashMap<>();
	
    private boolean hasUnsavedChanges = false;

    public CollectionManager() {
        creationDate = LocalDate.now();
    }

    private static CollectionManager instance;

    public static CollectionManager getInstance() {
        if (instance == null) {
            instance = new CollectionManager();
        }
        return instance;
    }
    public HashMap<String, Vehicle> getCollection() {
    	return collection;
    }


    public void add(String key, Vehicle vehicle) {
        collection.put(key, vehicle);
    }
    public void clear() {
        collection.clear();
    }

    public int size() {
        return collection.size();
    }

    public void removeByKey(String key) {
        collection.remove(key);
    }

   
    public boolean keyFree(String key) {
    	return collection.containsKey(key);
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Class<?> getCollectionClass() {
        return collection.getClass();
    }

    public String info() {
    	return("Информация о коллекции:\n "
				+ "Тип хранимых элементов: \n " + this.getCollectionClass()
				+ "\n Количество элементов: "+ this.size() 
				+ "\n Дата инициализации: "+ this.getCreationDate());
	}
    

    public void showCollection() {
    	System.out.println("Информация об элементах коллекции:");
        this.collection.forEach((k,v) -> System.out.println(k + " " + v));
    }
 
    public void setDate(LocalDate date) {
    	this.creationDate = date;
    }
    public static void setInstance(CollectionManager collection) {
    	instance = collection;
    }

}

