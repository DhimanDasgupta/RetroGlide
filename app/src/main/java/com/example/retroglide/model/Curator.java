package com.example.retroglide.model;

/**
 * Created by dhiman_da on 6/20/2015.
 */
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Curator implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Curator createFromParcel(Parcel in) {
            return new Curator(in);
        }

        public Curator[] newArray(int size) {
            return new Curator[size];
        }
    };
    @Expose
    public String title;
    @Expose
    public String message;
    @Expose
    public String total;
    @SerializedName("total_pages")
    @Expose
    public int totalPages;
    @Expose
    public int page;
    @Expose
    public int limit;
    @Expose
    public List<Dataset> dataset = new ArrayList<Dataset>();

    public Curator(Parcel in) {
        this.title = in.readString();
        this.message = in.readString();
        this.total = in.readString();
        this.totalPages = in.readInt();
        this.page = in.readInt();
        this.limit = in.readInt();
        dataset = new ArrayList<Dataset>();
        in.readTypedList(dataset, Dataset.CREATOR);
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Curator withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public Curator withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     *
     * @return
     * The total
     */
    public String getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    public Curator withTotal(String total) {
        this.total = total;
        return this;
    }

    /**
     *
     * @return
     * The totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     *
     * @param totalPages
     * The total_pages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Curator withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     *
     * @return
     * The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     *
     * @param page
     * The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    public Curator withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     *
     * @return
     * The limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     *
     * @param limit
     * The limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Curator withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *
     * @return
     * The dataset
     */
    public List<Dataset> getDataset() {
        return dataset;
    }

    /**
     *
     * @param dataset
     * The dataset
     */
    public void setDataset(List<Dataset> dataset) {
        this.dataset = dataset;
    }

    public Curator withDataset(List<Dataset> dataset) {
        this.dataset = dataset;
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.message);
        dest.writeString(this.total);
        dest.writeInt(this.totalPages);
        dest.writeInt(this.page);
        dest.writeInt(this.limit);
        dest.writeTypedList(this.dataset);
    }
}
