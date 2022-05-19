package com.nokerakuta.config;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("test")
@Getter
@Setter
public class TestProperties {

  private String about;
  private List<SiteData> sites;

  @Getter
  @Setter
  public static class SiteData {

    private String url;
    private String name;
  }
}
