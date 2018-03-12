package web;

import web.Message;

import java.util.ArrayList;

public class messages {
    static ArrayList <Message> data_;

    public messages() {
        data_ = new ArrayList<Message>();
    }

    public messages(ArrayList<Message> data_) {
        this.data_ = data_;
    }

    public ArrayList<Message> getData_() {
        return data_;
    }

    public void setData_(ArrayList<Message> data_) {
        this.data_ = data_;
    }

    public static void addMessage(Message message){
        data_.add(message);
    }

    public static int count(){
        return data_.size();
    }
}
