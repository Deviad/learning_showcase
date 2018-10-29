package iterator;

import behavioral.iterator.Microsoft;
import behavioral.iterator.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class IteratorTest {
    Microsoft ms = null;

    @Before
    public void setUp() {
        ms = new Microsoft();
    }

    @Test
    public void iteratorDoesIterate() {

        String[] arr = {"Windows 98", "Windows 2000", "Windows Me", "Windows 7"};

        int i = 0;

        while(i < arr.length) {
            ms.add(spy(Product.class).setName(arr[i]));
            i++;
        }

        int k = 0;
        Iterator<Product> iter = ms.iterator();
        while(iter.hasNext()) {
            Product product = iter.next();
            String productName = product.getName();
            assertEquals(arr[k], productName);
            k++;
        }
    }
}
