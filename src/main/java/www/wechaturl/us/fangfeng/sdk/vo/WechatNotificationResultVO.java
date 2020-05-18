package www.wechaturl.us.fangfeng.sdk.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class WechatNotificationResultVO implements Serializable{
  private static final long serialVersionUID = 1L;

  String code;
  String message;
  Content data;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Content getData() {
    return data;
  }

  public void setData(Content data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof WechatNotificationResultVO)) return false;
    WechatNotificationResultVO that = (WechatNotificationResultVO) o;
    return Objects.equals(getCode(), that.getCode()) &&
            Objects.equals(getMessage(), that.getMessage()) &&
            Objects.equals(getData(), that.getData());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCode(), getMessage(), getData());
  }
}

class Content implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("errcode")
  String errorCode;
  @JsonProperty("errmsg")
  String errorMessage;
  @JsonProperty("msgid")
  String messageId;

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Content)) return false;
    Content content = (Content) o;
    return Objects.equals(getErrorCode(), content.getErrorCode()) &&
            Objects.equals(getErrorMessage(), content.getErrorMessage()) &&
            Objects.equals(getMessageId(), content.getMessageId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getErrorCode(), getErrorMessage(), getMessageId());
  }
}
