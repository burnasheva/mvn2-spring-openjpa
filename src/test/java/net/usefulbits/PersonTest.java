package net.usefulbits;

import org.junit.Ignore;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

    @Test
    public void simpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäß() {
        try{
            Thread.sleep(10000);
        } catch (InterruptedException ie){

        }

        System.out.println("abcdefghijk");
        System.err.println("abcdefghijk");

        System.out.println("http://user:abcdefghijk@jetbrains.com");
        System.err.println("http://user:abcdefghijk@jetbrains.com");

        assertEquals(2, 2);

        assertEquals("Name not saved correctly", "David", "David");
        assertEquals("Age not saved correctly 123456", 22, 22);
    }

    @Test
    @Ignore("http://user:123456@jetbrains.com")
    public void simpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßdfdfdf() {

        assertEquals("David", "David");
        assertEquals(28, 29);
    }

    @Test
    @Ignore("abcdefghijk")
    public void simpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßsimpleTestWithAttachmentsÜÖäßTest() {

        assertEquals("Deleting person failed.", 0, 1);
    }
}
