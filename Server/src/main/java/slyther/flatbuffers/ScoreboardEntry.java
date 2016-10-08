// automatically generated by the FlatBuffers compiler, do not modify

package slyther.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ScoreboardEntry extends Table {
  public static ScoreboardEntry getRootAsScoreboardEntry(ByteBuffer _bb) { return getRootAsScoreboardEntry(_bb, new ScoreboardEntry()); }
  public static ScoreboardEntry getRootAsScoreboardEntry(ByteBuffer _bb, ScoreboardEntry obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public ScoreboardEntry __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String playerName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer playerNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public int score() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createScoreboardEntry(FlatBufferBuilder builder,
      int playerNameOffset,
      int score) {
    builder.startObject(2);
    ScoreboardEntry.addScore(builder, score);
    ScoreboardEntry.addPlayerName(builder, playerNameOffset);
    return ScoreboardEntry.endScoreboardEntry(builder);
  }

  public static void startScoreboardEntry(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addPlayerName(FlatBufferBuilder builder, int playerNameOffset) { builder.addOffset(0, playerNameOffset, 0); }
  public static void addScore(FlatBufferBuilder builder, int score) { builder.addInt(1, score, 0); }
  public static int endScoreboardEntry(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
