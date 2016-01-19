package com.trademe.test.models.categoryModels;

import java.io.Serializable;




/**
 * Created by alexanderparra on 16/01/16.
 */
public class Subcategory___ implements Serializable {

    private long id;
    private String Name;
    private String Number;
    private String Path;
    private boolean HasClassifieds;

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
     * The HasClassifieds
     */
    public boolean isHasClassifieds() {
        return HasClassifieds;
    }

    /**
     *
     * @param HasClassifieds
     * The HasClassifieds
     */
    public void setHasClassifieds(boolean HasClassifieds) {
        this.HasClassifieds = HasClassifieds;
    }
}
