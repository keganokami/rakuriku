package com.rakuriku.rakuriku.domain.model.compe;
// Generated Dec 12, 2021, 2:20:58 PM by Hibernate Tools 5.3.9.Final


import com.rakuriku.rakuriku.domain.model.BaseEntity;
import com.rakuriku.rakuriku.domain.model.auth.AdminsEntity;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CompeEntity generated by hbm2java
 */
@Entity
@Table(name="compe"
    ,schema="public"
)
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class CompeEntity extends BaseEntity implements java.io.Serializable {


     private String compeId;
     private AdminsEntity admins;
     private String compeName;
     private String compeDates;
     private String compePlace;
     private byte[] compeGuidelinesFile;
     private Serializable compeEvent;
     private Set<CompeEntryManagementEntity> compeEntryManagements = new HashSet<CompeEntryManagementEntity>(0);

    public CompeEntity() {
    }

	
    public CompeEntity(String compeId, String compeName, String compeDates, String compePlace, Serializable compeEvent) {
        this.compeId = compeId;
        this.compeName = compeName;
        this.compeDates = compeDates;
        this.compePlace = compePlace;
        this.compeEvent = compeEvent;
    }
    public CompeEntity(String compeId, AdminsEntity admins, String compeName, String compeDates, String compePlace, byte[] compeGuidelinesFile, Serializable compeEvent, Set<CompeEntryManagementEntity> compeEntryManagements) {
       this.compeId = compeId;
       this.admins = admins;
       this.compeName = compeName;
       this.compeDates = compeDates;
       this.compePlace = compePlace;
       this.compeGuidelinesFile = compeGuidelinesFile;
       this.compeEvent = compeEvent;
       this.compeEntryManagements = compeEntryManagements;
    }
   
     @Id 

    
    @Column(name="compe_id", unique=true, nullable=false)
    public String getCompeId() {
        return this.compeId;
    }
    
    public void setCompeId(String compeId) {
        this.compeId = compeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="admin_id")
    public AdminsEntity getAdmins() {
        return this.admins;
    }
    
    public void setAdmins(AdminsEntity admins) {
        this.admins = admins;
    }

    
    @Column(name="compe_name", nullable=false)
    public String getCompeName() {
        return this.compeName;
    }
    
    public void setCompeName(String compeName) {
        this.compeName = compeName;
    }

    
    @Column(name="compe_dates", nullable=false, length=100)
    public String getCompeDates() {
        return this.compeDates;
    }
    
    public void setCompeDates(String compeDates) {
        this.compeDates = compeDates;
    }

    
    @Column(name="compe_place", nullable=false, length=100)
    public String getCompePlace() {
        return this.compePlace;
    }
    
    public void setCompePlace(String compePlace) {
        this.compePlace = compePlace;
    }

    
    @Column(name="compe_guidelines_file")
    public byte[] getCompeGuidelinesFile() {
        return this.compeGuidelinesFile;
    }
    
    public void setCompeGuidelinesFile(byte[] compeGuidelinesFile) {
        this.compeGuidelinesFile = compeGuidelinesFile;
    }

    
    @Column(name="compe_event", nullable=false)
    @Type(type = "jsonb")
    public Serializable getCompeEvent() {
        return this.compeEvent;
    }
    
    public void setCompeEvent(Serializable compeEvent) {
        this.compeEvent = compeEvent;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="compe")
    public Set<CompeEntryManagementEntity> getCompeEntryManagements() {
        return this.compeEntryManagements;
    }
    
    public void setCompeEntryManagements(Set<CompeEntryManagementEntity> compeEntryManagements) {
        this.compeEntryManagements = compeEntryManagements;
    }




}


