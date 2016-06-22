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
 * 收货地址
 */
@Entity
@Table(name="t_receveaddr"
    ,catalog="gwsc"
)

public class Receveaddr  implements java.io.Serializable {


    // Fields    

     private Integer pkId;
     private Area area;
     private User user;
     private String address;
     private String phone;
     private String name;


    // Constructors

    /** default constructor */
    public Receveaddr() {
    }

    
    /** full constructor */
    public Receveaddr(Area area, User user, String address, String phone, String name) {
        this.area = area;
        this.user = user;
        this.address = address;
        this.phone = phone;
        this.name = name;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="PK_ID", unique=true, nullable=false)

    public Integer getPkId() {
        return this.pkId;
    }
    
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="Aid")

    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="Uid")

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    @Column(name="Address")

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="Phone", length=32)

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Column(name="Name", length=32)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }








}