import java.util.ArrayList;
import java.util.Collection;

public class ListUkol implements Ukoly{

	ArrayList<Ukol> ukoly = new ArrayList<Ukol>();
	
	public void  pridatUkol(Ukol ukol){
		ukoly.add(ukol);	
	}
	
	public Collection najdiUkol(String nazev) {
		ArrayList<Ukol> toReturn = new ArrayList<Ukol>();
		for (int i = 0; i < ukoly.size(); i++) {
			if (ukoly.get(i).getUkol().toLowerCase().equals(nazev.toLowerCase())) {
				 toReturn.add(ukoly.get(i));
			}
		}
		
		
		return toReturn;
	}
}
