package www.wechaturl.us.fangfeng.sdk.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class EntryDomainUrlVO implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("layer_type")
  private String layerType;
  private String scheme;
  private String domain;
  private String status;
  @JsonProperty("is_monitor")
  private String isMonitor;
  @JsonProperty("is_wide_resolve")
  private String isWideResolve;

  public String getLayerType() {
    return layerType;
  }

  public void setLayerType(String layerType) {
    this.layerType = layerType;
  }

  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
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

  public String getIsWideResolve() {
    return isWideResolve;
  }

  public void setIsWideResolve(String isWideResolve) {
    this.isWideResolve = isWideResolve;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof EntryDomainUrlVO)) return false;
    EntryDomainUrlVO that = (EntryDomainUrlVO) o;
    return Objects.equals(getLayerType(), that.getLayerType()) &&
            Objects.equals(getScheme(), that.getScheme()) &&
            Objects.equals(getDomain(), that.getDomain()) &&
            Objects.equals(getStatus(), that.getStatus()) &&
            Objects.equals(getIsMonitor(), that.getIsMonitor()) &&
            Objects.equals(getIsWideResolve(), that.getIsWideResolve());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getLayerType(), getScheme(), getDomain(), getStatus(), getIsMonitor(), getIsWideResolve());
  }
}
