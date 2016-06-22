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
 * 评价
 */
@Entity
@Table(name="t_note"
    ,catalog="gwsc"
)

public class Note  implements java.io.Serializable {


    // Fields    

     private Integer pkId;
     private User userByGid;
     private User userByUid;
     private String note;


    // Constructors

    /** default constructor */
    public Note() {
    }

    
    /** full constructor */
    public Note(User userByGid, User userByUid, String note) {
        this.userByGid = userByGid;
        this.userByUid = userByUid;
        this.note = note;
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
        @JoinColumn(name="Gid")

    public User getUserByGid() {
        return this.userByGid;
    }
    
    public void setUserByGid(User userByGid) {
        this.userByGid = userByGid;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="Uid")

    public User getUserByUid() {
        return this.userByUid;
    }
    
    public void setUserByUid(User userByUid) {
        this.userByUid = userByUid;
    }
    
    @Column(name="Note")

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
   








}