// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/keyword_view_service.proto

package com.google.ads.googleads.v1.services;

public final class KeywordViewServiceProto {
  private KeywordViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetKeywordViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetKeywordViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v1/services/keywo" +
      "rd_view_service.proto\022 google.ads.google" +
      "ads.v1.services\0324google/ads/googleads/v1" +
      "/resources/keyword_view.proto\032\034google/ap" +
      "i/annotations.proto\".\n\025GetKeywordViewReq" +
      "uest\022\025\n\rresource_name\030\001 \001(\t2\310\001\n\022KeywordV" +
      "iewService\022\261\001\n\016GetKeywordView\0227.google.a" +
      "ds.googleads.v1.services.GetKeywordViewR" +
      "equest\032..google.ads.googleads.v1.resourc" +
      "es.KeywordView\"6\202\323\344\223\0020\022./v1/{resource_na" +
      "me=customers/*/keywordViews/*}B\376\001\n$com.g" +
      "oogle.ads.googleads.v1.servicesB\027Keyword" +
      "ViewServiceProtoP\001ZHgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v1/servi" +
      "ces;services\242\002\003GAA\252\002 Google.Ads.GoogleAd" +
      "s.V1.Services\312\002 Google\\Ads\\GoogleAds\\V1\\" +
      "Services\352\002$Google::Ads::GoogleAds::V1::S" +
      "ervicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.KeywordViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetKeywordViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetKeywordViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetKeywordViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.KeywordViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
