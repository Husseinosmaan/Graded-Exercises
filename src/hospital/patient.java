package hospital;
public class patient {
    String name;
    double consultation_fee;

    //constructure
    patient() {
        name = "leyla";
        consultation_fee = 400;

    }

    //display
    void Display() {
        System.out.println("name:" + name);
        System.out.println("consultation fee" + consultation_fee);


    }


    public static void main(String[] args) {

        inpatient p1 = new inpatient();
        p1.addmission_day = "monday";
        p1.room_charge_fee = 600;
        p1.inpadisplay();
        outpatient p2 = new outpatient();
        p2.lab_fee = 100;
        p2.outdisplay();


    }
}
class inpatient extends patient{
    String addmission_day;
    int room_charge_fee;

    void inpadisplay(){
        Display();
        System.out.println("addmission day" +addmission_day);
        System.out.println("room charge fee" + room_charge_fee);

    }

}

class outpatient extends patient{
    int lab_fee;

    void outdisplay(){
        Display();
        System.out.println("lab fee" + lab_fee);
    }


}