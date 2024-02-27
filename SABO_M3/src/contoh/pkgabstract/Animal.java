package contoh.pkgabstract;

public abstract class Animal {
    private String color;
    private int leg;
    
    public String getColor(){
        return color;
    }
    public int getLeg(){
    return leg;
}
    public void setColor(String color){
        this.color = color;
    }
    public void setLeg(int leg){
        this.leg= leg;
    }
public abstract void walk();
public abstract void sound();
}

