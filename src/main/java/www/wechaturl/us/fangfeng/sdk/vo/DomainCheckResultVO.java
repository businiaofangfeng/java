package www.wechaturl.us.fangfeng.sdk.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class DomainCheckResultVO implements Serializable {
  private static final long serialVersionUID = 1L;

  private String code;
  private String msg;
  private String url;
  @JsonProperty("check_type")
  private String checkType;
  private String message;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getCheckType() {
    return checkType;
  }

  public void setCheckType(String checkType) {
    this.checkType = checkType;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof DomainCheckResultVO)) return false;
    DomainCheckResultVO that = (DomainCheckResultVO) o;
    return Objects.equals(getCode(), that.getCode()) &&
            Objects.equals(getMsg(), that.getMsg()) &&
            Objects.equals(getUrl(), that.getUrl()) &&
            Objects.equals(getCheckType(), that.getCheckType()) &&
            Objects.equals(getMessage(), that.getMessage());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCode(), getMsg(), getUrl(), getCheckType(), getMessage());
  }
}
