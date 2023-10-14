package com.teoke.entity.response;

import lombok.Data;

@Data
public class GetUserResponse {

    private Data data;
    private Support support;

    @lombok.Data
    public class Data{
        private int id;
        private String email;
        private String first_name;
        private String last_name;
        private String avatar;
    }

    @lombok.Data
    public class Support {
        private String url;
        private String text;

    }
}
