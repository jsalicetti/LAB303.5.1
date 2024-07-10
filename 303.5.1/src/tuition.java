public class tuition {
    public static void main(String[] args) {
        double startTuition = 10000;
        double percent = 1.07;
        double currentTuition = startTuition;
        int year = 1;
        while(currentTuition < startTuition *2){
            currentTuition *= percent;
            year++;
        }

        System.out.println("The tuition will double in "+ year + " years" );
    }
}