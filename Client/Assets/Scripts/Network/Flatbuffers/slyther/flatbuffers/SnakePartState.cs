// automatically generated by the FlatBuffers compiler, do not modify

namespace slyther.flatbuffers
{

using System;
using FlatBuffers;

public sealed class SnakePartState : Table {
  public static SnakePartState GetRootAsSnakePartState(ByteBuffer _bb) { return GetRootAsSnakePartState(_bb, new SnakePartState()); }
  public static SnakePartState GetRootAsSnakePartState(ByteBuffer _bb, SnakePartState obj) { return (obj.__init(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public SnakePartState __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public ushort Index { get { int o = __offset(4); return o != 0 ? bb.GetUshort(o + bb_pos) : (ushort)0; } }
  public slyther.flatbuffers.Vec2 Position { get { return GetPosition(new slyther.flatbuffers.Vec2()); } }
  public slyther.flatbuffers.Vec2 GetPosition(slyther.flatbuffers.Vec2 obj) { int o = __offset(6); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }

  public static void StartSnakePartState(FlatBufferBuilder builder) { builder.StartObject(2); }
  public static void AddIndex(FlatBufferBuilder builder, ushort index) { builder.AddUshort(0, index, 0); }
  public static void AddPosition(FlatBufferBuilder builder, Offset<slyther.flatbuffers.Vec2> positionOffset) { builder.AddStruct(1, positionOffset.Value, 0); }
  public static Offset<SnakePartState> EndSnakePartState(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<SnakePartState>(o);
  }
};


}
