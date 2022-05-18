
package com.fastenerstocksystem.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author bblns18
 */
@Entity
@Table(name = "fasteners")
public class Fastener implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "fastenerType")
    private String fastenerType;
    
    @Column(name = "threadType")
    private String threadType;
    
    @Column(name = "threadDesc")
    private String threadDesc;
    
    @Column(name = "threadLength")
    private String threadLength;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFastenerType() {
        return fastenerType;
    }

    public void setFastenerType(String fastenerType) {
        this.fastenerType = fastenerType;
    }

    public String getThreadType() {
        return threadType;
    }

    public void setThreadType(String threadType) {
        this.threadType = threadType;
    }

    public String getThreadDesc() {
        return threadDesc;
    }

    public void setThreadDesc(String threadDesc) {
        this.threadDesc = threadDesc;
    }
    
    public String getThreadLength() {
        return threadLength;
    }

    public void setThreadLength(String threadLength) {
        this.threadLength = threadLength;
    }
    
    
}
