package com.gwsc.common.model;
// default package

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 状态
 */
@Entity
@Table(name="t_stas"
    ,catalog="gwsc"
)

public class Stas  implements java.io.Serializable {


    // Fields    

     private Integer pkId;
     private String stas;
     private Set<Order> orders = new HashSet<Order>(0);


    // Constructors

    /** default constructor */
    public Stas() {
    }

	/** minimal constructor */
    public Stas(Integer pkId) {
        this.pkId = pkId;
    }
    
    /** full constructor */
    public Stas(Integer pkId, String stas, Set<Order> orders) {
        this.pkId = pkId;
        this.stas = stas;
        this.orders = orders;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="PK_ID", unique=true, nullable=false)

    public Integer getPkId() {
        return this.pkId;
    }
    
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }
    
    @Column(name="stas", length=32)

    public String getStas() {
        return this.stas;
    }
    
    public void setStas(String stas) {
        this.stas = stas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="stas")

    public Set<Order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
   








}