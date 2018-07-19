package structural.adapter;

public class LegacyUnmodifiableClass {
    private String identificator;
    private String surname;

    public LegacyUnmodifiableClass(String identificator, String surname) {
        this.identificator = identificator;
        this.surname = surname;
    }

    public String getIdentificator() {
        return identificator;
    }

    public void setIdentificator(String identificator) {
        this.identificator = identificator;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
