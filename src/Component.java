import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    public Component(String name){
        this.name = name;
        this.parent = null;
        this.hierarchy = 1;
        this.number = 0;


    }

    protected String name;
    protected Component parent;
    protected List<Component> parents = new ArrayList<>();// lista z rodzicami których wykorzystam przy pisaniu tych numerków wypisując numbery od tyłu
    protected int hierarchy;
    protected int number;
    abstract public void print(int position);
}
