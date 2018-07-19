package structural.adapter;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void adapterTest(){
        LegacyUnmodifiableClass legacyUnmodifiableClass = new LegacyUnmodifiableClass("1234", "thename");
        MatchedClass matchedClass = new MatchedClass(1234, "thename");
        AdapterOfLegacyUnmodifiableClass adapterOfLegacyUnmodifiableClass = new AdapterOfLegacyUnmodifiableClass(legacyUnmodifiableClass);

        IntefaceToMatch matched = matchedClass,
                        adapted = adapterOfLegacyUnmodifiableClass;

        assertEquals(matched.getId(), adapted.getId());
        assertEquals(matched.getName(), adapted.getName());
    }

}