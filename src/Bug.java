public class Bug {

    String description;
    String email;
    int priority;
    boolean isOpen;

    Bug(String description, String email, int priority){
        this.description = description;
        this.email = email;
        this.priority = priority;
        this.isOpen = getStatusOpen();
    }

    void allDetails(){
        System.out.println("Bug details: " + description + " Email: " + email + " Priority: " + priority
                + " Bug status: " + isOpen);
    }

    boolean getStatusOpen(){
        return true;
    }

    void showEmail(String email){
        System.out.println("Email: " + email);
    }

    void showStatus(){
        if (isOpen){
            System.out.println("Bug status: Open");
        }
        else{
            System.out.println("Bug status: Closed");
        }
    }

    String getPriority(){

        String bugPriority = "";

        switch (priority){
            case 1:
                bugPriority = "Bug priority: Major";
                break;
            case 2:
                bugPriority = "Bug priority: High";
                break;
            case 3:
                bugPriority = "Bug priority: Moderate";
                break;
            case 4:
                bugPriority = "Bug priority: Low";
                break;
            case 5:
                bugPriority = "Bug priority: Minor";
            default:
                break;

        } return bugPriority;
    }
}