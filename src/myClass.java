public class myClass {
    public static void main(String[] args) {

shouldWakeUp(true,23);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

            if(hourOfDay <0 || hourOfDay > 23) {
                return false;
            } else if((hourOfDay < 8 || hourOfDay > 22) && (barking)){
                return true;
            } else {
                return false;
            }




}
}
