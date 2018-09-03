package com.example.chenkang007.gankdemo.bean;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

/**
 * 创建时间：2018/8/31
 * 作者： chenkang007
 * 描述：今日数据
 */
public class TodayDataBean implements Serializable{
  @Expose
  public List<String> category;

  @Expose
  public boolean error;
  @Expose
  public List<Data> result;

  public static class Data{
    private List<SubData> subDatas;
  }

  @Override
  public String toString() {
    return "TodayDataBean{" +
        "category=" + category +
        ", error=" + error +
        ", result=" + result +
        '}';
  }
}
