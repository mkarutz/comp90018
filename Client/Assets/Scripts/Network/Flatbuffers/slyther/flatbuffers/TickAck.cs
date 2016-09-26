// automatically generated by the FlatBuffers compiler, do not modify

namespace slyther.flatbuffers
{

using System;
using FlatBuffers;

public sealed class TickAck : Table {
  public static TickAck GetRootAsTickAck(ByteBuffer _bb) { return GetRootAsTickAck(_bb, new TickAck()); }
  public static TickAck GetRootAsTickAck(ByteBuffer _bb, TickAck obj) { return (obj.__init(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public TickAck __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public uint Tick { get { int o = __offset(4); return o != 0 ? bb.GetUint(o + bb_pos) : (uint)0; } }

  public static Offset<TickAck> CreateTickAck(FlatBufferBuilder builder,
      uint tick = 0) {
    builder.StartObject(1);
    TickAck.AddTick(builder, tick);
    return TickAck.EndTickAck(builder);
  }

  public static void StartTickAck(FlatBufferBuilder builder) { builder.StartObject(1); }
  public static void AddTick(FlatBufferBuilder builder, uint tick) { builder.AddUint(0, tick, 0); }
  public static Offset<TickAck> EndTickAck(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<TickAck>(o);
  }
  public static void FinishTickAckBuffer(FlatBufferBuilder builder, Offset<TickAck> offset) { builder.Finish(offset.Value); }
};


}