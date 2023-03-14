public class Main {
    public static void main(String[] args) {
//        Approach 1 :
        Day[] arrOfDays = Day.values();
        for(Day arr : arrOfDays){
            System.out.println(arr.ordinal() + " " + arr);
        }
        System.out.println();
//        Approach 2 :
        for(Day day : Day.values()){
            System.out.println(day.getVal() + " " +  day);
        }
    }
}