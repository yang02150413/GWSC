package com.gwsc.common.model;
// default package

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 区
 */
@Entity
@Table(name="t_area"
    ,catalog="gwsc"
)

public class Area  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private City city;
     private Integer areaId;
     private String area;
     private Set<Receveaddr> receveaddrs = new HashSet<Receveaddr>(0);


    // Constructors

    /** default constructor */
    public Area() {
    }

	/** minimal constructor */
    public Area(City city, Integer areaId, String area) {
        this.city = city;
        this.areaId = areaId;
        this.area = area;
    }
    
    /** full constructor */
    public Area(City city, Integer areaId, String area, Set<Receveaddr> receveaddrs) {
        this.city = city;
        this.areaId = areaId;
        this.area = area;
        this.receveaddrs = receveaddrs;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="fatherID", nullable=false)

    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }
    
    @Column(name="areaID", nullable=false)

    public Integer getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
    
    @Column(name="area", nullable=false, length=20)

    public String getArea() {
        return this.area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="area")

    public Set<Receveaddr> getReceveaddrs() {
        return this.receveaddrs;
    }
    
    public void setReceveaddrs(Set<Receveaddr> receveaddrs) {
        this.receveaddrs = receveaddrs;
    }
   








}