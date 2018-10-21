package arnia.springboot;

import arnia.springboot.persistence.domain.Customer;
import arnia.springboot.persistence.repositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    /*
        Integration tests
     */

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void givenCustomerRepository_whenSaveAndRetreiveEntity_thenOK() {
        Customer customer = customerRepository
                .save(new Customer("Jack", "Bauer"));
        Customer foundEntity = customerRepository
                .findByLastName(customer.getLastName()).stream().findFirst().orElseThrow(EntityNotFoundException::new);

        assertNotNull(foundEntity);
        assertEquals(customer.getLastName(), foundEntity.getLastName());
    }
}
