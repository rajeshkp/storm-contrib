/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package storm.scribe.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogEntry implements org.apache.thrift7.TBase<LogEntry, LogEntry._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("LogEntry");

  private static final org.apache.thrift7.protocol.TField CATEGORY_FIELD_DESC = new org.apache.thrift7.protocol.TField("category", org.apache.thrift7.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift7.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift7.protocol.TField("message", org.apache.thrift7.protocol.TType.STRING, (short)2);

  private String category; // required
  private String message; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    CATEGORY((short)1, "category"),
    MESSAGE((short)2, "message");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CATEGORY
          return CATEGORY;
        case 2: // MESSAGE
          return MESSAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CATEGORY, new org.apache.thrift7.meta_data.FieldMetaData("category", org.apache.thrift7.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift7.meta_data.FieldMetaData("message", org.apache.thrift7.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(LogEntry.class, metaDataMap);
  }

  public LogEntry() {
  }

  public LogEntry(
    String category,
    String message)
  {
    this();
    this.category = category;
    this.message = message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LogEntry(LogEntry other) {
    if (other.is_set_category()) {
      this.category = other.category;
    }
    if (other.is_set_message()) {
      this.message = other.message;
    }
  }

  public LogEntry deepCopy() {
    return new LogEntry(this);
  }

  @Override
  public void clear() {
    this.category = null;
    this.message = null;
  }

  public String get_category() {
    return this.category;
  }

  public void set_category(String category) {
    this.category = category;
  }

  public void unset_category() {
    this.category = null;
  }

  /** Returns true if field category is set (has been assigned a value) and false otherwise */
  public boolean is_set_category() {
    return this.category != null;
  }

  public void set_category_isSet(boolean value) {
    if (!value) {
      this.category = null;
    }
  }

  public String get_message() {
    return this.message;
  }

  public void set_message(String message) {
    this.message = message;
  }

  public void unset_message() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean is_set_message() {
    return this.message != null;
  }

  public void set_message_isSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CATEGORY:
      if (value == null) {
        unset_category();
      } else {
        set_category((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unset_message();
      } else {
        set_message((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CATEGORY:
      return get_category();

    case MESSAGE:
      return get_message();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CATEGORY:
      return is_set_category();
    case MESSAGE:
      return is_set_message();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LogEntry)
      return this.equals((LogEntry)that);
    return false;
  }

  public boolean equals(LogEntry that) {
    if (that == null)
      return false;

    boolean this_present_category = true && this.is_set_category();
    boolean that_present_category = true && that.is_set_category();
    if (this_present_category || that_present_category) {
      if (!(this_present_category && that_present_category))
        return false;
      if (!this.category.equals(that.category))
        return false;
    }

    boolean this_present_message = true && this.is_set_message();
    boolean that_present_message = true && that.is_set_message();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_category = true && (is_set_category());
    builder.append(present_category);
    if (present_category)
      builder.append(category);

    boolean present_message = true && (is_set_message());
    builder.append(present_message);
    if (present_message)
      builder.append(message);

    return builder.toHashCode();
  }

  public int compareTo(LogEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LogEntry typedOther = (LogEntry)other;

    lastComparison = Boolean.valueOf(is_set_category()).compareTo(typedOther.is_set_category());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_category()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.category, typedOther.category);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_message()).compareTo(typedOther.is_set_message());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_message()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.message, typedOther.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // CATEGORY
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.category = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // MESSAGE
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.message = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.category != null) {
      oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
      oprot.writeString(this.category);
      oprot.writeFieldEnd();
    }
    if (this.message != null) {
      oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LogEntry(");
    boolean first = true;

    sb.append("category:");
    if (this.category == null) {
      sb.append("null");
    } else {
      sb.append(this.category);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

