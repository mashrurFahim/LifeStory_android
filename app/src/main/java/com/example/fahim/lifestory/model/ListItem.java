package com.example.fahim.lifestory.model;

import android.graphics.drawable.Drawable;

import com.example.fahim.lifestory.R;

import static java.security.AccessController.getContext;

/**
 * Created by Fahim on 2/12/2017.
 */

public class ListItem {
    private int profileImage;
    private String profileName;
    private int catagoryIconId;
    private String catagoryStatus;
    private String statusTime;
    private String profileStatus;
    private int statusImageId;
    private int likeIconId;
    private int likeCounter;
    private String likeText;
    private String likeUpdate;

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public int getLikeIconId() {
        return likeIconId;
    }

    public void setLikeIconId(int likeIconId) {
        this.likeIconId = likeIconId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public int getCatagoryIconId() {
        return catagoryIconId;
    }

    public void setCatagoryIconId(int catagoryIconId) {
        this.catagoryIconId = catagoryIconId;
    }

    public String getCatagoryStatus() {
        return catagoryStatus;
    }

    public void setCatagoryStatus(String catagoryStatus) {
        this.catagoryStatus = catagoryStatus;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }

    public int getStatusImageId() {
        return statusImageId;
    }

    public void setStatusImageId(int statusImageId) {
        this.statusImageId = statusImageId;
    }

    public String getLikeUpdate() {
        return likeUpdate;
    }

    public void setLikeUpdate(String likeUpdate) {
        this.likeUpdate = likeUpdate;
    }

    public int getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(int likeCounter) {
        this.likeCounter = likeCounter;
    }

    public String getLikeText() {
        return likeText;
    }

    public void setLikeText(String likeText) {
        this.likeText = likeText;
    }
}
