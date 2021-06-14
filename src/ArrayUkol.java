import java.util.ArrayList;
import java.util.Collection;

public class ArrayUkol implements Ukoly{
	Ukol[] ukoly = new Ukol[0];
	
	public void  pridatUkol(Ukol ukol){
		Ukol[] toRewrite = new Ukol[ukoly.length + 1];
		for (int i = 0; i < ukoly.length; i++) {
			toRewrite[i] = ukoly[i];
		}
		toRewrite[toRewrite.length - 1] = ukol;
		ukoly = toRewrite;
		
	}
	
	public Collection najdiUkol(String nazev) {
		ArrayList<Ukol> toReturn = new ArrayList<Ukol>();
		for (int i = 0; i < ukoly.length; i++) {
			if (ukoly[i].getUkol().toLowerCase().equals(nazev.toLowerCase())) {
				 toReturn.add(ukoly[i]);
			}
		}
		
		
		return toReturn;
	}
	
	
	
}
