package web;

import java.util.Date;

public class Message {
    private int id_;
    private String title_;
    private String username_;
    private Date date;
    private String content_;

    public Message() {

    }

    public Message(int id_, String title_, String username_, Date date, String content_) {
        this.id_ = id_;
        this.title_ = title_;
        this.username_ = username_;
        this.date = date;
        this.content_ = content_;
    }

    public String getContent_() {
        return content_;
    }

    public void setContent_(String content_) {
        this.content_ = content_;
    }

    public int getId_() {
        return id_;
    }

    public void setId_(int id_) {
        this.id_ = id_;
    }

    public String getTitle_() {
        return title_;
    }

    public void setTitle_(String title_) {
        this.title_ = title_;
    }

    public String getUsername_() {
        return username_;
    }

    public void setUsername_(String username_) {
        this.username_ = username_;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
