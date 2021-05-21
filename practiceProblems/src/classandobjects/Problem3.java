package classandobjects;


class Patient{
    String name;
    double height,weight;
    Patient(double w,double h)
    {
        weight=w;
        height=h;
    }
    double BMI()
    {
       
       return ((weight/(height*height))*703);
    }
}
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient(75,156);
		  System.out.println("The BMI:"+p.BMI());
		

	}

}
