public class TestEnum {

    Day day ;

    public TestEnum(Day day)
    {
        this.day=day;

    }
    public void tellAboutDay(){
        switch (day){
            case WED:
                System.out.println("Good day");
                break;
            case FRIDAY:
                System.out.println("Very good day@@");
                break;
            case SUNDAY:
                System.out.println("Weekends!!!!");
                break;
            case SATURDAY:
                System.out.println("Weekends!!!");
                break;

        }
        }

    public static void main(String[] args) {
        TestEnum firstDay = new TestEnum(Day.SATURDAY);
        firstDay.tellAboutDay();
    }
}
//    All enums implicitly extend java.lang.Enum.
// Because a class can only extend one parent (see Declaring Classes),
// the Java language does not support multiple inheritance of state
// (see Multiple Inheritance of State, Implementation, and Type),
// and therefore an enum cannot extend anything else.

