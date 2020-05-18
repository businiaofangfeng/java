package www.wechaturl.us.fangfeng.sdk.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class UrlVO implements Serializable {
  private static final long serialVersionUID = 1L;

  Long id;
  String url;
  String scheme;
  @JsonProperty("land_domain")
  String landDomain;
  @JsonProperty("visit_type")
  String visitType;
  @JsonProperty("group_id")
  String groupId;
  @JsonProperty("group_name")
  String groupName;
  @JsonProperty("short_domain_id")
  String shortDomainId;
  @JsonProperty("short_domain_type")
  String shortDomainType;
  String status;
  @JsonProperty("cdn_url_id")
  String cndUrlId;
  @JsonProperty("request_uri")
  String requestUri;
  @JsonProperty("weibo_shorturl")
  String weiboShortUrl;
  @JsonProperty("visit_times")
  String visitTimes;
  @JsonProperty("last_visit_date")
  String lastVisitDate;
  @JsonProperty("check_times")
  String checkTimes;
  @JsonProperty("last_check_date")
  String lastCheckDate;
  String title;
  String keywords;
  String description;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getLandDomain() {
    return landDomain;
  }

  public UrlVO setLandDomain(String landDomain) {
    this.landDomain = landDomain;
    return this;
  }

  public String getScheme() {
    return scheme;
  }

  public UrlVO setScheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  public String getVisitType() {
    return visitType;
  }

  public void setVisitType(String visitType) {
    this.visitType = visitType;
  }

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getRequestUri() {
    return requestUri;
  }

  public void setRequestUri(String requestUri) {
    this.requestUri = requestUri;
  }

  public String getWeiboShortUrl() {
    return weiboShortUrl;
  }

  public void setWeiboShortUrl(String weiboShortUrl) {
    this.weiboShortUrl = weiboShortUrl;
  }

  public String getVisitTimes() {
    return visitTimes;
  }

  public void setVisitTimes(String visitTimes) {
    this.visitTimes = visitTimes;
  }

  public String getLastVisitDate() {
    return lastVisitDate;
  }

  public void setLastVisitDate(String lastVisitDate) {
    this.lastVisitDate = lastVisitDate;
  }

  public String getCheckTimes() {
    return checkTimes;
  }

  public void setCheckTimes(String checkTimes) {
    this.checkTimes = checkTimes;
  }

  public String getLastCheckDate() {
    return lastCheckDate;
  }

  public void setLastCheckDate(String lastCheckDate) {
    this.lastCheckDate = lastCheckDate;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getShortDomainId() {
    return shortDomainId;
  }

  public void setShortDomainId(String shortDomainId) {
    this.shortDomainId = shortDomainId;
  }

  public String getShortDomainType() {
    return shortDomainType;
  }

  public void setShortDomainType(String shortDomainType) {
    this.shortDomainType = shortDomainType;
  }

  public String getCndUrlId() {
    return cndUrlId;
  }

  public void setCndUrlId(String cndUrlId) {
    this.cndUrlId = cndUrlId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof UrlVO)) return false;
    UrlVO urlVO = (UrlVO) o;
    return Objects.equals(getId(), urlVO.getId()) &&
            Objects.equals(getUrl(), urlVO.getUrl()) &&
            Objects.equals(getScheme(), urlVO.getScheme()) &&
            Objects.equals(getLandDomain(), urlVO.getLandDomain()) &&
            Objects.equals(getVisitType(), urlVO.getVisitType()) &&
            Objects.equals(getGroupId(), urlVO.getGroupId()) &&
            Objects.equals(getGroupName(), urlVO.getGroupName()) &&
            Objects.equals(getShortDomainId(), urlVO.getShortDomainId()) &&
            Objects.equals(getShortDomainType(), urlVO.getShortDomainType()) &&
            Objects.equals(getStatus(), urlVO.getStatus()) &&
            Objects.equals(getCndUrlId(), urlVO.getCndUrlId()) &&
            Objects.equals(getRequestUri(), urlVO.getRequestUri()) &&
            Objects.equals(getWeiboShortUrl(), urlVO.getWeiboShortUrl()) &&
            Objects.equals(getVisitTimes(), urlVO.getVisitTimes()) &&
            Objects.equals(getLastVisitDate(), urlVO.getLastVisitDate()) &&
            Objects.equals(getCheckTimes(), urlVO.getCheckTimes()) &&
            Objects.equals(getLastCheckDate(), urlVO.getLastCheckDate()) &&
            Objects.equals(getTitle(), urlVO.getTitle()) &&
            Objects.equals(getKeywords(), urlVO.getKeywords()) &&
            Objects.equals(getDescription(), urlVO.getDescription());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getUrl(), getScheme(), getLandDomain(), getVisitType(), getGroupId(), getGroupName(), getShortDomainId(), getShortDomainType(), getStatus(), getCndUrlId(), getRequestUri(), getWeiboShortUrl(), getVisitTimes(), getLastVisitDate(), getCheckTimes(), getLastCheckDate(), getTitle(), getKeywords(), getDescription());
  }
}
