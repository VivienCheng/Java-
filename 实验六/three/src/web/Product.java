package web;

public class Product {
    private int id_;
    private String name_;
    private int price_;
    private String form_;

    public Product(int id_, String name_, int price_, String form_) {
        this.id_ = id_;
        this.name_ = name_;
        this.price_ = price_;
        this.form_ = form_;
    }


    public Product() {


    }


    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public int getPrice_() {
        return price_;
    }

    public void setPrice_(int price_) {
        this.price_ = price_;
    }

    public String getForm_() {
        return form_;
    }

    public void setForm_(String form_) {
        this.form_ = form_;
    }
}

