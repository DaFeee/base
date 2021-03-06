package hu.bme.mit.train.sensor;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Date;

public class Tachograph {

    private Table<Date,Integer,Integer> table;

    public Tachograph(){
        table = HashBasedTable.create();
    }

    public void add(Date date, int position, int reference){
        table.put(date, position, reference);
    }

    public Table<Date, Integer, Integer> getTable(){
        return table;
    }
}
