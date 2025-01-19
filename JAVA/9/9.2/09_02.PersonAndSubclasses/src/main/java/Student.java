public class Student extends Person {

     private int studyCredits;

    public Student(String fullname, String address){
        super(fullname,address);

    }

    public void study(){
        studyCredits++;
    }
    public int credits(){
        return studyCredits;
    }

    @Override
    public String toString() {

        return super.toString() + "\n  Study credits" + studyCredits;

    }
}
