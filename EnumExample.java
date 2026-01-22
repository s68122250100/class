enum Day {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

}

public class EnumExample {

    public static void main(String[] args) {

        Day today = Day.MONDAY;

        switch (today) {

            case MONDAY:

                System.out.println("It's Monday!");

                break;

            case FRIDAY:

                System.out.println("It's Friday!");

                break;

            default:

                System.out.println("It's some other day.");

        }

    }

}