package com.trademe.test.models.searchModels;

import java.util.ArrayList;


/**
 * Created by alexanderparra on 18/01/16.
 */
public class Parameter {
    private String DisplayName;
    private String Name;
    private String LowerBoundName;
    private String UpperBoundName;
    private int Type;
    private boolean AllowsMultipleValues;
    private String MutualExclusionGroup;
    private String DependentOn;
    private String ExternalOptionsKey;


    /**
     *
     * @return
     * The DisplayName
     */
    public String getDisplayName() {
        return DisplayName;
    }

    /**
     *
     * @param DisplayName
     * The DisplayName
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
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
     * The LowerBoundName
     */
    public String getLowerBoundName() {
        return LowerBoundName;
    }

    /**
     *
     * @param LowerBoundName
     * The LowerBoundName
     */
    public void setLowerBoundName(String LowerBoundName) {
        this.LowerBoundName = LowerBoundName;
    }

    /**
     *
     * @return
     * The UpperBoundName
     */
    public String getUpperBoundName() {
        return UpperBoundName;
    }

    /**
     *
     * @param UpperBoundName
     * The UpperBoundName
     */
    public void setUpperBoundName(String UpperBoundName) {
        this.UpperBoundName = UpperBoundName;
    }

    /**
     *
     * @return
     * The Type
     */
    public int getType() {
        return Type;
    }

    /**
     *
     * @param Type
     * The Type
     */
    public void setType(int Type) {
        this.Type = Type;
    }

    /**
     *
     * @return
     * The AllowsMultipleValues
     */
    public boolean isAllowsMultipleValues() {
        return AllowsMultipleValues;
    }

    /**
     *
     * @param AllowsMultipleValues
     * The AllowsMultipleValues
     */
    public void setAllowsMultipleValues(boolean AllowsMultipleValues) {
        this.AllowsMultipleValues = AllowsMultipleValues;
    }

    /**
     *
     * @return
     * The MutualExclusionGroup
     */
    public String getMutualExclusionGroup() {
        return MutualExclusionGroup;
    }

    /**
     *
     * @param MutualExclusionGroup
     * The MutualExclusionGroup
     */
    public void setMutualExclusionGroup(String MutualExclusionGroup) {
        this.MutualExclusionGroup = MutualExclusionGroup;
    }

    /**
     *
     * @return
     * The DependentOn
     */
    public String getDependentOn() {
        return DependentOn;
    }

    /**
     *
     * @param DependentOn
     * The DependentOn
     */
    public void setDependentOn(String DependentOn) {
        this.DependentOn = DependentOn;
    }

    /**
     *
     * @return
     * The ExternalOptionsKey
     */
    public String getExternalOptionsKey() {
        return ExternalOptionsKey;
    }

    /**
     *
     * @param ExternalOptionsKey
     * The ExternalOptionsKey
     */
    public void setExternalOptionsKey(String ExternalOptionsKey) {
        this.ExternalOptionsKey = ExternalOptionsKey;
    }





}
