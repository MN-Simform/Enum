public enum Day {

    MONDAY(10),
    TUESDAY(20),
    WEDNESDAY(30),
    THURSDAY(40),
    FRIDAY(50),
    SATURDAY(60),
    SUNDAY(70);

    private int val;
    Day(int val){
        this.val = val;
    }
    public int getVal() {
        return val;
    }
}
