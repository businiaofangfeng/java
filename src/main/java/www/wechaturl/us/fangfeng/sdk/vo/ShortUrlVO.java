package www.wechaturl.us.fangfeng.sdk.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class ShortUrlVO implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("entry_type")
  private String entryType;

  private String code;
  private String message;

  @JsonProperty("shorturl")
  private String shortUrl;

  @JsonProperty("longurl")
  private String longUrl;

  private OriginData data;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getShortUrl() {
    return shortUrl;
  }

  public void setShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
  }

  public String getEntryType() {
    return entryType;
  }

  public ShortUrlVO setEntryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ShortUrlVO setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getLongUrl() {
    return longUrl;
  }

  public ShortUrlVO setLongUrl(String longUrl) {
    this.longUrl = longUrl;
    return this;
  }

  public OriginData getData() {
    return data;
  }

  public ShortUrlVO setData(OriginData data) {
    this.data = data;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ShortUrlVO)) return false;
    ShortUrlVO that = (ShortUrlVO) o;
    return Objects.equals(getEntryType(), that.getEntryType()) &&
            Objects.equals(getCode(), that.getCode()) &&
            Objects.equals(getMessage(), that.getMessage()) &&
            Objects.equals(getShortUrl(), that.getShortUrl()) &&
            Objects.equals(getLongUrl(), that.getLongUrl()) &&
            Objects.equals(getData(), that.getData());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getEntryType(), getCode(), getMessage(), getShortUrl(), getLongUrl(), getData());
  }
}

class OriginData implements Serializable{
  private static final long serialVersionUID = 1L;

  private String code;
  @JsonProperty("short_url")
  private String shortUrl;

  public String getCode() {
    return code;
  }

  public OriginData setCode(String code) {
    this.code = code;
    return this;
  }

  public String getShortUrl() {
    return shortUrl;
  }

  public OriginData setShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
    return this;
  }
}
