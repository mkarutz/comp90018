// automatically generated by the FlatBuffers compiler, do not modify

namespace slyther.flatbuffers
{

using System;
using FlatBuffers;

public sealed class ServerGoodbye : Table {
  public static ServerGoodbye GetRootAsServerGoodbye(ByteBuffer _bb) { return GetRootAsServerGoodbye(_bb, new ServerGoodbye()); }
  public static ServerGoodbye GetRootAsServerGoodbye(ByteBuffer _bb, ServerGoodbye obj) { return (obj.__init(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public ServerGoodbye __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }


  public static void StartServerGoodbye(FlatBufferBuilder builder) { builder.StartObject(0); }
  public static Offset<ServerGoodbye> EndServerGoodbye(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<ServerGoodbye>(o);
  }
};


}
