public class MainApp {

    public static void main(String[] args) {

        Bug bug1 = new Bug("Username is not displayed", "newmember@java.com", 4);

        bug1.allDetails();

        Bug bug2 = new Bug("Cannot load parameters", "user@java.com", 3);

        bug2.showEmail(bug2.email);
        bug2.showStatus();
        String priority = bug2.getPriority();
        System.out.println(priority);
    }


}
