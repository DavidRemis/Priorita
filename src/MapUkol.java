import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;



public class MapUkol implements Ukoly{
	int id = 0;
	HashMap<Integer, Ukol> ukoly = new HashMap<Integer, Ukol>();
	
	public void  pridatUkol(Ukol ukol){
		ukoly.put(id, ukol);
		id++;
	}
	
	public Collection najdiUkol(String nazev) {
		ArrayList<Ukol> toReturn = new ArrayList<Ukol>();
		for (int i = 0; i < id; i++) {
			if (ukoly.get(i).getUkol().toLowerCase().equals(nazev.toLowerCase())) {
				toReturn.add(ukoly.get(i));
			}
		}
		return toReturn;
	}
}
