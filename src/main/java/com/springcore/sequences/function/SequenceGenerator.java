package com.springcore.sequences.function;

import com.springcore.sequences.dao.SequenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SequenceGenerator {

    @Autowired
    private SequenceDao sequenceDao;

    public String getSequence(){

        int i = 1;

        sequenceDao.setPrefix("TAE");
        sequenceDao.setSuffix("WK");
        sequenceDao.setInital("0000" + i);
        sequenceDao.setCounter(i);
        i++;

        return sequenceDao.getPrefix() + sequenceDao.getInital() +sequenceDao.getSuffix();
    }
}
