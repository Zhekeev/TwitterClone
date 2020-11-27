package com.example.sweater.entity.dto;

import com.example.sweater.entity.Message;
import com.example.sweater.entity.User;
import com.example.sweater.entity.util.MessageHelper;

public class MessageDto {
    private Long id;
    private String text;
    private String tag;
    private User author;
    private String filename;
    private Boolean meLiked;

    public MessageDto(Message message) {
        this.id = message.getId();
        this.text = message.getText();
        this.tag = message.getTag();
        this.author = message.getAuthor();
        this.filename = message.getFileName();
    }

    public String getAuthorName() {
        return MessageHelper.getAuthorName(author);
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getTag() {
        return tag;
    }

    public User getAuthor() {
        return author;
    }

    public String getFilename() {
        return filename;
    }


    public Boolean getMeLiked() {
        return meLiked;
    }
}
