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
 * 商品
 */
@Entity
@Table(name="t_goods"
    ,catalog="gwsc"
)

public class Goods  implements java.io.Serializable {

    // Fields    

     private Integer pkId;
     private Shop shop;
     private String name;
     private String description;
     private Integer price;
     private Integer restNunber;
     private Integer saleNumber;
     private String imgPath;
     private List2 goodType;
     private int goodsStatu;
     private Set<Car> cars = new HashSet<Car>(0);
     private Set<Order> orders = new HashSet<Order>(0);


    // Constructors

    /** default constructor */
    public Goods() {
    }

    
    /** full constructor */
    public Goods(Shop shop, String name, String description, Integer price, Integer restNunber, Integer saleNumber, String imgPath, List2 goodType, Set<Car> cars, Set<Order> orders) {
        this.shop = shop;
        this.name = name;
        this.description = description;
        this.price = price;
        this.restNunber = restNunber;
        this.saleNumber = saleNumber;
        this.imgPath = imgPath;
        this.goodType = goodType;
        this.cars = cars;
        this.orders = orders;
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
        @JoinColumn(name="Sid")

    public Shop getShop() {
        return this.shop;
    }
    
    public void setShop(Shop shop) {
        this.shop = shop;
    }
    
    @Column(name="Name")

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="Description")

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="Price")

    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    @Column(name="RestNunber")

    public Integer getRestNunber() {
        return this.restNunber;
    }
    
    public void setRestNunber(Integer restNunber) {
        this.restNunber = restNunber;
    }
    
    @Column(name="SaleNumber")

    public Integer getSaleNumber() {
        return this.saleNumber;
    }
    
    public void setSaleNumber(Integer saleNumber) {
        this.saleNumber = saleNumber;
    }
    
    @Column(name="ImgPath")

    public String getImgPath() {
        return this.imgPath;
    }
    
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="goodType")
    public List2 getGoodType() {
        return this.goodType;
    }
    
    public void setGoodType(List2 goodType) {
        this.goodType = goodType;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="goods")

    public Set<Car> getCars() {
        return this.cars;
    }
    
    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="goods")

    public Set<Order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }


	public int getGoodsStatu() {
		return goodsStatu;
	}


	public void setGoodsStatu(int goodsStatu) {
		this.goodsStatu = goodsStatu;
	}
   








}