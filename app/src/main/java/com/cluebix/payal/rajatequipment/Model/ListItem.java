package com.cluebix.payal.rajatequipment.Model;

public class ListItem {

    String p_name;
    int p_imageId;


    public ListItem(String p_name, int p_imageId) {
        this.p_name = p_name;
        this.p_imageId = p_imageId;
    }


    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_imageId() {
        return p_imageId;
    }

    public void setP_imageId(int p_imageId) {
        this.p_imageId = p_imageId;
    }
}

