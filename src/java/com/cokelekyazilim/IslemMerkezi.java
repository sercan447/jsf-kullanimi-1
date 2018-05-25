
package com.cokelekyazilim;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "Islemanaged")
@SessionScoped
public class IslemMerkezi {
    
    
    private String isim;
    private String soyisim;
    private String yas;
    private String dogumtarihi;
    
    private String gizliKelime;
    private String Adres;
    
    private String secilenLise;
    private String secilenUni;
    private List<String> secilenYazilim;
    private String secilenEvlilik;
    
    private Map<String,String> lise;
    private Map<String,String> universite;
    private Map<String,String> yazilimTech;
    private Map<String,String> evlilikdurumu;
    
    @PostConstruct
    public void init(){
       
        secilenYazilim = new LinkedList<String>();
        
        lise = new HashMap<String,String>();
        lise.put( "Tacirler E.V.İ.Ö.Okulu","Tacirler E.V.İ.Ö.Okulu");
        lise.put("İsmet Paşa İ.Ö.Okulu","İsmet Paşa İ.Ö.Okulu");
        lise.put("Örfü Çetinkaya İ.Ö.Okulu","Örfü Çetinkaya İ.Ö.Okulu");
        
        universite = new HashMap<String,String>();
        universite.put("Süleyman Demirel","Süleyman Demirel");
        universite.put("Anadolu Üniversitesi","Anadolu Üniversitesi");
        universite.put("Muğla Sıtkı Kocaman","Muğla Sıtkı Kocaman");
        
        yazilimTech = new LinkedHashMap<String,String>();
        yazilimTech.put("JSP","JSP");
        yazilimTech.put( "JSF","JSF");
        yazilimTech.put( "Hibernate","Hibernate");
        yazilimTech.put( "SOAP","SOAP");
        yazilimTech.put("RESTFUL","RESTFUL");
        yazilimTech.put("Spring Core","Spring Core");
        yazilimTech.put( "Maven","Maven");
        yazilimTech.put("Spring MVC","Spring MVC");
        yazilimTech.put("Servlet","Servlet");
        yazilimTech.put("JAXB","JAXB");
        yazilimTech.put("XML-XSD-XPATH","XML-XSD-XPATH");
        yazilimTech.put("JDBC","JDBC");
        yazilimTech.put("JSON","JSON");
        yazilimTech.put("MYSQL","MYSQL");
        
        evlilikdurumu = new HashMap<String,String>();
        evlilikdurumu.put("Evli", "Evli");
        evlilikdurumu.put("Dul","Dul");
        evlilikdurumu.put("Bekar","Bekar");
                
                
    }

    public void Bildirim(ActionEvent ev){
        System.out.println("Ad : "+this.getIsim());
        System.out.println("Soyisim : "+this.getSoyisim());
        System.out.println("Yas : "+this.getYas());
        System.out.println("Dogum Tarihi :"+this.getDogumtarihi());
        System.out.println("Gizli Kelime : "+this.getGizliKelime());
        System.out.println("Lise : "+this.getSecilenLise());
        System.out.println("Uni : "+this.getSecilenUni());
        System.out.println("Tecnolojy : "+this.getSecilenYazilim());
        System.out.println("Adres : "+this.getAdres());
        System.out.println("Evlilik : "+this.getSecilenEvlilik());
        System.out.println("-------------------------");
        
                
    }

    public String getSecilenEvlilik() {
        return secilenEvlilik;
    }

    public void setSecilenEvlilik(String secilenEvlilik) {
        this.secilenEvlilik = secilenEvlilik;
    }

    public Map<String, String> getEvlilikdurumu() {
        return evlilikdurumu;
    }

    public void setEvlilikdurumu(Map<String, String> evlilikdurumu) {
        this.evlilikdurumu = evlilikdurumu;
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public String getGizliKelime() {
        return gizliKelime;
    }

    public void setGizliKelime(String gizliKelime) {
        this.gizliKelime = gizliKelime;
    }

    public String getSecilenLise() {
        return secilenLise;
    }

    public void setSecilenLise(String secilenLise) {
        this.secilenLise = secilenLise;
    }

    public String getSecilenUni() {
        return secilenUni;
    }

    public void setSecilenUni(String secilenUni) {
        this.secilenUni = secilenUni;
    }

    public List<String> getSecilenYazilim() {
        return secilenYazilim;
    }

    public void setSecilenYazilim(List<String> secilenYazilim) {
        this.secilenYazilim = secilenYazilim;
    }



    public Map<String, String> getLise() {
        return lise;
    }

    public void setLise(Map<String, String> lise) {
        this.lise = lise;
    }

    public Map<String, String> getUniversite() {
        return universite;
    }

    public void setUniversite(Map<String, String> universite) {
        this.universite = universite;
    }

    public Map<String, String> getYazilimTech() {
        return yazilimTech;
    }

    public void setYazilimTech(Map<String, String> yazilimTech) {
        this.yazilimTech = yazilimTech;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }


    
    
    
    
}
