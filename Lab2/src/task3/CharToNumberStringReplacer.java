package task3;

public class CharToNumberStringReplacer implements StringReplacer{
	
	private String originString;
	private String russianAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
	
	public CharToNumberStringReplacer(String str){
		originString = str.toLowerCase();
	}
	
	public String getFormattedOriginString(){
		Iterator it = getIterator();
		String res = "";
		while(it.hasNext()){
			res += it.next()+"  ";
		}
		return res;
	}
	
	public String getFormattedReplacedString(){
		Iterator it = getIterator();
		String res = "";
		while(it.hasNext()){
			char ch = (Character)it.next();
			int pos =getRussianSymbolAlphabetPosition(ch); 
			if(pos>0)
				res += pos+((pos<10)?"  ":" ");
			else 
				res+= ch+"  ";
		}
		return res;
	}
	
	public int getRussianSymbolAlphabetPosition(char ch){
		return russianAlphabet.indexOf(ch)+1;
	}

	@Override
	public Iterator getIterator() {
		return new CharIterator(originString);
	}
}
