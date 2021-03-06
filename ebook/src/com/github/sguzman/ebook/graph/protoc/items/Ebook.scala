// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.sguzman.ebook.graph.protoc.items

@SerialVersionUID(0L)
final case class Ebook(
    title: _root_.scala.Predef.String = "",
    date: _root_.scala.Predef.String = "",
    img: _root_.scala.Predef.String = "",
    desc: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
    id: _root_.scala.Int = 0,
    detail: scala.Option[com.github.sguzman.ebook.graph.protoc.items.Details] = None,
    categories: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty,
    links: _root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link] = _root_.scala.collection.Seq.empty,
    prev: scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link] = None,
    next: scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[Ebook] with scalapb.lenses.Updatable[Ebook] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (title != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, title) }
      if (date != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, date) }
      if (img != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, img) }
      if (desc != _root_.com.google.protobuf.ByteString.EMPTY) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(4, desc) }
      if (id != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(5, id) }
      if (detail.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(detail.get.serializedSize) + detail.get.serializedSize }
      categories.foreach(categories => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, categories))
      links.foreach(links => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(links.serializedSize) + links.serializedSize)
      if (prev.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(prev.get.serializedSize) + prev.get.serializedSize }
      if (next.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(next.get.serializedSize) + next.get.serializedSize }
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
        val __v = title
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = date
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = img
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = desc
        if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(4, __v)
        }
      };
      {
        val __v = id
        if (__v != 0) {
          _output__.writeUInt32(5, __v)
        }
      };
      detail.foreach { __v =>
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      categories.foreach { __v =>
        _output__.writeString(7, __v)
      };
      links.foreach { __v =>
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      prev.foreach { __v =>
        _output__.writeTag(9, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      next.foreach { __v =>
        _output__.writeTag(10, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.sguzman.ebook.graph.protoc.items.Ebook = {
      var __title = this.title
      var __date = this.date
      var __img = this.img
      var __desc = this.desc
      var __id = this.id
      var __detail = this.detail
      val __categories = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.categories)
      val __links = (_root_.scala.collection.immutable.Vector.newBuilder[com.github.sguzman.ebook.graph.protoc.items.Link] ++= this.links)
      var __prev = this.prev
      var __next = this.next
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __title = _input__.readString()
          case 18 =>
            __date = _input__.readString()
          case 26 =>
            __img = _input__.readString()
          case 34 =>
            __desc = _input__.readBytes()
          case 40 =>
            __id = _input__.readUInt32()
          case 50 =>
            __detail = Option(_root_.scalapb.LiteParser.readMessage(_input__, __detail.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Details.defaultInstance)))
          case 58 =>
            __categories += _input__.readString()
          case 66 =>
            __links += _root_.scalapb.LiteParser.readMessage(_input__, com.github.sguzman.ebook.graph.protoc.items.Link.defaultInstance)
          case 74 =>
            __prev = Option(_root_.scalapb.LiteParser.readMessage(_input__, __prev.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Link.defaultInstance)))
          case 82 =>
            __next = Option(_root_.scalapb.LiteParser.readMessage(_input__, __next.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Link.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.github.sguzman.ebook.graph.protoc.items.Ebook(
          title = __title,
          date = __date,
          img = __img,
          desc = __desc,
          id = __id,
          detail = __detail,
          categories = __categories.result(),
          links = __links.result(),
          prev = __prev,
          next = __next
      )
    }
    def withTitle(__v: _root_.scala.Predef.String): Ebook = copy(title = __v)
    def withDate(__v: _root_.scala.Predef.String): Ebook = copy(date = __v)
    def withImg(__v: _root_.scala.Predef.String): Ebook = copy(img = __v)
    def withDesc(__v: _root_.com.google.protobuf.ByteString): Ebook = copy(desc = __v)
    def withId(__v: _root_.scala.Int): Ebook = copy(id = __v)
    def getDetail: com.github.sguzman.ebook.graph.protoc.items.Details = detail.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Details.defaultInstance)
    def clearDetail: Ebook = copy(detail = None)
    def withDetail(__v: com.github.sguzman.ebook.graph.protoc.items.Details): Ebook = copy(detail = Option(__v))
    def clearCategories = copy(categories = _root_.scala.collection.Seq.empty)
    def addCategories(__vs: _root_.scala.Predef.String*): Ebook = addAllCategories(__vs)
    def addAllCategories(__vs: TraversableOnce[_root_.scala.Predef.String]): Ebook = copy(categories = categories ++ __vs)
    def withCategories(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): Ebook = copy(categories = __v)
    def clearLinks = copy(links = _root_.scala.collection.Seq.empty)
    def addLinks(__vs: com.github.sguzman.ebook.graph.protoc.items.Link*): Ebook = addAllLinks(__vs)
    def addAllLinks(__vs: TraversableOnce[com.github.sguzman.ebook.graph.protoc.items.Link]): Ebook = copy(links = links ++ __vs)
    def withLinks(__v: _root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link]): Ebook = copy(links = __v)
    def getPrev: com.github.sguzman.ebook.graph.protoc.items.Link = prev.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Link.defaultInstance)
    def clearPrev: Ebook = copy(prev = None)
    def withPrev(__v: com.github.sguzman.ebook.graph.protoc.items.Link): Ebook = copy(prev = Option(__v))
    def getNext: com.github.sguzman.ebook.graph.protoc.items.Link = next.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Link.defaultInstance)
    def clearNext: Ebook = copy(next = None)
    def withNext(__v: com.github.sguzman.ebook.graph.protoc.items.Link): Ebook = copy(next = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = title
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = date
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = img
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = desc
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
        case 5 => {
          val __t = id
          if (__t != 0) __t else null
        }
        case 6 => detail.orNull
        case 7 => categories
        case 8 => links
        case 9 => prev.orNull
        case 10 => next.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(title)
        case 2 => _root_.scalapb.descriptors.PString(date)
        case 3 => _root_.scalapb.descriptors.PString(img)
        case 4 => _root_.scalapb.descriptors.PByteString(desc)
        case 5 => _root_.scalapb.descriptors.PInt(id)
        case 6 => detail.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => _root_.scalapb.descriptors.PRepeated(categories.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 8 => _root_.scalapb.descriptors.PRepeated(links.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 9 => prev.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => next.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.sguzman.ebook.graph.protoc.items.Ebook
}

object Ebook extends scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.Ebook] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.Ebook] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.github.sguzman.ebook.graph.protoc.items.Ebook = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.github.sguzman.ebook.graph.protoc.items.Ebook(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(3), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString],
      __fieldsMap.getOrElse(__fields.get(4), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Details]],
      __fieldsMap.getOrElse(__fields.get(6), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(7), Nil).asInstanceOf[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link]],
      __fieldsMap.get(__fields.get(8)).asInstanceOf[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link]],
      __fieldsMap.get(__fields.get(9)).asInstanceOf[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.sguzman.ebook.graph.protoc.items.Ebook] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.sguzman.ebook.graph.protoc.items.Ebook(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Details]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).flatMap(_.as[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ItemsProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ItemsProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 6 => __out = com.github.sguzman.ebook.graph.protoc.items.Details
      case 8 => __out = com.github.sguzman.ebook.graph.protoc.items.Link
      case 9 => __out = com.github.sguzman.ebook.graph.protoc.items.Link
      case 10 => __out = com.github.sguzman.ebook.graph.protoc.items.Link
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.github.sguzman.ebook.graph.protoc.items.Ebook(
  )
  implicit class EbookLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Ebook]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Ebook](_l) {
    def title: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.title)((c_, f_) => c_.copy(title = f_))
    def date: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.date)((c_, f_) => c_.copy(date = f_))
    def img: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.img)((c_, f_) => c_.copy(img = f_))
    def desc: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.desc)((c_, f_) => c_.copy(desc = f_))
    def id: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def detail: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Details] = field(_.getDetail)((c_, f_) => c_.copy(detail = Option(f_)))
    def optionalDetail: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[com.github.sguzman.ebook.graph.protoc.items.Details]] = field(_.detail)((c_, f_) => c_.copy(detail = f_))
    def categories: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.categories)((c_, f_) => c_.copy(categories = f_))
    def links: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link]] = field(_.links)((c_, f_) => c_.copy(links = f_))
    def prev: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Link] = field(_.getPrev)((c_, f_) => c_.copy(prev = Option(f_)))
    def optionalPrev: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link]] = field(_.prev)((c_, f_) => c_.copy(prev = f_))
    def next: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Link] = field(_.getNext)((c_, f_) => c_.copy(next = Option(f_)))
    def optionalNext: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link]] = field(_.next)((c_, f_) => c_.copy(next = f_))
  }
  final val TITLE_FIELD_NUMBER = 1
  final val DATE_FIELD_NUMBER = 2
  final val IMG_FIELD_NUMBER = 3
  final val DESC_FIELD_NUMBER = 4
  final val ID_FIELD_NUMBER = 5
  final val DETAIL_FIELD_NUMBER = 6
  final val CATEGORIES_FIELD_NUMBER = 7
  final val LINKS_FIELD_NUMBER = 8
  final val PREV_FIELD_NUMBER = 9
  final val NEXT_FIELD_NUMBER = 10
}
