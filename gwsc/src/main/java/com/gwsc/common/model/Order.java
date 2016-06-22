package com.gwsc.common.model;
// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * 订单
 */
@Entity
@Table(name="t_order"
    ,catalog="gwsc"
)

public class Order  implements java.io.Serializable {

    // Fields    

     private Integer pkId;
     private Receveaddr receveaddr;
     private Goods goods;
     private Stas stas;
     private User user;
     private Integer number;
     private Date odate;
     private Date pdate;


    // Constructors

    /** default constructor */
    public Order() {
    }

    
    /** full constructor */
    public Order(Receveaddr receveaddr, Goods goods, Stas stas, User user, Integer number, Date odate, Date pdate) {
        this.receveaddr = receveaddr;
        this.goods = goods;
        this.stas = stas;
        this.user = user;
        this.number = number;
        this.odate = odate;
        this.pdate = pdate;
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
        @JoinColumn(name="Rid")

    public Receveaddr getReceveaddr() {
        return this.receveaddr;
    }
    
    public void setReceveaddr(Receveaddr receveaddr) {
        this.receveaddr = receveaddr;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="Gid")

    public Goods getGoods() {
        return this.goods;
    }
    
    public void setGoods(Goods goods) {
        this.goods = goods;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="stas")

    public Stas getStas() {
        return this.stas;
    }
    
    public void setStas(Stas stas) {
        this.stas = stas;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="Uid")

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    @Column(name="Number")

    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="ODate", length=10)

    public Date getOdate() {
        return this.odate;
    }
    
    public void setOdate(Date odate) {
        this.odate = odate;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="PDate", length=10)

    public Date getPdate() {
        return this.pdate;
    }
    
    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }
   








}