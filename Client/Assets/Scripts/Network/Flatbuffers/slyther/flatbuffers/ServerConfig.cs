// automatically generated by the FlatBuffers compiler, do not modify

namespace slyther.flatbuffers
{

using System;
using FlatBuffers;

public sealed class ServerConfig : Table {
  public static ServerConfig GetRootAsServerConfig(ByteBuffer _bb) { return GetRootAsServerConfig(_bb, new ServerConfig()); }
  public static ServerConfig GetRootAsServerConfig(ByteBuffer _bb, ServerConfig obj) { return (obj.__init(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public ServerConfig __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public byte TickRate { get { int o = __offset(4); return o != 0 ? bb.Get(o + bb_pos) : (byte)0; } }

  public static Offset<ServerConfig> CreateServerConfig(FlatBufferBuilder builder,
      byte tickRate = 0) {
    builder.StartObject(1);
    ServerConfig.AddTickRate(builder, tickRate);
    return ServerConfig.EndServerConfig(builder);
  }

  public static void StartServerConfig(FlatBufferBuilder builder) { builder.StartObject(1); }
  public static void AddTickRate(FlatBufferBuilder builder, byte tickRate) { builder.AddByte(0, tickRate, 0); }
  public static Offset<ServerConfig> EndServerConfig(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<ServerConfig>(o);
  }
};


}
