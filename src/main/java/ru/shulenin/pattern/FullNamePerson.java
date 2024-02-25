package ru.shulenin.pattern;

public class FullNamePerson implements FullNameGetter{
    private SplitedNamePerson person;

    public FullNamePerson(SplitedNamePerson person) {
        this.person = person;
    }

    public SplitedNamePerson getPerson() {
        return person;
    }

    public void setPerson(SplitedNamePerson person) {
        this.person = person;
    }

    @Override
    public String getFullName() {
        return person.getFirstname().concat(" " + person.getLastname());
    }
}
