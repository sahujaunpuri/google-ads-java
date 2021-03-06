// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/keyword_plan_service.proto

package com.google.ads.googleads.v1.services;

public interface KeywordPlanKeywordForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.KeywordPlanKeywordForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Keyword Plan keyword related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
   */
  boolean hasKeywordPlanAdGroupKeyword();
  /**
   * <pre>
   * The resource name of the Keyword Plan keyword related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
   */
  com.google.protobuf.StringValue getKeywordPlanAdGroupKeyword();
  /**
   * <pre>
   * The resource name of the Keyword Plan keyword related to the forecast.
   * `customers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}`
   * </pre>
   *
   * <code>.google.protobuf.StringValue keyword_plan_ad_group_keyword = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getKeywordPlanAdGroupKeywordOrBuilder();

  /**
   * <pre>
   * The forecast for the Keyword Plan keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.ForecastMetrics keyword_forecast = 2;</code>
   */
  boolean hasKeywordForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.ForecastMetrics keyword_forecast = 2;</code>
   */
  com.google.ads.googleads.v1.services.ForecastMetrics getKeywordForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.ForecastMetrics keyword_forecast = 2;</code>
   */
  com.google.ads.googleads.v1.services.ForecastMetricsOrBuilder getKeywordForecastOrBuilder();
}
