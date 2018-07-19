package structural.adapter;

public class AdapterOfLegacyUnmodifiableClass implements IntefaceToMatch {
    // Use this class to interact to any legacy class.
    // The upper object won't know about the legacy class (we cannot change it), just about this one.

    private LegacyUnmodifiableClass legacyUnmodifiableClass;

    public AdapterOfLegacyUnmodifiableClass(LegacyUnmodifiableClass legacyUnmodifiableClass) {
        this.legacyUnmodifiableClass = legacyUnmodifiableClass;
    }

    @Override
    public Integer getId() {
        return Integer.parseInt(legacyUnmodifiableClass.getIdentificator()); // Now the Identificator is the id and must be integer.
    }

    @Override
    public String getName() {
        return legacyUnmodifiableClass.getSurname();    //Now the surname is the getName
    }
}
