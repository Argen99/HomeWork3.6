package com.geektech.homework36;

public class Model {

    private int image;
    private String name;
    private int keyId;

    public Model(int image, String name) {
        this.image = image;
        this.name = name;

    }

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
