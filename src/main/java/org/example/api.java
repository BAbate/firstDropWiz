package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class api {
    private long id;
    private String content;

    public api() {
        // Jackson deserialization
    }

    public api(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
