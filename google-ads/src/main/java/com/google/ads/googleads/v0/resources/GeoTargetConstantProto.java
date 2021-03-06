// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/geo_target_constant.proto

package com.google.ads.googleads.v0.resources;

public final class GeoTargetConstantProto {
  private GeoTargetConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_GeoTargetConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_GeoTargetConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v0/resources/geo_" +
      "target_constant.proto\022!google.ads.google" +
      "ads.v0.resources\032>google/ads/googleads/v" +
      "0/enums/geo_target_constant_status.proto" +
      "\032\036google/protobuf/wrappers.proto\"\200\003\n\021Geo" +
      "TargetConstant\022\025\n\rresource_name\030\001 \001(\t\022\'\n" +
      "\002id\030\003 \001(\0132\033.google.protobuf.Int64Value\022*" +
      "\n\004name\030\004 \001(\0132\034.google.protobuf.StringVal" +
      "ue\0222\n\014country_code\030\005 \001(\0132\034.google.protob" +
      "uf.StringValue\0221\n\013target_type\030\006 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\022b\n\006status\030\007 \001(" +
      "\0162R.google.ads.googleads.v0.enums.GeoTar" +
      "getConstantStatusEnum.GeoTargetConstantS" +
      "tatus\0224\n\016canonical_name\030\010 \001(\0132\034.google.p" +
      "rotobuf.StringValueB\203\002\n%com.google.ads.g" +
      "oogleads.v0.resourcesB\026GeoTargetConstant" +
      "ProtoP\001ZJgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v0/resources;resour" +
      "ces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V0.Reso" +
      "urces\312\002!Google\\Ads\\GoogleAds\\V0\\Resource" +
      "s\352\002%Google::Ads::GoogleAds::V0::Resource" +
      "sb\006proto3"
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
          com.google.ads.googleads.v0.enums.GeoTargetConstantStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_GeoTargetConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_GeoTargetConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_GeoTargetConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "CountryCode", "TargetType", "Status", "CanonicalName", });
    com.google.ads.googleads.v0.enums.GeoTargetConstantStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
