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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * 省份
 */
@Entity
@Table(name="t_province"
    ,catalog="gwsc"
, uniqueConstraints = @UniqueConstraint(columnNames="provinceID")
)

public class Province  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer provinceId;
     private String province;
     private Set<City> cities = new HashSet<City>(0);


    // Constructors

    /** default constructor */
    public Province() {
    }

	/** minimal constructor */
    public Province(Integer provinceId, String province) {
        this.provinceId = provinceId;
        this.province = province;
    }
    
    /** full constructor */
    public Province(Integer provinceId, String province, Set<City> cities) {
        this.provinceId = provinceId;
        this.province = province;
        this.cities = cities;
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
    
    @Column(name="provinceID", unique=true, nullable=false)

    public Integer getProvinceId() {
        return this.provinceId;
    }
    
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
    
    @Column(name="province", nullable=false, length=20)

    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="province")

    public Set<City> getCities() {
        return this.cities;
    }
    
    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
   








}