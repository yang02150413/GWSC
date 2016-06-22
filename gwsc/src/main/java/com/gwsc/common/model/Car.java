package com.gwsc.common.model;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * 购物车
 */
@Entity
@Table(name="t_car"
    ,catalog="gwsc"
)
public class Car  implements java.io.Serializable {

    // Fields    

     private Integer pkId;
     private Goods goods;
     private User user;
     private Integer num;


    // Constructors

    /** default constructor */
    public Car() {
    }

    
    /** full constructor */
    public Car(Goods goods, User user, Integer num) {
        this.goods = goods;
        this.user = user;
        this.num = num;
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
        @JoinColumn(name="gid")

    public Goods getGoods() {
        return this.goods;
    }
    
    public void setGoods(Goods goods) {
        this.goods = goods;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="uid")

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    @Column(name="num")

    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }
   








}