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
 * 店铺
 */
@Entity
@Table(name="t_shop"
    ,catalog="gwsc"
)

public class Shop  implements java.io.Serializable {


    // Fields    

     private Integer pkId;
     private User user;
     private String shopname;
     private String address;
     private String description;
     private Integer star;
     private Set<Goods> goodses = new HashSet<Goods>(0);


    // Constructors

    /** default constructor */
    public Shop() {
    }

    
    /** full constructor */
    public Shop(User user, String shopname, String address, String description, Integer star, Set<Goods> goodses) {
        this.user = user;
        this.shopname = shopname;
        this.address = address;
        this.description = description;
        this.star = star;
        this.goodses = goodses;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="pk_id", unique=true, nullable=false)

    public Integer getPkId() {
        return this.pkId;
    }
    
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="userid")

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    @Column(name="shopname", length=32)

    public String getShopname() {
        return this.shopname;
    }
    
    public void setShopname(String shopname) {
        this.shopname = shopname;
    }
    
    @Column(name="address")

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="description")

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="star")

    public Integer getStar() {
        return this.star;
    }
    
    public void setStar(Integer star) {
        this.star = star;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="shop")

    public Set<Goods> getGoodses() {
        return this.goodses;
    }
    
    public void setGoodses(Set<Goods> goodses) {
        this.goodses = goodses;
    }
   








}