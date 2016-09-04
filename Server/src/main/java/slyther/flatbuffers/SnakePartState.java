// automatically generated by the FlatBuffers compiler, do not modify

package slyther.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class SnakePartState extends Table {
  public static SnakePartState getRootAsSnakePartState(ByteBuffer _bb) { return getRootAsSnakePartState(_bb, new SnakePartState()); }
  public static SnakePartState getRootAsSnakePartState(ByteBuffer _bb, SnakePartState obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public SnakePartState __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int index() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public slyther.flatbuffers.Vector2 position() { return position(new slyther.flatbuffers.Vector2()); }
  public slyther.flatbuffers.Vector2 position(slyther.flatbuffers.Vector2 obj) { int o = __offset(6); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  public slyther.flatbuffers.Vector2 direction() { return direction(new slyther.flatbuffers.Vector2()); }
  public slyther.flatbuffers.Vector2 direction(slyther.flatbuffers.Vector2 obj) { int o = __offset(8); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }

  public static void startSnakePartState(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addIndex(FlatBufferBuilder builder, int index) { builder.addByte(0, (byte)index, 0); }
  public static void addPosition(FlatBufferBuilder builder, int positionOffset) { builder.addStruct(1, positionOffset, 0); }
  public static void addDirection(FlatBufferBuilder builder, int directionOffset) { builder.addStruct(2, directionOffset, 0); }
  public static int endSnakePartState(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
