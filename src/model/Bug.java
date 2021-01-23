package model;

public class Bug {

    private String description;
    private String email;
    private int priority;
    private boolean isOpen;

    public Bug(String description, String email, int priority){
        this.description = description;
        this.email = email;
        this.priority = priority;
        this.isOpen = true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("Description is too short");
        } else {
            this.description = description;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Email format is incorrect");
        } else {
            this.email = email;
        }
    }

    public void setPriority(int priority) {
        if (priority < 1 || priority > 5) {
            System.out.println("Wrong priority");
        } else {
            this.priority = priority;
        }

    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void allDetails(){
        System.out.println("Bug details: " + description + " Email: " + email + " Priority: " + priority
                + " model.Bug status: " + isOpen);
    }


    public void showEmail(String email){
        System.out.println("Email: " + email);
    }

    public void showStatus(){
        if (isOpen){
            System.out.println("Bug status: Open");
        }
        else{
            System.out.println("Bug status: Closed");
        }
    }

    public String getBugPriority(){

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
                System.out.println("No such priority");
                break;

        } return bugPriority;
    }
}
