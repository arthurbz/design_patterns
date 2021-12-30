package proxy;

public class Proxy {

    public static void main(String[] args) {
        College college = new CollegeProxy("Wrong");
        System.out.println("Incorrect Login");
        System.out.println(college.getCollegeName());
        System.out.println(college.getCourseName());
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        college = new CollegeProxy("OK");
        System.out.println("Correct Login");
        System.out.println(college.getCollegeName());
        System.out.println(college.getCourseName());
    }

}
