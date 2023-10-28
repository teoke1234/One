package com.teoke.testdata;

import io.github.sskorol.data.Column;
import io.github.sskorol.data.Sheet;
import lombok.Getter;


@Getter
@Sheet(name = "TESTDATA")
public class TestData {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "titlehomepageexpected")
    private String titleHomePageExpected;

    @Column(name = "footertextexpected")
    private String footerTextExpected;

}

