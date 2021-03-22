package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;


import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensor sensor;

    @Before
    public void before() {

        TrainSystem system = new TrainSystem();
        sensor = system.getSensor();
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        sensor.overrideSpeedLimit(10);
        Assert.assertEquals(10,sensor.getSpeedLimit());
    }
}
