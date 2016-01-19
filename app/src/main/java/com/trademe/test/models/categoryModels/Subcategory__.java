package com.trademe.test.models.categoryModels;

import java.io.Serializable;
import java.util.List;

/**
 * Created by alexanderparra on 16/01/16.
 */
public class Subcategory__ implements Serializable {

    private long id;
    private String Name;
    private String Number;
    private String Path;
    private List<Subcategory___> Subcategories;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    /**
     *
     * @return
     * The Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     * The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return
     * The Number
     */
    public String getNumber() {
        return Number;
    }

    /**
     *
     * @param Number
     * The Number
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     *
     * @return
     * The Path
     */
    public String getPath() {
        return Path;
    }

    /**
     *
     * @param Path
     * The Path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     *
     * @return
     * The Subcategories
     */
    public List<Subcategory___> getSubcategories() {
        return Subcategories;
    }

    /**
     *
     * @param Subcategories
     * The Subcategories
     */
    public void setSubcategories(List<Subcategory___> Subcategories) {
        this.Subcategories = Subcategories;
    }
}
