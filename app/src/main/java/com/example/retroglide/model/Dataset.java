package com.example.retroglide.model;

/**
 * Created by dhiman_da on 6/20/2015.
 */

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dataset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Dataset createFromParcel(Parcel in) {
            return new Dataset(in);
        }

        public Dataset[] newArray(int size) {
            return new Dataset[size];
        }
    };
    @SerializedName("curator_id")
    @Expose
    public String curatorId;
    @SerializedName("curator_handle")
    @Expose
    public String curatorHandle;
    @SerializedName("curator_url")
    @Expose
    public String curatorUrl;
    @SerializedName("curator_site_url")
    @Expose
    public String curatorSiteUrl;
    @SerializedName("curator_image_file")
    @Expose
    public String curatorImageFile;
    @SerializedName("curator_type")
    @Expose
    public String curatorType;
    @SerializedName("curator_title")
    @Expose
    public String curatorTitle;
    @SerializedName("curator_tagline")
    @Expose
    public String curatorTagline;
    @SerializedName("curator_bio")
    @Expose
    public String curatorBio;
    @SerializedName("curator_favorites")
    @Expose
    public String curatorFavorites;
    @SerializedName("curator_comments")
    @Expose
    public String curatorComments;
    @SerializedName("curator_playlists")
    @Expose
    public String curatorPlaylists;
    @SerializedName("curator_date_created")
    @Expose
    public String curatorDateCreated;

    public Dataset(Parcel in) {
        this.curatorId = in.readString();
        this.curatorHandle = in.readString();
        this.curatorUrl = in.readString();
        this.curatorSiteUrl = in.readString();
        this.curatorImageFile = in.readString();
        this.curatorType = in.readString();
        this.curatorTitle = in.readString();
        this.curatorTagline = in.readString();
        this.curatorBio = in.readString();
        this.curatorFavorites = in.readString();
        this.curatorComments = in.readString();
        this.curatorPlaylists = in.readString();
        this.curatorDateCreated = in.readString();
    }

    /**
     * @return The curatorId
     */
    public String getCuratorId() {
        return curatorId;
    }

    /**
     * @param curatorId The curator_id
     */
    public void setCuratorId(String curatorId) {
        this.curatorId = curatorId;
    }

    public Dataset withCuratorId(String curatorId) {
        this.curatorId = curatorId;
        return this;
    }

    /**
     * @return The curatorHandle
     */
    public String getCuratorHandle() {
        return curatorHandle;
    }

    /**
     * @param curatorHandle The curator_handle
     */
    public void setCuratorHandle(String curatorHandle) {
        this.curatorHandle = curatorHandle;
    }

    public Dataset withCuratorHandle(String curatorHandle) {
        this.curatorHandle = curatorHandle;
        return this;
    }

    /**
     * @return The curatorUrl
     */
    public String getCuratorUrl() {
        return curatorUrl;
    }

    /**
     * @param curatorUrl The curator_url
     */
    public void setCuratorUrl(String curatorUrl) {
        this.curatorUrl = curatorUrl;
    }

    public Dataset withCuratorUrl(String curatorUrl) {
        this.curatorUrl = curatorUrl;
        return this;
    }

    /**
     * @return The curatorSiteUrl
     */
    public String getCuratorSiteUrl() {
        return curatorSiteUrl;
    }

    /**
     * @param curatorSiteUrl The curator_site_url
     */
    public void setCuratorSiteUrl(String curatorSiteUrl) {
        this.curatorSiteUrl = curatorSiteUrl;
    }

    public Dataset withCuratorSiteUrl(String curatorSiteUrl) {
        this.curatorSiteUrl = curatorSiteUrl;
        return this;
    }

    /**
     * @return The curatorImageFile
     */
    public String getCuratorImageFile() {
        return curatorImageFile;
    }

    /**
     * @param curatorImageFile The curator_image_file
     */
    public void setCuratorImageFile(String curatorImageFile) {
        this.curatorImageFile = curatorImageFile;
    }

    public Dataset withCuratorImageFile(String curatorImageFile) {
        this.curatorImageFile = curatorImageFile;
        return this;
    }

    /**
     * @return The curatorType
     */
    public String getCuratorType() {
        return curatorType;
    }

    /**
     * @param curatorType The curator_type
     */
    public void setCuratorType(String curatorType) {
        this.curatorType = curatorType;
    }

    public Dataset withCuratorType(String curatorType) {
        this.curatorType = curatorType;
        return this;
    }

    /**
     * @return The curatorTitle
     */
    public String getCuratorTitle() {
        return curatorTitle;
    }

    /**
     * @param curatorTitle The curator_title
     */
    public void setCuratorTitle(String curatorTitle) {
        this.curatorTitle = curatorTitle;
    }

    public Dataset withCuratorTitle(String curatorTitle) {
        this.curatorTitle = curatorTitle;
        return this;
    }

    /**
     * @return The curatorTagline
     */
    public String getCuratorTagline() {
        return curatorTagline;
    }

    /**
     * @param curatorTagline The curator_tagline
     */
    public void setCuratorTagline(String curatorTagline) {
        this.curatorTagline = curatorTagline;
    }

    public Dataset withCuratorTagline(String curatorTagline) {
        this.curatorTagline = curatorTagline;
        return this;
    }

    /**
     * @return The curatorBio
     */
    public String getCuratorBio() {
        return curatorBio;
    }

    /**
     * @param curatorBio The curator_bio
     */
    public void setCuratorBio(String curatorBio) {
        this.curatorBio = curatorBio;
    }

    public Dataset withCuratorBio(String curatorBio) {
        this.curatorBio = curatorBio;
        return this;
    }

    /**
     * @return The curatorFavorites
     */
    public String getCuratorFavorites() {
        return curatorFavorites;
    }

    /**
     * @param curatorFavorites The curator_favorites
     */
    public void setCuratorFavorites(String curatorFavorites) {
        this.curatorFavorites = curatorFavorites;
    }

    public Dataset withCuratorFavorites(String curatorFavorites) {
        this.curatorFavorites = curatorFavorites;
        return this;
    }

    /**
     * @return The curatorComments
     */
    public String getCuratorComments() {
        return curatorComments;
    }

    /**
     * @param curatorComments The curator_comments
     */
    public void setCuratorComments(String curatorComments) {
        this.curatorComments = curatorComments;
    }

    public Dataset withCuratorComments(String curatorComments) {
        this.curatorComments = curatorComments;
        return this;
    }

    /**
     * @return The curatorPlaylists
     */
    public String getCuratorPlaylists() {
        return curatorPlaylists;
    }

    /**
     * @param curatorPlaylists The curator_playlists
     */
    public void setCuratorPlaylists(String curatorPlaylists) {
        this.curatorPlaylists = curatorPlaylists;
    }

    public Dataset withCuratorPlaylists(String curatorPlaylists) {
        this.curatorPlaylists = curatorPlaylists;
        return this;
    }

    /**
     * @return The curatorDateCreated
     */
    public String getCuratorDateCreated() {
        return curatorDateCreated;
    }

    /**
     * @param curatorDateCreated The curator_date_created
     */
    public void setCuratorDateCreated(String curatorDateCreated) {
        this.curatorDateCreated = curatorDateCreated;
    }

    public Dataset withCuratorDateCreated(String curatorDateCreated) {
        this.curatorDateCreated = curatorDateCreated;
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.curatorId);
        dest.writeString(this.curatorHandle);
        dest.writeString(this.curatorUrl);
        dest.writeString(this.curatorSiteUrl);
        dest.writeString(this.curatorImageFile);
        dest.writeString(this.curatorType);
        dest.writeString(this.curatorTitle);
        dest.writeString(this.curatorTagline);
        dest.writeString(this.curatorBio);
        dest.writeString(this.curatorFavorites);
        dest.writeString(this.curatorComments);
        dest.writeString(this.curatorPlaylists);
        dest.writeString(this.curatorDateCreated);
    }
}
