import java.util.ArrayList;
import java.util.List;

public class Alphabet{

    private List<Symbol> symbols = new ArrayList<>();

    public void addSymbol(Symbol s){
        symbols.add(s);
    }

    public void removeSymbol (Symbol s){
        symbols.remove(s);
    }
}
