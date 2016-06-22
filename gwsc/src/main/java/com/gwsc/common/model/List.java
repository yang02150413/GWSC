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


/**
 * 一级菜单
 */
@Entity
@Table(name="t_list"
    ,catalog="gwsc"
)

public class List  implements java.io.Serializable {


    // Fields    

     private Integer pkId;
     private String name;
     private Set<List2> list2s = new HashSet<List2>(0);


    // Constructors

    /** default constructor */
    public List() {
    }

	/** minimal constructor */
    public List(String name) {
        this.name = name;
    }
    
    /** full constructor */
    public List(String name, Set<List2> list2s) {
        this.name = name;
        this.list2s = list2s;
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
    
    @Column(name="name", nullable=false)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="list")

    public Set<List2> getList2s() {
        return this.list2s;
    }
    
    public void setList2s(Set<List2> list2s) {
        this.list2s = list2s;
    }
   








}