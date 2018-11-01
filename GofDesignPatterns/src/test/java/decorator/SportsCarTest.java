package decorator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import structural.decorator.Car;
import structural.decorator.CarDecorator;
import structural.decorator.SportsCar;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.powermock.api.support.membermodification.MemberMatcher.method;
import static org.powermock.api.support.membermodification.MemberModifier.stub;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CarDecorator.class)
public class SportsCarTest {

    @Test
    public void SportsCarTurnOn() {
//        PowerMockito.suppress(PowerMockito.methodsDeclaredIn(CarDecorator.class));
//        PowerMockito
//                .replace(method(CarDecorator.class, "turnOn"))
//                .with(method(SportsCarTest.class, "getString"));
        Car car = spy(new Car());
        SportsCar sc = spy(new SportsCar(car));
        stub(method(CarDecorator.class, "turnOn")).toReturn("Vroom, ");
        assertEquals("Vroom, It goes fast!", sc.turnOn());
        verify(sc).turnOn();
        verify(car).turnOn();
    }
}
