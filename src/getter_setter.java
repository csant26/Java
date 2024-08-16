public class getter_setter {
    public static void main(String[] args) throws Exception{
        Data d = new Data();
        d.setName("Csant");
        System.out.println(d.getName());
    }
}
class Data{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
