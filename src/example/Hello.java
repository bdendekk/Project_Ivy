
package example;

import org.apache.commons.lang.WordUtils;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
        
        //parcours
	for (int i=0; i<myEntries.size(); i++){
		System.out.println("Nombre lu : "+i);
		if(myEntries.get(i) > monmax){
			monmax = myEntries.get(i);
		}
	System.out.println("le maximum est : "+monmax);
	}

    }
}
        
