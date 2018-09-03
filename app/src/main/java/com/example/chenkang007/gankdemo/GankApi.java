package com.example.chenkang007.gankdemo;

import com.example.chenkang007.gankdemo.bean.TodayDataBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * 创建时间：2018/8/31
 * 作者： chenkang007
 * 描述：干货网api
 */
public interface GankApi {
  /**
   * 获取最新一日数据
   */
  @GET("today")
  Call<TodayDataBean> getToday();
}
