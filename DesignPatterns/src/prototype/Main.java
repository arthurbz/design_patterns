package prototype;

//import java.io.BufferedReader;  
import java.io.IOException;  
//import java.io.InputStreamReader;  
  
class PrototypeDemo{  
     public static void main(String[] args) throws IOException {  
          
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        //System.out.print("Enter Employee Id: ");  
        int eid = 123; //Integer.parseInt(br.readLine());  
        System.out.print("\n");  
          
        //System.out.print("Enter Employee Name: ");  
        String ename = "Elliot"; //br.readLine();  
        System.out.print("\n");  
          
        //System.out.print("Enter Employee Designation: ");  
        String edesignation = "Security team"; //br.readLine();  
        System.out.print("\n");  
          
        //System.out.print("Enter Employee Address: ");  
        String eaddress = "Church Ave, Brookly, NY 11226"; //br.readLine();  
        System.out.print("\n");  
          
        //System.out.print("Enter Employee Salary: ");  
        double esalary = 999999.99; //Double.parseDouble(br.readLine());  
        System.out.print("\n");  
           
        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);  
          
        e1.showRecord();  
        System.out.println("\n");  
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();  
        e2.showRecord();  
    }     
}