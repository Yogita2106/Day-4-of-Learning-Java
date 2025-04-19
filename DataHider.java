public class DataHider {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        DataHider obj = new DataHider();
        obj.setName("Yogita");
        obj.setName("Yashika");
        System.out.println(obj.getName());
        
    }
}
