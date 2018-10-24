package deqo.slam.mysimplestack.simplestacktest;

import deqo.slam.mysimplestack.simplestack.Item;
import deqo.slam.mysimplestack.simplestack.SimpleStack;
import deqo.slam.mysimplestack.simplestack.SimpleStackImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

public class ItemTest {

    @Before
    public void setup() {
        SimpleStack s0=new SimpleStackImpl();
        SimpleStack s1=new SimpleStackImpl();
        SimpleStack s2=new SimpleStackImpl();
    }

    @Test
    public void emptyTest(){
        Assert.assertEquals(true,s0.isEmpty());
    }

    @Test
    public int getSize() {
        Assert.assertNotNull(s0.getSize());
    }

    @Test
    public Item peek() throws EmptyStackException {

    }

    @Test
    public Item pop() throws EmptyStackException {
        ;
    }

    @Test
    public void push(Item item) {
        ;
    }
}
