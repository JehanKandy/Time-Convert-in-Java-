import java.util.Scanner; 
class time{
    public static void main(String[] args) {
        Scanner checkTime = new Scanner(System.in);

        System.out.println("Enter Time IN Seconds : ");
        int secoundGet = checkTime.nextInt();

        //for close the checkTime 
        checkTime.close();

        //get time in minutes
        int timeinMin = secoundGet / 60;

        //get the remaining minutes mod secoundGet by 60
        int haltingSec = secoundGet % 60;

        //get the time in hours devide minutes by 60
        int timeinHours = timeinMin / 60;

        //now get the remaining minutes mod minutes by 60
        int haltingMin = timeinMin % 60;

        //now get the output
        System.out.println("The Entered Time : " + timeinHours + " Hours " + haltingMin +" Minutes and " + haltingSec +" Seconds.");
    }
}