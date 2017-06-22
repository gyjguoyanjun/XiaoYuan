package com.example.tianjieyu.xiaoyuan.beans;

/**
 * Created by tianjieyu on 2017/6/21.
 */

public class MusicInfo {
    private int pic;
    private String title;
    private String author;

    public MusicInfo(int pic, String title, String author) {
        this.pic = pic;
        this.title = title;
        this.author = author;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "MusicInfo{" +
                "pic=" + pic +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
