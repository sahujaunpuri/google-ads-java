// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/campaign_criterion.proto

package com.google.ads.googleads.v0.resources;

public final class CampaignCriterionProto {
  private CampaignCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_CampaignCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_CampaignCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v0/resources/camp" +
      "aign_criterion.proto\022!google.ads.googlea" +
      "ds.v0.resources\032-google/ads/googleads/v0" +
      "/common/criteria.proto\0322google/ads/googl" +
      "eads/v0/enums/criterion_type.proto\032\036goog" +
      "le/protobuf/wrappers.proto\"\244\017\n\021CampaignC" +
      "riterion\022\025\n\rresource_name\030\001 \001(\t\022.\n\010campa" +
      "ign\030\004 \001(\0132\034.google.protobuf.StringValue\022" +
      "1\n\014criterion_id\030\005 \001(\0132\033.google.protobuf." +
      "Int64Value\0221\n\014bid_modifier\030\016 \001(\0132\033.googl" +
      "e.protobuf.FloatValue\022,\n\010negative\030\007 \001(\0132" +
      "\032.google.protobuf.BoolValue\022L\n\004type\030\006 \001(" +
      "\0162>.google.ads.googleads.v0.enums.Criter" +
      "ionTypeEnum.CriterionType\022>\n\007keyword\030\010 \001" +
      "(\0132+.google.ads.googleads.v0.common.Keyw" +
      "ordInfoH\000\022B\n\tplacement\030\t \001(\0132-.google.ad" +
      "s.googleads.v0.common.PlacementInfoH\000\022T\n" +
      "\023mobile_app_category\030\n \001(\01325.google.ads." +
      "googleads.v0.common.MobileAppCategoryInf" +
      "oH\000\022@\n\010location\030\014 \001(\0132,.google.ads.googl" +
      "eads.v0.common.LocationInfoH\000\022<\n\006device\030" +
      "\r \001(\0132*.google.ads.googleads.v0.common.D" +
      "eviceInfoH\000\022E\n\013ad_schedule\030\017 \001(\0132..googl" +
      "e.ads.googleads.v0.common.AdScheduleInfo" +
      "H\000\022A\n\tage_range\030\020 \001(\0132,.google.ads.googl" +
      "eads.v0.common.AgeRangeInfoH\000\022<\n\006gender\030" +
      "\021 \001(\0132*.google.ads.googleads.v0.common.G" +
      "enderInfoH\000\022G\n\014income_range\030\022 \001(\0132/.goog" +
      "le.ads.googleads.v0.common.IncomeRangeIn" +
      "foH\000\022M\n\017parental_status\030\023 \001(\01322.google.a" +
      "ds.googleads.v0.common.ParentalStatusInf" +
      "oH\000\022A\n\tuser_list\030\026 \001(\0132,.google.ads.goog" +
      "leads.v0.common.UserListInfoH\000\022I\n\ryoutub" +
      "e_video\030\024 \001(\01320.google.ads.googleads.v0." +
      "common.YouTubeVideoInfoH\000\022M\n\017youtube_cha" +
      "nnel\030\025 \001(\01322.google.ads.googleads.v0.com" +
      "mon.YouTubeChannelInfoH\000\022B\n\tproximity\030\027 " +
      "\001(\0132-.google.ads.googleads.v0.common.Pro" +
      "ximityInfoH\000\022:\n\005topic\030\030 \001(\0132).google.ads" +
      ".googleads.v0.common.TopicInfoH\000\022I\n\rlist" +
      "ing_scope\030\031 \001(\01320.google.ads.googleads.v" +
      "0.common.ListingScopeInfoH\000\022@\n\010language\030" +
      "\032 \001(\0132,.google.ads.googleads.v0.common.L" +
      "anguageInfoH\000\022?\n\010ip_block\030\033 \001(\0132+.google" +
      ".ads.googleads.v0.common.IpBlockInfoH\000\022I" +
      "\n\rcontent_label\030\034 \001(\01320.google.ads.googl" +
      "eads.v0.common.ContentLabelInfoH\000\022>\n\007car" +
      "rier\030\035 \001(\0132+.google.ads.googleads.v0.com" +
      "mon.CarrierInfoH\000\022I\n\ruser_interest\030\036 \001(\013" +
      "20.google.ads.googleads.v0.common.UserIn" +
      "terestInfoH\000\022>\n\007webpage\030\037 \001(\0132+.google.a" +
      "ds.googleads.v0.common.WebpageInfoH\000\022^\n\030" +
      "operating_system_version\030  \001(\0132:.google." +
      "ads.googleads.v0.common.OperatingSystemV" +
      "ersionInfoH\000B\013\n\tcriterionB\203\002\n%com.google" +
      ".ads.googleads.v0.resourcesB\026CampaignCri" +
      "terionProtoP\001ZJgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v0/resources;" +
      "resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V" +
      "0.Resources\312\002!Google\\Ads\\GoogleAds\\V0\\Re" +
      "sources\352\002%Google::Ads::GoogleAds::V0::Re" +
      "sourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_CampaignCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_CampaignCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_CampaignCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "BidModifier", "Negative", "Type", "Keyword", "Placement", "MobileAppCategory", "Location", "Device", "AdSchedule", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Proximity", "Topic", "ListingScope", "Language", "IpBlock", "ContentLabel", "Carrier", "UserInterest", "Webpage", "OperatingSystemVersion", "Criterion", });
    com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
