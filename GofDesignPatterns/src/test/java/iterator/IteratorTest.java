package iterator;

import behavioral.iterator.Microsoft;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;


import java.util.Iterator;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class IteratorTest {
    Microsoft ms = null;




    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        ms = new Microsoft();
    }

    @Test
    public void iteratorDoesIterate() {

        String[] arr = {"Windows 98", "Windows 2000", "Windows Me", "Windows 7"};

        int i = 0;

        while(i < arr.length) {
            ms.add(new Microsoft().setName(arr[i]));
            i++;
        }

        int k = 0;
        Iterator<Microsoft> iter = ms.iterator();
        while(iter.hasNext()) {
            Microsoft product = iter.next();
            String productName = product.getName();
            assertEquals(arr[k], productName);
            k++;
        }
    }
}
