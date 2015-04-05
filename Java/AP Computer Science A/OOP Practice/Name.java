public class Name{
    private String fName;
    private String lName;
    private String mName;
    public Name(){
       this.fName = null;
       this.lName = null;
       this.mName = null;
    }
    public Name(String newFirstName, String newMiddleInitial, String newLastName){
       this.fName = newFirstName;
       this.lName = newLastName;
       this.mName = newMiddleInitial;
    }
    public Name(String newFirstName, String newLastName){
       this.fName = newFirstName;
       this.lName = newLastName;
    }
    public void setName(String newFirstName, String newMiddleInitial, String newLastName){
       this.fName = newFirstName;
       this.lName = newLastName;
       this.mName = newMiddleInitial;
    }
    public void setName(String newFirstName, String newLastName){
       this.fName = newFirstName;
       this.lName = newLastName;
    }
    public String toString(){
        if (this.mName == null){
            return (this.fName + " " + this.lName);
        }else {
            return (this.fName + " " + this.mName.charAt(0) + ". " + this.lName);
        }
    }
}