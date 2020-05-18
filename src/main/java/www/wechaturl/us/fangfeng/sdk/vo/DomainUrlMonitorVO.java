package www.wechaturl.us.fangfeng.sdk.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class DomainUrlMonitorVO implements Serializable {
  private static final long serialVersionUID = 1L;

  private String url;
  @JsonProperty("check_type")
  private String checkType;
  private String status;
  @JsonProperty("is_monitor")
  private String isMonitor;
  private String frequency;
  @JsonProperty("last_check_date")
  private String lastCheckDate;
  @JsonProperty("check_times")
  private String checkTimes;

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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getIsMonitor() {
    return isMonitor;
  }

  public void setIsMonitor(String isMonitor) {
    this.isMonitor = isMonitor;
  }

  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public String getLastCheckDate() {
    return lastCheckDate;
  }

  public void setLastCheckDate(String lastCheckDate) {
    this.lastCheckDate = lastCheckDate;
  }

  public String getCheckTimes() {
    return checkTimes;
  }

  public void setCheckTimes(String checkTimes) {
    this.checkTimes = checkTimes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof DomainUrlMonitorVO)) return false;
    DomainUrlMonitorVO that = (DomainUrlMonitorVO) o;
    return Objects.equals(getUrl(), that.getUrl()) &&
            Objects.equals(getCheckType(), that.getCheckType()) &&
            Objects.equals(getStatus(), that.getStatus()) &&
            Objects.equals(getIsMonitor(), that.getIsMonitor()) &&
            Objects.equals(getFrequency(), that.getFrequency()) &&
            Objects.equals(getLastCheckDate(), that.getLastCheckDate()) &&
            Objects.equals(getCheckTimes(), that.getCheckTimes());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUrl(), getCheckType(), getStatus(), getIsMonitor(), getFrequency(), getLastCheckDate(), getCheckTimes());
  }
}
