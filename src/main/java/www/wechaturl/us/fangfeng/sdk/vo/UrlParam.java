package www.wechaturl.us.fangfeng.sdk.vo;

import java.io.Serializable;
import java.util.Objects;

public class UrlParam implements Serializable {

  private static final Long serialVersionUID = 1L;

  private String id;
  private int appid;
  private String appkey;
  private String url;
  private String ip;
  private String requestUri;
  private String domain;
  private String type;
  private int status;
  private String checkType;
  private String entryType;
  private int frequency;
  private int isMonitor;
  private String visitType;
  private String layerType;
  private String newLandDomainUrl;
  private int groupId;
  private String title;
  private String keywords;
  private String description;
  private int page;
  private int rows;

  private UrlParam() {
  }

  public UrlParam(int appid, String appkey) {
    this.appid = appid;
    this.appkey = appkey;
    this.groupId = -1;
    this.isMonitor = -1;
    this.status = -1;
  }

  public UrlParam(int appid, String appkey, String url) {
    this.appid = appid;
    this.appkey = appkey;
    this.url = url;
    this.groupId = -1;
    this.isMonitor = -1;
    this.status = -1;
  }

  public UrlParam(int appid, String appkey, String url, int groupId) {
    this.appid = appid;
    this.appkey = appkey;
    this.url = url;
    this.groupId = groupId;
    this.isMonitor = -1;
    this.status = -1;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAppid() {
    return String.valueOf(appid);
  }

  public UrlParam setAppid(int appid) {
    this.appid = appid;
    return this;
  }

  public String getAppkey() {
    return appkey;
  }

  public UrlParam setAppkey(String appkey) {
    this.appkey = appkey;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public UrlParam setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getRequestUri() {
    return requestUri;
  }

  public UrlParam setRequestUri(String requestUri) {
    this.requestUri = requestUri;
    return this;
  }

  public String getDomain() {
    return domain;
  }

  public UrlParam setDomain(String domain) {
    this.domain = domain;
    return this;
  }

  public String getType() {
    return type;
  }

  public UrlParam setType(String type) {
    this.type = type;
    return this;
  }

  public String getStatus() {
    return status == -1 ? "" : String.valueOf(this.status);
  }

  public UrlParam setStatus(int status) {
    this.status = status;
    return this;
  }

  public String getFrequency() {
    return frequency == 0 ? "" : String.valueOf(frequency);
  }

  public UrlParam setFrequency(int frequency) {
    this.frequency = frequency;
    return this;
  }

  public String getLayerType() {
    return layerType;
  }

  public UrlParam setLayerType(String layerType) {
    this.layerType = layerType;
    return this;
  }

  public String getIsMonitor() {
    return isMonitor == -1 ? "" : String.valueOf(isMonitor);
  }

  public UrlParam setIsMonitor(int isMonitor) {
    this.isMonitor = isMonitor;
    return this;
  }

  public String getCheckType() {
    return checkType;
  }

  public UrlParam setCheckType(String checkType) {
    this.checkType = checkType;
    return this;
  }

  public String getEntryType() {
    return entryType;
  }

  public UrlParam setEntryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

  public String getVisitType() {
    return visitType;
  }

  public UrlParam setVisitType(String visitType) {
    this.visitType = visitType;
    return this;
  }

  public String getIp() {
    return ip;
  }

  public UrlParam setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getNewLandDomainUrl() {
    return newLandDomainUrl;
  }

  public UrlParam setNewLandDomainUrl(String newLandDomainUrl) {
    this.newLandDomainUrl = newLandDomainUrl;
    return this;
  }

  public String getGroupId() {
    return groupId == -1 ? "" : String.valueOf(groupId);
  }

  public UrlParam setGroupId(int groupId) {
    this.groupId = groupId;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public UrlParam setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getKeywords() {
    return keywords;
  }

  public UrlParam setKeywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public UrlParam setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getPage() {
    return page == 0 ? "" : String.valueOf(page);
  }

  public UrlParam setPage(int page) {
    this.page = page;
    return this;
  }

  public String getRows() {
    return rows == 0 ? "" : String.valueOf(rows);
  }

  public UrlParam setRows(int rows) {
    this.rows = rows;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof UrlParam)) return false;
    UrlParam urlParam = (UrlParam) o;
    return getAppid() == urlParam.getAppid() &&
            getFrequency() == urlParam.getFrequency() &&
            getIsMonitor() == urlParam.getIsMonitor() &&
            getGroupId() == urlParam.getGroupId() &&
            getPage() == urlParam.getPage() &&
            getRows() == urlParam.getRows() &&
            Objects.equals(getAppkey(), urlParam.getAppkey()) &&
            Objects.equals(getUrl(), urlParam.getUrl()) &&
            Objects.equals(getRequestUri(), urlParam.getRequestUri()) &&
            Objects.equals(getDomain(), urlParam.getDomain()) &&
            Objects.equals(getType(), urlParam.getType()) &&
            Objects.equals(getCheckType(), urlParam.getCheckType()) &&
            Objects.equals(getVisitType(), urlParam.getVisitType()) &&
            Objects.equals(getLayerType(), urlParam.getLayerType()) &&
            Objects.equals(getNewLandDomainUrl(), urlParam.getNewLandDomainUrl()) &&
            Objects.equals(getTitle(), urlParam.getTitle()) &&
            Objects.equals(getKeywords(), urlParam.getKeywords()) &&
            Objects.equals(getDescription(), urlParam.getDescription());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAppid(), getAppkey(), getUrl(), getRequestUri(), getDomain(), getType(), getCheckType(), getFrequency(), getIsMonitor(), getVisitType(), getLayerType(), getNewLandDomainUrl(), getGroupId(), getTitle(), getKeywords(), getDescription(), getPage(), getRows());
  }
}
