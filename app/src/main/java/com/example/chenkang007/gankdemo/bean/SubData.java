package com.example.chenkang007.gankdemo.bean;

import java.util.List;

/**
 * 创建时间：2018/9/3
 * 作者： chenkang007
 * 描述：子目录内容
 */
public class SubData{
  //内容ID
  private String _id;
  //创建时间
  private String creatdAt;
  //内容描述
  private String desc;
  //内容来源
  private String source;
  //上传时间
  private String publishedAt;
  //内容类型
  private String type;
  //地址Url
  private String url;
  //
  private boolean used;
  //作者
  private String who;
  //图片地址列表
  private List<String> images;

  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public String getCreatdAt() {
    return creatdAt;
  }

  public void setCreatdAt(String creatdAt) {
    this.creatdAt = creatdAt;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public boolean isUsed() {
    return used;
  }

  public void setUsed(boolean used) {
    this.used = used;
  }

  public String getWho() {
    return who;
  }

  public void setWho(String who) {
    this.who = who;
  }

  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  @Override
  public String toString() {
    return "SubData{" +
        "_id='" + _id + '\'' +
        ", creatdAt='" + creatdAt + '\'' +
        ", desc='" + desc + '\'' +
        ", source='" + source + '\'' +
        ", publishedAt='" + publishedAt + '\'' +
        ", type='" + type + '\'' +
        ", url='" + url + '\'' +
        ", used=" + used +
        ", who='" + who + '\'' +
        ", images=" + images +
        '}';
  }
}

