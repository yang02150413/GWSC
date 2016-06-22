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
import javax.persistence.UniqueConstraint;


/**
 * 城市
 */
@Entity
@Table(name="t_city"
    ,catalog="gwsc"
, uniqueConstraints = @UniqueConstraint(columnNames="cityID")
)

public class City  implements java.io.Serializable {

    // Fields    

     private Integer id;
     private Province province;
     private Integer cityId;
     private String city;
     private Set<Area> areas = new HashSet<Area>(0);


    // Constructors

    /** default constructor */
    public City() {
    }

	/** minimal constructor */
    public City(Province province, Integer cityId, String city) {
        this.province = province;
        this.cityId = cityId;
        this.city = city;
    }
    
    /** full constructor */
    public City(Province province, Integer cityId, String city, Set<Area> areas) {
        this.province = province;
        this.cityId = cityId;
        this.city = city;
        this.areas = areas;
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

    public Province getProvince() {
        return this.province;
    }
    
    public void setProvince(Province province) {
        this.province = province;
    }
    
    @Column(name="cityID", unique=true, nullable=false)

    public Integer getCityId() {
        return this.cityId;
    }
    
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
    
    @Column(name="city", nullable=false, length=20)

    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="city")

    public Set<Area> getAreas() {
        return this.areas;
    }
    
    public void setAreas(Set<Area> areas) {
        this.areas = areas;
    }
   








}