import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest ("Sandy", 20);

    }

    @Test
    public void hasGotName(){
        assertEquals("Sandy", guest.getName());
    }

    @Test
    public void hasGotAge(){
        assertEquals(20, guest.getAge());
    }
}
