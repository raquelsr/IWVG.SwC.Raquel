package iwvg.swc.raquel.operaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    
    User u;
    
    @Before
    public void before() {
       u = new User(1,"Raquel","Serrano", 18);
    }

    @Test
    public void testUser() {
      assertEquals(1, u.getNumber());
      assertEquals("Raquel", u.getName());
      assertEquals("Serrano" , u.getFamilyName());
      assertEquals(18 , u.getEdad());
    }

    @Test
    public void testGetEdad() {
        assertEquals(18 , u.getEdad());
    }
    
    @Test
    public void testFullName() {
       assertEquals("Raquel Serrano", u.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("R." , u.initials());
    }

    @Test
    public void testGetNumber() {
        assertEquals(1, u.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals("Raquel", u.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Serrano", u.getFamilyName());
    }

}
