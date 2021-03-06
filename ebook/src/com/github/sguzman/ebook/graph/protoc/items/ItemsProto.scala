// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.sguzman.ebook.graph.protoc.items

object ItemsProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.github.sguzman.ebook.graph.protoc.items.Link,
    com.github.sguzman.ebook.graph.protoc.items.Size,
    com.github.sguzman.ebook.graph.protoc.items.Details,
    com.github.sguzman.ebook.graph.protoc.items.Ebook,
    com.github.sguzman.ebook.graph.protoc.items.PageDimension,
    com.github.sguzman.ebook.graph.protoc.items.Hosting,
    com.github.sguzman.ebook.graph.protoc.items.StoreEbook,
    com.github.sguzman.ebook.graph.protoc.items.ItemStore,
    com.github.sguzman.ebook.graph.protoc.items.Store
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CjFjb20vZ2l0aHViL3NndXptYW4vZWJvb2svZ3JhcGgvcHJvdG9jL2l0ZW1zLnByb3RvEiVjb20uZ2l0aHViLnNndXptYW4uZ
  WJvb2suZ3JhcGgucHJvdG9jIhoKBExpbmsSEgoEbGluaxgBIAEoCVIEbGluayKCAQoEU2l6ZRISCgRzaXplGAEgASgCUgRzaXplE
  kUKBHR5cGUYAiABKA4yMS5jb20uZ2l0aHViLnNndXptYW4uZWJvb2suZ3JhcGgucHJvdG9jLlNpemUuVHlwZXNSBHR5cGUiHwoFV
  HlwZXMSBgoCS2IQABIGCgJNYhABEgYKAkdiEAIi+gEKB0RldGFpbHMSGAoHYXV0aG9ycxgBIAEoCVIHYXV0aG9ycxIYCgdwdWJEY
  XRlGAIgASgJUgdwdWJEYXRlEhYKBmlzYm4xMBgDIAEoCVIGaXNibjEwEhYKBmlzYm4xMxgEIAEoCVIGaXNibjEzEhwKCXB1Ymxpc
  2hlchgFIAEoCVIJcHVibGlzaGVyEhQKBXBhZ2VzGAYgASgNUgVwYWdlcxIWCgZmb3JtYXQYByABKAlSBmZvcm1hdBI/CgRzaXplG
  AggASgLMisuY29tLmdpdGh1Yi5zZ3V6bWFuLmVib29rLmdyYXBoLnByb3RvYy5TaXplUgRzaXplIpQDCgVFYm9vaxIUCgV0aXRsZ
  RgBIAEoCVIFdGl0bGUSEgoEZGF0ZRgCIAEoCVIEZGF0ZRIQCgNpbWcYAyABKAlSA2ltZxISCgRkZXNjGAQgASgMUgRkZXNjEg4KA
  mlkGAUgASgNUgJpZBJGCgZkZXRhaWwYBiABKAsyLi5jb20uZ2l0aHViLnNndXptYW4uZWJvb2suZ3JhcGgucHJvdG9jLkRldGFpb
  HNSBmRldGFpbBIeCgpjYXRlZ29yaWVzGAcgAygJUgpjYXRlZ29yaWVzEkEKBWxpbmtzGAggAygLMisuY29tLmdpdGh1Yi5zZ3V6b
  WFuLmVib29rLmdyYXBoLnByb3RvYy5MaW5rUgVsaW5rcxI/CgRwcmV2GAkgASgLMisuY29tLmdpdGh1Yi5zZ3V6bWFuLmVib29rL
  mdyYXBoLnByb3RvYy5MaW5rUgRwcmV2Ej8KBG5leHQYCiABKAsyKy5jb20uZ2l0aHViLnNndXptYW4uZWJvb2suZ3JhcGgucHJvd
  G9jLkxpbmtSBG5leHQiswEKDVBhZ2VEaW1lbnNpb24SFgoGaGVpZ2h0GAEgASgCUgZoZWlnaHQSFAoFd2lkdGgYAiABKAJSBXdpZ
  HRoElAKBXVuaXRzGAMgASgOMjouY29tLmdpdGh1Yi5zZ3V6bWFuLmVib29rLmdyYXBoLnByb3RvYy5QYWdlRGltZW5zaW9uLlVua
  XRzUgV1bml0cyIiCgVVbml0cxIHCgNQVFMQABIGCgJQWBABEggKBElOQ0gQAiKFAwoHSG9zdGluZxIaCgh0b3BUaXRsZRgBIAEoC
  VIIdG9wVGl0bGUSGgoIZmlsZVR5cGUYAiABKAlSCGZpbGVUeXBlEhQKBXRpdGxlGAMgASgJUgV0aXRsZRIWCgZhdXRob3IYBCABK
  AlSBmF1dGhvchIYCgdjcmVhdG9yGAUgASgJUgdjcmVhdG9yEhoKCHByb2R1Y2VyGAYgASgJUghwcm9kdWNlchIiCgxjcmVhdGlvb
  kRhdGUYByABKAlSDGNyZWF0aW9uRGF0ZRIYCgdtb2REYXRlGAggASgJUgdtb2REYXRlEhQKBXBhZ2VzGAkgASgNUgVwYWdlcxIcC
  gllbmNyeXB0ZWQYCiABKAhSCWVuY3J5cHRlZBJGCgNkaW0YCyABKAsyNC5jb20uZ2l0aHViLnNndXptYW4uZWJvb2suZ3JhcGguc
  HJvdG9jLlBhZ2VEaW1lbnNpb25SA2RpbRISCgRzaXplGAwgASgNUgRzaXplEhAKA21kNRgNIAEoCVIDbWQ1IpIBCgpTdG9yZUVib
  29rEkAKBGJvb2sYASABKAsyLC5jb20uZ2l0aHViLnNndXptYW4uZWJvb2suZ3JhcGgucHJvdG9jLkVib29rUgRib29rEkIKBGhvc
  3QYAiABKAsyLi5jb20uZ2l0aHViLnNndXptYW4uZWJvb2suZ3JhcGgucHJvdG9jLkhvc3RpbmdSBGhvc3QijAUKCUl0ZW1TdG9yZ
  RJBCgVsaW5rcxgBIAMoCzIrLmNvbS5naXRodWIuc2d1em1hbi5lYm9vay5ncmFwaC5wcm90b2MuTGlua1IFbGlua3MSUQoFYm9va
  3MYAiADKAsyOy5jb20uZ2l0aHViLnNndXptYW4uZWJvb2suZ3JhcGgucHJvdG9jLkl0ZW1TdG9yZS5Cb29rc0VudHJ5UgVib29rc
  xJOCgRob3N0GAMgAygLMjouY29tLmdpdGh1Yi5zZ3V6bWFuLmVib29rLmdyYXBoLnByb3RvYy5JdGVtU3RvcmUuSG9zdEVudHJ5U
  gRob3N0El0KCXJhcGlkSG9zdBgEIAMoCzI/LmNvbS5naXRodWIuc2d1em1hbi5lYm9vay5ncmFwaC5wcm90b2MuSXRlbVN0b3JlL
  lJhcGlkSG9zdEVudHJ5UglyYXBpZEhvc3QaZgoKQm9va3NFbnRyeRIQCgNrZXkYASABKAlSA2tleRJCCgV2YWx1ZRgCIAEoCzIsL
  mNvbS5naXRodWIuc2d1em1hbi5lYm9vay5ncmFwaC5wcm90b2MuRWJvb2tSBXZhbHVlOgI4ARpkCglIb3N0RW50cnkSEAoDa2V5G
  AEgASgJUgNrZXkSQQoFdmFsdWUYAiABKAsyKy5jb20uZ2l0aHViLnNndXptYW4uZWJvb2suZ3JhcGgucHJvdG9jLkxpbmtSBXZhb
  HVlOgI4ARpsCg5SYXBpZEhvc3RFbnRyeRIQCgNrZXkYASABKAlSA2tleRJECgV2YWx1ZRgCIAEoCzIuLmNvbS5naXRodWIuc2d1e
  m1hbi5lYm9vay5ncmFwaC5wcm90b2MuSG9zdGluZ1IFdmFsdWU6AjgBIlAKBVN0b3JlEkcKBXN0b3JlGAEgAygLMjEuY29tLmdpd
  Gh1Yi5zZ3V6bWFuLmVib29rLmdyYXBoLnByb3RvYy5TdG9yZUVib29rUgVzdG9yZWIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}