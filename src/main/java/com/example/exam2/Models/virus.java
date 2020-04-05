package com.example.exam2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="viruses")
public class virus {
    @Id //primary
    @Column(name = "id") public int id;
    @Column(name = "vname") public  String vname;
    @Column(name = "description") public String description;
    @Column(name = "symptoms") public  String symptoms;
    @Column(name = "duration") public  String duration;
    @Column(name = "mortalityrate") public String mortalityrate;
    @Column(name = "image") public String image;

    public virus() { }
    public virus(int id, String vname, String description, String symptoms, String duration, String mortalityrate, String image){
        this.id = id;
        this.vname = vname;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityrate = mortalityrate;
        this.image = image;

    }

    public int getId(){return id;}
    public void setID(int id){ this.id = id;}
    
    public String getVName(){return vname;}
    public void setVName(String vname){ this.vname = vname;}

    public String getDescription(){return description;}
    public void setDescription(String description){ this.vname = description;}

    public String getSymptoms(){return symptoms;}
    public void setSymptoms(String symptoms){ this.vname = symptoms;}

    public String getDuration(){return duration;}
    public void setDuration(String duration){ this.vname = duration;}

    public String getMortalityrate(){return mortalityrate;}
    public void setMortalityrate(String mortalityrate){ this.mortalityrate = mortalityrate;}

    public String getImage(){return image;}
    public void setImage(int image){ this.id = image;}


}
