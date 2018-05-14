import java.util.*;

class ComparadorDeStrings implements  Comparator<String>{
	public int compare(String s1, String s2){
		/*if(s1.compareTo(s2)<0){
			return 1;
		}else if (s1.compareTo(s2)>0){
			return -1;
		}else{
			return 0;
		}*/
		// o tambien
		
		return s2.compareTo(s1);
	}//compare
}//ComparadorDeStrings
