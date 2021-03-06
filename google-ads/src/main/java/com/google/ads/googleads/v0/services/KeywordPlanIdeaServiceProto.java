// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v0.services;

public final class KeywordPlanIdeaServiceProto {
  private KeywordPlanIdeaServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeasRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeasRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_KeywordAndUrlSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_KeywordAndUrlSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_KeywordSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_KeywordSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_UrlSeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_UrlSeed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v0/services/keywo" +
      "rd_plan_idea_service.proto\022 google.ads.g" +
      "oogleads.v0.services\0328google/ads/googlea" +
      "ds/v0/common/keyword_plan_common.proto\0328" +
      "google/ads/googleads/v0/enums/keyword_pl" +
      "an_network.proto\032\034google/api/annotations" +
      ".proto\032\036google/protobuf/wrappers.proto\"\351" +
      "\003\n\033GenerateKeywordIdeasRequest\022\023\n\013custom" +
      "er_id\030\001 \001(\t\022.\n\010language\030\007 \001(\0132\034.google.p" +
      "rotobuf.StringValue\022:\n\024geo_target_consta" +
      "nts\030\010 \003(\0132\034.google.protobuf.StringValue\022" +
      "f\n\024keyword_plan_network\030\t \001(\0162H.google.a" +
      "ds.googleads.v0.enums.KeywordPlanNetwork" +
      "Enum.KeywordPlanNetwork\022S\n\024keyword_and_u" +
      "rl_seed\030\002 \001(\01323.google.ads.googleads.v0." +
      "services.KeywordAndUrlSeedH\000\022E\n\014keyword_" +
      "seed\030\003 \001(\0132-.google.ads.googleads.v0.ser" +
      "vices.KeywordSeedH\000\022=\n\010url_seed\030\005 \001(\0132)." +
      "google.ads.googleads.v0.services.UrlSeed" +
      "H\000B\006\n\004seed\"n\n\021KeywordAndUrlSeed\022)\n\003url\030\001" +
      " \001(\0132\034.google.protobuf.StringValue\022.\n\010ke" +
      "ywords\030\002 \003(\0132\034.google.protobuf.StringVal" +
      "ue\"=\n\013KeywordSeed\022.\n\010keywords\030\001 \003(\0132\034.go" +
      "ogle.protobuf.StringValue\"4\n\007UrlSeed\022)\n\003" +
      "url\030\001 \001(\0132\034.google.protobuf.StringValue\"" +
      "k\n\033GenerateKeywordIdeaResponse\022L\n\007result" +
      "s\030\001 \003(\0132;.google.ads.googleads.v0.servic" +
      "es.GenerateKeywordIdeaResult\"\243\001\n\031Generat" +
      "eKeywordIdeaResult\022*\n\004text\030\002 \001(\0132\034.googl" +
      "e.protobuf.StringValue\022Z\n\024keyword_idea_m" +
      "etrics\030\003 \001(\0132<.google.ads.googleads.v0.c" +
      "ommon.KeywordPlanHistoricalMetrics2\356\001\n\026K" +
      "eywordPlanIdeaService\022\323\001\n\024GenerateKeywor" +
      "dIdeas\022=.google.ads.googleads.v0.service" +
      "s.GenerateKeywordIdeasRequest\032=.google.a" +
      "ds.googleads.v0.services.GenerateKeyword" +
      "IdeaResponse\"=\202\323\344\223\0027\"2/v0/customers/{cus" +
      "tomer_id=*}:generateKeywordIdeas:\001*B\202\002\n$" +
      "com.google.ads.googleads.v0.servicesB\033Ke" +
      "ywordPlanIdeaServiceProtoP\001ZHgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v0/services;services\242\002\003GAA\252\002 Google.Ads" +
      ".GoogleAds.V0.Services\312\002 Google\\Ads\\Goog" +
      "leAds\\V0\\Services\352\002$Google::Ads::GoogleA" +
      "ds::V0::Servicesb\006proto3"
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
          com.google.ads.googleads.v0.common.KeywordPlanCommonProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.KeywordPlanNetworkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeasRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeasRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeasRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Language", "GeoTargetConstants", "KeywordPlanNetwork", "KeywordAndUrlSeed", "KeywordSeed", "UrlSeed", "Seed", });
    internal_static_google_ads_googleads_v0_services_KeywordAndUrlSeed_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_KeywordAndUrlSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_KeywordAndUrlSeed_descriptor,
        new java.lang.String[] { "Url", "Keywords", });
    internal_static_google_ads_googleads_v0_services_KeywordSeed_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_KeywordSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_KeywordSeed_descriptor,
        new java.lang.String[] { "Keywords", });
    internal_static_google_ads_googleads_v0_services_UrlSeed_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_UrlSeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_UrlSeed_descriptor,
        new java.lang.String[] { "Url", });
    internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GenerateKeywordIdeaResult_descriptor,
        new java.lang.String[] { "Text", "KeywordIdeaMetrics", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.common.KeywordPlanCommonProto.getDescriptor();
    com.google.ads.googleads.v0.enums.KeywordPlanNetworkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
