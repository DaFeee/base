package hu.bme.mit.train.sensor;

import com.google.common.collect.Table;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class TachographTest {

    Tachograph tacho = new Tachograph();

    @Test
    public void TestCase() {
        Date date = new Date(0);
        tacho.add(date,1,3);
        Table<Date,Integer,Integer> table = tacho.getTable();
        Assert.assertFalse(table.isEmpty());
    }
}
