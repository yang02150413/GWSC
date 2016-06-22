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
 * 二级菜单
 */
@Entity
@Table(name="t_list2"
    ,catalog="gwsc"
)

public class List2  implements java.io.Serializable {

    // Fields    

     private Integer pkId;
     private List list;
     private String name;


    // Constructors

    /** default constructor */
    public List2() {
    }

	/** minimal constructor */
    public List2(String name) {
        this.name = name;
    }
    
    /** full constructor */
    public List2(List list, String name) {
        this.list = list;
        this.name = name;
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
        @JoinColumn(name="fid")

    public List getList() {
        return this.list;
    }
    
    public void setList(List list) {
        this.list = list;
    }
    
    @Column(name="name", nullable=false)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   








}