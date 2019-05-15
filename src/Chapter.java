import java.util.ArrayList;

public class Chapter extends Component
{

    public Chapter(String nazwa){
        super(nazwa);

    }

    ArrayList<Component> list = new ArrayList();



    public String numerRozdzialu(){

        return "xd";
    }

    @Override
    public void print(int position) {
        System.out.println(name);
        int number = 1;
        for(Component el : list){
            for(int i = 0; i<(hierarchy-1);i++){
                System.out.print("   "); // dodanie liczby wcięć zależnej od numeru w hierarchii
            }
            for(Component par : parents){
                if(par.parents.size()>0) System.out.print(par.number +"."); //tutaj dam kiedyś iterator by pominąc numer książki
            }
            System.out.print(this.number+".");
            System.out.print( number + " ");
            el.print(number);
            number++;
        }

    }

    public void add(Component komponent){
        list.add(komponent); // dodaje do listy rodział
    //    komponent.parent = this; // wpisuje siebie jako rodzica
        komponent.parents.add(this); // dodaje siebie do listy rodziców
        komponent.parents.addAll(this.parents); // dodaje swoich rodziców do listy rodziców

        komponent.hierarchy = this.hierarchy +1;
        komponent.number = list.size();
     //   System.out.println("mam numerek " + komponent.number);

    }

}
