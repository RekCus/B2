public class Parent extends Person {
    private String name;

    private String child;

    private int id;

    public void setName(String name){
        this.name=name;
    }

    public void setChild(String child){
        this.child=child;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){

        return this.name;
    }

    public String child() {
        return this.child;
    }

    public int getId(){
        return this.id;
    }
}
