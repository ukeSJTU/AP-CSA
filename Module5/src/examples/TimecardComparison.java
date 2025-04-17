package examples;

public class TimecardComparison {
    private String firstname;
    private String lastname;
    private int date;
    private String id;

    public TimecardComparison(String firstname, String lastname, int date, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
        this.id = id;
    }

    public boolean equals(TimecardComparison t) {
        return (t.date == date && t.id.equals(id));
    }

    public static void main(String[] args) {
        // declare and instantiate
        TimecardComparison timecardSearch = new TimecardComparison("Jennifer", "Smith", 11032020, "jSmith");
        TimecardComparison timecard1 = new TimecardComparison("Jennie", "Jones", 1102020, "jJones");
        TimecardComparison timecard2 = new TimecardComparison("Jennifer", "Tompkins", 11022020, "jTompkins");
        TimecardComparison timecard3 = new TimecardComparison("Jen", "Smith", 11032020, "jSmith");
        TimecardComparison timecard4 = new TimecardComparison("Jennifer", "Smith", 11022020, "jSmith");
        TimecardComparison timecard5 = new TimecardComparison("Jennifer", "Smith", 11032020, "jSmithy");
        System.out.println(timecardSearch.equals(timecard1));
        System.out.println(timecardSearch.equals(timecard2));
        System.out.println(timecardSearch.equals(timecard3));
        System.out.println(timecardSearch.equals(timecard4));
        System.out.println(timecardSearch.equals(timecard5));
    }
}
