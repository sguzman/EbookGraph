// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.sguzman.ebook.graph.protoc.http

object HttpProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.github.sguzman.ebook.graph.protoc.http.HttpCache
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CjBjb20vZ2l0aHViL3NndXptYW4vZWJvb2svZ3JhcGgvcHJvdG9jL2h0dHAucHJvdG8SJWNvbS5naXRodWIuc2d1em1hbi5lY
  m9vay5ncmFwaC5wcm90b2MimAEKCUh0dHBDYWNoZRJRCgVjYWNoZRgBIAMoCzI7LmNvbS5naXRodWIuc2d1em1hbi5lYm9vay5nc
  mFwaC5wcm90b2MuSHR0cENhY2hlLkNhY2hlRW50cnlSBWNhY2hlGjgKCkNhY2hlRW50cnkSEAoDa2V5GAEgASgJUgNrZXkSFAoFd
  mFsdWUYAiABKAxSBXZhbHVlOgI4AWIGcHJvdG8z"""
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