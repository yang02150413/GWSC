package com.gwsc.common.model;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * 用户表
 */
@Entity
@Table(name="t_user"
    ,catalog="gwsc"
)

public class User  implements java.io.Serializable {


    // Fields    

     private Integer pkId;
     private String loginName;
     private String password;
     private Integer userType;
     private String ans1;
     private String ans2;
     private String ans3;
     private Date regDate;
     private Set<Car> cars = new HashSet<Car>(0);
     private Set<Shop> shops = new HashSet<Shop>(0);
     private Set<Userinfo> userinfos = new HashSet<Userinfo>(0);
     private Set<Receveaddr> receveaddrs = new HashSet<Receveaddr>(0);
     private Set<Order> orders = new HashSet<Order>(0);
     private Set<Note> notesForGid = new HashSet<Note>(0);
     private Set<Note> notesForUid = new HashSet<Note>(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(Integer pkId, String loginName, String password, Integer userType, Date regDate) {
        this.pkId = pkId;
        this.loginName = loginName;
        this.password = password;
        this.userType = userType;
        this.regDate = regDate;
    }
    
    /** full constructor */
    public User(Integer pkId, String loginName, String password, Integer userType, String ans1, String ans2, String ans3, Date regDate, Set<Car> cars, Set<Shop> shops, Set<Userinfo> userinfos, Set<Receveaddr> receveaddrs, Set<Order> orders, Set<Note> notesForGid, Set<Note> notesForUid) {
        this.pkId = pkId;
        this.loginName = loginName;
        this.password = password;
        this.userType = userType;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.regDate = regDate;
        this.cars = cars;
        this.shops = shops;
        this.userinfos = userinfos;
        this.receveaddrs = receveaddrs;
        this.orders = orders;
        this.notesForGid = notesForGid;
        this.notesForUid = notesForUid;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="pk_id", unique=true, nullable=false)

    public Integer getPkId() {
        return this.pkId;
    }
    
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }
    
    @Column(name="loginName", nullable=false, length=32)

    public String getLoginName() {
        return this.loginName;
    }
    
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    @Column(name="password", nullable=false, length=32)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="userType", nullable=false)

    public Integer getUserType() {
        return this.userType;
    }
    
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    
    @Column(name="Ans1")

    public String getAns1() {
        return this.ans1;
    }
    
    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }
    
    @Column(name="Ans2")

    public String getAns2() {
        return this.ans2;
    }
    
    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }
    
    @Column(name="Ans3")

    public String getAns3() {
        return this.ans3;
    }
    
    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="regDate", nullable=false, length=10)

    public Date getRegDate() {
        return this.regDate;
    }
    
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<Car> getCars() {
        return this.cars;
    }
    
    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<Shop> getShops() {
        return this.shops;
    }
    
    public void setShops(Set<Shop> shops) {
        this.shops = shops;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<Userinfo> getUserinfos() {
        return this.userinfos;
    }
    
    public void setUserinfos(Set<Userinfo> userinfos) {
        this.userinfos = userinfos;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<Receveaddr> getReceveaddrs() {
        return this.receveaddrs;
    }
    
    public void setReceveaddrs(Set<Receveaddr> receveaddrs) {
        this.receveaddrs = receveaddrs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<Order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userByGid")

    public Set<Note> getNotesForGid() {
        return this.notesForGid;
    }
    
    public void setNotesForGid(Set<Note> notesForGid) {
        this.notesForGid = notesForGid;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userByUid")

    public Set<Note> getNotesForUid() {
        return this.notesForUid;
    }
    
    public void setNotesForUid(Set<Note> notesForUid) {
        this.notesForUid = notesForUid;
    }
   








}