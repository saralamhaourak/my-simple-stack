package deqo.slam.mysimplestack.simplestack;

import java.lang.reflect.Array;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;



/*repondre à lexigence 1*/
/* modification dans brache mysimplestack1 */

public class SimpleStackImpl implements SimpleStack {

    Stack<Object> oj=new Stack<Object>();

    @Overrides
    public boolean isEmpty() {
        return oj.isEmpty();
    }

    @Override
    public int getSize() {
        return oj.size();
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item)oj.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item)oj.pop();
    }

    @Override
    public void push(Item item) {
        return oj.push(item);
    }

}
