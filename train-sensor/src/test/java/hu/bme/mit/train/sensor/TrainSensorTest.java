package hu.bme.mit.train.sensor;


import hu.bme.mit.train.interfaces.TrainSensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensor sensor;

    @Before
    public void before() {

    }

    @Test
    public void ThisIsAnExampleTestStub() {
        sensor.overrideSpeedLimit(10);
        Assert.assertEquals(10,sensor.getSpeedLimit());
    }
}
