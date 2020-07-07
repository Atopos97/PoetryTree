package com.wenxuan.demo.Login.Entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Users {
    private Long uuu001;
    private String uuu002;
    private String uuu003;
    private String uuu004;
    private String uuu005;
    private Long uuu006;
    private String uuu007;
    private String uuu008;
    private Long uuu009;
    private String uuu010;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long getUuu001() {
        return uuu001;
    }

    public void setUuu001(Long uuu001) {
        this.uuu001 = uuu001;
    }
    @Column
    public String getUuu002() {
        return uuu002;
    }

    public void setUuu002(String uuu002) {
        this.uuu002 = uuu002;
    }
    @Column
    public String getUuu003() {
        return uuu003;
    }

    public void setUuu003(String uuu003) {
        this.uuu003 = uuu003;
    }
    @Column
    public String getUuu004() {
        return uuu004;
    }

    public void setUuu004(String uuu004) {
        this.uuu004 = uuu004;
    }
    @Column
    public String getUuu005() {
        return uuu005;
    }

    public void setUuu005(String uuu005) {
        this.uuu005 = uuu005;
    }
    @Column
    public Long getUuu006() {
        return uuu006;
    }

    public void setUuu006(Long uuu006) {
        this.uuu006 = uuu006;
    }
    @Column
    public String getUuu007() {
        return uuu007;
    }

    public void setUuu007(String uuu007) {
        this.uuu007 = uuu007;
    }
    @Column
    public String getUuu008() {
        return uuu008;
    }

    public void setUuu008(String uuu008) {
        this.uuu008 = uuu008;
    }
    @Column
    public Long getUuu009() {
        return uuu009;
    }

    public void setUuu009(Long uuu009) {
        this.uuu009 = uuu009;
    }
    @Column
    public String getUuu010() {
        return uuu010;
    }

    public void setUuu010(String uuu010) {
        this.uuu010 = uuu010;
    }
}
