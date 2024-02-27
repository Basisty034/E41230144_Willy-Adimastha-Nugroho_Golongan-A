package contoh.pkgabstract;

public class bird extends Animal{
    public bird(String color, int leg){
        setColor(color);
        setLeg(leg);
        System.out.println("Color : " + getColor());
        System.out.println("Leg : " + getLeg());
    }
    public void walk(){
        System.out.println("Bird have 2 legs");
    }
    public void sound(){
        System.out.println("ciit ciit");
    }
}
