package receipebook;

public class uploads {
    int uploadid;
    String receipename;
    String description;

    uploads(int uploadid,String receipename,String description){
        this.uploadid=uploadid;
        this.receipename=receipename;
        this.description=description;
    }

    public int getid(){
        return uploadid;
    }
    public String getreceipename(){
        return receipename;
    }
    public String getdescription(){
        return description;
    }
    public void displayRecipeCard() {
        System.out.println("\nRecipe: " + receipename);
        System.out.println("Description: " + description);
        System.out.println("Uploaded by User ID: " + uploadid);
    }

}
