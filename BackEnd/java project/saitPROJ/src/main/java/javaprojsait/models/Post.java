package javaprojsait.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title,anons,full_text;
    private int views;
    public long getid(){
        return id;
    } 
    public void setid(long id){
        this.id = id;
    } 
    public String getTitle(){
        return title;
    } 
    public void setTitle(String title){
        this.title = title;
    } 
    public String getAnons(){return anons;}
    public void setAnons(String anons){
        this.anons = anons;
    }
    public String getFull_text(){
        return full_text;
    } 
    public void setFull_text(String full_text){
        this.full_text = full_text;
    }
    public int getViews(){
        return views;
    } 
    public void setViews(int views){
        this.views = views;
    }
}
