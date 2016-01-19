package com.trademe.test.models.categoryModels;

import java.io.Serializable;
import java.util.List;

/**
 * Created by alexanderparra on 14/01/16.
 */
public class Subcategory implements Serializable {

    private String Name;
    private String Number;
    private String Path;
    private List<Subcategory_> Subcategories;


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


    public List<Subcategory_> getSubcategories() {
        return Subcategories;
    }


    public void setSubcategories(List<Subcategory_> Subcategories) {
        this.Subcategories = Subcategories;
    }


}
