package com.springcore.sequences.dao;

import org.springframework.stereotype.Component;

@Component
public class SequenceDao {
    private String prefix;
    private String suffix;
    private Long inital;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Long getInital() {
        return inital;
    }

    public void setInital(Long inital) {
        this.inital = inital;
    }

    @Override
    public String toString() {
        return "SequenceDao{" +
                "prefix='" + prefix + '\'' +
                ", suffix='" + suffix + '\'' +
                ", inital=" + inital +
                '}';
    }
}
