package Office;

public class Employee {
    private Long id;
    private String name;
    private static String address = "Palembang";
    
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
}
