package com.trademe.test.models.searchModels;

import java.util.ArrayList;

/**
 * Created by alexanderparra on 18/01/16.
 */
public class Search {

    private int TotalCount;
    private int Page;
    private int PageSize;
    private java.util.List<List> List = new ArrayList<List>();
    private String DidYouMean;
    private java.util.List<FoundCategory> FoundCategories = new ArrayList<FoundCategory>();
    private int FavouriteId;
    private int FavouriteType;
    private java.util.List<Parameter> Parameters = new ArrayList<Parameter>();
    private java.util.List<SortOrder> SortOrders = new ArrayList<SortOrder>();
    private MemberProfile MemberProfile;
    private java.util.List<Ad> Ads = new ArrayList<Ad>();
    private DealPromotionInfo DealPromotionInfo;

    /**
     *
     * @return
     * The TotalCount
     */
    public int getTotalCount() {
        return TotalCount;
    }

    /**
     *
     * @param TotalCount
     * The TotalCount
     */
    public void setTotalCount(int TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     *
     * @return
     * The Page
     */
    public int getPage() {
        return Page;
    }

    /**
     *
     * @param Page
     * The Page
     */
    public void setPage(int Page) {
        this.Page = Page;
    }

    /**
     *
     * @return
     * The PageSize
     */
    public int getPageSize() {
        return PageSize;
    }

    /**
     *
     * @param PageSize
     * The PageSize
     */
    public void setPageSize(int PageSize) {
        this.PageSize = PageSize;
    }

    /**
     *
     * @return
     * The List
     */
    public java.util.List<List> getList() {
        return List;
    }

    /**
     *
     * @param List
     * The List
     */
    public void setList(java.util.List<List> List) {
        this.List = List;
    }

    /**
     *
     * @return
     * The DidYouMean
     */
    public String getDidYouMean() {
        return DidYouMean;
    }

    /**
     *
     * @param DidYouMean
     * The DidYouMean
     */
    public void setDidYouMean(String DidYouMean) {
        this.DidYouMean = DidYouMean;
    }

    /**
     *
     * @return
     * The FoundCategories
     */
    public java.util.List<FoundCategory> getFoundCategories() {
        return FoundCategories;
    }

    /**
     *
     * @param FoundCategories
     * The FoundCategories
     */
    public void setFoundCategories(java.util.List<FoundCategory> FoundCategories) {
        this.FoundCategories = FoundCategories;
    }

    /**
     *
     * @return
     * The FavouriteId
     */
    public int getFavouriteId() {
        return FavouriteId;
    }

    /**
     *
     * @param FavouriteId
     * The FavouriteId
     */
    public void setFavouriteId(int FavouriteId) {
        this.FavouriteId = FavouriteId;
    }

    /**
     *
     * @return
     * The FavouriteType
     */
    public int getFavouriteType() {
        return FavouriteType;
    }

    /**
     *
     * @param FavouriteType
     * The FavouriteType
     */
    public void setFavouriteType(int FavouriteType) {
        this.FavouriteType = FavouriteType;
    }

    /**
     *
     * @return
     * The Parameters
     */
    public java.util.List<Parameter> getParameters() {
        return Parameters;
    }

    /**
     *
     * @param Parameters
     * The Parameters
     */
    public void setParameters(java.util.List<Parameter> Parameters) {
        this.Parameters = Parameters;
    }

    /**
     *
     * @return
     * The SortOrders
     */
    public java.util.List<SortOrder> getSortOrders() {
        return SortOrders;
    }

    /**
     *
     * @param SortOrders
     * The SortOrders
     */
    public void setSortOrders(java.util.List<SortOrder> SortOrders) {
        this.SortOrders = SortOrders;
    }

    /**
     *
     * @return
     * The MemberProfile
     */
    public MemberProfile getMemberProfile() {
        return MemberProfile;
    }

    /**
     *
     * @param MemberProfile
     * The MemberProfile
     */
    public void setMemberProfile(MemberProfile MemberProfile) {
        this.MemberProfile = MemberProfile;
    }

    /**
     *
     * @return
     * The Ads
     */
    public java.util.List<Ad> getAds() {
        return Ads;
    }

    /**
     *
     * @param Ads
     * The Ads
     */
    public void setAds(java.util.List<Ad> Ads) {
        this.Ads = Ads;
    }

    /**
     *
     * @return
     * The DealPromotionInfo
     */
    public DealPromotionInfo getDealPromotionInfo() {
        return DealPromotionInfo;
    }

    /**
     *
     * @param DealPromotionInfo
     * The DealPromotionInfo
     */
    public void setDealPromotionInfo(DealPromotionInfo DealPromotionInfo) {
        this.DealPromotionInfo = DealPromotionInfo;
    }

}
