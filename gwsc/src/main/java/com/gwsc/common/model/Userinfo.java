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
 * 用户详细信息
 */
@Entity
@Table(name="t_userinfo"
    ,catalog="gwsc"
)

public class Userinfo  implements java.io.Serializable {

    // Fields    

     private Integer pkId;
     private User user;
     private String nname;
     private Integer sex;
     private String phone;
     private String email;
     private String imgpath;


    // Constructors

    /** default constructor */
    public Userinfo() {
    }

    
    /** full constructor */
    public Userinfo(User user, String nname, Integer sex, String phone, String email, String imgpath) {
        this.user = user;
        this.nname = nname;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.imgpath = imgpath;
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
    
    @Column(name="nname", length=32)

    public String getNname() {
        return this.nname;
    }
    
    public void setNname(String nname) {
        this.nname = nname;
    }
    
    @Column(name="sex")

    public Integer getSex() {
        return this.sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    
    @Column(name="phone", length=32)

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Column(name="email")

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="imgpath")

    public String getImgpath() {
        return this.imgpath;
    }
    
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }
   








}