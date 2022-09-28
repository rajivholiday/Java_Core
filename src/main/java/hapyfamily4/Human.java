package hapyfamily4;


import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private int iq;
    private String[][] schedule;
    Family family;

    public Human() {
    }

    public Human(String name, String surname, int birthYear, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int birthYear) {

        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println("hi");
    }



    public String toString() {
        return String.format("Human" +
                        "{name = %s, surname = %s, year = %d, iq = %d, schedule = %s}", name, surname, birthYear, iq,
                Arrays.deepToString(schedule));
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Human objects got deleted");
    }
}