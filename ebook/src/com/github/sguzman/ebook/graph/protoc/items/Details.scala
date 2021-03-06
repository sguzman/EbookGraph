// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.sguzman.ebook.graph.protoc.items

@SerialVersionUID(0L)
final case class Details(
    authors: _root_.scala.Predef.String = "",
    pubDate: _root_.scala.Predef.String = "",
    isbn10: _root_.scala.Predef.String = "",
    isbn13: _root_.scala.Predef.String = "",
    publisher: _root_.scala.Predef.String = "",
    pages: _root_.scala.Int = 0,
    format: _root_.scala.Predef.String = "",
    size: scala.Option[com.github.sguzman.ebook.graph.protoc.items.Size] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[Details] with scalapb.lenses.Updatable[Details] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (authors != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, authors) }
      if (pubDate != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, pubDate) }
      if (isbn10 != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, isbn10) }
      if (isbn13 != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, isbn13) }
      if (publisher != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, publisher) }
      if (pages != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(6, pages) }
      if (format != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, format) }
      if (size.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(size.get.serializedSize) + size.get.serializedSize }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = authors
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = pubDate
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = isbn10
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = isbn13
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = publisher
        if (__v != "") {
          _output__.writeString(5, __v)
        }
      };
      {
        val __v = pages
        if (__v != 0) {
          _output__.writeUInt32(6, __v)
        }
      };
      {
        val __v = format
        if (__v != "") {
          _output__.writeString(7, __v)
        }
      };
      size.foreach { __v =>
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.sguzman.ebook.graph.protoc.items.Details = {
      var __authors = this.authors
      var __pubDate = this.pubDate
      var __isbn10 = this.isbn10
      var __isbn13 = this.isbn13
      var __publisher = this.publisher
      var __pages = this.pages
      var __format = this.format
      var __size = this.size
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __authors = _input__.readString()
          case 18 =>
            __pubDate = _input__.readString()
          case 26 =>
            __isbn10 = _input__.readString()
          case 34 =>
            __isbn13 = _input__.readString()
          case 42 =>
            __publisher = _input__.readString()
          case 48 =>
            __pages = _input__.readUInt32()
          case 58 =>
            __format = _input__.readString()
          case 66 =>
            __size = Option(_root_.scalapb.LiteParser.readMessage(_input__, __size.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Size.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.github.sguzman.ebook.graph.protoc.items.Details(
          authors = __authors,
          pubDate = __pubDate,
          isbn10 = __isbn10,
          isbn13 = __isbn13,
          publisher = __publisher,
          pages = __pages,
          format = __format,
          size = __size
      )
    }
    def withAuthors(__v: _root_.scala.Predef.String): Details = copy(authors = __v)
    def withPubDate(__v: _root_.scala.Predef.String): Details = copy(pubDate = __v)
    def withIsbn10(__v: _root_.scala.Predef.String): Details = copy(isbn10 = __v)
    def withIsbn13(__v: _root_.scala.Predef.String): Details = copy(isbn13 = __v)
    def withPublisher(__v: _root_.scala.Predef.String): Details = copy(publisher = __v)
    def withPages(__v: _root_.scala.Int): Details = copy(pages = __v)
    def withFormat(__v: _root_.scala.Predef.String): Details = copy(format = __v)
    def getSize: com.github.sguzman.ebook.graph.protoc.items.Size = size.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Size.defaultInstance)
    def clearSize: Details = copy(size = None)
    def withSize(__v: com.github.sguzman.ebook.graph.protoc.items.Size): Details = copy(size = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = authors
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = pubDate
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = isbn10
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = isbn13
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = publisher
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = pages
          if (__t != 0) __t else null
        }
        case 7 => {
          val __t = format
          if (__t != "") __t else null
        }
        case 8 => size.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(authors)
        case 2 => _root_.scalapb.descriptors.PString(pubDate)
        case 3 => _root_.scalapb.descriptors.PString(isbn10)
        case 4 => _root_.scalapb.descriptors.PString(isbn13)
        case 5 => _root_.scalapb.descriptors.PString(publisher)
        case 6 => _root_.scalapb.descriptors.PInt(pages)
        case 7 => _root_.scalapb.descriptors.PString(format)
        case 8 => size.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.sguzman.ebook.graph.protoc.items.Details
}

object Details extends scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.Details] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.Details] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.github.sguzman.ebook.graph.protoc.items.Details = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.github.sguzman.ebook.graph.protoc.items.Details(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(4), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(5), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(6), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(7)).asInstanceOf[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Size]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.sguzman.ebook.graph.protoc.items.Details] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.sguzman.ebook.graph.protoc.items.Details(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Size]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ItemsProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ItemsProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 8 => __out = com.github.sguzman.ebook.graph.protoc.items.Size
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.github.sguzman.ebook.graph.protoc.items.Details(
  )
  implicit class DetailsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Details]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Details](_l) {
    def authors: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.authors)((c_, f_) => c_.copy(authors = f_))
    def pubDate: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.pubDate)((c_, f_) => c_.copy(pubDate = f_))
    def isbn10: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.isbn10)((c_, f_) => c_.copy(isbn10 = f_))
    def isbn13: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.isbn13)((c_, f_) => c_.copy(isbn13 = f_))
    def publisher: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.publisher)((c_, f_) => c_.copy(publisher = f_))
    def pages: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.pages)((c_, f_) => c_.copy(pages = f_))
    def format: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.format)((c_, f_) => c_.copy(format = f_))
    def size: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Size] = field(_.getSize)((c_, f_) => c_.copy(size = Option(f_)))
    def optionalSize: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[com.github.sguzman.ebook.graph.protoc.items.Size]] = field(_.size)((c_, f_) => c_.copy(size = f_))
  }
  final val AUTHORS_FIELD_NUMBER = 1
  final val PUBDATE_FIELD_NUMBER = 2
  final val ISBN10_FIELD_NUMBER = 3
  final val ISBN13_FIELD_NUMBER = 4
  final val PUBLISHER_FIELD_NUMBER = 5
  final val PAGES_FIELD_NUMBER = 6
  final val FORMAT_FIELD_NUMBER = 7
  final val SIZE_FIELD_NUMBER = 8
}
