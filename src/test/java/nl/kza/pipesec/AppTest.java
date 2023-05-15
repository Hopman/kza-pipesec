package nl.kza.pipesec;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void shouldBeSecure()
    {
        assertTrue( true );
    }

    @Test
    public void areWeSecure()
    {
        assertEquals( "INSECURE", "KZA" );
    }
}
