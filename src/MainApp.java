import model.Bug;

public class MainApp {

    public static void main(String[] args) {

        Bug bug = new Bug("Cannot load parameters", "user@java.com", 3);

        bug.setEmail("sdfgs");
        System.out.println(bug.getEmail());
        bug.setEmail("nowy@mail.pl");
        System.out.println(bug.getEmail());

        bug.setPriority(6);
        System.out.println(bug.getBugPriority());
        bug.setPriority(1);
        System.out.println(bug.getBugPriority());

        bug.setDescription("sadf");
        System.out.println(bug.getDescription());
        bug.setDescription("This is a completely new description");
        System.out.println(bug.getDescription());
    }


}
