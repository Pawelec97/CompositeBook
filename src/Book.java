import java.util.ArrayList;

public class Book extends Component {
    public Book(String name){
        super(name);
    }
    protected ArrayList<Component> spis = new ArrayList();

  /*  public void add(Component komponent){

        spis.add(komponent);

    }*/
  public void add(Component komponent){
      spis.add(komponent); // dodaje do listy rodział
      komponent.parent = this; // wpisuje siebie jako rodzica
      komponent.parents.add(this); // dodaje siebie do listy rodziców
      komponent.parents.addAll(this.parents); // dodaje swoich rodziców do listy rodziców

      komponent.hierarchy = this.hierarchy +1;
      komponent.number = spis.size();
      //   System.out.println("mam numerek " + komponent.number);

  }

    public void print(int number){


        System.out.println(name);

        for(Component e : spis){
            System.out.print(number+ ". ");
            e.print(number);
            number++;
        }
    }
}
