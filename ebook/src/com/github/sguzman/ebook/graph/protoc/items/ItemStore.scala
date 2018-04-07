// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.github.sguzman.ebook.graph.protoc.items

@SerialVersionUID(0L)
final case class ItemStore(
    links: _root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link] = _root_.scala.collection.Seq.empty,
    books: scala.collection.immutable.Map[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook] = scala.collection.immutable.Map.empty,
    host: scala.collection.immutable.Map[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link] = scala.collection.immutable.Map.empty,
    rapidHost: scala.collection.immutable.Map[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting] = scala.collection.immutable.Map.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[ItemStore] with scalapb.lenses.Updatable[ItemStore] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      links.foreach(links => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(links.serializedSize) + links.serializedSize)
      books.foreach(books => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_books.toBase(books).serializedSize) + com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_books.toBase(books).serializedSize)
      host.foreach(host => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_host.toBase(host).serializedSize) + com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_host.toBase(host).serializedSize)
      rapidHost.foreach(rapidHost => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_rapidHost.toBase(rapidHost).serializedSize) + com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_rapidHost.toBase(rapidHost).serializedSize)
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
      links.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      books.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_books.toBase(__v).serializedSize)
        com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_books.toBase(__v).writeTo(_output__)
      };
      host.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_host.toBase(__v).serializedSize)
        com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_host.toBase(__v).writeTo(_output__)
      };
      rapidHost.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_rapidHost.toBase(__v).serializedSize)
        com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_rapidHost.toBase(__v).writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.sguzman.ebook.graph.protoc.items.ItemStore = {
      val __links = (_root_.scala.collection.immutable.Vector.newBuilder[com.github.sguzman.ebook.graph.protoc.items.Link] ++= this.links)
      val __books = (scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook] ++= this.books)
      val __host = (scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link] ++= this.host)
      val __rapidHost = (scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting] ++= this.rapidHost)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __links += _root_.scalapb.LiteParser.readMessage(_input__, com.github.sguzman.ebook.graph.protoc.items.Link.defaultInstance)
          case 18 =>
            __books += com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_books.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry.defaultInstance))
          case 26 =>
            __host += com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_host.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry.defaultInstance))
          case 34 =>
            __rapidHost += com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_rapidHost.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry.defaultInstance))
          case tag => _input__.skipField(tag)
        }
      }
      com.github.sguzman.ebook.graph.protoc.items.ItemStore(
          links = __links.result(),
          books = __books.result(),
          host = __host.result(),
          rapidHost = __rapidHost.result()
      )
    }
    def clearLinks = copy(links = _root_.scala.collection.Seq.empty)
    def addLinks(__vs: com.github.sguzman.ebook.graph.protoc.items.Link*): ItemStore = addAllLinks(__vs)
    def addAllLinks(__vs: TraversableOnce[com.github.sguzman.ebook.graph.protoc.items.Link]): ItemStore = copy(links = links ++ __vs)
    def withLinks(__v: _root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link]): ItemStore = copy(links = __v)
    def clearBooks = copy(books = scala.collection.immutable.Map.empty)
    def addBooks(__vs: (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook)*): ItemStore = addAllBooks(__vs)
    def addAllBooks(__vs: TraversableOnce[(_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook)]): ItemStore = copy(books = books ++ __vs)
    def withBooks(__v: scala.collection.immutable.Map[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook]): ItemStore = copy(books = __v)
    def clearHost = copy(host = scala.collection.immutable.Map.empty)
    def addHost(__vs: (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link)*): ItemStore = addAllHost(__vs)
    def addAllHost(__vs: TraversableOnce[(_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link)]): ItemStore = copy(host = host ++ __vs)
    def withHost(__v: scala.collection.immutable.Map[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link]): ItemStore = copy(host = __v)
    def clearRapidHost = copy(rapidHost = scala.collection.immutable.Map.empty)
    def addRapidHost(__vs: (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting)*): ItemStore = addAllRapidHost(__vs)
    def addAllRapidHost(__vs: TraversableOnce[(_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting)]): ItemStore = copy(rapidHost = rapidHost ++ __vs)
    def withRapidHost(__v: scala.collection.immutable.Map[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting]): ItemStore = copy(rapidHost = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => links
        case 2 => books.map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_books.toBase)(_root_.scala.collection.breakOut)
        case 3 => host.map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_host.toBase)(_root_.scala.collection.breakOut)
        case 4 => rapidHost.map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_rapidHost.toBase)(_root_.scala.collection.breakOut)
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(links.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 2 => _root_.scalapb.descriptors.PRepeated(books.map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_books.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
        case 3 => _root_.scalapb.descriptors.PRepeated(host.map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_host.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
        case 4 => _root_.scalapb.descriptors.PRepeated(rapidHost.map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_rapidHost.toBase(_).toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.github.sguzman.ebook.graph.protoc.items.ItemStore
}

object ItemStore extends scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.ItemStore] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.ItemStore] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.github.sguzman.ebook.graph.protoc.items.ItemStore = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.github.sguzman.ebook.graph.protoc.items.ItemStore(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry]].map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_books.toCustom)(_root_.scala.collection.breakOut),
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry]].map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_host.toCustom)(_root_.scala.collection.breakOut),
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry]].map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_rapidHost.toCustom)(_root_.scala.collection.breakOut)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.sguzman.ebook.graph.protoc.items.ItemStore] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.github.sguzman.ebook.graph.protoc.items.ItemStore(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_books.toCustom)(_root_.scala.collection.breakOut),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_host.toCustom)(_root_.scala.collection.breakOut),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry]]).getOrElse(_root_.scala.collection.Seq.empty).map(com.github.sguzman.ebook.graph.protoc.items.ItemStore._typemapper_rapidHost.toCustom)(_root_.scala.collection.breakOut)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ItemsProto.javaDescriptor.getMessageTypes.get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ItemsProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.github.sguzman.ebook.graph.protoc.items.Link
      case 2 => __out = com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry
      case 3 => __out = com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry
      case 4 => __out = com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry,
    _root_.com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry,
    _root_.com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.github.sguzman.ebook.graph.protoc.items.ItemStore(
  )
  @SerialVersionUID(0L)
  final case class BooksEntry(
      key: _root_.scala.Predef.String = "",
      value: scala.Option[com.github.sguzman.ebook.graph.protoc.items.Ebook] = None
      ) extends scalapb.GeneratedMessage with scalapb.Message[BooksEntry] with scalapb.lenses.Updatable[BooksEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (key != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, key) }
        if (value.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.get.serializedSize) + value.get.serializedSize }
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
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        value.foreach { __v =>
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 18 =>
              __value = Option(_root_.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Ebook.defaultInstance)))
            case tag => _input__.skipField(tag)
          }
        }
        com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): BooksEntry = copy(key = __v)
      def getValue: com.github.sguzman.ebook.graph.protoc.items.Ebook = value.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Ebook.defaultInstance)
      def clearValue: BooksEntry = copy(value = None)
      def withValue(__v: com.github.sguzman.ebook.graph.protoc.items.Ebook): BooksEntry = copy(value = Option(__v))
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry
  }
  
  object BooksEntry extends scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Ebook]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Ebook]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.github.sguzman.ebook.graph.protoc.items.ItemStore.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.github.sguzman.ebook.graph.protoc.items.ItemStore.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 2 => __out = com.github.sguzman.ebook.graph.protoc.items.Ebook
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry(
    )
    implicit class BooksEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Ebook] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
      def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[com.github.sguzman.ebook.graph.protoc.items.Ebook]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook)] =
      _root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook)](__m => (__m.key, __m.getValue))(__p => com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry(__p._1, Some(__p._2)))
  }
  
  @SerialVersionUID(0L)
  final case class HostEntry(
      key: _root_.scala.Predef.String = "",
      value: scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link] = None
      ) extends scalapb.GeneratedMessage with scalapb.Message[HostEntry] with scalapb.lenses.Updatable[HostEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (key != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, key) }
        if (value.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.get.serializedSize) + value.get.serializedSize }
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
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        value.foreach { __v =>
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 18 =>
              __value = Option(_root_.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Link.defaultInstance)))
            case tag => _input__.skipField(tag)
          }
        }
        com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): HostEntry = copy(key = __v)
      def getValue: com.github.sguzman.ebook.graph.protoc.items.Link = value.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Link.defaultInstance)
      def clearValue: HostEntry = copy(value = None)
      def withValue(__v: com.github.sguzman.ebook.graph.protoc.items.Link): HostEntry = copy(value = Option(__v))
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry
  }
  
  object HostEntry extends scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.github.sguzman.ebook.graph.protoc.items.ItemStore.javaDescriptor.getNestedTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.github.sguzman.ebook.graph.protoc.items.ItemStore.scalaDescriptor.nestedMessages(1)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 2 => __out = com.github.sguzman.ebook.graph.protoc.items.Link
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry(
    )
    implicit class HostEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Link] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
      def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[com.github.sguzman.ebook.graph.protoc.items.Link]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link)] =
      _root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link)](__m => (__m.key, __m.getValue))(__p => com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry(__p._1, Some(__p._2)))
  }
  
  @SerialVersionUID(0L)
  final case class RapidHostEntry(
      key: _root_.scala.Predef.String = "",
      value: scala.Option[com.github.sguzman.ebook.graph.protoc.items.Hosting] = None
      ) extends scalapb.GeneratedMessage with scalapb.Message[RapidHostEntry] with scalapb.lenses.Updatable[RapidHostEntry] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (key != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, key) }
        if (value.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(value.get.serializedSize) + value.get.serializedSize }
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
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        value.foreach { __v =>
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 18 =>
              __value = Option(_root_.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Hosting.defaultInstance)))
            case tag => _input__.skipField(tag)
          }
        }
        com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): RapidHostEntry = copy(key = __v)
      def getValue: com.github.sguzman.ebook.graph.protoc.items.Hosting = value.getOrElse(com.github.sguzman.ebook.graph.protoc.items.Hosting.defaultInstance)
      def clearValue: RapidHostEntry = copy(value = None)
      def withValue(__v: com.github.sguzman.ebook.graph.protoc.items.Hosting): RapidHostEntry = copy(value = Option(__v))
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry
  }
  
  object RapidHostEntry extends scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Hosting]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[com.github.sguzman.ebook.graph.protoc.items.Hosting]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.github.sguzman.ebook.graph.protoc.items.ItemStore.javaDescriptor.getNestedTypes.get(2)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.github.sguzman.ebook.graph.protoc.items.ItemStore.scalaDescriptor.nestedMessages(2)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 2 => __out = com.github.sguzman.ebook.graph.protoc.items.Hosting
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry(
    )
    implicit class RapidHostEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.Hosting] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
      def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[com.github.sguzman.ebook.graph.protoc.items.Hosting]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting)] =
      _root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting)](__m => (__m.key, __m.getValue))(__p => com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry(__p._1, Some(__p._2)))
  }
  
  implicit class ItemStoreLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.ItemStore]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.github.sguzman.ebook.graph.protoc.items.ItemStore](_l) {
    def links: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.github.sguzman.ebook.graph.protoc.items.Link]] = field(_.links)((c_, f_) => c_.copy(links = f_))
    def books: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook]] = field(_.books)((c_, f_) => c_.copy(books = f_))
    def host: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link]] = field(_.host)((c_, f_) => c_.copy(host = f_))
    def rapidHost: _root_.scalapb.lenses.Lens[UpperPB, scala.collection.immutable.Map[_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting]] = field(_.rapidHost)((c_, f_) => c_.copy(rapidHost = f_))
  }
  final val LINKS_FIELD_NUMBER = 1
  final val BOOKS_FIELD_NUMBER = 2
  final val HOST_FIELD_NUMBER = 3
  final val RAPIDHOST_FIELD_NUMBER = 4
  @transient
  private val _typemapper_books: _root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook)] = implicitly[_root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.BooksEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Ebook)]]
  @transient
  private val _typemapper_host: _root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link)] = implicitly[_root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.HostEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Link)]]
  @transient
  private val _typemapper_rapidHost: _root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting)] = implicitly[_root_.scalapb.TypeMapper[com.github.sguzman.ebook.graph.protoc.items.ItemStore.RapidHostEntry, (_root_.scala.Predef.String, com.github.sguzman.ebook.graph.protoc.items.Hosting)]]
}
