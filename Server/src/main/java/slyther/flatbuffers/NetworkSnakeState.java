// automatically generated by the FlatBuffers compiler, do not modify

package slyther.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class NetworkSnakeState extends Table {
  public static NetworkSnakeState getRootAsNetworkSnakeState(ByteBuffer _bb) { return getRootAsNetworkSnakeState(_bb, new NetworkSnakeState()); }
  public static NetworkSnakeState getRootAsNetworkSnakeState(ByteBuffer _bb, NetworkSnakeState obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public NetworkSnakeState __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String skin() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer skinAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public long score() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0; }
  public boolean isDead() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean isTurbo() { int o = __offset(14); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public NetworkSnakePartState parts(int j) { return parts(new NetworkSnakePartState(), j); }
  public NetworkSnakePartState parts(NetworkSnakePartState obj, int j) { int o = __offset(16); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int partsLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public int head() { int o = __offset(18); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public int tail() { int o = __offset(20); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }

  public static int createNetworkSnakeState(FlatBufferBuilder builder,
      int nameOffset,
      int skinOffset,
      long score,
      boolean isDead,
      boolean isTurbo,
      int partsOffset,
      int head,
      int tail) {
    builder.startObject(9);
    NetworkSnakeState.addParts(builder, partsOffset);
    NetworkSnakeState.addScore(builder, score);
    NetworkSnakeState.addSkin(builder, skinOffset);
    NetworkSnakeState.addName(builder, nameOffset);
    NetworkSnakeState.addTail(builder, tail);
    NetworkSnakeState.addHead(builder, head);
    NetworkSnakeState.addIsTurbo(builder, isTurbo);
    NetworkSnakeState.addIsDead(builder, isDead);
    return NetworkSnakeState.endNetworkSnakeState(builder);
  }

  public static void startNetworkSnakeState(FlatBufferBuilder builder) { builder.startObject(9); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addSkin(FlatBufferBuilder builder, int skinOffset) { builder.addOffset(2, skinOffset, 0); }
  public static void addScore(FlatBufferBuilder builder, long score) { builder.addInt(3, (int)score, 0); }
  public static void addIsDead(FlatBufferBuilder builder, boolean isDead) { builder.addBoolean(4, isDead, false); }
  public static void addIsTurbo(FlatBufferBuilder builder, boolean isTurbo) { builder.addBoolean(5, isTurbo, false); }
  public static void addParts(FlatBufferBuilder builder, int partsOffset) { builder.addOffset(6, partsOffset, 0); }
  public static int createPartsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static int createPartsVector(FlatBufferBuilder builder, int[] data, int n) { builder.startVector(4, n, 4); for (int i = n - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPartsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addHead(FlatBufferBuilder builder, int head) { builder.addShort(7, (short)head, 0); }
  public static void addTail(FlatBufferBuilder builder, int tail) { builder.addShort(8, (short)tail, 0); }
  public static int endNetworkSnakeState(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

