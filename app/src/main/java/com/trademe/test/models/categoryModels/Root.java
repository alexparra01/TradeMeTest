package com.trademe.test.models.categoryModels;

import java.io.Serializable;
import java.util.List;

/**
 * Created by alexanderparra on 16/01/16.
 */
public class Root implements Serializable{

    private String Name;
    private String Number;
    private String Path;
    private List<Subcategory> Subcategories;


    public String getName() {
        return Name;
    }


    public void setName(String Name) {
        this.Name = Name;
    }


    public String getNumber() {
        return Number;
    }


    public void setNumber(String Number) {
        this.Number = Number;
    }


    public String getPath() {
        return Path;
    }


    public void setPath(String Path) {
        this.Path = Path;
    }


    public List<Subcategory> getSubcategories() {
        return Subcategories;
    }

    public void setSubcategories(List<Subcategory> Subcategories) {
        this.Subcategories = Subcategories;
    }


}

