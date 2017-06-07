package com.example.fajar.learnyourself.RecyclerView;

/**
 * Created by Fajar on 6/5/2017.
 */

public class MateriModel {
    int icon;
    String title, intro, content;

    public MateriModel(int icon, String title, String intro, String content) {
        this.icon = icon;
        this.title = title;
        this.intro = intro;
        this.content = content;
    }

    public int getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getIntro() {
        return intro;
    }

    public String getContent() {
        return content;
    }
}
