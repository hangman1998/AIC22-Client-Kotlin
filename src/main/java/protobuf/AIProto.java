package protobuf;

public final class AIProto {
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        String[] descriptorData = {"\n\rAIProto.proto\022\"ir.sharif.aic.hideandse" + "ek.api.grpc\032\033google/protobuf/empty.proto" + "\032\037google/protobuf/timestamp.proto\"Z\n\004Tur" + "n\022\022\n\nturnNumber\030\001 \001(\005\022>\n\010turnType\030\002 \001(\0162" + ",.ir.sharif.aic.hideandseek.api.grpc.Tur" + "nType\"\252\001\n\005Agent\022\n\n\002id\030\001 \001(\005\0226\n\004team\030\002 \001(" + "\0162(.ir.sharif.aic.hideandseek.api.grpc.T" + "eam\022;\n\004type\030\003 \001(\0162-.ir.sharif.aic.hidean" + "dseek.api.grpc.AgentType\022\017\n\007node_id\030\004 \001(" + "\005\022\017\n\007is_dead\030\005 \001(\010\"\022\n\004Node\022\n\n\002id\030\001 \001(\005\"P", "\n\004Path\022\n\n\002id\030\001 \001(\005\022\025\n\rfirst_node_id\030\002 \001(" + "\005\022\026\n\016second_node_id\030\003 \001(\005\022\r\n\005price\030\004 \001(\001" + "\"y\n\005Graph\0227\n\005paths\030\001 \003(\0132(.ir.sharif.aic" + ".hideandseek.api.grpc.Path\0227\n\005nodes\030\002 \003(" + "\0132(.ir.sharif.aic.hideandseek.api.grpc.N" + "ode\"M\n\016IncomeSettings\022\034\n\024policeIncomeEac" + "hTurn\030\001 \001(\001\022\035\n\025thievesIncomeEachTurn\030\002 \001" + "(\001\"6\n\014TurnSettings\022\020\n\010maxTurns\030\001 \001(\005\022\024\n\014" + "visibleTurns\030\002 \003(\005\"D\n\014ChatSettings\022\026\n\016ch" + "atBoxMaxSize\030\001 \001(\005\022\034\n\024chatCostPerCharact", "er\030\002 \001(\001\"\242\002\n\nGameConfig\0228\n\005graph\030\001 \001(\0132)" + ".ir.sharif.aic.hideandseek.api.grpc.Grap" + "h\022J\n\016incomeSettings\030\002 \001(\01322.ir.sharif.ai" + "c.hideandseek.api.grpc.IncomeSettings\022F\n" + "\014turnSettings\030\003 \001(\01320.ir.sharif.aic.hide" + "andseek.api.grpc.TurnSettings\022F\n\014chatSet" + "tings\030\004 \001(\01320.ir.sharif.aic.hideandseek." + "api.grpc.ChatSettings\"=\n\027DeclareReadines" + "sCommand\022\r\n\005token\030\001 \001(\t\022\023\n\013startNodeId\030\002" + " \001(\005\".\n\013MoveCommand\022\r\n\005token\030\001 \001(\t\022\020\n\010to", "NodeId\030\002 \001(\005\"\035\n\014WatchCommand\022\r\n\005token\030\001 " + "\001(\t\"\314\003\n\010GameView\022>\n\006status\030\001 \001(\0162..ir.sh" + "arif.aic.hideandseek.api.grpc.GameStatus" + "\022>\n\006result\030\002 \001(\0162..ir.sharif.aic.hideand" + "seek.api.grpc.GameResult\0226\n\004turn\030\003 \001(\0132(" + ".ir.sharif.aic.hideandseek.api.grpc.Turn" + "\022>\n\006config\030\004 \001(\0132..ir.sharif.aic.hideand" + "seek.api.grpc.GameConfig\0229\n\006viewer\030\005 \001(\013" + "2).ir.sharif.aic.hideandseek.api.grpc.Ag" + "ent\022\017\n\007balance\030\006 \001(\001\022A\n\016visible_agents\030\007", " \003(\0132).ir.sharif.aic.hideandseek.api.grp" + "c.Agent\0229\n\007chatBox\030\010 \003(\0132(.ir.sharif.aic" + ".hideandseek.api.grpc.Chat\"*\n\013ChatComman" + "d\022\r\n\005token\030\001 \001(\t\022\014\n\004text\030\002 \001(\t\"d\n\004Chat\022\n" + "\n\002id\030\001 \001(\t\022\023\n\013fromAgentId\030\002 \001(\005\022\014\n\004text\030" + "\003 \001(\t\022-\n\ttimeStamp\030\004 \001(\0132\032.google.protob" + "uf.Timestamp*\035\n\004Team\022\t\n\005FIRST\020\000\022\n\n\006SECON" + "D\020\001*+\n\010TurnType\022\016\n\nTHIEF_TURN\020\000\022\017\n\013POLIC" + "E_TURN\020\001*\"\n\tAgentType\022\t\n\005THIEF\020\000\022\n\n\006POLI" + "CE\020\001*4\n\nGameStatus\022\013\n\007PENDING\020\000\022\013\n\007ONGOI", "NG\020\001\022\014\n\010FINISHED\020\002*C\n\nGameResult\022\013\n\007UNKN" + "OWN\020\000\022\016\n\nFIRST_WINS\020\001\022\017\n\013SECOND_WINS\020\002\022\007" + "\n\003TIE\020\0032\212\003\n\013GameHandler\022g\n\020DeclareReadin" + "ess\022;.ir.sharif.aic.hideandseek.api.grpc" + ".DeclareReadinessCommand\032\026.google.protob" + "uf.Empty\022i\n\005Watch\0220.ir.sharif.aic.hidean" + "dseek.api.grpc.WatchCommand\032,.ir.sharif." + "aic.hideandseek.api.grpc.GameView0\001\022O\n\004M" + "ove\022/.ir.sharif.aic.hideandseek.api.grpc" + ".MoveCommand\032\026.google.protobuf.Empty\022V\n\013", "SendMessage\022/.ir.sharif.aic.hideandseek." + "api.grpc.ChatCommand\032\026.google.protobuf.E" + "mptyb\006proto3"};
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public com.google.protobuf.ExtensionRegistry assignDescriptors(com.google.protobuf.Descriptors.FileDescriptor root) {
                descriptor = root;
                return null;
            }
        };
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[]{com.google.protobuf.EmptyProto.getDescriptor(), com.google.protobuf.TimestampProto.getDescriptor(),}, assigner);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_descriptor, new String[]{"TurnNumber", "TurnType",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_descriptor = getDescriptor().getMessageTypes().get(1);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_descriptor, new String[]{"Id", "Team", "Type", "NodeId", "IsDead",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_descriptor = getDescriptor().getMessageTypes().get(2);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_descriptor, new String[]{"Id",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_descriptor = getDescriptor().getMessageTypes().get(3);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_descriptor, new String[]{"Id", "FirstNodeId", "SecondNodeId", "Price",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_descriptor = getDescriptor().getMessageTypes().get(4);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_descriptor, new String[]{"Paths", "Nodes",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_descriptor = getDescriptor().getMessageTypes().get(5);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_descriptor, new String[]{"PoliceIncomeEachTurn", "ThievesIncomeEachTurn",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_descriptor = getDescriptor().getMessageTypes().get(6);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_descriptor, new String[]{"MaxTurns", "VisibleTurns",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_descriptor = getDescriptor().getMessageTypes().get(7);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_descriptor, new String[]{"ChatBoxMaxSize", "ChatCostPerCharacter",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_descriptor = getDescriptor().getMessageTypes().get(8);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_descriptor, new String[]{"Graph", "IncomeSettings", "TurnSettings", "ChatSettings",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_descriptor = getDescriptor().getMessageTypes().get(9);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_descriptor, new String[]{"Token", "StartNodeId",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_descriptor = getDescriptor().getMessageTypes().get(10);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_descriptor, new String[]{"Token", "ToNodeId",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_descriptor = getDescriptor().getMessageTypes().get(11);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_descriptor, new String[]{"Token",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_descriptor = getDescriptor().getMessageTypes().get(12);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_descriptor, new String[]{"Status", "Result", "Turn", "Config", "Viewer", "Balance", "VisibleAgents", "ChatBox",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_descriptor = getDescriptor().getMessageTypes().get(13);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_descriptor, new String[]{"Token", "Text",});
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_descriptor = getDescriptor().getMessageTypes().get(14);
        internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_descriptor, new String[]{"Id", "FromAgentId", "Text", "TimeStamp",});
        com.google.protobuf.EmptyProto.getDescriptor();
        com.google.protobuf.TimestampProto.getDescriptor();
    }

    private AIProto() {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    /**
     * Protobuf enum {@code ir.sharif.aic.hideandseek.api.grpc.Team}
     */
    public enum Team implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>FIRST = 0;</code>
         */
        FIRST(0),
        /**
         * <code>SECOND = 1;</code>
         */
        SECOND(1), UNRECOGNIZED(-1),
        ;

        /**
         * <code>FIRST = 0;</code>
         */
        public static final int FIRST_VALUE = 0;
        /**
         * <code>SECOND = 1;</code>
         */
        public static final int SECOND_VALUE = 1;
        private static final com.google.protobuf.Internal.EnumLiteMap<Team> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<Team>() {
            public Team findValueByNumber(int number) {
                return Team.forNumber(number);
            }
        };
        private static final Team[] VALUES = values();
        private final int value;

        private Team(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static Team valueOf(int value) {
            return forNumber(value);
        }

        public static Team forNumber(int value) {
            switch (value) {
                case 0:
                    return FIRST;
                case 1:
                    return SECOND;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<Team> internalGetValueMap() {
            return internalValueMap;
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return AIProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Team valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        // @@protoc_insertion_point(enum_scope:ir.sharif.aic.hideandseek.api.grpc.Team)
    }

    /**
     * Protobuf enum {@code ir.sharif.aic.hideandseek.api.grpc.TurnType}
     */
    public enum TurnType implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>THIEF_TURN = 0;</code>
         */
        THIEF_TURN(0),
        /**
         * <code>POLICE_TURN = 1;</code>
         */
        POLICE_TURN(1), UNRECOGNIZED(-1),
        ;

        /**
         * <code>THIEF_TURN = 0;</code>
         */
        public static final int THIEF_TURN_VALUE = 0;
        /**
         * <code>POLICE_TURN = 1;</code>
         */
        public static final int POLICE_TURN_VALUE = 1;
        private static final com.google.protobuf.Internal.EnumLiteMap<TurnType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<TurnType>() {
            public TurnType findValueByNumber(int number) {
                return TurnType.forNumber(number);
            }
        };
        private static final TurnType[] VALUES = values();
        private final int value;

        private TurnType(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static TurnType valueOf(int value) {
            return forNumber(value);
        }

        public static TurnType forNumber(int value) {
            switch (value) {
                case 0:
                    return THIEF_TURN;
                case 1:
                    return POLICE_TURN;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<TurnType> internalGetValueMap() {
            return internalValueMap;
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return AIProto.getDescriptor().getEnumTypes().get(1);
        }

        public static TurnType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        // @@protoc_insertion_point(enum_scope:ir.sharif.aic.hideandseek.api.grpc.TurnType)
    }

    /**
     * Protobuf enum {@code ir.sharif.aic.hideandseek.api.grpc.AgentType}
     */
    public enum AgentType implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>THIEF = 0;</code>
         */
        THIEF(0),
        /**
         * <code>POLICE = 1;</code>
         */
        POLICE(1), UNRECOGNIZED(-1),
        ;

        /**
         * <code>THIEF = 0;</code>
         */
        public static final int THIEF_VALUE = 0;
        /**
         * <code>POLICE = 1;</code>
         */
        public static final int POLICE_VALUE = 1;
        private static final com.google.protobuf.Internal.EnumLiteMap<AgentType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<AgentType>() {
            public AgentType findValueByNumber(int number) {
                return AgentType.forNumber(number);
            }
        };
        private static final AgentType[] VALUES = values();
        private final int value;

        private AgentType(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static AgentType valueOf(int value) {
            return forNumber(value);
        }

        public static AgentType forNumber(int value) {
            switch (value) {
                case 0:
                    return THIEF;
                case 1:
                    return POLICE;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<AgentType> internalGetValueMap() {
            return internalValueMap;
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return AIProto.getDescriptor().getEnumTypes().get(2);
        }

        public static AgentType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        // @@protoc_insertion_point(enum_scope:ir.sharif.aic.hideandseek.api.grpc.AgentType)
    }

    /**
     * Protobuf enum {@code ir.sharif.aic.hideandseek.api.grpc.GameStatus}
     */
    public enum GameStatus implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>PENDING = 0;</code>
         */
        PENDING(0),
        /**
         * <code>ONGOING = 1;</code>
         */
        ONGOING(1),
        /**
         * <code>FINISHED = 2;</code>
         */
        FINISHED(2), UNRECOGNIZED(-1),
        ;

        /**
         * <code>PENDING = 0;</code>
         */
        public static final int PENDING_VALUE = 0;
        /**
         * <code>ONGOING = 1;</code>
         */
        public static final int ONGOING_VALUE = 1;
        /**
         * <code>FINISHED = 2;</code>
         */
        public static final int FINISHED_VALUE = 2;
        private static final com.google.protobuf.Internal.EnumLiteMap<GameStatus> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<GameStatus>() {
            public GameStatus findValueByNumber(int number) {
                return GameStatus.forNumber(number);
            }
        };
        private static final GameStatus[] VALUES = values();
        private final int value;

        private GameStatus(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static GameStatus valueOf(int value) {
            return forNumber(value);
        }

        public static GameStatus forNumber(int value) {
            switch (value) {
                case 0:
                    return PENDING;
                case 1:
                    return ONGOING;
                case 2:
                    return FINISHED;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<GameStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return AIProto.getDescriptor().getEnumTypes().get(3);
        }

        public static GameStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        // @@protoc_insertion_point(enum_scope:ir.sharif.aic.hideandseek.api.grpc.GameStatus)
    }

    /**
     * Protobuf enum {@code ir.sharif.aic.hideandseek.api.grpc.GameResult}
     */
    public enum GameResult implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>UNKNOWN = 0;</code>
         */
        UNKNOWN(0),
        /**
         * <code>FIRST_WINS = 1;</code>
         */
        FIRST_WINS(1),
        /**
         * <code>SECOND_WINS = 2;</code>
         */
        SECOND_WINS(2),
        /**
         * <code>TIE = 3;</code>
         */
        TIE(3), UNRECOGNIZED(-1),
        ;

        /**
         * <code>UNKNOWN = 0;</code>
         */
        public static final int UNKNOWN_VALUE = 0;
        /**
         * <code>FIRST_WINS = 1;</code>
         */
        public static final int FIRST_WINS_VALUE = 1;
        /**
         * <code>SECOND_WINS = 2;</code>
         */
        public static final int SECOND_WINS_VALUE = 2;
        /**
         * <code>TIE = 3;</code>
         */
        public static final int TIE_VALUE = 3;
        private static final com.google.protobuf.Internal.EnumLiteMap<GameResult> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<GameResult>() {
            public GameResult findValueByNumber(int number) {
                return GameResult.forNumber(number);
            }
        };
        private static final GameResult[] VALUES = values();
        private final int value;

        private GameResult(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static GameResult valueOf(int value) {
            return forNumber(value);
        }

        public static GameResult forNumber(int value) {
            switch (value) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return FIRST_WINS;
                case 2:
                    return SECOND_WINS;
                case 3:
                    return TIE;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<GameResult> internalGetValueMap() {
            return internalValueMap;
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return AIProto.getDescriptor().getEnumTypes().get(4);
        }

        public static GameResult valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        // @@protoc_insertion_point(enum_scope:ir.sharif.aic.hideandseek.api.grpc.GameResult)
    }

    public interface TurnOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.Turn)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 turnNumber = 1;</code>
         */
        int getTurnNumber();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnType turnType = 2;</code>
         */
        int getTurnTypeValue();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnType turnType = 2;</code>
         */
        AIProto.TurnType getTurnType();
    }

    public interface AgentOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.Agent)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 id = 1;</code>
         */
        int getId();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Team team = 2;</code>
         */
        int getTeamValue();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Team team = 2;</code>
         */
        AIProto.Team getTeam();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.AgentType type = 3;</code>
         */
        int getTypeValue();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.AgentType type = 3;</code>
         */
        AIProto.AgentType getType();

        /**
         * <code>int32 node_id = 4;</code>
         */
        int getNodeId();

        /**
         * <code>bool is_dead = 5;</code>
         */
        boolean getIsDead();
    }

    public interface NodeOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.Node)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 id = 1;</code>
         */
        int getId();
    }

    public interface PathOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.Path)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 id = 1;</code>
         */
        int getId();

        /**
         * <code>int32 first_node_id = 2;</code>
         */
        int getFirstNodeId();

        /**
         * <code>int32 second_node_id = 3;</code>
         */
        int getSecondNodeId();

        /**
         * <code>double price = 4;</code>
         */
        double getPrice();
    }

    public interface GraphOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.Graph)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        java.util.List<Path> getPathsList();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        AIProto.Path getPaths(int index);

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        int getPathsCount();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        java.util.List<? extends PathOrBuilder> getPathsOrBuilderList();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        AIProto.PathOrBuilder getPathsOrBuilder(int index);

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        java.util.List<Node> getNodesList();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        AIProto.Node getNodes(int index);

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        int getNodesCount();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        java.util.List<? extends NodeOrBuilder> getNodesOrBuilderList();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        AIProto.NodeOrBuilder getNodesOrBuilder(int index);
    }

    public interface IncomeSettingsOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.IncomeSettings)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>double policeIncomeEachTurn = 1;</code>
         */
        double getPoliceIncomeEachTurn();

        /**
         * <code>double thievesIncomeEachTurn = 2;</code>
         */
        double getThievesIncomeEachTurn();
    }

    public interface TurnSettingsOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.TurnSettings)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 maxTurns = 1;</code>
         */
        int getMaxTurns();

        /**
         * <code>repeated int32 visibleTurns = 2;</code>
         */
        java.util.List<Integer> getVisibleTurnsList();

        /**
         * <code>repeated int32 visibleTurns = 2;</code>
         */
        int getVisibleTurnsCount();

        /**
         * <code>repeated int32 visibleTurns = 2;</code>
         */
        int getVisibleTurns(int index);
    }

    public interface ChatSettingsOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.ChatSettings)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 chatBoxMaxSize = 1;</code>
         */
        int getChatBoxMaxSize();

        /**
         * <code>double chatCostPerCharacter = 2;</code>
         */
        double getChatCostPerCharacter();
    }

    public interface GameConfigOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.GameConfig)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
         */
        boolean hasGraph();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
         */
        AIProto.Graph getGraph();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
         */
        AIProto.GraphOrBuilder getGraphOrBuilder();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
         */
        boolean hasIncomeSettings();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
         */
        AIProto.IncomeSettings getIncomeSettings();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
         */
        AIProto.IncomeSettingsOrBuilder getIncomeSettingsOrBuilder();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
         */
        boolean hasTurnSettings();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
         */
        AIProto.TurnSettings getTurnSettings();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
         */
        AIProto.TurnSettingsOrBuilder getTurnSettingsOrBuilder();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
         */
        boolean hasChatSettings();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
         */
        AIProto.ChatSettings getChatSettings();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
         */
        AIProto.ChatSettingsOrBuilder getChatSettingsOrBuilder();
    }

    public interface DeclareReadinessCommandOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.DeclareReadinessCommand)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string token = 1;</code>
         */
        String getToken();

        /**
         * <code>string token = 1;</code>
         */
        com.google.protobuf.ByteString getTokenBytes();

        /**
         * <code>int32 startNodeId = 2;</code>
         */
        int getStartNodeId();
    }

    public interface MoveCommandOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.MoveCommand)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string token = 1;</code>
         */
        String getToken();

        /**
         * <code>string token = 1;</code>
         */
        com.google.protobuf.ByteString getTokenBytes();

        /**
         * <code>int32 toNodeId = 2;</code>
         */
        int getToNodeId();
    }

    public interface WatchCommandOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.WatchCommand)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string token = 1;</code>
         */
        String getToken();

        /**
         * <code>string token = 1;</code>
         */
        com.google.protobuf.ByteString getTokenBytes();
    }

    public interface GameViewOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.GameView)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameStatus status = 1;</code>
         */
        int getStatusValue();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameStatus status = 1;</code>
         */
        AIProto.GameStatus getStatus();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameResult result = 2;</code>
         */
        int getResultValue();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameResult result = 2;</code>
         */
        AIProto.GameResult getResult();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
         */
        boolean hasTurn();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
         */
        AIProto.Turn getTurn();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
         */
        AIProto.TurnOrBuilder getTurnOrBuilder();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
         */
        boolean hasConfig();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
         */
        AIProto.GameConfig getConfig();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
         */
        AIProto.GameConfigOrBuilder getConfigOrBuilder();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
         */
        boolean hasViewer();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
         */
        AIProto.Agent getViewer();

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
         */
        AIProto.AgentOrBuilder getViewerOrBuilder();

        /**
         * <code>double balance = 6;</code>
         */
        double getBalance();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        java.util.List<Agent> getVisibleAgentsList();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        AIProto.Agent getVisibleAgents(int index);

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        int getVisibleAgentsCount();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        java.util.List<? extends AgentOrBuilder> getVisibleAgentsOrBuilderList();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        AIProto.AgentOrBuilder getVisibleAgentsOrBuilder(int index);

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        java.util.List<Chat> getChatBoxList();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        AIProto.Chat getChatBox(int index);

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        int getChatBoxCount();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        java.util.List<? extends ChatOrBuilder> getChatBoxOrBuilderList();

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        AIProto.ChatOrBuilder getChatBoxOrBuilder(int index);
    }

    public interface ChatCommandOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.ChatCommand)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string token = 1;</code>
         */
        String getToken();

        /**
         * <code>string token = 1;</code>
         */
        com.google.protobuf.ByteString getTokenBytes();

        /**
         * <code>string text = 2;</code>
         */
        String getText();

        /**
         * <code>string text = 2;</code>
         */
        com.google.protobuf.ByteString getTextBytes();
    }

    public interface ChatOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ir.sharif.aic.hideandseek.api.grpc.Chat)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string id = 1;</code>
         */
        String getId();

        /**
         * <code>string id = 1;</code>
         */
        com.google.protobuf.ByteString getIdBytes();

        /**
         * <code>int32 fromAgentId = 2;</code>
         */
        int getFromAgentId();

        /**
         * <code>string text = 3;</code>
         */
        String getText();

        /**
         * <code>string text = 3;</code>
         */
        com.google.protobuf.ByteString getTextBytes();

        /**
         * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
         */
        boolean hasTimeStamp();

        /**
         * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
         */
        com.google.protobuf.Timestamp getTimeStamp();

        /**
         * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
         */
        com.google.protobuf.TimestampOrBuilder getTimeStampOrBuilder();
    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Turn}
     */
    public static final class Turn extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.Turn)
            TurnOrBuilder {
        public static final int TURNNUMBER_FIELD_NUMBER = 1;
        public static final int TURNTYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.Turn)
        private static final AIProto.Turn DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<Turn> PARSER = new com.google.protobuf.AbstractParser<Turn>() {
            public Turn parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new Turn(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.Turn();
        }

        private int turnNumber_;
        private int turnType_;
        private byte memoizedIsInitialized = -1;

        // Use Turn.newBuilder() to construct.
        private Turn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Turn() {
            turnNumber_ = 0;
            turnType_ = 0;
        }

        private Turn(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            turnNumber_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            int rawValue = input.readEnum();

                            turnType_ = rawValue;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_descriptor;
        }

        public static AIProto.Turn parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Turn parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Turn parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Turn parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Turn parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Turn parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Turn parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Turn parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Turn parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.Turn parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Turn parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Turn parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.Turn prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.Turn getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Turn> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Turn.class, AIProto.Turn.Builder.class);
        }

        /**
         * <code>int32 turnNumber = 1;</code>
         */
        public int getTurnNumber() {
            return turnNumber_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnType turnType = 2;</code>
         */
        public int getTurnTypeValue() {
            return turnType_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnType turnType = 2;</code>
         */
        public AIProto.TurnType getTurnType() {
            AIProto.TurnType result = AIProto.TurnType.valueOf(turnType_);
            return result == null ? AIProto.TurnType.UNRECOGNIZED : result;
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (turnNumber_ != 0) {
                output.writeInt32(1, turnNumber_);
            }
            if (turnType_ != AIProto.TurnType.THIEF_TURN.getNumber()) {
                output.writeEnum(2, turnType_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (turnNumber_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, turnNumber_);
            }
            if (turnType_ != AIProto.TurnType.THIEF_TURN.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, turnType_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.Turn)) {
                return super.equals(obj);
            }
            AIProto.Turn other = (AIProto.Turn) obj;

            boolean result = true;
            result = result && (getTurnNumber() == other.getTurnNumber());
            result = result && turnType_ == other.turnType_;
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TURNNUMBER_FIELD_NUMBER;
            hash = (53 * hash) + getTurnNumber();
            hash = (37 * hash) + TURNTYPE_FIELD_NUMBER;
            hash = (53 * hash) + turnType_;
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<Turn> getParserForType() {
            return PARSER;
        }

        public AIProto.Turn getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Turn}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.Turn)
                AIProto.TurnOrBuilder {
            private int turnNumber_;
            private int turnType_ = 0;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.Turn.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Turn.class, AIProto.Turn.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                turnNumber_ = 0;

                turnType_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Turn_descriptor;
            }

            public AIProto.Turn getDefaultInstanceForType() {
                return AIProto.Turn.getDefaultInstance();
            }

            public AIProto.Turn build() {
                AIProto.Turn result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.Turn buildPartial() {
                AIProto.Turn result = new AIProto.Turn(this);
                result.turnNumber_ = turnNumber_;
                result.turnType_ = turnType_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.Turn) {
                    return mergeFrom((AIProto.Turn) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.Turn other) {
                if (other == AIProto.Turn.getDefaultInstance()) return this;
                if (other.getTurnNumber() != 0) {
                    setTurnNumber(other.getTurnNumber());
                }
                if (other.turnType_ != 0) {
                    setTurnTypeValue(other.getTurnTypeValue());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.Turn parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.Turn) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>int32 turnNumber = 1;</code>
             */
            public int getTurnNumber() {
                return turnNumber_;
            }

            /**
             * <code>int32 turnNumber = 1;</code>
             */
            public Builder setTurnNumber(int value) {

                turnNumber_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 turnNumber = 1;</code>
             */
            public Builder clearTurnNumber() {

                turnNumber_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnType turnType = 2;</code>
             */
            public int getTurnTypeValue() {
                return turnType_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnType turnType = 2;</code>
             */
            public Builder setTurnTypeValue(int value) {
                turnType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnType turnType = 2;</code>
             */
            public AIProto.TurnType getTurnType() {
                AIProto.TurnType result = AIProto.TurnType.valueOf(turnType_);
                return result == null ? AIProto.TurnType.UNRECOGNIZED : result;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnType turnType = 2;</code>
             */
            public Builder setTurnType(AIProto.TurnType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                turnType_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnType turnType = 2;</code>
             */
            public Builder clearTurnType() {

                turnType_ = 0;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.Turn)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Agent}
     */
    public static final class Agent extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.Agent)
            AgentOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int TEAM_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int NODE_ID_FIELD_NUMBER = 4;
        public static final int IS_DEAD_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.Agent)
        private static final AIProto.Agent DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<Agent> PARSER = new com.google.protobuf.AbstractParser<Agent>() {
            public Agent parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new Agent(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.Agent();
        }

        private int id_;
        private int team_;
        private int type_;
        private int nodeId_;
        private boolean isDead_;
        private byte memoizedIsInitialized = -1;

        // Use Agent.newBuilder() to construct.
        private Agent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Agent() {
            id_ = 0;
            team_ = 0;
            type_ = 0;
            nodeId_ = 0;
            isDead_ = false;
        }

        private Agent(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            id_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            int rawValue = input.readEnum();

                            team_ = rawValue;
                            break;
                        }
                        case 24: {
                            int rawValue = input.readEnum();

                            type_ = rawValue;
                            break;
                        }
                        case 32: {

                            nodeId_ = input.readInt32();
                            break;
                        }
                        case 40: {

                            isDead_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_descriptor;
        }

        public static AIProto.Agent parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Agent parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Agent parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Agent parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Agent parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Agent parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Agent parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Agent parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Agent parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.Agent parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Agent parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Agent parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.Agent prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.Agent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Agent> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Agent.class, AIProto.Agent.Builder.class);
        }

        /**
         * <code>int32 id = 1;</code>
         */
        public int getId() {
            return id_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Team team = 2;</code>
         */
        public int getTeamValue() {
            return team_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Team team = 2;</code>
         */
        public AIProto.Team getTeam() {
            AIProto.Team result = AIProto.Team.valueOf(team_);
            return result == null ? AIProto.Team.UNRECOGNIZED : result;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.AgentType type = 3;</code>
         */
        public int getTypeValue() {
            return type_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.AgentType type = 3;</code>
         */
        public AIProto.AgentType getType() {
            AIProto.AgentType result = AIProto.AgentType.valueOf(type_);
            return result == null ? AIProto.AgentType.UNRECOGNIZED : result;
        }

        /**
         * <code>int32 node_id = 4;</code>
         */
        public int getNodeId() {
            return nodeId_;
        }

        /**
         * <code>bool is_dead = 5;</code>
         */
        public boolean getIsDead() {
            return isDead_;
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (id_ != 0) {
                output.writeInt32(1, id_);
            }
            if (team_ != AIProto.Team.FIRST.getNumber()) {
                output.writeEnum(2, team_);
            }
            if (type_ != AIProto.AgentType.THIEF.getNumber()) {
                output.writeEnum(3, type_);
            }
            if (nodeId_ != 0) {
                output.writeInt32(4, nodeId_);
            }
            if (isDead_ != false) {
                output.writeBool(5, isDead_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, id_);
            }
            if (team_ != AIProto.Team.FIRST.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, team_);
            }
            if (type_ != AIProto.AgentType.THIEF.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, type_);
            }
            if (nodeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, nodeId_);
            }
            if (isDead_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, isDead_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.Agent)) {
                return super.equals(obj);
            }
            AIProto.Agent other = (AIProto.Agent) obj;

            boolean result = true;
            result = result && (getId() == other.getId());
            result = result && team_ == other.team_;
            result = result && type_ == other.type_;
            result = result && (getNodeId() == other.getNodeId());
            result = result && (getIsDead() == other.getIsDead());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId();
            hash = (37 * hash) + TEAM_FIELD_NUMBER;
            hash = (53 * hash) + team_;
            hash = (37 * hash) + TYPE_FIELD_NUMBER;
            hash = (53 * hash) + type_;
            hash = (37 * hash) + NODE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getNodeId();
            hash = (37 * hash) + IS_DEAD_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsDead());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<Agent> getParserForType() {
            return PARSER;
        }

        public AIProto.Agent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Agent}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.Agent)
                AIProto.AgentOrBuilder {
            private int id_;
            private int team_ = 0;
            private int type_ = 0;
            private int nodeId_;
            private boolean isDead_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.Agent.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Agent.class, AIProto.Agent.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                id_ = 0;

                team_ = 0;

                type_ = 0;

                nodeId_ = 0;

                isDead_ = false;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Agent_descriptor;
            }

            public AIProto.Agent getDefaultInstanceForType() {
                return AIProto.Agent.getDefaultInstance();
            }

            public AIProto.Agent build() {
                AIProto.Agent result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.Agent buildPartial() {
                AIProto.Agent result = new AIProto.Agent(this);
                result.id_ = id_;
                result.team_ = team_;
                result.type_ = type_;
                result.nodeId_ = nodeId_;
                result.isDead_ = isDead_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.Agent) {
                    return mergeFrom((AIProto.Agent) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.Agent other) {
                if (other == AIProto.Agent.getDefaultInstance()) return this;
                if (other.getId() != 0) {
                    setId(other.getId());
                }
                if (other.team_ != 0) {
                    setTeamValue(other.getTeamValue());
                }
                if (other.type_ != 0) {
                    setTypeValue(other.getTypeValue());
                }
                if (other.getNodeId() != 0) {
                    setNodeId(other.getNodeId());
                }
                if (other.getIsDead() != false) {
                    setIsDead(other.getIsDead());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.Agent parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.Agent) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>int32 id = 1;</code>
             */
            public int getId() {
                return id_;
            }

            /**
             * <code>int32 id = 1;</code>
             */
            public Builder setId(int value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 id = 1;</code>
             */
            public Builder clearId() {

                id_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Team team = 2;</code>
             */
            public int getTeamValue() {
                return team_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Team team = 2;</code>
             */
            public Builder setTeamValue(int value) {
                team_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Team team = 2;</code>
             */
            public AIProto.Team getTeam() {
                AIProto.Team result = AIProto.Team.valueOf(team_);
                return result == null ? AIProto.Team.UNRECOGNIZED : result;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Team team = 2;</code>
             */
            public Builder setTeam(AIProto.Team value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                team_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Team team = 2;</code>
             */
            public Builder clearTeam() {

                team_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.AgentType type = 3;</code>
             */
            public int getTypeValue() {
                return type_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.AgentType type = 3;</code>
             */
            public Builder setTypeValue(int value) {
                type_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.AgentType type = 3;</code>
             */
            public AIProto.AgentType getType() {
                AIProto.AgentType result = AIProto.AgentType.valueOf(type_);
                return result == null ? AIProto.AgentType.UNRECOGNIZED : result;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.AgentType type = 3;</code>
             */
            public Builder setType(AIProto.AgentType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                type_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.AgentType type = 3;</code>
             */
            public Builder clearType() {

                type_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>int32 node_id = 4;</code>
             */
            public int getNodeId() {
                return nodeId_;
            }

            /**
             * <code>int32 node_id = 4;</code>
             */
            public Builder setNodeId(int value) {

                nodeId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 node_id = 4;</code>
             */
            public Builder clearNodeId() {

                nodeId_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>bool is_dead = 5;</code>
             */
            public boolean getIsDead() {
                return isDead_;
            }

            /**
             * <code>bool is_dead = 5;</code>
             */
            public Builder setIsDead(boolean value) {

                isDead_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>bool is_dead = 5;</code>
             */
            public Builder clearIsDead() {

                isDead_ = false;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.Agent)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Node}
     */
    public static final class Node extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.Node)
            NodeOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.Node)
        private static final AIProto.Node DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<Node> PARSER = new com.google.protobuf.AbstractParser<Node>() {
            public Node parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new Node(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.Node();
        }

        private int id_;
        private byte memoizedIsInitialized = -1;

        // Use Node.newBuilder() to construct.
        private Node(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Node() {
            id_ = 0;
        }

        private Node(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            id_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_descriptor;
        }

        public static AIProto.Node parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Node parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Node parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Node parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Node parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Node parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Node parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Node parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Node parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.Node parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Node parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Node parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.Node prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.Node getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Node> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Node.class, AIProto.Node.Builder.class);
        }

        /**
         * <code>int32 id = 1;</code>
         */
        public int getId() {
            return id_;
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (id_ != 0) {
                output.writeInt32(1, id_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, id_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.Node)) {
                return super.equals(obj);
            }
            AIProto.Node other = (AIProto.Node) obj;

            boolean result = true;
            result = result && (getId() == other.getId());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<Node> getParserForType() {
            return PARSER;
        }

        public AIProto.Node getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Node}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.Node)
                AIProto.NodeOrBuilder {
            private int id_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.Node.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Node.class, AIProto.Node.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                id_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Node_descriptor;
            }

            public AIProto.Node getDefaultInstanceForType() {
                return AIProto.Node.getDefaultInstance();
            }

            public AIProto.Node build() {
                AIProto.Node result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.Node buildPartial() {
                AIProto.Node result = new AIProto.Node(this);
                result.id_ = id_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.Node) {
                    return mergeFrom((AIProto.Node) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.Node other) {
                if (other == AIProto.Node.getDefaultInstance()) return this;
                if (other.getId() != 0) {
                    setId(other.getId());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.Node parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.Node) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>int32 id = 1;</code>
             */
            public int getId() {
                return id_;
            }

            /**
             * <code>int32 id = 1;</code>
             */
            public Builder setId(int value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 id = 1;</code>
             */
            public Builder clearId() {

                id_ = 0;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.Node)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Path}
     */
    public static final class Path extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.Path)
            PathOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int FIRST_NODE_ID_FIELD_NUMBER = 2;
        public static final int SECOND_NODE_ID_FIELD_NUMBER = 3;
        public static final int PRICE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.Path)
        private static final AIProto.Path DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<Path> PARSER = new com.google.protobuf.AbstractParser<Path>() {
            public Path parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new Path(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.Path();
        }

        private int id_;
        private int firstNodeId_;
        private int secondNodeId_;
        private double price_;
        private byte memoizedIsInitialized = -1;

        // Use Path.newBuilder() to construct.
        private Path(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Path() {
            id_ = 0;
            firstNodeId_ = 0;
            secondNodeId_ = 0;
            price_ = 0D;
        }

        private Path(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            id_ = input.readInt32();
                            break;
                        }
                        case 16: {

                            firstNodeId_ = input.readInt32();
                            break;
                        }
                        case 24: {

                            secondNodeId_ = input.readInt32();
                            break;
                        }
                        case 33: {

                            price_ = input.readDouble();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_descriptor;
        }

        public static AIProto.Path parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Path parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Path parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Path parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Path parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Path parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Path parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Path parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Path parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.Path parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Path parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Path parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.Path prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.Path getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Path> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Path.class, AIProto.Path.Builder.class);
        }

        /**
         * <code>int32 id = 1;</code>
         */
        public int getId() {
            return id_;
        }

        /**
         * <code>int32 first_node_id = 2;</code>
         */
        public int getFirstNodeId() {
            return firstNodeId_;
        }

        /**
         * <code>int32 second_node_id = 3;</code>
         */
        public int getSecondNodeId() {
            return secondNodeId_;
        }

        /**
         * <code>double price = 4;</code>
         */
        public double getPrice() {
            return price_;
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (id_ != 0) {
                output.writeInt32(1, id_);
            }
            if (firstNodeId_ != 0) {
                output.writeInt32(2, firstNodeId_);
            }
            if (secondNodeId_ != 0) {
                output.writeInt32(3, secondNodeId_);
            }
            if (price_ != 0D) {
                output.writeDouble(4, price_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, id_);
            }
            if (firstNodeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, firstNodeId_);
            }
            if (secondNodeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, secondNodeId_);
            }
            if (price_ != 0D) {
                size += com.google.protobuf.CodedOutputStream.computeDoubleSize(4, price_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.Path)) {
                return super.equals(obj);
            }
            AIProto.Path other = (AIProto.Path) obj;

            boolean result = true;
            result = result && (getId() == other.getId());
            result = result && (getFirstNodeId() == other.getFirstNodeId());
            result = result && (getSecondNodeId() == other.getSecondNodeId());
            result = result && (Double.doubleToLongBits(getPrice()) == Double.doubleToLongBits(other.getPrice()));
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId();
            hash = (37 * hash) + FIRST_NODE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getFirstNodeId();
            hash = (37 * hash) + SECOND_NODE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getSecondNodeId();
            hash = (37 * hash) + PRICE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(Double.doubleToLongBits(getPrice()));
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<Path> getParserForType() {
            return PARSER;
        }

        public AIProto.Path getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Path}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.Path)
                AIProto.PathOrBuilder {
            private int id_;
            private int firstNodeId_;
            private int secondNodeId_;
            private double price_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.Path.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Path.class, AIProto.Path.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                id_ = 0;

                firstNodeId_ = 0;

                secondNodeId_ = 0;

                price_ = 0D;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Path_descriptor;
            }

            public AIProto.Path getDefaultInstanceForType() {
                return AIProto.Path.getDefaultInstance();
            }

            public AIProto.Path build() {
                AIProto.Path result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.Path buildPartial() {
                AIProto.Path result = new AIProto.Path(this);
                result.id_ = id_;
                result.firstNodeId_ = firstNodeId_;
                result.secondNodeId_ = secondNodeId_;
                result.price_ = price_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.Path) {
                    return mergeFrom((AIProto.Path) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.Path other) {
                if (other == AIProto.Path.getDefaultInstance()) return this;
                if (other.getId() != 0) {
                    setId(other.getId());
                }
                if (other.getFirstNodeId() != 0) {
                    setFirstNodeId(other.getFirstNodeId());
                }
                if (other.getSecondNodeId() != 0) {
                    setSecondNodeId(other.getSecondNodeId());
                }
                if (other.getPrice() != 0D) {
                    setPrice(other.getPrice());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.Path parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.Path) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>int32 id = 1;</code>
             */
            public int getId() {
                return id_;
            }

            /**
             * <code>int32 id = 1;</code>
             */
            public Builder setId(int value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 id = 1;</code>
             */
            public Builder clearId() {

                id_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>int32 first_node_id = 2;</code>
             */
            public int getFirstNodeId() {
                return firstNodeId_;
            }

            /**
             * <code>int32 first_node_id = 2;</code>
             */
            public Builder setFirstNodeId(int value) {

                firstNodeId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 first_node_id = 2;</code>
             */
            public Builder clearFirstNodeId() {

                firstNodeId_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>int32 second_node_id = 3;</code>
             */
            public int getSecondNodeId() {
                return secondNodeId_;
            }

            /**
             * <code>int32 second_node_id = 3;</code>
             */
            public Builder setSecondNodeId(int value) {

                secondNodeId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 second_node_id = 3;</code>
             */
            public Builder clearSecondNodeId() {

                secondNodeId_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>double price = 4;</code>
             */
            public double getPrice() {
                return price_;
            }

            /**
             * <code>double price = 4;</code>
             */
            public Builder setPrice(double value) {

                price_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>double price = 4;</code>
             */
            public Builder clearPrice() {

                price_ = 0D;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.Path)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Graph}
     */
    public static final class Graph extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.Graph)
            GraphOrBuilder {
        public static final int PATHS_FIELD_NUMBER = 1;
        public static final int NODES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.Graph)
        private static final AIProto.Graph DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<Graph> PARSER = new com.google.protobuf.AbstractParser<Graph>() {
            public Graph parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new Graph(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.Graph();
        }

        private java.util.List<Path> paths_;
        private java.util.List<Node> nodes_;
        private byte memoizedIsInitialized = -1;

        // Use Graph.newBuilder() to construct.
        private Graph(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Graph() {
            paths_ = java.util.Collections.emptyList();
            nodes_ = java.util.Collections.emptyList();
        }

        private Graph(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                paths_ = new java.util.ArrayList<Path>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            paths_.add(input.readMessage(AIProto.Path.parser(), extensionRegistry));
                            break;
                        }
                        case 18: {
                            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                                nodes_ = new java.util.ArrayList<Node>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            nodes_.add(input.readMessage(AIProto.Node.parser(), extensionRegistry));
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    paths_ = java.util.Collections.unmodifiableList(paths_);
                }
                if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                    nodes_ = java.util.Collections.unmodifiableList(nodes_);
                }
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_descriptor;
        }

        public static AIProto.Graph parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Graph parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Graph parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Graph parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Graph parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Graph parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Graph parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Graph parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Graph parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.Graph parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Graph parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Graph parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.Graph prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.Graph getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Graph> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Graph.class, AIProto.Graph.Builder.class);
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        public java.util.List<Path> getPathsList() {
            return paths_;
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        public java.util.List<? extends PathOrBuilder> getPathsOrBuilderList() {
            return paths_;
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        public int getPathsCount() {
            return paths_.size();
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        public AIProto.Path getPaths(int index) {
            return paths_.get(index);
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
         */
        public AIProto.PathOrBuilder getPathsOrBuilder(int index) {
            return paths_.get(index);
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        public java.util.List<Node> getNodesList() {
            return nodes_;
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        public java.util.List<? extends NodeOrBuilder> getNodesOrBuilderList() {
            return nodes_;
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        public int getNodesCount() {
            return nodes_.size();
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        public AIProto.Node getNodes(int index) {
            return nodes_.get(index);
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
         */
        public AIProto.NodeOrBuilder getNodesOrBuilder(int index) {
            return nodes_.get(index);
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            for (int i = 0; i < paths_.size(); i++) {
                output.writeMessage(1, paths_.get(i));
            }
            for (int i = 0; i < nodes_.size(); i++) {
                output.writeMessage(2, nodes_.get(i));
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < paths_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, paths_.get(i));
            }
            for (int i = 0; i < nodes_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, nodes_.get(i));
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.Graph)) {
                return super.equals(obj);
            }
            AIProto.Graph other = (AIProto.Graph) obj;

            boolean result = true;
            result = result && getPathsList().equals(other.getPathsList());
            result = result && getNodesList().equals(other.getNodesList());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getPathsCount() > 0) {
                hash = (37 * hash) + PATHS_FIELD_NUMBER;
                hash = (53 * hash) + getPathsList().hashCode();
            }
            if (getNodesCount() > 0) {
                hash = (37 * hash) + NODES_FIELD_NUMBER;
                hash = (53 * hash) + getNodesList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<Graph> getParserForType() {
            return PARSER;
        }

        public AIProto.Graph getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Graph}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.Graph)
                AIProto.GraphOrBuilder {
            private int bitField0_;
            private java.util.List<Path> paths_ = java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<Path, Path.Builder, PathOrBuilder> pathsBuilder_;
            private java.util.List<Node> nodes_ = java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<Node, Node.Builder, NodeOrBuilder> nodesBuilder_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.Graph.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Graph.class, AIProto.Graph.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPathsFieldBuilder();
                    getNodesFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                if (pathsBuilder_ == null) {
                    paths_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    pathsBuilder_.clear();
                }
                if (nodesBuilder_ == null) {
                    nodes_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    nodesBuilder_.clear();
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Graph_descriptor;
            }

            public AIProto.Graph getDefaultInstanceForType() {
                return AIProto.Graph.getDefaultInstance();
            }

            public AIProto.Graph build() {
                AIProto.Graph result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.Graph buildPartial() {
                AIProto.Graph result = new AIProto.Graph(this);
                int from_bitField0_ = bitField0_;
                if (pathsBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001)) {
                        paths_ = java.util.Collections.unmodifiableList(paths_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.paths_ = paths_;
                } else {
                    result.paths_ = pathsBuilder_.build();
                }
                if (nodesBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002)) {
                        nodes_ = java.util.Collections.unmodifiableList(nodes_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.nodes_ = nodes_;
                } else {
                    result.nodes_ = nodesBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.Graph) {
                    return mergeFrom((AIProto.Graph) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.Graph other) {
                if (other == AIProto.Graph.getDefaultInstance()) return this;
                if (pathsBuilder_ == null) {
                    if (!other.paths_.isEmpty()) {
                        if (paths_.isEmpty()) {
                            paths_ = other.paths_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensurePathsIsMutable();
                            paths_.addAll(other.paths_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.paths_.isEmpty()) {
                        if (pathsBuilder_.isEmpty()) {
                            pathsBuilder_.dispose();
                            pathsBuilder_ = null;
                            paths_ = other.paths_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            pathsBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getPathsFieldBuilder() : null;
                        } else {
                            pathsBuilder_.addAllMessages(other.paths_);
                        }
                    }
                }
                if (nodesBuilder_ == null) {
                    if (!other.nodes_.isEmpty()) {
                        if (nodes_.isEmpty()) {
                            nodes_ = other.nodes_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureNodesIsMutable();
                            nodes_.addAll(other.nodes_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.nodes_.isEmpty()) {
                        if (nodesBuilder_.isEmpty()) {
                            nodesBuilder_.dispose();
                            nodesBuilder_ = null;
                            nodes_ = other.nodes_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            nodesBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getNodesFieldBuilder() : null;
                        } else {
                            nodesBuilder_.addAllMessages(other.nodes_);
                        }
                    }
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.Graph parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.Graph) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private void ensurePathsIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    paths_ = new java.util.ArrayList<Path>(paths_);
                    bitField0_ |= 0x00000001;
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public java.util.List<Path> getPathsList() {
                if (pathsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(paths_);
                } else {
                    return pathsBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public int getPathsCount() {
                if (pathsBuilder_ == null) {
                    return paths_.size();
                } else {
                    return pathsBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public AIProto.Path getPaths(int index) {
                if (pathsBuilder_ == null) {
                    return paths_.get(index);
                } else {
                    return pathsBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public Builder setPaths(int index, AIProto.Path value) {
                if (pathsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePathsIsMutable();
                    paths_.set(index, value);
                    onChanged();
                } else {
                    pathsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public Builder setPaths(int index, AIProto.Path.Builder builderForValue) {
                if (pathsBuilder_ == null) {
                    ensurePathsIsMutable();
                    paths_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    pathsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public Builder addPaths(AIProto.Path value) {
                if (pathsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePathsIsMutable();
                    paths_.add(value);
                    onChanged();
                } else {
                    pathsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public Builder addPaths(int index, AIProto.Path value) {
                if (pathsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePathsIsMutable();
                    paths_.add(index, value);
                    onChanged();
                } else {
                    pathsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public Builder addPaths(AIProto.Path.Builder builderForValue) {
                if (pathsBuilder_ == null) {
                    ensurePathsIsMutable();
                    paths_.add(builderForValue.build());
                    onChanged();
                } else {
                    pathsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public Builder addPaths(int index, AIProto.Path.Builder builderForValue) {
                if (pathsBuilder_ == null) {
                    ensurePathsIsMutable();
                    paths_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    pathsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public Builder addAllPaths(Iterable<? extends Path> values) {
                if (pathsBuilder_ == null) {
                    ensurePathsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, paths_);
                    onChanged();
                } else {
                    pathsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public Builder clearPaths() {
                if (pathsBuilder_ == null) {
                    paths_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    pathsBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public Builder removePaths(int index) {
                if (pathsBuilder_ == null) {
                    ensurePathsIsMutable();
                    paths_.remove(index);
                    onChanged();
                } else {
                    pathsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public AIProto.Path.Builder getPathsBuilder(int index) {
                return getPathsFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public AIProto.PathOrBuilder getPathsOrBuilder(int index) {
                if (pathsBuilder_ == null) {
                    return paths_.get(index);
                } else {
                    return pathsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public java.util.List<? extends PathOrBuilder> getPathsOrBuilderList() {
                if (pathsBuilder_ != null) {
                    return pathsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(paths_);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public AIProto.Path.Builder addPathsBuilder() {
                return getPathsFieldBuilder().addBuilder(AIProto.Path.getDefaultInstance());
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public AIProto.Path.Builder addPathsBuilder(int index) {
                return getPathsFieldBuilder().addBuilder(index, AIProto.Path.getDefaultInstance());
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Path paths = 1;</code>
             */
            public java.util.List<Path.Builder> getPathsBuilderList() {
                return getPathsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<Path, Path.Builder, PathOrBuilder> getPathsFieldBuilder() {
                if (pathsBuilder_ == null) {
                    pathsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<Path, Path.Builder, PathOrBuilder>(paths_, ((bitField0_ & 0x00000001) == 0x00000001), getParentForChildren(), isClean());
                    paths_ = null;
                }
                return pathsBuilder_;
            }

            private void ensureNodesIsMutable() {
                if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                    nodes_ = new java.util.ArrayList<Node>(nodes_);
                    bitField0_ |= 0x00000002;
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public java.util.List<Node> getNodesList() {
                if (nodesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(nodes_);
                } else {
                    return nodesBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public int getNodesCount() {
                if (nodesBuilder_ == null) {
                    return nodes_.size();
                } else {
                    return nodesBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public AIProto.Node getNodes(int index) {
                if (nodesBuilder_ == null) {
                    return nodes_.get(index);
                } else {
                    return nodesBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public Builder setNodes(int index, AIProto.Node value) {
                if (nodesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureNodesIsMutable();
                    nodes_.set(index, value);
                    onChanged();
                } else {
                    nodesBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public Builder setNodes(int index, AIProto.Node.Builder builderForValue) {
                if (nodesBuilder_ == null) {
                    ensureNodesIsMutable();
                    nodes_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    nodesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public Builder addNodes(AIProto.Node value) {
                if (nodesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureNodesIsMutable();
                    nodes_.add(value);
                    onChanged();
                } else {
                    nodesBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public Builder addNodes(int index, AIProto.Node value) {
                if (nodesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureNodesIsMutable();
                    nodes_.add(index, value);
                    onChanged();
                } else {
                    nodesBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public Builder addNodes(AIProto.Node.Builder builderForValue) {
                if (nodesBuilder_ == null) {
                    ensureNodesIsMutable();
                    nodes_.add(builderForValue.build());
                    onChanged();
                } else {
                    nodesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public Builder addNodes(int index, AIProto.Node.Builder builderForValue) {
                if (nodesBuilder_ == null) {
                    ensureNodesIsMutable();
                    nodes_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    nodesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public Builder addAllNodes(Iterable<? extends Node> values) {
                if (nodesBuilder_ == null) {
                    ensureNodesIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nodes_);
                    onChanged();
                } else {
                    nodesBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public Builder clearNodes() {
                if (nodesBuilder_ == null) {
                    nodes_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    nodesBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public Builder removeNodes(int index) {
                if (nodesBuilder_ == null) {
                    ensureNodesIsMutable();
                    nodes_.remove(index);
                    onChanged();
                } else {
                    nodesBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public AIProto.Node.Builder getNodesBuilder(int index) {
                return getNodesFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public AIProto.NodeOrBuilder getNodesOrBuilder(int index) {
                if (nodesBuilder_ == null) {
                    return nodes_.get(index);
                } else {
                    return nodesBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public java.util.List<? extends NodeOrBuilder> getNodesOrBuilderList() {
                if (nodesBuilder_ != null) {
                    return nodesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(nodes_);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public AIProto.Node.Builder addNodesBuilder() {
                return getNodesFieldBuilder().addBuilder(AIProto.Node.getDefaultInstance());
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public AIProto.Node.Builder addNodesBuilder(int index) {
                return getNodesFieldBuilder().addBuilder(index, AIProto.Node.getDefaultInstance());
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Node nodes = 2;</code>
             */
            public java.util.List<Node.Builder> getNodesBuilderList() {
                return getNodesFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<Node, Node.Builder, NodeOrBuilder> getNodesFieldBuilder() {
                if (nodesBuilder_ == null) {
                    nodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<Node, Node.Builder, NodeOrBuilder>(nodes_, ((bitField0_ & 0x00000002) == 0x00000002), getParentForChildren(), isClean());
                    nodes_ = null;
                }
                return nodesBuilder_;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.Graph)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.IncomeSettings}
     */
    public static final class IncomeSettings extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.IncomeSettings)
            IncomeSettingsOrBuilder {
        public static final int POLICEINCOMEEACHTURN_FIELD_NUMBER = 1;
        public static final int THIEVESINCOMEEACHTURN_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.IncomeSettings)
        private static final AIProto.IncomeSettings DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<IncomeSettings> PARSER = new com.google.protobuf.AbstractParser<IncomeSettings>() {
            public IncomeSettings parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new IncomeSettings(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.IncomeSettings();
        }

        private double policeIncomeEachTurn_;
        private double thievesIncomeEachTurn_;
        private byte memoizedIsInitialized = -1;

        // Use IncomeSettings.newBuilder() to construct.
        private IncomeSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private IncomeSettings() {
            policeIncomeEachTurn_ = 0D;
            thievesIncomeEachTurn_ = 0D;
        }

        private IncomeSettings(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 9: {

                            policeIncomeEachTurn_ = input.readDouble();
                            break;
                        }
                        case 17: {

                            thievesIncomeEachTurn_ = input.readDouble();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_descriptor;
        }

        public static AIProto.IncomeSettings parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.IncomeSettings parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.IncomeSettings parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.IncomeSettings parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.IncomeSettings parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.IncomeSettings parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.IncomeSettings parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.IncomeSettings parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.IncomeSettings parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.IncomeSettings parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.IncomeSettings parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.IncomeSettings parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.IncomeSettings prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.IncomeSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<IncomeSettings> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.IncomeSettings.class, AIProto.IncomeSettings.Builder.class);
        }

        /**
         * <code>double policeIncomeEachTurn = 1;</code>
         */
        public double getPoliceIncomeEachTurn() {
            return policeIncomeEachTurn_;
        }

        /**
         * <code>double thievesIncomeEachTurn = 2;</code>
         */
        public double getThievesIncomeEachTurn() {
            return thievesIncomeEachTurn_;
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (policeIncomeEachTurn_ != 0D) {
                output.writeDouble(1, policeIncomeEachTurn_);
            }
            if (thievesIncomeEachTurn_ != 0D) {
                output.writeDouble(2, thievesIncomeEachTurn_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (policeIncomeEachTurn_ != 0D) {
                size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, policeIncomeEachTurn_);
            }
            if (thievesIncomeEachTurn_ != 0D) {
                size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, thievesIncomeEachTurn_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.IncomeSettings)) {
                return super.equals(obj);
            }
            AIProto.IncomeSettings other = (AIProto.IncomeSettings) obj;

            boolean result = true;
            result = result && (Double.doubleToLongBits(getPoliceIncomeEachTurn()) == Double.doubleToLongBits(other.getPoliceIncomeEachTurn()));
            result = result && (Double.doubleToLongBits(getThievesIncomeEachTurn()) == Double.doubleToLongBits(other.getThievesIncomeEachTurn()));
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + POLICEINCOMEEACHTURN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(Double.doubleToLongBits(getPoliceIncomeEachTurn()));
            hash = (37 * hash) + THIEVESINCOMEEACHTURN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(Double.doubleToLongBits(getThievesIncomeEachTurn()));
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<IncomeSettings> getParserForType() {
            return PARSER;
        }

        public AIProto.IncomeSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.IncomeSettings}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.IncomeSettings)
                AIProto.IncomeSettingsOrBuilder {
            private double policeIncomeEachTurn_;
            private double thievesIncomeEachTurn_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.IncomeSettings.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.IncomeSettings.class, AIProto.IncomeSettings.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                policeIncomeEachTurn_ = 0D;

                thievesIncomeEachTurn_ = 0D;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_IncomeSettings_descriptor;
            }

            public AIProto.IncomeSettings getDefaultInstanceForType() {
                return AIProto.IncomeSettings.getDefaultInstance();
            }

            public AIProto.IncomeSettings build() {
                AIProto.IncomeSettings result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.IncomeSettings buildPartial() {
                AIProto.IncomeSettings result = new AIProto.IncomeSettings(this);
                result.policeIncomeEachTurn_ = policeIncomeEachTurn_;
                result.thievesIncomeEachTurn_ = thievesIncomeEachTurn_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.IncomeSettings) {
                    return mergeFrom((AIProto.IncomeSettings) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.IncomeSettings other) {
                if (other == AIProto.IncomeSettings.getDefaultInstance()) return this;
                if (other.getPoliceIncomeEachTurn() != 0D) {
                    setPoliceIncomeEachTurn(other.getPoliceIncomeEachTurn());
                }
                if (other.getThievesIncomeEachTurn() != 0D) {
                    setThievesIncomeEachTurn(other.getThievesIncomeEachTurn());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.IncomeSettings parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.IncomeSettings) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>double policeIncomeEachTurn = 1;</code>
             */
            public double getPoliceIncomeEachTurn() {
                return policeIncomeEachTurn_;
            }

            /**
             * <code>double policeIncomeEachTurn = 1;</code>
             */
            public Builder setPoliceIncomeEachTurn(double value) {

                policeIncomeEachTurn_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>double policeIncomeEachTurn = 1;</code>
             */
            public Builder clearPoliceIncomeEachTurn() {

                policeIncomeEachTurn_ = 0D;
                onChanged();
                return this;
            }

            /**
             * <code>double thievesIncomeEachTurn = 2;</code>
             */
            public double getThievesIncomeEachTurn() {
                return thievesIncomeEachTurn_;
            }

            /**
             * <code>double thievesIncomeEachTurn = 2;</code>
             */
            public Builder setThievesIncomeEachTurn(double value) {

                thievesIncomeEachTurn_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>double thievesIncomeEachTurn = 2;</code>
             */
            public Builder clearThievesIncomeEachTurn() {

                thievesIncomeEachTurn_ = 0D;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.IncomeSettings)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.TurnSettings}
     */
    public static final class TurnSettings extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.TurnSettings)
            TurnSettingsOrBuilder {
        public static final int MAXTURNS_FIELD_NUMBER = 1;
        public static final int VISIBLETURNS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.TurnSettings)
        private static final AIProto.TurnSettings DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<TurnSettings> PARSER = new com.google.protobuf.AbstractParser<TurnSettings>() {
            public TurnSettings parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new TurnSettings(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.TurnSettings();
        }

        private int bitField0_;
        private int maxTurns_;
        private java.util.List<Integer> visibleTurns_;
        private int visibleTurnsMemoizedSerializedSize = -1;
        private byte memoizedIsInitialized = -1;

        // Use TurnSettings.newBuilder() to construct.
        private TurnSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TurnSettings() {
            maxTurns_ = 0;
            visibleTurns_ = java.util.Collections.emptyList();
        }

        private TurnSettings(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            maxTurns_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                                visibleTurns_ = new java.util.ArrayList<Integer>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            visibleTurns_.add(input.readInt32());
                            break;
                        }
                        case 18: {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                                visibleTurns_ = new java.util.ArrayList<Integer>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                visibleTurns_.add(input.readInt32());
                            }
                            input.popLimit(limit);
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                    visibleTurns_ = java.util.Collections.unmodifiableList(visibleTurns_);
                }
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_descriptor;
        }

        public static AIProto.TurnSettings parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.TurnSettings parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.TurnSettings parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.TurnSettings parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.TurnSettings parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.TurnSettings parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.TurnSettings parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.TurnSettings parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.TurnSettings parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.TurnSettings parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.TurnSettings parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.TurnSettings parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.TurnSettings prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.TurnSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<TurnSettings> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.TurnSettings.class, AIProto.TurnSettings.Builder.class);
        }

        /**
         * <code>int32 maxTurns = 1;</code>
         */
        public int getMaxTurns() {
            return maxTurns_;
        }

        /**
         * <code>repeated int32 visibleTurns = 2;</code>
         */
        public java.util.List<Integer> getVisibleTurnsList() {
            return visibleTurns_;
        }

        /**
         * <code>repeated int32 visibleTurns = 2;</code>
         */
        public int getVisibleTurnsCount() {
            return visibleTurns_.size();
        }

        /**
         * <code>repeated int32 visibleTurns = 2;</code>
         */
        public int getVisibleTurns(int index) {
            return visibleTurns_.get(index);
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            getSerializedSize();
            if (maxTurns_ != 0) {
                output.writeInt32(1, maxTurns_);
            }
            if (getVisibleTurnsList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(visibleTurnsMemoizedSerializedSize);
            }
            for (int i = 0; i < visibleTurns_.size(); i++) {
                output.writeInt32NoTag(visibleTurns_.get(i));
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (maxTurns_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, maxTurns_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < visibleTurns_.size(); i++) {
                    dataSize += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(visibleTurns_.get(i));
                }
                size += dataSize;
                if (!getVisibleTurnsList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                visibleTurnsMemoizedSerializedSize = dataSize;
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.TurnSettings)) {
                return super.equals(obj);
            }
            AIProto.TurnSettings other = (AIProto.TurnSettings) obj;

            boolean result = true;
            result = result && (getMaxTurns() == other.getMaxTurns());
            result = result && getVisibleTurnsList().equals(other.getVisibleTurnsList());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MAXTURNS_FIELD_NUMBER;
            hash = (53 * hash) + getMaxTurns();
            if (getVisibleTurnsCount() > 0) {
                hash = (37 * hash) + VISIBLETURNS_FIELD_NUMBER;
                hash = (53 * hash) + getVisibleTurnsList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<TurnSettings> getParserForType() {
            return PARSER;
        }

        public AIProto.TurnSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.TurnSettings}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.TurnSettings)
                AIProto.TurnSettingsOrBuilder {
            private int bitField0_;
            private int maxTurns_;
            private java.util.List<Integer> visibleTurns_ = java.util.Collections.emptyList();

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.TurnSettings.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.TurnSettings.class, AIProto.TurnSettings.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                maxTurns_ = 0;

                visibleTurns_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_TurnSettings_descriptor;
            }

            public AIProto.TurnSettings getDefaultInstanceForType() {
                return AIProto.TurnSettings.getDefaultInstance();
            }

            public AIProto.TurnSettings build() {
                AIProto.TurnSettings result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.TurnSettings buildPartial() {
                AIProto.TurnSettings result = new AIProto.TurnSettings(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                result.maxTurns_ = maxTurns_;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    visibleTurns_ = java.util.Collections.unmodifiableList(visibleTurns_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.visibleTurns_ = visibleTurns_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.TurnSettings) {
                    return mergeFrom((AIProto.TurnSettings) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.TurnSettings other) {
                if (other == AIProto.TurnSettings.getDefaultInstance()) return this;
                if (other.getMaxTurns() != 0) {
                    setMaxTurns(other.getMaxTurns());
                }
                if (!other.visibleTurns_.isEmpty()) {
                    if (visibleTurns_.isEmpty()) {
                        visibleTurns_ = other.visibleTurns_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensureVisibleTurnsIsMutable();
                        visibleTurns_.addAll(other.visibleTurns_);
                    }
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.TurnSettings parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.TurnSettings) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>int32 maxTurns = 1;</code>
             */
            public int getMaxTurns() {
                return maxTurns_;
            }

            /**
             * <code>int32 maxTurns = 1;</code>
             */
            public Builder setMaxTurns(int value) {

                maxTurns_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 maxTurns = 1;</code>
             */
            public Builder clearMaxTurns() {

                maxTurns_ = 0;
                onChanged();
                return this;
            }

            private void ensureVisibleTurnsIsMutable() {
                if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                    visibleTurns_ = new java.util.ArrayList<Integer>(visibleTurns_);
                    bitField0_ |= 0x00000002;
                }
            }

            /**
             * <code>repeated int32 visibleTurns = 2;</code>
             */
            public java.util.List<Integer> getVisibleTurnsList() {
                return java.util.Collections.unmodifiableList(visibleTurns_);
            }

            /**
             * <code>repeated int32 visibleTurns = 2;</code>
             */
            public int getVisibleTurnsCount() {
                return visibleTurns_.size();
            }

            /**
             * <code>repeated int32 visibleTurns = 2;</code>
             */
            public int getVisibleTurns(int index) {
                return visibleTurns_.get(index);
            }

            /**
             * <code>repeated int32 visibleTurns = 2;</code>
             */
            public Builder setVisibleTurns(int index, int value) {
                ensureVisibleTurnsIsMutable();
                visibleTurns_.set(index, value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated int32 visibleTurns = 2;</code>
             */
            public Builder addVisibleTurns(int value) {
                ensureVisibleTurnsIsMutable();
                visibleTurns_.add(value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated int32 visibleTurns = 2;</code>
             */
            public Builder addAllVisibleTurns(Iterable<? extends Integer> values) {
                ensureVisibleTurnsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, visibleTurns_);
                onChanged();
                return this;
            }

            /**
             * <code>repeated int32 visibleTurns = 2;</code>
             */
            public Builder clearVisibleTurns() {
                visibleTurns_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.TurnSettings)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.ChatSettings}
     */
    public static final class ChatSettings extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.ChatSettings)
            ChatSettingsOrBuilder {
        public static final int CHATBOXMAXSIZE_FIELD_NUMBER = 1;
        public static final int CHATCOSTPERCHARACTER_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.ChatSettings)
        private static final AIProto.ChatSettings DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<ChatSettings> PARSER = new com.google.protobuf.AbstractParser<ChatSettings>() {
            public ChatSettings parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new ChatSettings(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.ChatSettings();
        }

        private int chatBoxMaxSize_;
        private double chatCostPerCharacter_;
        private byte memoizedIsInitialized = -1;

        // Use ChatSettings.newBuilder() to construct.
        private ChatSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ChatSettings() {
            chatBoxMaxSize_ = 0;
            chatCostPerCharacter_ = 0D;
        }

        private ChatSettings(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            chatBoxMaxSize_ = input.readInt32();
                            break;
                        }
                        case 17: {

                            chatCostPerCharacter_ = input.readDouble();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_descriptor;
        }

        public static AIProto.ChatSettings parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.ChatSettings parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.ChatSettings parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.ChatSettings parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.ChatSettings parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.ChatSettings parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.ChatSettings parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.ChatSettings parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.ChatSettings parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.ChatSettings parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.ChatSettings parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.ChatSettings parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.ChatSettings prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.ChatSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<ChatSettings> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.ChatSettings.class, AIProto.ChatSettings.Builder.class);
        }

        /**
         * <code>int32 chatBoxMaxSize = 1;</code>
         */
        public int getChatBoxMaxSize() {
            return chatBoxMaxSize_;
        }

        /**
         * <code>double chatCostPerCharacter = 2;</code>
         */
        public double getChatCostPerCharacter() {
            return chatCostPerCharacter_;
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (chatBoxMaxSize_ != 0) {
                output.writeInt32(1, chatBoxMaxSize_);
            }
            if (chatCostPerCharacter_ != 0D) {
                output.writeDouble(2, chatCostPerCharacter_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (chatBoxMaxSize_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, chatBoxMaxSize_);
            }
            if (chatCostPerCharacter_ != 0D) {
                size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, chatCostPerCharacter_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.ChatSettings)) {
                return super.equals(obj);
            }
            AIProto.ChatSettings other = (AIProto.ChatSettings) obj;

            boolean result = true;
            result = result && (getChatBoxMaxSize() == other.getChatBoxMaxSize());
            result = result && (Double.doubleToLongBits(getChatCostPerCharacter()) == Double.doubleToLongBits(other.getChatCostPerCharacter()));
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + CHATBOXMAXSIZE_FIELD_NUMBER;
            hash = (53 * hash) + getChatBoxMaxSize();
            hash = (37 * hash) + CHATCOSTPERCHARACTER_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(Double.doubleToLongBits(getChatCostPerCharacter()));
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<ChatSettings> getParserForType() {
            return PARSER;
        }

        public AIProto.ChatSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.ChatSettings}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.ChatSettings)
                AIProto.ChatSettingsOrBuilder {
            private int chatBoxMaxSize_;
            private double chatCostPerCharacter_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.ChatSettings.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.ChatSettings.class, AIProto.ChatSettings.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                chatBoxMaxSize_ = 0;

                chatCostPerCharacter_ = 0D;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatSettings_descriptor;
            }

            public AIProto.ChatSettings getDefaultInstanceForType() {
                return AIProto.ChatSettings.getDefaultInstance();
            }

            public AIProto.ChatSettings build() {
                AIProto.ChatSettings result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.ChatSettings buildPartial() {
                AIProto.ChatSettings result = new AIProto.ChatSettings(this);
                result.chatBoxMaxSize_ = chatBoxMaxSize_;
                result.chatCostPerCharacter_ = chatCostPerCharacter_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.ChatSettings) {
                    return mergeFrom((AIProto.ChatSettings) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.ChatSettings other) {
                if (other == AIProto.ChatSettings.getDefaultInstance()) return this;
                if (other.getChatBoxMaxSize() != 0) {
                    setChatBoxMaxSize(other.getChatBoxMaxSize());
                }
                if (other.getChatCostPerCharacter() != 0D) {
                    setChatCostPerCharacter(other.getChatCostPerCharacter());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.ChatSettings parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.ChatSettings) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>int32 chatBoxMaxSize = 1;</code>
             */
            public int getChatBoxMaxSize() {
                return chatBoxMaxSize_;
            }

            /**
             * <code>int32 chatBoxMaxSize = 1;</code>
             */
            public Builder setChatBoxMaxSize(int value) {

                chatBoxMaxSize_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 chatBoxMaxSize = 1;</code>
             */
            public Builder clearChatBoxMaxSize() {

                chatBoxMaxSize_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>double chatCostPerCharacter = 2;</code>
             */
            public double getChatCostPerCharacter() {
                return chatCostPerCharacter_;
            }

            /**
             * <code>double chatCostPerCharacter = 2;</code>
             */
            public Builder setChatCostPerCharacter(double value) {

                chatCostPerCharacter_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>double chatCostPerCharacter = 2;</code>
             */
            public Builder clearChatCostPerCharacter() {

                chatCostPerCharacter_ = 0D;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.ChatSettings)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.GameConfig}
     */
    public static final class GameConfig extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.GameConfig)
            GameConfigOrBuilder {
        public static final int GRAPH_FIELD_NUMBER = 1;
        public static final int INCOMESETTINGS_FIELD_NUMBER = 2;
        public static final int TURNSETTINGS_FIELD_NUMBER = 3;
        public static final int CHATSETTINGS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.GameConfig)
        private static final AIProto.GameConfig DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<GameConfig> PARSER = new com.google.protobuf.AbstractParser<GameConfig>() {
            public GameConfig parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new GameConfig(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.GameConfig();
        }

        private AIProto.Graph graph_;
        private AIProto.IncomeSettings incomeSettings_;
        private AIProto.TurnSettings turnSettings_;
        private AIProto.ChatSettings chatSettings_;
        private byte memoizedIsInitialized = -1;

        // Use GameConfig.newBuilder() to construct.
        private GameConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GameConfig() {
        }

        private GameConfig(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            AIProto.Graph.Builder subBuilder = null;
                            if (graph_ != null) {
                                subBuilder = graph_.toBuilder();
                            }
                            graph_ = input.readMessage(AIProto.Graph.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(graph_);
                                graph_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 18: {
                            AIProto.IncomeSettings.Builder subBuilder = null;
                            if (incomeSettings_ != null) {
                                subBuilder = incomeSettings_.toBuilder();
                            }
                            incomeSettings_ = input.readMessage(AIProto.IncomeSettings.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(incomeSettings_);
                                incomeSettings_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 26: {
                            AIProto.TurnSettings.Builder subBuilder = null;
                            if (turnSettings_ != null) {
                                subBuilder = turnSettings_.toBuilder();
                            }
                            turnSettings_ = input.readMessage(AIProto.TurnSettings.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(turnSettings_);
                                turnSettings_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 34: {
                            AIProto.ChatSettings.Builder subBuilder = null;
                            if (chatSettings_ != null) {
                                subBuilder = chatSettings_.toBuilder();
                            }
                            chatSettings_ = input.readMessage(AIProto.ChatSettings.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(chatSettings_);
                                chatSettings_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_descriptor;
        }

        public static AIProto.GameConfig parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.GameConfig parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.GameConfig parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.GameConfig parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.GameConfig parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.GameConfig parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.GameConfig parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.GameConfig parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.GameConfig parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.GameConfig parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.GameConfig parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.GameConfig parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.GameConfig prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.GameConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<GameConfig> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.GameConfig.class, AIProto.GameConfig.Builder.class);
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
         */
        public boolean hasGraph() {
            return graph_ != null;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
         */
        public AIProto.Graph getGraph() {
            return graph_ == null ? AIProto.Graph.getDefaultInstance() : graph_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
         */
        public AIProto.GraphOrBuilder getGraphOrBuilder() {
            return getGraph();
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
         */
        public boolean hasIncomeSettings() {
            return incomeSettings_ != null;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
         */
        public AIProto.IncomeSettings getIncomeSettings() {
            return incomeSettings_ == null ? AIProto.IncomeSettings.getDefaultInstance() : incomeSettings_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
         */
        public AIProto.IncomeSettingsOrBuilder getIncomeSettingsOrBuilder() {
            return getIncomeSettings();
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
         */
        public boolean hasTurnSettings() {
            return turnSettings_ != null;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
         */
        public AIProto.TurnSettings getTurnSettings() {
            return turnSettings_ == null ? AIProto.TurnSettings.getDefaultInstance() : turnSettings_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
         */
        public AIProto.TurnSettingsOrBuilder getTurnSettingsOrBuilder() {
            return getTurnSettings();
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
         */
        public boolean hasChatSettings() {
            return chatSettings_ != null;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
         */
        public AIProto.ChatSettings getChatSettings() {
            return chatSettings_ == null ? AIProto.ChatSettings.getDefaultInstance() : chatSettings_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
         */
        public AIProto.ChatSettingsOrBuilder getChatSettingsOrBuilder() {
            return getChatSettings();
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (graph_ != null) {
                output.writeMessage(1, getGraph());
            }
            if (incomeSettings_ != null) {
                output.writeMessage(2, getIncomeSettings());
            }
            if (turnSettings_ != null) {
                output.writeMessage(3, getTurnSettings());
            }
            if (chatSettings_ != null) {
                output.writeMessage(4, getChatSettings());
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (graph_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGraph());
            }
            if (incomeSettings_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getIncomeSettings());
            }
            if (turnSettings_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTurnSettings());
            }
            if (chatSettings_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getChatSettings());
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.GameConfig)) {
                return super.equals(obj);
            }
            AIProto.GameConfig other = (AIProto.GameConfig) obj;

            boolean result = true;
            result = result && (hasGraph() == other.hasGraph());
            if (hasGraph()) {
                result = result && getGraph().equals(other.getGraph());
            }
            result = result && (hasIncomeSettings() == other.hasIncomeSettings());
            if (hasIncomeSettings()) {
                result = result && getIncomeSettings().equals(other.getIncomeSettings());
            }
            result = result && (hasTurnSettings() == other.hasTurnSettings());
            if (hasTurnSettings()) {
                result = result && getTurnSettings().equals(other.getTurnSettings());
            }
            result = result && (hasChatSettings() == other.hasChatSettings());
            if (hasChatSettings()) {
                result = result && getChatSettings().equals(other.getChatSettings());
            }
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasGraph()) {
                hash = (37 * hash) + GRAPH_FIELD_NUMBER;
                hash = (53 * hash) + getGraph().hashCode();
            }
            if (hasIncomeSettings()) {
                hash = (37 * hash) + INCOMESETTINGS_FIELD_NUMBER;
                hash = (53 * hash) + getIncomeSettings().hashCode();
            }
            if (hasTurnSettings()) {
                hash = (37 * hash) + TURNSETTINGS_FIELD_NUMBER;
                hash = (53 * hash) + getTurnSettings().hashCode();
            }
            if (hasChatSettings()) {
                hash = (37 * hash) + CHATSETTINGS_FIELD_NUMBER;
                hash = (53 * hash) + getChatSettings().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<GameConfig> getParserForType() {
            return PARSER;
        }

        public AIProto.GameConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.GameConfig}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.GameConfig)
                AIProto.GameConfigOrBuilder {
            private AIProto.Graph graph_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<Graph, Graph.Builder, GraphOrBuilder> graphBuilder_;
            private AIProto.IncomeSettings incomeSettings_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<IncomeSettings, IncomeSettings.Builder, IncomeSettingsOrBuilder> incomeSettingsBuilder_;
            private AIProto.TurnSettings turnSettings_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<TurnSettings, TurnSettings.Builder, TurnSettingsOrBuilder> turnSettingsBuilder_;
            private AIProto.ChatSettings chatSettings_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<ChatSettings, ChatSettings.Builder, ChatSettingsOrBuilder> chatSettingsBuilder_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.GameConfig.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.GameConfig.class, AIProto.GameConfig.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                if (graphBuilder_ == null) {
                    graph_ = null;
                } else {
                    graph_ = null;
                    graphBuilder_ = null;
                }
                if (incomeSettingsBuilder_ == null) {
                    incomeSettings_ = null;
                } else {
                    incomeSettings_ = null;
                    incomeSettingsBuilder_ = null;
                }
                if (turnSettingsBuilder_ == null) {
                    turnSettings_ = null;
                } else {
                    turnSettings_ = null;
                    turnSettingsBuilder_ = null;
                }
                if (chatSettingsBuilder_ == null) {
                    chatSettings_ = null;
                } else {
                    chatSettings_ = null;
                    chatSettingsBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameConfig_descriptor;
            }

            public AIProto.GameConfig getDefaultInstanceForType() {
                return AIProto.GameConfig.getDefaultInstance();
            }

            public AIProto.GameConfig build() {
                AIProto.GameConfig result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.GameConfig buildPartial() {
                AIProto.GameConfig result = new AIProto.GameConfig(this);
                if (graphBuilder_ == null) {
                    result.graph_ = graph_;
                } else {
                    result.graph_ = graphBuilder_.build();
                }
                if (incomeSettingsBuilder_ == null) {
                    result.incomeSettings_ = incomeSettings_;
                } else {
                    result.incomeSettings_ = incomeSettingsBuilder_.build();
                }
                if (turnSettingsBuilder_ == null) {
                    result.turnSettings_ = turnSettings_;
                } else {
                    result.turnSettings_ = turnSettingsBuilder_.build();
                }
                if (chatSettingsBuilder_ == null) {
                    result.chatSettings_ = chatSettings_;
                } else {
                    result.chatSettings_ = chatSettingsBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.GameConfig) {
                    return mergeFrom((AIProto.GameConfig) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.GameConfig other) {
                if (other == AIProto.GameConfig.getDefaultInstance()) return this;
                if (other.hasGraph()) {
                    mergeGraph(other.getGraph());
                }
                if (other.hasIncomeSettings()) {
                    mergeIncomeSettings(other.getIncomeSettings());
                }
                if (other.hasTurnSettings()) {
                    mergeTurnSettings(other.getTurnSettings());
                }
                if (other.hasChatSettings()) {
                    mergeChatSettings(other.getChatSettings());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.GameConfig parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.GameConfig) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
             */
            public boolean hasGraph() {
                return graphBuilder_ != null || graph_ != null;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
             */
            public AIProto.Graph getGraph() {
                if (graphBuilder_ == null) {
                    return graph_ == null ? AIProto.Graph.getDefaultInstance() : graph_;
                } else {
                    return graphBuilder_.getMessage();
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
             */
            public Builder setGraph(AIProto.Graph value) {
                if (graphBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    graph_ = value;
                    onChanged();
                } else {
                    graphBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
             */
            public Builder setGraph(AIProto.Graph.Builder builderForValue) {
                if (graphBuilder_ == null) {
                    graph_ = builderForValue.build();
                    onChanged();
                } else {
                    graphBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
             */
            public Builder mergeGraph(AIProto.Graph value) {
                if (graphBuilder_ == null) {
                    if (graph_ != null) {
                        graph_ = AIProto.Graph.newBuilder(graph_).mergeFrom(value).buildPartial();
                    } else {
                        graph_ = value;
                    }
                    onChanged();
                } else {
                    graphBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
             */
            public Builder clearGraph() {
                if (graphBuilder_ == null) {
                    graph_ = null;
                    onChanged();
                } else {
                    graph_ = null;
                    graphBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
             */
            public AIProto.Graph.Builder getGraphBuilder() {

                onChanged();
                return getGraphFieldBuilder().getBuilder();
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
             */
            public AIProto.GraphOrBuilder getGraphOrBuilder() {
                if (graphBuilder_ != null) {
                    return graphBuilder_.getMessageOrBuilder();
                } else {
                    return graph_ == null ? AIProto.Graph.getDefaultInstance() : graph_;
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Graph graph = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<Graph, Graph.Builder, GraphOrBuilder> getGraphFieldBuilder() {
                if (graphBuilder_ == null) {
                    graphBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<Graph, Graph.Builder, GraphOrBuilder>(getGraph(), getParentForChildren(), isClean());
                    graph_ = null;
                }
                return graphBuilder_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
             */
            public boolean hasIncomeSettings() {
                return incomeSettingsBuilder_ != null || incomeSettings_ != null;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
             */
            public AIProto.IncomeSettings getIncomeSettings() {
                if (incomeSettingsBuilder_ == null) {
                    return incomeSettings_ == null ? AIProto.IncomeSettings.getDefaultInstance() : incomeSettings_;
                } else {
                    return incomeSettingsBuilder_.getMessage();
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
             */
            public Builder setIncomeSettings(AIProto.IncomeSettings value) {
                if (incomeSettingsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    incomeSettings_ = value;
                    onChanged();
                } else {
                    incomeSettingsBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
             */
            public Builder setIncomeSettings(AIProto.IncomeSettings.Builder builderForValue) {
                if (incomeSettingsBuilder_ == null) {
                    incomeSettings_ = builderForValue.build();
                    onChanged();
                } else {
                    incomeSettingsBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
             */
            public Builder mergeIncomeSettings(AIProto.IncomeSettings value) {
                if (incomeSettingsBuilder_ == null) {
                    if (incomeSettings_ != null) {
                        incomeSettings_ = AIProto.IncomeSettings.newBuilder(incomeSettings_).mergeFrom(value).buildPartial();
                    } else {
                        incomeSettings_ = value;
                    }
                    onChanged();
                } else {
                    incomeSettingsBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
             */
            public Builder clearIncomeSettings() {
                if (incomeSettingsBuilder_ == null) {
                    incomeSettings_ = null;
                    onChanged();
                } else {
                    incomeSettings_ = null;
                    incomeSettingsBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
             */
            public AIProto.IncomeSettings.Builder getIncomeSettingsBuilder() {

                onChanged();
                return getIncomeSettingsFieldBuilder().getBuilder();
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
             */
            public AIProto.IncomeSettingsOrBuilder getIncomeSettingsOrBuilder() {
                if (incomeSettingsBuilder_ != null) {
                    return incomeSettingsBuilder_.getMessageOrBuilder();
                } else {
                    return incomeSettings_ == null ? AIProto.IncomeSettings.getDefaultInstance() : incomeSettings_;
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.IncomeSettings incomeSettings = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<IncomeSettings, IncomeSettings.Builder, IncomeSettingsOrBuilder> getIncomeSettingsFieldBuilder() {
                if (incomeSettingsBuilder_ == null) {
                    incomeSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<IncomeSettings, IncomeSettings.Builder, IncomeSettingsOrBuilder>(getIncomeSettings(), getParentForChildren(), isClean());
                    incomeSettings_ = null;
                }
                return incomeSettingsBuilder_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
             */
            public boolean hasTurnSettings() {
                return turnSettingsBuilder_ != null || turnSettings_ != null;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
             */
            public AIProto.TurnSettings getTurnSettings() {
                if (turnSettingsBuilder_ == null) {
                    return turnSettings_ == null ? AIProto.TurnSettings.getDefaultInstance() : turnSettings_;
                } else {
                    return turnSettingsBuilder_.getMessage();
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
             */
            public Builder setTurnSettings(AIProto.TurnSettings value) {
                if (turnSettingsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    turnSettings_ = value;
                    onChanged();
                } else {
                    turnSettingsBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
             */
            public Builder setTurnSettings(AIProto.TurnSettings.Builder builderForValue) {
                if (turnSettingsBuilder_ == null) {
                    turnSettings_ = builderForValue.build();
                    onChanged();
                } else {
                    turnSettingsBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
             */
            public Builder mergeTurnSettings(AIProto.TurnSettings value) {
                if (turnSettingsBuilder_ == null) {
                    if (turnSettings_ != null) {
                        turnSettings_ = AIProto.TurnSettings.newBuilder(turnSettings_).mergeFrom(value).buildPartial();
                    } else {
                        turnSettings_ = value;
                    }
                    onChanged();
                } else {
                    turnSettingsBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
             */
            public Builder clearTurnSettings() {
                if (turnSettingsBuilder_ == null) {
                    turnSettings_ = null;
                    onChanged();
                } else {
                    turnSettings_ = null;
                    turnSettingsBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
             */
            public AIProto.TurnSettings.Builder getTurnSettingsBuilder() {

                onChanged();
                return getTurnSettingsFieldBuilder().getBuilder();
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
             */
            public AIProto.TurnSettingsOrBuilder getTurnSettingsOrBuilder() {
                if (turnSettingsBuilder_ != null) {
                    return turnSettingsBuilder_.getMessageOrBuilder();
                } else {
                    return turnSettings_ == null ? AIProto.TurnSettings.getDefaultInstance() : turnSettings_;
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.TurnSettings turnSettings = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<TurnSettings, TurnSettings.Builder, TurnSettingsOrBuilder> getTurnSettingsFieldBuilder() {
                if (turnSettingsBuilder_ == null) {
                    turnSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<TurnSettings, TurnSettings.Builder, TurnSettingsOrBuilder>(getTurnSettings(), getParentForChildren(), isClean());
                    turnSettings_ = null;
                }
                return turnSettingsBuilder_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
             */
            public boolean hasChatSettings() {
                return chatSettingsBuilder_ != null || chatSettings_ != null;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
             */
            public AIProto.ChatSettings getChatSettings() {
                if (chatSettingsBuilder_ == null) {
                    return chatSettings_ == null ? AIProto.ChatSettings.getDefaultInstance() : chatSettings_;
                } else {
                    return chatSettingsBuilder_.getMessage();
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
             */
            public Builder setChatSettings(AIProto.ChatSettings value) {
                if (chatSettingsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    chatSettings_ = value;
                    onChanged();
                } else {
                    chatSettingsBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
             */
            public Builder setChatSettings(AIProto.ChatSettings.Builder builderForValue) {
                if (chatSettingsBuilder_ == null) {
                    chatSettings_ = builderForValue.build();
                    onChanged();
                } else {
                    chatSettingsBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
             */
            public Builder mergeChatSettings(AIProto.ChatSettings value) {
                if (chatSettingsBuilder_ == null) {
                    if (chatSettings_ != null) {
                        chatSettings_ = AIProto.ChatSettings.newBuilder(chatSettings_).mergeFrom(value).buildPartial();
                    } else {
                        chatSettings_ = value;
                    }
                    onChanged();
                } else {
                    chatSettingsBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
             */
            public Builder clearChatSettings() {
                if (chatSettingsBuilder_ == null) {
                    chatSettings_ = null;
                    onChanged();
                } else {
                    chatSettings_ = null;
                    chatSettingsBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
             */
            public AIProto.ChatSettings.Builder getChatSettingsBuilder() {

                onChanged();
                return getChatSettingsFieldBuilder().getBuilder();
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
             */
            public AIProto.ChatSettingsOrBuilder getChatSettingsOrBuilder() {
                if (chatSettingsBuilder_ != null) {
                    return chatSettingsBuilder_.getMessageOrBuilder();
                } else {
                    return chatSettings_ == null ? AIProto.ChatSettings.getDefaultInstance() : chatSettings_;
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.ChatSettings chatSettings = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<ChatSettings, ChatSettings.Builder, ChatSettingsOrBuilder> getChatSettingsFieldBuilder() {
                if (chatSettingsBuilder_ == null) {
                    chatSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<ChatSettings, ChatSettings.Builder, ChatSettingsOrBuilder>(getChatSettings(), getParentForChildren(), isClean());
                    chatSettings_ = null;
                }
                return chatSettingsBuilder_;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.GameConfig)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.DeclareReadinessCommand}
     */
    public static final class DeclareReadinessCommand extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.DeclareReadinessCommand)
            DeclareReadinessCommandOrBuilder {
        public static final int TOKEN_FIELD_NUMBER = 1;
        public static final int STARTNODEID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.DeclareReadinessCommand)
        private static final AIProto.DeclareReadinessCommand DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<DeclareReadinessCommand> PARSER = new com.google.protobuf.AbstractParser<DeclareReadinessCommand>() {
            public DeclareReadinessCommand parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new DeclareReadinessCommand(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.DeclareReadinessCommand();
        }

        private volatile Object token_;
        private int startNodeId_;
        private byte memoizedIsInitialized = -1;

        // Use DeclareReadinessCommand.newBuilder() to construct.
        private DeclareReadinessCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DeclareReadinessCommand() {
            token_ = "";
            startNodeId_ = 0;
        }

        private DeclareReadinessCommand(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            token_ = s;
                            break;
                        }
                        case 16: {

                            startNodeId_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_descriptor;
        }

        public static AIProto.DeclareReadinessCommand parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.DeclareReadinessCommand parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.DeclareReadinessCommand parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.DeclareReadinessCommand parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.DeclareReadinessCommand parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.DeclareReadinessCommand parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.DeclareReadinessCommand parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.DeclareReadinessCommand parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.DeclareReadinessCommand parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.DeclareReadinessCommand parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.DeclareReadinessCommand parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.DeclareReadinessCommand parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.DeclareReadinessCommand prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.DeclareReadinessCommand getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<DeclareReadinessCommand> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.DeclareReadinessCommand.class, AIProto.DeclareReadinessCommand.Builder.class);
        }

        /**
         * <code>string token = 1;</code>
         */
        public String getToken() {
            Object ref = token_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                token_ = s;
                return s;
            }
        }

        /**
         * <code>string token = 1;</code>
         */
        public com.google.protobuf.ByteString getTokenBytes() {
            Object ref = token_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                token_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>int32 startNodeId = 2;</code>
         */
        public int getStartNodeId() {
            return startNodeId_;
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (!getTokenBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
            }
            if (startNodeId_ != 0) {
                output.writeInt32(2, startNodeId_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getTokenBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
            }
            if (startNodeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, startNodeId_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.DeclareReadinessCommand)) {
                return super.equals(obj);
            }
            AIProto.DeclareReadinessCommand other = (AIProto.DeclareReadinessCommand) obj;

            boolean result = true;
            result = result && getToken().equals(other.getToken());
            result = result && (getStartNodeId() == other.getStartNodeId());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TOKEN_FIELD_NUMBER;
            hash = (53 * hash) + getToken().hashCode();
            hash = (37 * hash) + STARTNODEID_FIELD_NUMBER;
            hash = (53 * hash) + getStartNodeId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<DeclareReadinessCommand> getParserForType() {
            return PARSER;
        }

        public AIProto.DeclareReadinessCommand getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.DeclareReadinessCommand}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.DeclareReadinessCommand)
                AIProto.DeclareReadinessCommandOrBuilder {
            private Object token_ = "";
            private int startNodeId_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.DeclareReadinessCommand.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.DeclareReadinessCommand.class, AIProto.DeclareReadinessCommand.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                token_ = "";

                startNodeId_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_DeclareReadinessCommand_descriptor;
            }

            public AIProto.DeclareReadinessCommand getDefaultInstanceForType() {
                return AIProto.DeclareReadinessCommand.getDefaultInstance();
            }

            public AIProto.DeclareReadinessCommand build() {
                AIProto.DeclareReadinessCommand result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.DeclareReadinessCommand buildPartial() {
                AIProto.DeclareReadinessCommand result = new AIProto.DeclareReadinessCommand(this);
                result.token_ = token_;
                result.startNodeId_ = startNodeId_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.DeclareReadinessCommand) {
                    return mergeFrom((AIProto.DeclareReadinessCommand) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.DeclareReadinessCommand other) {
                if (other == AIProto.DeclareReadinessCommand.getDefaultInstance()) return this;
                if (!other.getToken().isEmpty()) {
                    token_ = other.token_;
                    onChanged();
                }
                if (other.getStartNodeId() != 0) {
                    setStartNodeId(other.getStartNodeId());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.DeclareReadinessCommand parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.DeclareReadinessCommand) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public String getToken() {
                Object ref = token_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    token_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder setToken(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                token_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public com.google.protobuf.ByteString getTokenBytes() {
                Object ref = token_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                    token_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder setTokenBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                token_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder clearToken() {

                token_ = getDefaultInstance().getToken();
                onChanged();
                return this;
            }

            /**
             * <code>int32 startNodeId = 2;</code>
             */
            public int getStartNodeId() {
                return startNodeId_;
            }

            /**
             * <code>int32 startNodeId = 2;</code>
             */
            public Builder setStartNodeId(int value) {

                startNodeId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 startNodeId = 2;</code>
             */
            public Builder clearStartNodeId() {

                startNodeId_ = 0;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.DeclareReadinessCommand)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.MoveCommand}
     */
    public static final class MoveCommand extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.MoveCommand)
            MoveCommandOrBuilder {
        public static final int TOKEN_FIELD_NUMBER = 1;
        public static final int TONODEID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.MoveCommand)
        private static final AIProto.MoveCommand DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<MoveCommand> PARSER = new com.google.protobuf.AbstractParser<MoveCommand>() {
            public MoveCommand parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new MoveCommand(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.MoveCommand();
        }

        private volatile Object token_;
        private int toNodeId_;
        private byte memoizedIsInitialized = -1;

        // Use MoveCommand.newBuilder() to construct.
        private MoveCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MoveCommand() {
            token_ = "";
            toNodeId_ = 0;
        }

        private MoveCommand(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            token_ = s;
                            break;
                        }
                        case 16: {

                            toNodeId_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_descriptor;
        }

        public static AIProto.MoveCommand parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.MoveCommand parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.MoveCommand parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.MoveCommand parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.MoveCommand parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.MoveCommand parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.MoveCommand parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.MoveCommand parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.MoveCommand parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.MoveCommand parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.MoveCommand parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.MoveCommand parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.MoveCommand prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.MoveCommand getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<MoveCommand> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.MoveCommand.class, AIProto.MoveCommand.Builder.class);
        }

        /**
         * <code>string token = 1;</code>
         */
        public String getToken() {
            Object ref = token_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                token_ = s;
                return s;
            }
        }

        /**
         * <code>string token = 1;</code>
         */
        public com.google.protobuf.ByteString getTokenBytes() {
            Object ref = token_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                token_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>int32 toNodeId = 2;</code>
         */
        public int getToNodeId() {
            return toNodeId_;
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (!getTokenBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
            }
            if (toNodeId_ != 0) {
                output.writeInt32(2, toNodeId_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getTokenBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
            }
            if (toNodeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, toNodeId_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.MoveCommand)) {
                return super.equals(obj);
            }
            AIProto.MoveCommand other = (AIProto.MoveCommand) obj;

            boolean result = true;
            result = result && getToken().equals(other.getToken());
            result = result && (getToNodeId() == other.getToNodeId());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TOKEN_FIELD_NUMBER;
            hash = (53 * hash) + getToken().hashCode();
            hash = (37 * hash) + TONODEID_FIELD_NUMBER;
            hash = (53 * hash) + getToNodeId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<MoveCommand> getParserForType() {
            return PARSER;
        }

        public AIProto.MoveCommand getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.MoveCommand}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.MoveCommand)
                AIProto.MoveCommandOrBuilder {
            private Object token_ = "";
            private int toNodeId_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.MoveCommand.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.MoveCommand.class, AIProto.MoveCommand.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                token_ = "";

                toNodeId_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_MoveCommand_descriptor;
            }

            public AIProto.MoveCommand getDefaultInstanceForType() {
                return AIProto.MoveCommand.getDefaultInstance();
            }

            public AIProto.MoveCommand build() {
                AIProto.MoveCommand result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.MoveCommand buildPartial() {
                AIProto.MoveCommand result = new AIProto.MoveCommand(this);
                result.token_ = token_;
                result.toNodeId_ = toNodeId_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.MoveCommand) {
                    return mergeFrom((AIProto.MoveCommand) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.MoveCommand other) {
                if (other == AIProto.MoveCommand.getDefaultInstance()) return this;
                if (!other.getToken().isEmpty()) {
                    token_ = other.token_;
                    onChanged();
                }
                if (other.getToNodeId() != 0) {
                    setToNodeId(other.getToNodeId());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.MoveCommand parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.MoveCommand) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public String getToken() {
                Object ref = token_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    token_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder setToken(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                token_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public com.google.protobuf.ByteString getTokenBytes() {
                Object ref = token_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                    token_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder setTokenBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                token_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder clearToken() {

                token_ = getDefaultInstance().getToken();
                onChanged();
                return this;
            }

            /**
             * <code>int32 toNodeId = 2;</code>
             */
            public int getToNodeId() {
                return toNodeId_;
            }

            /**
             * <code>int32 toNodeId = 2;</code>
             */
            public Builder setToNodeId(int value) {

                toNodeId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 toNodeId = 2;</code>
             */
            public Builder clearToNodeId() {

                toNodeId_ = 0;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.MoveCommand)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.WatchCommand}
     */
    public static final class WatchCommand extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.WatchCommand)
            WatchCommandOrBuilder {
        public static final int TOKEN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.WatchCommand)
        private static final AIProto.WatchCommand DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<WatchCommand> PARSER = new com.google.protobuf.AbstractParser<WatchCommand>() {
            public WatchCommand parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new WatchCommand(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.WatchCommand();
        }

        private volatile Object token_;
        private byte memoizedIsInitialized = -1;

        // Use WatchCommand.newBuilder() to construct.
        private WatchCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private WatchCommand() {
            token_ = "";
        }

        private WatchCommand(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            token_ = s;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_descriptor;
        }

        public static AIProto.WatchCommand parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.WatchCommand parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.WatchCommand parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.WatchCommand parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.WatchCommand parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.WatchCommand parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.WatchCommand parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.WatchCommand parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.WatchCommand parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.WatchCommand parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.WatchCommand parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.WatchCommand parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.WatchCommand prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.WatchCommand getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<WatchCommand> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.WatchCommand.class, AIProto.WatchCommand.Builder.class);
        }

        /**
         * <code>string token = 1;</code>
         */
        public String getToken() {
            Object ref = token_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                token_ = s;
                return s;
            }
        }

        /**
         * <code>string token = 1;</code>
         */
        public com.google.protobuf.ByteString getTokenBytes() {
            Object ref = token_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                token_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (!getTokenBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getTokenBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.WatchCommand)) {
                return super.equals(obj);
            }
            AIProto.WatchCommand other = (AIProto.WatchCommand) obj;

            boolean result = true;
            result = result && getToken().equals(other.getToken());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TOKEN_FIELD_NUMBER;
            hash = (53 * hash) + getToken().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<WatchCommand> getParserForType() {
            return PARSER;
        }

        public AIProto.WatchCommand getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.WatchCommand}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.WatchCommand)
                AIProto.WatchCommandOrBuilder {
            private Object token_ = "";

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.WatchCommand.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.WatchCommand.class, AIProto.WatchCommand.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                token_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_WatchCommand_descriptor;
            }

            public AIProto.WatchCommand getDefaultInstanceForType() {
                return AIProto.WatchCommand.getDefaultInstance();
            }

            public AIProto.WatchCommand build() {
                AIProto.WatchCommand result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.WatchCommand buildPartial() {
                AIProto.WatchCommand result = new AIProto.WatchCommand(this);
                result.token_ = token_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.WatchCommand) {
                    return mergeFrom((AIProto.WatchCommand) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.WatchCommand other) {
                if (other == AIProto.WatchCommand.getDefaultInstance()) return this;
                if (!other.getToken().isEmpty()) {
                    token_ = other.token_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.WatchCommand parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.WatchCommand) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public String getToken() {
                Object ref = token_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    token_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder setToken(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                token_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public com.google.protobuf.ByteString getTokenBytes() {
                Object ref = token_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                    token_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder setTokenBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                token_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder clearToken() {

                token_ = getDefaultInstance().getToken();
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.WatchCommand)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.GameView}
     */
    public static final class GameView extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.GameView)
            GameViewOrBuilder {
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int RESULT_FIELD_NUMBER = 2;
        public static final int TURN_FIELD_NUMBER = 3;
        public static final int CONFIG_FIELD_NUMBER = 4;
        public static final int VIEWER_FIELD_NUMBER = 5;
        public static final int BALANCE_FIELD_NUMBER = 6;
        public static final int VISIBLE_AGENTS_FIELD_NUMBER = 7;
        public static final int CHATBOX_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.GameView)
        private static final AIProto.GameView DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<GameView> PARSER = new com.google.protobuf.AbstractParser<GameView>() {
            public GameView parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new GameView(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.GameView();
        }

        private int bitField0_;
        private int status_;
        private int result_;
        private AIProto.Turn turn_;
        private AIProto.GameConfig config_;
        private AIProto.Agent viewer_;
        private double balance_;
        private java.util.List<Agent> visibleAgents_;
        private java.util.List<Chat> chatBox_;
        private byte memoizedIsInitialized = -1;

        // Use GameView.newBuilder() to construct.
        private GameView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GameView() {
            status_ = 0;
            result_ = 0;
            balance_ = 0D;
            visibleAgents_ = java.util.Collections.emptyList();
            chatBox_ = java.util.Collections.emptyList();
        }

        private GameView(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();

                            status_ = rawValue;
                            break;
                        }
                        case 16: {
                            int rawValue = input.readEnum();

                            result_ = rawValue;
                            break;
                        }
                        case 26: {
                            AIProto.Turn.Builder subBuilder = null;
                            if (turn_ != null) {
                                subBuilder = turn_.toBuilder();
                            }
                            turn_ = input.readMessage(AIProto.Turn.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(turn_);
                                turn_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 34: {
                            AIProto.GameConfig.Builder subBuilder = null;
                            if (config_ != null) {
                                subBuilder = config_.toBuilder();
                            }
                            config_ = input.readMessage(AIProto.GameConfig.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(config_);
                                config_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 42: {
                            AIProto.Agent.Builder subBuilder = null;
                            if (viewer_ != null) {
                                subBuilder = viewer_.toBuilder();
                            }
                            viewer_ = input.readMessage(AIProto.Agent.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(viewer_);
                                viewer_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 49: {

                            balance_ = input.readDouble();
                            break;
                        }
                        case 58: {
                            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                                visibleAgents_ = new java.util.ArrayList<Agent>();
                                mutable_bitField0_ |= 0x00000040;
                            }
                            visibleAgents_.add(input.readMessage(AIProto.Agent.parser(), extensionRegistry));
                            break;
                        }
                        case 66: {
                            if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                                chatBox_ = new java.util.ArrayList<Chat>();
                                mutable_bitField0_ |= 0x00000080;
                            }
                            chatBox_.add(input.readMessage(AIProto.Chat.parser(), extensionRegistry));
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                    visibleAgents_ = java.util.Collections.unmodifiableList(visibleAgents_);
                }
                if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                    chatBox_ = java.util.Collections.unmodifiableList(chatBox_);
                }
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_descriptor;
        }

        public static AIProto.GameView parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.GameView parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.GameView parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.GameView parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.GameView parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.GameView parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.GameView parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.GameView parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.GameView parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.GameView parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.GameView parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.GameView parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.GameView prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.GameView getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<GameView> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.GameView.class, AIProto.GameView.Builder.class);
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameStatus status = 1;</code>
         */
        public int getStatusValue() {
            return status_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameStatus status = 1;</code>
         */
        public AIProto.GameStatus getStatus() {
            AIProto.GameStatus result = AIProto.GameStatus.valueOf(status_);
            return result == null ? AIProto.GameStatus.UNRECOGNIZED : result;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameResult result = 2;</code>
         */
        public int getResultValue() {
            return result_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameResult result = 2;</code>
         */
        public AIProto.GameResult getResult() {
            AIProto.GameResult result = AIProto.GameResult.valueOf(result_);
            return result == null ? AIProto.GameResult.UNRECOGNIZED : result;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
         */
        public boolean hasTurn() {
            return turn_ != null;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
         */
        public AIProto.Turn getTurn() {
            return turn_ == null ? AIProto.Turn.getDefaultInstance() : turn_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
         */
        public AIProto.TurnOrBuilder getTurnOrBuilder() {
            return getTurn();
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
         */
        public boolean hasConfig() {
            return config_ != null;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
         */
        public AIProto.GameConfig getConfig() {
            return config_ == null ? AIProto.GameConfig.getDefaultInstance() : config_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
         */
        public AIProto.GameConfigOrBuilder getConfigOrBuilder() {
            return getConfig();
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
         */
        public boolean hasViewer() {
            return viewer_ != null;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
         */
        public AIProto.Agent getViewer() {
            return viewer_ == null ? AIProto.Agent.getDefaultInstance() : viewer_;
        }

        /**
         * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
         */
        public AIProto.AgentOrBuilder getViewerOrBuilder() {
            return getViewer();
        }

        /**
         * <code>double balance = 6;</code>
         */
        public double getBalance() {
            return balance_;
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        public java.util.List<Agent> getVisibleAgentsList() {
            return visibleAgents_;
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        public java.util.List<? extends AgentOrBuilder> getVisibleAgentsOrBuilderList() {
            return visibleAgents_;
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        public int getVisibleAgentsCount() {
            return visibleAgents_.size();
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        public AIProto.Agent getVisibleAgents(int index) {
            return visibleAgents_.get(index);
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
         */
        public AIProto.AgentOrBuilder getVisibleAgentsOrBuilder(int index) {
            return visibleAgents_.get(index);
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        public java.util.List<Chat> getChatBoxList() {
            return chatBox_;
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        public java.util.List<? extends ChatOrBuilder> getChatBoxOrBuilderList() {
            return chatBox_;
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        public int getChatBoxCount() {
            return chatBox_.size();
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        public AIProto.Chat getChatBox(int index) {
            return chatBox_.get(index);
        }

        /**
         * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
         */
        public AIProto.ChatOrBuilder getChatBoxOrBuilder(int index) {
            return chatBox_.get(index);
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (status_ != AIProto.GameStatus.PENDING.getNumber()) {
                output.writeEnum(1, status_);
            }
            if (result_ != AIProto.GameResult.UNKNOWN.getNumber()) {
                output.writeEnum(2, result_);
            }
            if (turn_ != null) {
                output.writeMessage(3, getTurn());
            }
            if (config_ != null) {
                output.writeMessage(4, getConfig());
            }
            if (viewer_ != null) {
                output.writeMessage(5, getViewer());
            }
            if (balance_ != 0D) {
                output.writeDouble(6, balance_);
            }
            for (int i = 0; i < visibleAgents_.size(); i++) {
                output.writeMessage(7, visibleAgents_.get(i));
            }
            for (int i = 0; i < chatBox_.size(); i++) {
                output.writeMessage(8, chatBox_.get(i));
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (status_ != AIProto.GameStatus.PENDING.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, status_);
            }
            if (result_ != AIProto.GameResult.UNKNOWN.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, result_);
            }
            if (turn_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTurn());
            }
            if (config_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getConfig());
            }
            if (viewer_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getViewer());
            }
            if (balance_ != 0D) {
                size += com.google.protobuf.CodedOutputStream.computeDoubleSize(6, balance_);
            }
            for (int i = 0; i < visibleAgents_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, visibleAgents_.get(i));
            }
            for (int i = 0; i < chatBox_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, chatBox_.get(i));
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.GameView)) {
                return super.equals(obj);
            }
            AIProto.GameView other = (AIProto.GameView) obj;

            boolean result = true;
            result = result && status_ == other.status_;
            result = result && result_ == other.result_;
            result = result && (hasTurn() == other.hasTurn());
            if (hasTurn()) {
                result = result && getTurn().equals(other.getTurn());
            }
            result = result && (hasConfig() == other.hasConfig());
            if (hasConfig()) {
                result = result && getConfig().equals(other.getConfig());
            }
            result = result && (hasViewer() == other.hasViewer());
            if (hasViewer()) {
                result = result && getViewer().equals(other.getViewer());
            }
            result = result && (Double.doubleToLongBits(getBalance()) == Double.doubleToLongBits(other.getBalance()));
            result = result && getVisibleAgentsList().equals(other.getVisibleAgentsList());
            result = result && getChatBoxList().equals(other.getChatBoxList());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + STATUS_FIELD_NUMBER;
            hash = (53 * hash) + status_;
            hash = (37 * hash) + RESULT_FIELD_NUMBER;
            hash = (53 * hash) + result_;
            if (hasTurn()) {
                hash = (37 * hash) + TURN_FIELD_NUMBER;
                hash = (53 * hash) + getTurn().hashCode();
            }
            if (hasConfig()) {
                hash = (37 * hash) + CONFIG_FIELD_NUMBER;
                hash = (53 * hash) + getConfig().hashCode();
            }
            if (hasViewer()) {
                hash = (37 * hash) + VIEWER_FIELD_NUMBER;
                hash = (53 * hash) + getViewer().hashCode();
            }
            hash = (37 * hash) + BALANCE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(Double.doubleToLongBits(getBalance()));
            if (getVisibleAgentsCount() > 0) {
                hash = (37 * hash) + VISIBLE_AGENTS_FIELD_NUMBER;
                hash = (53 * hash) + getVisibleAgentsList().hashCode();
            }
            if (getChatBoxCount() > 0) {
                hash = (37 * hash) + CHATBOX_FIELD_NUMBER;
                hash = (53 * hash) + getChatBoxList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<GameView> getParserForType() {
            return PARSER;
        }

        public AIProto.GameView getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.GameView}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.GameView)
                AIProto.GameViewOrBuilder {
            private int bitField0_;
            private int status_ = 0;
            private int result_ = 0;
            private AIProto.Turn turn_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<Turn, Turn.Builder, TurnOrBuilder> turnBuilder_;
            private AIProto.GameConfig config_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<GameConfig, GameConfig.Builder, GameConfigOrBuilder> configBuilder_;
            private AIProto.Agent viewer_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<Agent, Agent.Builder, AgentOrBuilder> viewerBuilder_;
            private double balance_;
            private java.util.List<Agent> visibleAgents_ = java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<Agent, Agent.Builder, AgentOrBuilder> visibleAgentsBuilder_;
            private java.util.List<Chat> chatBox_ = java.util.Collections.emptyList();
            private com.google.protobuf.RepeatedFieldBuilderV3<Chat, Chat.Builder, ChatOrBuilder> chatBoxBuilder_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.GameView.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.GameView.class, AIProto.GameView.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getVisibleAgentsFieldBuilder();
                    getChatBoxFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                status_ = 0;

                result_ = 0;

                if (turnBuilder_ == null) {
                    turn_ = null;
                } else {
                    turn_ = null;
                    turnBuilder_ = null;
                }
                if (configBuilder_ == null) {
                    config_ = null;
                } else {
                    config_ = null;
                    configBuilder_ = null;
                }
                if (viewerBuilder_ == null) {
                    viewer_ = null;
                } else {
                    viewer_ = null;
                    viewerBuilder_ = null;
                }
                balance_ = 0D;

                if (visibleAgentsBuilder_ == null) {
                    visibleAgents_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000040);
                } else {
                    visibleAgentsBuilder_.clear();
                }
                if (chatBoxBuilder_ == null) {
                    chatBox_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000080);
                } else {
                    chatBoxBuilder_.clear();
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_GameView_descriptor;
            }

            public AIProto.GameView getDefaultInstanceForType() {
                return AIProto.GameView.getDefaultInstance();
            }

            public AIProto.GameView build() {
                AIProto.GameView result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.GameView buildPartial() {
                AIProto.GameView result = new AIProto.GameView(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                result.status_ = status_;
                result.result_ = result_;
                if (turnBuilder_ == null) {
                    result.turn_ = turn_;
                } else {
                    result.turn_ = turnBuilder_.build();
                }
                if (configBuilder_ == null) {
                    result.config_ = config_;
                } else {
                    result.config_ = configBuilder_.build();
                }
                if (viewerBuilder_ == null) {
                    result.viewer_ = viewer_;
                } else {
                    result.viewer_ = viewerBuilder_.build();
                }
                result.balance_ = balance_;
                if (visibleAgentsBuilder_ == null) {
                    if (((bitField0_ & 0x00000040) == 0x00000040)) {
                        visibleAgents_ = java.util.Collections.unmodifiableList(visibleAgents_);
                        bitField0_ = (bitField0_ & ~0x00000040);
                    }
                    result.visibleAgents_ = visibleAgents_;
                } else {
                    result.visibleAgents_ = visibleAgentsBuilder_.build();
                }
                if (chatBoxBuilder_ == null) {
                    if (((bitField0_ & 0x00000080) == 0x00000080)) {
                        chatBox_ = java.util.Collections.unmodifiableList(chatBox_);
                        bitField0_ = (bitField0_ & ~0x00000080);
                    }
                    result.chatBox_ = chatBox_;
                } else {
                    result.chatBox_ = chatBoxBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.GameView) {
                    return mergeFrom((AIProto.GameView) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.GameView other) {
                if (other == AIProto.GameView.getDefaultInstance()) return this;
                if (other.status_ != 0) {
                    setStatusValue(other.getStatusValue());
                }
                if (other.result_ != 0) {
                    setResultValue(other.getResultValue());
                }
                if (other.hasTurn()) {
                    mergeTurn(other.getTurn());
                }
                if (other.hasConfig()) {
                    mergeConfig(other.getConfig());
                }
                if (other.hasViewer()) {
                    mergeViewer(other.getViewer());
                }
                if (other.getBalance() != 0D) {
                    setBalance(other.getBalance());
                }
                if (visibleAgentsBuilder_ == null) {
                    if (!other.visibleAgents_.isEmpty()) {
                        if (visibleAgents_.isEmpty()) {
                            visibleAgents_ = other.visibleAgents_;
                            bitField0_ = (bitField0_ & ~0x00000040);
                        } else {
                            ensureVisibleAgentsIsMutable();
                            visibleAgents_.addAll(other.visibleAgents_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.visibleAgents_.isEmpty()) {
                        if (visibleAgentsBuilder_.isEmpty()) {
                            visibleAgentsBuilder_.dispose();
                            visibleAgentsBuilder_ = null;
                            visibleAgents_ = other.visibleAgents_;
                            bitField0_ = (bitField0_ & ~0x00000040);
                            visibleAgentsBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getVisibleAgentsFieldBuilder() : null;
                        } else {
                            visibleAgentsBuilder_.addAllMessages(other.visibleAgents_);
                        }
                    }
                }
                if (chatBoxBuilder_ == null) {
                    if (!other.chatBox_.isEmpty()) {
                        if (chatBox_.isEmpty()) {
                            chatBox_ = other.chatBox_;
                            bitField0_ = (bitField0_ & ~0x00000080);
                        } else {
                            ensureChatBoxIsMutable();
                            chatBox_.addAll(other.chatBox_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.chatBox_.isEmpty()) {
                        if (chatBoxBuilder_.isEmpty()) {
                            chatBoxBuilder_.dispose();
                            chatBoxBuilder_ = null;
                            chatBox_ = other.chatBox_;
                            bitField0_ = (bitField0_ & ~0x00000080);
                            chatBoxBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getChatBoxFieldBuilder() : null;
                        } else {
                            chatBoxBuilder_.addAllMessages(other.chatBox_);
                        }
                    }
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.GameView parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.GameView) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameStatus status = 1;</code>
             */
            public int getStatusValue() {
                return status_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameStatus status = 1;</code>
             */
            public Builder setStatusValue(int value) {
                status_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameStatus status = 1;</code>
             */
            public AIProto.GameStatus getStatus() {
                AIProto.GameStatus result = AIProto.GameStatus.valueOf(status_);
                return result == null ? AIProto.GameStatus.UNRECOGNIZED : result;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameStatus status = 1;</code>
             */
            public Builder setStatus(AIProto.GameStatus value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                status_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameStatus status = 1;</code>
             */
            public Builder clearStatus() {

                status_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameResult result = 2;</code>
             */
            public int getResultValue() {
                return result_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameResult result = 2;</code>
             */
            public Builder setResultValue(int value) {
                result_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameResult result = 2;</code>
             */
            public AIProto.GameResult getResult() {
                AIProto.GameResult result = AIProto.GameResult.valueOf(result_);
                return result == null ? AIProto.GameResult.UNRECOGNIZED : result;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameResult result = 2;</code>
             */
            public Builder setResult(AIProto.GameResult value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                result_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameResult result = 2;</code>
             */
            public Builder clearResult() {

                result_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
             */
            public boolean hasTurn() {
                return turnBuilder_ != null || turn_ != null;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
             */
            public AIProto.Turn getTurn() {
                if (turnBuilder_ == null) {
                    return turn_ == null ? AIProto.Turn.getDefaultInstance() : turn_;
                } else {
                    return turnBuilder_.getMessage();
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
             */
            public Builder setTurn(AIProto.Turn value) {
                if (turnBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    turn_ = value;
                    onChanged();
                } else {
                    turnBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
             */
            public Builder setTurn(AIProto.Turn.Builder builderForValue) {
                if (turnBuilder_ == null) {
                    turn_ = builderForValue.build();
                    onChanged();
                } else {
                    turnBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
             */
            public Builder mergeTurn(AIProto.Turn value) {
                if (turnBuilder_ == null) {
                    if (turn_ != null) {
                        turn_ = AIProto.Turn.newBuilder(turn_).mergeFrom(value).buildPartial();
                    } else {
                        turn_ = value;
                    }
                    onChanged();
                } else {
                    turnBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
             */
            public Builder clearTurn() {
                if (turnBuilder_ == null) {
                    turn_ = null;
                    onChanged();
                } else {
                    turn_ = null;
                    turnBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
             */
            public AIProto.Turn.Builder getTurnBuilder() {

                onChanged();
                return getTurnFieldBuilder().getBuilder();
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
             */
            public AIProto.TurnOrBuilder getTurnOrBuilder() {
                if (turnBuilder_ != null) {
                    return turnBuilder_.getMessageOrBuilder();
                } else {
                    return turn_ == null ? AIProto.Turn.getDefaultInstance() : turn_;
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Turn turn = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<Turn, Turn.Builder, TurnOrBuilder> getTurnFieldBuilder() {
                if (turnBuilder_ == null) {
                    turnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<Turn, Turn.Builder, TurnOrBuilder>(getTurn(), getParentForChildren(), isClean());
                    turn_ = null;
                }
                return turnBuilder_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
             */
            public boolean hasConfig() {
                return configBuilder_ != null || config_ != null;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
             */
            public AIProto.GameConfig getConfig() {
                if (configBuilder_ == null) {
                    return config_ == null ? AIProto.GameConfig.getDefaultInstance() : config_;
                } else {
                    return configBuilder_.getMessage();
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
             */
            public Builder setConfig(AIProto.GameConfig value) {
                if (configBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    config_ = value;
                    onChanged();
                } else {
                    configBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
             */
            public Builder setConfig(AIProto.GameConfig.Builder builderForValue) {
                if (configBuilder_ == null) {
                    config_ = builderForValue.build();
                    onChanged();
                } else {
                    configBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
             */
            public Builder mergeConfig(AIProto.GameConfig value) {
                if (configBuilder_ == null) {
                    if (config_ != null) {
                        config_ = AIProto.GameConfig.newBuilder(config_).mergeFrom(value).buildPartial();
                    } else {
                        config_ = value;
                    }
                    onChanged();
                } else {
                    configBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
             */
            public Builder clearConfig() {
                if (configBuilder_ == null) {
                    config_ = null;
                    onChanged();
                } else {
                    config_ = null;
                    configBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
             */
            public AIProto.GameConfig.Builder getConfigBuilder() {

                onChanged();
                return getConfigFieldBuilder().getBuilder();
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
             */
            public AIProto.GameConfigOrBuilder getConfigOrBuilder() {
                if (configBuilder_ != null) {
                    return configBuilder_.getMessageOrBuilder();
                } else {
                    return config_ == null ? AIProto.GameConfig.getDefaultInstance() : config_;
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.GameConfig config = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<GameConfig, GameConfig.Builder, GameConfigOrBuilder> getConfigFieldBuilder() {
                if (configBuilder_ == null) {
                    configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<GameConfig, GameConfig.Builder, GameConfigOrBuilder>(getConfig(), getParentForChildren(), isClean());
                    config_ = null;
                }
                return configBuilder_;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
             */
            public boolean hasViewer() {
                return viewerBuilder_ != null || viewer_ != null;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
             */
            public AIProto.Agent getViewer() {
                if (viewerBuilder_ == null) {
                    return viewer_ == null ? AIProto.Agent.getDefaultInstance() : viewer_;
                } else {
                    return viewerBuilder_.getMessage();
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
             */
            public Builder setViewer(AIProto.Agent value) {
                if (viewerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    viewer_ = value;
                    onChanged();
                } else {
                    viewerBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
             */
            public Builder setViewer(AIProto.Agent.Builder builderForValue) {
                if (viewerBuilder_ == null) {
                    viewer_ = builderForValue.build();
                    onChanged();
                } else {
                    viewerBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
             */
            public Builder mergeViewer(AIProto.Agent value) {
                if (viewerBuilder_ == null) {
                    if (viewer_ != null) {
                        viewer_ = AIProto.Agent.newBuilder(viewer_).mergeFrom(value).buildPartial();
                    } else {
                        viewer_ = value;
                    }
                    onChanged();
                } else {
                    viewerBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
             */
            public Builder clearViewer() {
                if (viewerBuilder_ == null) {
                    viewer_ = null;
                    onChanged();
                } else {
                    viewer_ = null;
                    viewerBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
             */
            public AIProto.Agent.Builder getViewerBuilder() {

                onChanged();
                return getViewerFieldBuilder().getBuilder();
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
             */
            public AIProto.AgentOrBuilder getViewerOrBuilder() {
                if (viewerBuilder_ != null) {
                    return viewerBuilder_.getMessageOrBuilder();
                } else {
                    return viewer_ == null ? AIProto.Agent.getDefaultInstance() : viewer_;
                }
            }

            /**
             * <code>.ir.sharif.aic.hideandseek.api.grpc.Agent viewer = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<Agent, Agent.Builder, AgentOrBuilder> getViewerFieldBuilder() {
                if (viewerBuilder_ == null) {
                    viewerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<Agent, Agent.Builder, AgentOrBuilder>(getViewer(), getParentForChildren(), isClean());
                    viewer_ = null;
                }
                return viewerBuilder_;
            }

            /**
             * <code>double balance = 6;</code>
             */
            public double getBalance() {
                return balance_;
            }

            /**
             * <code>double balance = 6;</code>
             */
            public Builder setBalance(double value) {

                balance_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>double balance = 6;</code>
             */
            public Builder clearBalance() {

                balance_ = 0D;
                onChanged();
                return this;
            }

            private void ensureVisibleAgentsIsMutable() {
                if (!((bitField0_ & 0x00000040) == 0x00000040)) {
                    visibleAgents_ = new java.util.ArrayList<Agent>(visibleAgents_);
                    bitField0_ |= 0x00000040;
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public java.util.List<Agent> getVisibleAgentsList() {
                if (visibleAgentsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(visibleAgents_);
                } else {
                    return visibleAgentsBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public int getVisibleAgentsCount() {
                if (visibleAgentsBuilder_ == null) {
                    return visibleAgents_.size();
                } else {
                    return visibleAgentsBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public AIProto.Agent getVisibleAgents(int index) {
                if (visibleAgentsBuilder_ == null) {
                    return visibleAgents_.get(index);
                } else {
                    return visibleAgentsBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public Builder setVisibleAgents(int index, AIProto.Agent value) {
                if (visibleAgentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureVisibleAgentsIsMutable();
                    visibleAgents_.set(index, value);
                    onChanged();
                } else {
                    visibleAgentsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public Builder setVisibleAgents(int index, AIProto.Agent.Builder builderForValue) {
                if (visibleAgentsBuilder_ == null) {
                    ensureVisibleAgentsIsMutable();
                    visibleAgents_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    visibleAgentsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public Builder addVisibleAgents(AIProto.Agent value) {
                if (visibleAgentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureVisibleAgentsIsMutable();
                    visibleAgents_.add(value);
                    onChanged();
                } else {
                    visibleAgentsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public Builder addVisibleAgents(int index, AIProto.Agent value) {
                if (visibleAgentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureVisibleAgentsIsMutable();
                    visibleAgents_.add(index, value);
                    onChanged();
                } else {
                    visibleAgentsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public Builder addVisibleAgents(AIProto.Agent.Builder builderForValue) {
                if (visibleAgentsBuilder_ == null) {
                    ensureVisibleAgentsIsMutable();
                    visibleAgents_.add(builderForValue.build());
                    onChanged();
                } else {
                    visibleAgentsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public Builder addVisibleAgents(int index, AIProto.Agent.Builder builderForValue) {
                if (visibleAgentsBuilder_ == null) {
                    ensureVisibleAgentsIsMutable();
                    visibleAgents_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    visibleAgentsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public Builder addAllVisibleAgents(Iterable<? extends Agent> values) {
                if (visibleAgentsBuilder_ == null) {
                    ensureVisibleAgentsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, visibleAgents_);
                    onChanged();
                } else {
                    visibleAgentsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public Builder clearVisibleAgents() {
                if (visibleAgentsBuilder_ == null) {
                    visibleAgents_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000040);
                    onChanged();
                } else {
                    visibleAgentsBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public Builder removeVisibleAgents(int index) {
                if (visibleAgentsBuilder_ == null) {
                    ensureVisibleAgentsIsMutable();
                    visibleAgents_.remove(index);
                    onChanged();
                } else {
                    visibleAgentsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public AIProto.Agent.Builder getVisibleAgentsBuilder(int index) {
                return getVisibleAgentsFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public AIProto.AgentOrBuilder getVisibleAgentsOrBuilder(int index) {
                if (visibleAgentsBuilder_ == null) {
                    return visibleAgents_.get(index);
                } else {
                    return visibleAgentsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public java.util.List<? extends AgentOrBuilder> getVisibleAgentsOrBuilderList() {
                if (visibleAgentsBuilder_ != null) {
                    return visibleAgentsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(visibleAgents_);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public AIProto.Agent.Builder addVisibleAgentsBuilder() {
                return getVisibleAgentsFieldBuilder().addBuilder(AIProto.Agent.getDefaultInstance());
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public AIProto.Agent.Builder addVisibleAgentsBuilder(int index) {
                return getVisibleAgentsFieldBuilder().addBuilder(index, AIProto.Agent.getDefaultInstance());
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Agent visible_agents = 7;</code>
             */
            public java.util.List<Agent.Builder> getVisibleAgentsBuilderList() {
                return getVisibleAgentsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<Agent, Agent.Builder, AgentOrBuilder> getVisibleAgentsFieldBuilder() {
                if (visibleAgentsBuilder_ == null) {
                    visibleAgentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<Agent, Agent.Builder, AgentOrBuilder>(visibleAgents_, ((bitField0_ & 0x00000040) == 0x00000040), getParentForChildren(), isClean());
                    visibleAgents_ = null;
                }
                return visibleAgentsBuilder_;
            }

            private void ensureChatBoxIsMutable() {
                if (!((bitField0_ & 0x00000080) == 0x00000080)) {
                    chatBox_ = new java.util.ArrayList<Chat>(chatBox_);
                    bitField0_ |= 0x00000080;
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public java.util.List<Chat> getChatBoxList() {
                if (chatBoxBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(chatBox_);
                } else {
                    return chatBoxBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public int getChatBoxCount() {
                if (chatBoxBuilder_ == null) {
                    return chatBox_.size();
                } else {
                    return chatBoxBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public AIProto.Chat getChatBox(int index) {
                if (chatBoxBuilder_ == null) {
                    return chatBox_.get(index);
                } else {
                    return chatBoxBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public Builder setChatBox(int index, AIProto.Chat value) {
                if (chatBoxBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureChatBoxIsMutable();
                    chatBox_.set(index, value);
                    onChanged();
                } else {
                    chatBoxBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public Builder setChatBox(int index, AIProto.Chat.Builder builderForValue) {
                if (chatBoxBuilder_ == null) {
                    ensureChatBoxIsMutable();
                    chatBox_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    chatBoxBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public Builder addChatBox(AIProto.Chat value) {
                if (chatBoxBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureChatBoxIsMutable();
                    chatBox_.add(value);
                    onChanged();
                } else {
                    chatBoxBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public Builder addChatBox(int index, AIProto.Chat value) {
                if (chatBoxBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureChatBoxIsMutable();
                    chatBox_.add(index, value);
                    onChanged();
                } else {
                    chatBoxBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public Builder addChatBox(AIProto.Chat.Builder builderForValue) {
                if (chatBoxBuilder_ == null) {
                    ensureChatBoxIsMutable();
                    chatBox_.add(builderForValue.build());
                    onChanged();
                } else {
                    chatBoxBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public Builder addChatBox(int index, AIProto.Chat.Builder builderForValue) {
                if (chatBoxBuilder_ == null) {
                    ensureChatBoxIsMutable();
                    chatBox_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    chatBoxBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public Builder addAllChatBox(Iterable<? extends Chat> values) {
                if (chatBoxBuilder_ == null) {
                    ensureChatBoxIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(values, chatBox_);
                    onChanged();
                } else {
                    chatBoxBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public Builder clearChatBox() {
                if (chatBoxBuilder_ == null) {
                    chatBox_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000080);
                    onChanged();
                } else {
                    chatBoxBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public Builder removeChatBox(int index) {
                if (chatBoxBuilder_ == null) {
                    ensureChatBoxIsMutable();
                    chatBox_.remove(index);
                    onChanged();
                } else {
                    chatBoxBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public AIProto.Chat.Builder getChatBoxBuilder(int index) {
                return getChatBoxFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public AIProto.ChatOrBuilder getChatBoxOrBuilder(int index) {
                if (chatBoxBuilder_ == null) {
                    return chatBox_.get(index);
                } else {
                    return chatBoxBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public java.util.List<? extends ChatOrBuilder> getChatBoxOrBuilderList() {
                if (chatBoxBuilder_ != null) {
                    return chatBoxBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(chatBox_);
                }
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public AIProto.Chat.Builder addChatBoxBuilder() {
                return getChatBoxFieldBuilder().addBuilder(AIProto.Chat.getDefaultInstance());
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public AIProto.Chat.Builder addChatBoxBuilder(int index) {
                return getChatBoxFieldBuilder().addBuilder(index, AIProto.Chat.getDefaultInstance());
            }

            /**
             * <code>repeated .ir.sharif.aic.hideandseek.api.grpc.Chat chatBox = 8;</code>
             */
            public java.util.List<Chat.Builder> getChatBoxBuilderList() {
                return getChatBoxFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<Chat, Chat.Builder, ChatOrBuilder> getChatBoxFieldBuilder() {
                if (chatBoxBuilder_ == null) {
                    chatBoxBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<Chat, Chat.Builder, ChatOrBuilder>(chatBox_, ((bitField0_ & 0x00000080) == 0x00000080), getParentForChildren(), isClean());
                    chatBox_ = null;
                }
                return chatBoxBuilder_;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.GameView)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.ChatCommand}
     */
    public static final class ChatCommand extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.ChatCommand)
            ChatCommandOrBuilder {
        public static final int TOKEN_FIELD_NUMBER = 1;
        public static final int TEXT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.ChatCommand)
        private static final AIProto.ChatCommand DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<ChatCommand> PARSER = new com.google.protobuf.AbstractParser<ChatCommand>() {
            public ChatCommand parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new ChatCommand(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.ChatCommand();
        }

        private volatile Object token_;
        private volatile Object text_;
        private byte memoizedIsInitialized = -1;

        // Use ChatCommand.newBuilder() to construct.
        private ChatCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ChatCommand() {
            token_ = "";
            text_ = "";
        }

        private ChatCommand(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            token_ = s;
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            text_ = s;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_descriptor;
        }

        public static AIProto.ChatCommand parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.ChatCommand parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.ChatCommand parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.ChatCommand parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.ChatCommand parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.ChatCommand parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.ChatCommand parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.ChatCommand parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.ChatCommand parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.ChatCommand parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.ChatCommand parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.ChatCommand parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.ChatCommand prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.ChatCommand getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<ChatCommand> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.ChatCommand.class, AIProto.ChatCommand.Builder.class);
        }

        /**
         * <code>string token = 1;</code>
         */
        public String getToken() {
            Object ref = token_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                token_ = s;
                return s;
            }
        }

        /**
         * <code>string token = 1;</code>
         */
        public com.google.protobuf.ByteString getTokenBytes() {
            Object ref = token_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                token_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string text = 2;</code>
         */
        public String getText() {
            Object ref = text_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                text_ = s;
                return s;
            }
        }

        /**
         * <code>string text = 2;</code>
         */
        public com.google.protobuf.ByteString getTextBytes() {
            Object ref = text_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                text_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (!getTokenBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
            }
            if (!getTextBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, text_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getTokenBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
            }
            if (!getTextBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, text_);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.ChatCommand)) {
                return super.equals(obj);
            }
            AIProto.ChatCommand other = (AIProto.ChatCommand) obj;

            boolean result = true;
            result = result && getToken().equals(other.getToken());
            result = result && getText().equals(other.getText());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TOKEN_FIELD_NUMBER;
            hash = (53 * hash) + getToken().hashCode();
            hash = (37 * hash) + TEXT_FIELD_NUMBER;
            hash = (53 * hash) + getText().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<ChatCommand> getParserForType() {
            return PARSER;
        }

        public AIProto.ChatCommand getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.ChatCommand}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.ChatCommand)
                AIProto.ChatCommandOrBuilder {
            private Object token_ = "";
            private Object text_ = "";

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.ChatCommand.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.ChatCommand.class, AIProto.ChatCommand.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                token_ = "";

                text_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_ChatCommand_descriptor;
            }

            public AIProto.ChatCommand getDefaultInstanceForType() {
                return AIProto.ChatCommand.getDefaultInstance();
            }

            public AIProto.ChatCommand build() {
                AIProto.ChatCommand result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.ChatCommand buildPartial() {
                AIProto.ChatCommand result = new AIProto.ChatCommand(this);
                result.token_ = token_;
                result.text_ = text_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.ChatCommand) {
                    return mergeFrom((AIProto.ChatCommand) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.ChatCommand other) {
                if (other == AIProto.ChatCommand.getDefaultInstance()) return this;
                if (!other.getToken().isEmpty()) {
                    token_ = other.token_;
                    onChanged();
                }
                if (!other.getText().isEmpty()) {
                    text_ = other.text_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.ChatCommand parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.ChatCommand) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public String getToken() {
                Object ref = token_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    token_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder setToken(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                token_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public com.google.protobuf.ByteString getTokenBytes() {
                Object ref = token_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                    token_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder setTokenBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                token_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string token = 1;</code>
             */
            public Builder clearToken() {

                token_ = getDefaultInstance().getToken();
                onChanged();
                return this;
            }

            /**
             * <code>string text = 2;</code>
             */
            public String getText() {
                Object ref = text_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    text_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string text = 2;</code>
             */
            public Builder setText(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                text_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string text = 2;</code>
             */
            public com.google.protobuf.ByteString getTextBytes() {
                Object ref = text_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                    text_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string text = 2;</code>
             */
            public Builder setTextBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                text_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string text = 2;</code>
             */
            public Builder clearText() {

                text_ = getDefaultInstance().getText();
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.ChatCommand)
        }

    }

    /**
     * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Chat}
     */
    public static final class Chat extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ir.sharif.aic.hideandseek.api.grpc.Chat)
            ChatOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int FROMAGENTID_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 3;
        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:ir.sharif.aic.hideandseek.api.grpc.Chat)
        private static final AIProto.Chat DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<Chat> PARSER = new com.google.protobuf.AbstractParser<Chat>() {
            public Chat parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
                return new Chat(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new AIProto.Chat();
        }

        private volatile Object id_;
        private int fromAgentId_;
        private volatile Object text_;
        private com.google.protobuf.Timestamp timeStamp_;
        private byte memoizedIsInitialized = -1;

        // Use Chat.newBuilder() to construct.
        private Chat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Chat() {
            id_ = "";
            fromAgentId_ = 0;
            text_ = "";
        }

        private Chat(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            id_ = s;
                            break;
                        }
                        case 16: {

                            fromAgentId_ = input.readInt32();
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            text_ = s;
                            break;
                        }
                        case 34: {
                            com.google.protobuf.Timestamp.Builder subBuilder = null;
                            if (timeStamp_ != null) {
                                subBuilder = timeStamp_.toBuilder();
                            }
                            timeStamp_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(timeStamp_);
                                timeStamp_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_descriptor;
        }

        public static AIProto.Chat parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Chat parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Chat parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Chat parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Chat parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AIProto.Chat parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AIProto.Chat parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Chat parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Chat parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AIProto.Chat parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AIProto.Chat parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AIProto.Chat parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AIProto.Chat prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static AIProto.Chat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Chat> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Chat.class, AIProto.Chat.Builder.class);
        }

        /**
         * <code>string id = 1;</code>
         */
        public String getId() {
            Object ref = id_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                id_ = s;
                return s;
            }
        }

        /**
         * <code>string id = 1;</code>
         */
        public com.google.protobuf.ByteString getIdBytes() {
            Object ref = id_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                id_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>int32 fromAgentId = 2;</code>
         */
        public int getFromAgentId() {
            return fromAgentId_;
        }

        /**
         * <code>string text = 3;</code>
         */
        public String getText() {
            Object ref = text_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                text_ = s;
                return s;
            }
        }

        /**
         * <code>string text = 3;</code>
         */
        public com.google.protobuf.ByteString getTextBytes() {
            Object ref = text_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                text_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
         */
        public boolean hasTimeStamp() {
            return timeStamp_ != null;
        }

        /**
         * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
         */
        public com.google.protobuf.Timestamp getTimeStamp() {
            return timeStamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeStamp_;
        }

        /**
         * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
         */
        public com.google.protobuf.TimestampOrBuilder getTimeStampOrBuilder() {
            return getTimeStamp();
        }

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (!getIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
            }
            if (fromAgentId_ != 0) {
                output.writeInt32(2, fromAgentId_);
            }
            if (!getTextBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, text_);
            }
            if (timeStamp_ != null) {
                output.writeMessage(4, getTimeStamp());
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
            }
            if (fromAgentId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, fromAgentId_);
            }
            if (!getTextBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, text_);
            }
            if (timeStamp_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getTimeStamp());
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AIProto.Chat)) {
                return super.equals(obj);
            }
            AIProto.Chat other = (AIProto.Chat) obj;

            boolean result = true;
            result = result && getId().equals(other.getId());
            result = result && (getFromAgentId() == other.getFromAgentId());
            result = result && getText().equals(other.getText());
            result = result && (hasTimeStamp() == other.hasTimeStamp());
            if (hasTimeStamp()) {
                result = result && getTimeStamp().equals(other.getTimeStamp());
            }
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId().hashCode();
            hash = (37 * hash) + FROMAGENTID_FIELD_NUMBER;
            hash = (53 * hash) + getFromAgentId();
            hash = (37 * hash) + TEXT_FIELD_NUMBER;
            hash = (53 * hash) + getText().hashCode();
            if (hasTimeStamp()) {
                hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
                hash = (53 * hash) + getTimeStamp().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<Chat> getParserForType() {
            return PARSER;
        }

        public AIProto.Chat getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code ir.sharif.aic.hideandseek.api.grpc.Chat}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ir.sharif.aic.hideandseek.api.grpc.Chat)
                AIProto.ChatOrBuilder {
            private Object id_ = "";
            private int fromAgentId_;
            private Object text_ = "";
            private com.google.protobuf.Timestamp timeStamp_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeStampBuilder_;

            // Construct using ir.sharif.aic.hideandseek.api.grpc.AIProto.Chat.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_fieldAccessorTable.ensureFieldAccessorsInitialized(AIProto.Chat.class, AIProto.Chat.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                id_ = "";

                fromAgentId_ = 0;

                text_ = "";

                if (timeStampBuilder_ == null) {
                    timeStamp_ = null;
                } else {
                    timeStamp_ = null;
                    timeStampBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return AIProto.internal_static_ir_sharif_aic_hideandseek_api_grpc_Chat_descriptor;
            }

            public AIProto.Chat getDefaultInstanceForType() {
                return AIProto.Chat.getDefaultInstance();
            }

            public AIProto.Chat build() {
                AIProto.Chat result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public AIProto.Chat buildPartial() {
                AIProto.Chat result = new AIProto.Chat(this);
                result.id_ = id_;
                result.fromAgentId_ = fromAgentId_;
                result.text_ = text_;
                if (timeStampBuilder_ == null) {
                    result.timeStamp_ = timeStamp_;
                } else {
                    result.timeStamp_ = timeStampBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof AIProto.Chat) {
                    return mergeFrom((AIProto.Chat) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(AIProto.Chat other) {
                if (other == AIProto.Chat.getDefaultInstance()) return this;
                if (!other.getId().isEmpty()) {
                    id_ = other.id_;
                    onChanged();
                }
                if (other.getFromAgentId() != 0) {
                    setFromAgentId(other.getFromAgentId());
                }
                if (!other.getText().isEmpty()) {
                    text_ = other.text_;
                    onChanged();
                }
                if (other.hasTimeStamp()) {
                    mergeTimeStamp(other.getTimeStamp());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                AIProto.Chat parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (AIProto.Chat) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>string id = 1;</code>
             */
            public String getId() {
                Object ref = id_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    id_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string id = 1;</code>
             */
            public Builder setId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string id = 1;</code>
             */
            public com.google.protobuf.ByteString getIdBytes() {
                Object ref = id_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                    id_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string id = 1;</code>
             */
            public Builder setIdBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string id = 1;</code>
             */
            public Builder clearId() {

                id_ = getDefaultInstance().getId();
                onChanged();
                return this;
            }

            /**
             * <code>int32 fromAgentId = 2;</code>
             */
            public int getFromAgentId() {
                return fromAgentId_;
            }

            /**
             * <code>int32 fromAgentId = 2;</code>
             */
            public Builder setFromAgentId(int value) {

                fromAgentId_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 fromAgentId = 2;</code>
             */
            public Builder clearFromAgentId() {

                fromAgentId_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string text = 3;</code>
             */
            public String getText() {
                Object ref = text_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    text_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string text = 3;</code>
             */
            public Builder setText(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                text_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string text = 3;</code>
             */
            public com.google.protobuf.ByteString getTextBytes() {
                Object ref = text_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                    text_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string text = 3;</code>
             */
            public Builder setTextBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                text_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string text = 3;</code>
             */
            public Builder clearText() {

                text_ = getDefaultInstance().getText();
                onChanged();
                return this;
            }

            /**
             * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
             */
            public boolean hasTimeStamp() {
                return timeStampBuilder_ != null || timeStamp_ != null;
            }

            /**
             * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
             */
            public com.google.protobuf.Timestamp getTimeStamp() {
                if (timeStampBuilder_ == null) {
                    return timeStamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeStamp_;
                } else {
                    return timeStampBuilder_.getMessage();
                }
            }

            /**
             * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
             */
            public Builder setTimeStamp(com.google.protobuf.Timestamp value) {
                if (timeStampBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    timeStamp_ = value;
                    onChanged();
                } else {
                    timeStampBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
             */
            public Builder setTimeStamp(com.google.protobuf.Timestamp.Builder builderForValue) {
                if (timeStampBuilder_ == null) {
                    timeStamp_ = builderForValue.build();
                    onChanged();
                } else {
                    timeStampBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
             */
            public Builder mergeTimeStamp(com.google.protobuf.Timestamp value) {
                if (timeStampBuilder_ == null) {
                    if (timeStamp_ != null) {
                        timeStamp_ = com.google.protobuf.Timestamp.newBuilder(timeStamp_).mergeFrom(value).buildPartial();
                    } else {
                        timeStamp_ = value;
                    }
                    onChanged();
                } else {
                    timeStampBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
             */
            public Builder clearTimeStamp() {
                if (timeStampBuilder_ == null) {
                    timeStamp_ = null;
                    onChanged();
                } else {
                    timeStamp_ = null;
                    timeStampBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
             */
            public com.google.protobuf.Timestamp.Builder getTimeStampBuilder() {

                onChanged();
                return getTimeStampFieldBuilder().getBuilder();
            }

            /**
             * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
             */
            public com.google.protobuf.TimestampOrBuilder getTimeStampOrBuilder() {
                if (timeStampBuilder_ != null) {
                    return timeStampBuilder_.getMessageOrBuilder();
                } else {
                    return timeStamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeStamp_;
                }
            }

            /**
             * <code>.google.protobuf.Timestamp timeStamp = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> getTimeStampFieldBuilder() {
                if (timeStampBuilder_ == null) {
                    timeStampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(getTimeStamp(), getParentForChildren(), isClean());
                    timeStamp_ = null;
                }
                return timeStampBuilder_;
            }

            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ir.sharif.aic.hideandseek.api.grpc.Chat)
        }

    }

    // @@protoc_insertion_point(outer_class_scope)
}
