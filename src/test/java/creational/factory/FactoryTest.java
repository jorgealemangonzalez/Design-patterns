package creational.factory;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void factoryTest() {
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        assertEquals(website.pages.get(0).getClass(),ContactPage.class);
        assertEquals(website.pages.get(1).getClass(),CommentPage.class);
    }
}