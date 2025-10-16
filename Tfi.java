class Ramoji{
   String setName;
    String director;
    String heroName;

    void display(String setName,String director,String heroName) {
        this.setName = setName;
        this.director = director;
        this.heroName = heroName;
        System.out.println(setName + " " + director + " " + heroName);
    }

}
class Annapurna extends Ramoji {
    String heroineName;
    void display(String setName,String director,String heroName,String heroineName){
        this.setName = setName;
        this.director = director;
        this.heroName = heroName;
        this.heroineName = heroineName;
        System.out.println(setName + " " + director + " " + heroName + " " + heroineName);
    }
}



public class Tfi{
    public static void main (String args[]){
        Ramoji set1 = new Ramoji();
        Annapurna set2 = new Annapurna();
        set1.display("Bahubaliset","Rajamouli","Prabhas");
        set2.display("Kanappa","Manoj","Vishnu","Aiswarya");
    }
}