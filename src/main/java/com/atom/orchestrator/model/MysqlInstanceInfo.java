package com.atom.orchestrator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Atom
 */
public class MysqlInstanceInfo {
    @JsonProperty("Key")
    private Key key;
    @JsonProperty("InstanceAlias")
    private String instanceAlias;
    @JsonProperty("Uptime")
    private long uptime;
    @JsonProperty("ServerID")
    private int serverID;
    @JsonProperty("ServerUUID")
    private String serverUUID;
    @JsonProperty("Version")
    private String version;
    @JsonProperty("VersionComment")
    private String versionComment;
    @JsonProperty("FlavorName")
    private String flavorName;
    @JsonProperty("ReadOnly")
    private boolean readOnly;
    @JsonProperty("Binlog_format")
    private String binlogFormat;
    @JsonProperty("BinlogRowImage")
    private String binlogRowImage;
    @JsonProperty("LogBinEnabled")
    private boolean logBinEnabled;
    @JsonProperty("LogSlaveUpdatesEnabled")
    private boolean logSlaveUpdatesEnabled;
    @JsonProperty("LogReplicationUpdatesEnabled")
    private boolean logReplicationUpdatesEnabled;
    @JsonProperty("SelfBinlogCoordinates")
    private SelfBinlogCoordinates selfBinlogCoordinates;
    @JsonProperty("MasterKey")
    private MasterKey masterKey;
    @JsonProperty("MasterUUID")
    private String masterUUID;
    @JsonProperty("AncestryUUID")
    private String ancestryUUID;
    @JsonProperty("IsDetachedMaster")
    private boolean isDetachedMaster;
    @JsonProperty("Slave_SQL_Running")
    private boolean slaveSQLRunning;
    @JsonProperty("ReplicationSQLThreadRuning")
    private boolean replicationSQLThreadRunning;
    @JsonProperty("Slave_IO_Running")
    private boolean slaveIORunning;
    @JsonProperty("ReplicationIOThreadRuning")
    private boolean replicationIOThreadRunning;
    @JsonProperty("ReplicationSQLThreadState")
    private int replicationSQLThreadState;
    @JsonProperty("ReplicationIOThreadState")
    private int replicationIOThreadState;
    @JsonProperty("HasReplicationFilters")
    private boolean hasReplicationFilters;
    @JsonProperty("GTIDMode")
    private String gtidMode;
    @JsonProperty("SupportsOracleGTID")
    private boolean supportsOracleGTID;
    @JsonProperty("UsingOracleGTID")
    private boolean usingOracleGTID;
    @JsonProperty("UsingMariaDBGTID")
    private boolean usingMariaDBGTID;
    @JsonProperty("UsingPseudoGTID")
    private boolean usingPseudoGTID;
    @JsonProperty("ReadBinlogCoordinates")
    private ReadBinlogCoordinates readBinlogCoordinates;
    @JsonProperty("ExecBinlogCoordinates")
    private ExecBinlogCoordinates execBinlogCoordinates;
    @JsonProperty("IsDetached")
    private boolean isDetached;
    @JsonProperty("RelaylogCoordinates")
    private RelaylogCoordinates relaylogCoordinates;
    @JsonProperty("LastSQLError")
    private String LastSQLError;
    @JsonProperty("LastIOError")
    private String lastIOError;
    @JsonProperty("SecondsBehindMaster")
    private SecondsBehindMaster secondsBehindMaster;
    @JsonProperty("SQLDelay")
    private int sqlDelay;
    @JsonProperty("ExecutedGtidSet")
    private String executedGtidSet;
    @JsonProperty("GtidPurged")
    private String gtidPurged;
    @JsonProperty("GtidErrant")
    private String gtidErrant;
    @JsonProperty("SlaveLagSeconds")
    private SlaveLagSeconds slaveLagSeconds;
    @JsonProperty("ReplicationLagSeconds")
    private ReplicationLagSeconds replicationLagSeconds;
    @JsonProperty("SlaveHosts")
    private List<SlaveHosts> slaveHosts;
    @JsonProperty("Replicas")
    private List<Replicas> replicas;
    @JsonProperty("ClusterName")
    private String clusterName;
    @JsonProperty("SuggestedClusterAlias")
    private String suggestedClusterAlias;
    @JsonProperty("DataCenter")
    private String dataCenter;
    @JsonProperty("Region")
    private String region;
    @JsonProperty("PhysicalEnvironment")
    private String physicalEnvironment;
    @JsonProperty("ReplicationDepth")
    private int replicationDepth;
    @JsonProperty("IsCoMaster")
    private boolean isCoMaster;
    @JsonProperty("HasReplicationCredentials")
    private boolean hasReplicationCredentials;
    @JsonProperty("ReplicationCredentialsAvailable")
    private boolean replicationCredentialsAvailable;
    @JsonProperty("SemiSyncAvailable")
    private boolean semiSyncAvailable;
    @JsonProperty("SemiSyncPriority")
    private int semiSyncPriority;
    @JsonProperty("SemiSyncMasterEnabled")
    private boolean semiSyncMasterEnabled;
    @JsonProperty("SemiSyncReplicaEnabled")
    private boolean semiSyncReplicaEnabled;
    @JsonProperty("SemiSyncMasterTimeout")
    private int semiSyncMasterTimeout;
    @JsonProperty("SemiSyncMasterWaitForReplicaCount")
    private int semiSyncMasterWaitForReplicaCount;
    @JsonProperty("SemiSyncMasterStatus")
    private boolean semiSyncMasterStatus;
    @JsonProperty("SemiSyncMasterClients")
    private int semiSyncMasterClients;
    @JsonProperty("SemiSyncReplicaStatus")
    private boolean semiSyncReplicaStatus;
    @JsonProperty("LastSeenTimestamp")
    private String lastSeenTimestamp;
    @JsonProperty("IsLastCheckValid")
    private boolean isLastCheckValid;
    @JsonProperty("IsUpToDate")
    private boolean isUpToDate;
    @JsonProperty("IsRecentlyChecked")
    private boolean isRecentlyChecked;
    @JsonProperty("SecondsSinceLastSeen")
    private SecondsSinceLastSeen secondsSinceLastSeen;
    @JsonProperty("CountMySQLSnapshots")
    private int countMySQLSnapshots;
    @JsonProperty("IsCandidate")
    private boolean isCandidate;
    @JsonProperty("PromotionRule")
    private String promotionRule;
    @JsonProperty("IsDowntimed")
    private boolean isDowntimed;
    @JsonProperty("DowntimeReason")
    private String downtimeReason;
    @JsonProperty("DowntimeOwner")
    private String downtimeOwner;
    @JsonProperty("DowntimeEndTimestamp")
    private String downtimeEndTimestamp;
    @JsonProperty("ElapsedDowntime")
    private int elapsedDowntime;
    @JsonProperty("UnresolvedHostname")
    private String unresolvedHostname;
    @JsonProperty("AllowTLS")
    private boolean allowTLS;
    @JsonProperty("Problems")
    private List<String> problems;
    @JsonProperty("LastDiscoveryLatency")
    private long lastDiscoveryLatency;
    @JsonProperty("ReplicationGroupName")
    private String replicationGroupName;
    @JsonProperty("ReplicationGroupIsSinglePrimary")
    private boolean replicationGroupIsSinglePrimary;
    @JsonProperty("ReplicationGroupMemberState")
    private String replicationGroupMemberState;
    @JsonProperty("ReplicationGroupMemberRole")
    private String replicationGroupMemberRole;
    @JsonProperty("ReplicationGroupMembers")
    private List<String> replicationGroupMembers;
    @JsonProperty("ReplicationGroupPrimaryInstanceKey")
    private ReplicationGroupPrimaryInstanceKey replicationGroupPrimaryInstanceKey;

    public void setKey(Key Key) {
        this.key = Key;
    }

    public Key getKey() {
        return key;
    }

    public void setInstanceAlias(String InstanceAlias) {
        this.instanceAlias = InstanceAlias;
    }

    public String getInstanceAlias() {
        return instanceAlias;
    }

    public void setUptime(long Uptime) {
        this.uptime = Uptime;
    }

    public long getUptime() {
        return uptime;
    }

    public void setServerID(int ServerID) {
        this.serverID = ServerID;
    }

    public int getServerID() {
        return serverID;
    }

    public void setServerUUID(String ServerUUID) {
        this.serverUUID = ServerUUID;
    }

    public String getServerUUID() {
        return serverUUID;
    }

    public void setVersion(String Version) {
        this.version = Version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersionComment(String VersionComment) {
        this.versionComment = VersionComment;
    }

    public String getVersionComment() {
        return versionComment;
    }

    public void setFlavorName(String FlavorName) {
        this.flavorName = FlavorName;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setReadOnly(boolean ReadOnly) {
        this.readOnly = ReadOnly;
    }

    public boolean getReadOnly() {
        return readOnly;
    }

    public void setBinlogFormat(String Binlog_format) {
        this.binlogFormat = Binlog_format;
    }

    public String getBinlogFormat() {
        return binlogFormat;
    }

    public void setBinlogRowImage(String BinlogRowImage) {
        this.binlogRowImage = BinlogRowImage;
    }

    public String getBinlogRowImage() {
        return binlogRowImage;
    }

    public void setLogBinEnabled(boolean LogBinEnabled) {
        this.logBinEnabled = LogBinEnabled;
    }

    public boolean getLogBinEnabled() {
        return logBinEnabled;
    }

    public void setLogSlaveUpdatesEnabled(boolean LogSlaveUpdatesEnabled) {
        this.logSlaveUpdatesEnabled = LogSlaveUpdatesEnabled;
    }

    public boolean getLogSlaveUpdatesEnabled() {
        return logSlaveUpdatesEnabled;
    }

    public void setLogReplicationUpdatesEnabled(boolean LogReplicationUpdatesEnabled) {
        this.logReplicationUpdatesEnabled = LogReplicationUpdatesEnabled;
    }

    public boolean getLogReplicationUpdatesEnabled() {
        return logReplicationUpdatesEnabled;
    }

    public void setSelfBinlogCoordinates(SelfBinlogCoordinates SelfBinlogCoordinates) {
        this.selfBinlogCoordinates = SelfBinlogCoordinates;
    }

    public SelfBinlogCoordinates getSelfBinlogCoordinates() {
        return selfBinlogCoordinates;
    }

    public void setMasterKey(MasterKey MasterKey) {
        this.masterKey = MasterKey;
    }

    public MasterKey getMasterKey() {
        return masterKey;
    }

    public void setMasterUUID(String MasterUUID) {
        this.masterUUID = MasterUUID;
    }

    public String getMasterUUID() {
        return masterUUID;
    }

    public void setAncestryUUID(String AncestryUUID) {
        this.ancestryUUID = AncestryUUID;
    }

    public String getAncestryUUID() {
        return ancestryUUID;
    }

    public void setIsDetachedMaster(boolean IsDetachedMaster) {
        this.isDetachedMaster = IsDetachedMaster;
    }

    public boolean getIsDetachedMaster() {
        return isDetachedMaster;
    }

    public void setSlaveSQLRunning(boolean Slave_SQL_Running) {
        this.slaveSQLRunning = Slave_SQL_Running;
    }

    public boolean getSlaveSQLRunning() {
        return slaveSQLRunning;
    }

    public void setReplicationSQLThreadRunning(boolean ReplicationSQLThreadRuning) {
        this.replicationSQLThreadRunning = ReplicationSQLThreadRuning;
    }

    public boolean getReplicationSQLThreadRunning() {
        return replicationSQLThreadRunning;
    }

    public void setSlaveIORunning(boolean Slave_IO_Running) {
        this.slaveIORunning = Slave_IO_Running;
    }

    public boolean getSlaveIORunning() {
        return slaveIORunning;
    }

    public void setReplicationIOThreadRunning(boolean ReplicationIOThreadRuning) {
        this.replicationIOThreadRunning = ReplicationIOThreadRuning;
    }

    public boolean getReplicationIOThreadRunning() {
        return replicationIOThreadRunning;
    }

    public void setReplicationSQLThreadState(int ReplicationSQLThreadState) {
        this.replicationSQLThreadState = ReplicationSQLThreadState;
    }

    public int getReplicationSQLThreadState() {
        return replicationSQLThreadState;
    }

    public void setReplicationIOThreadState(int ReplicationIOThreadState) {
        this.replicationIOThreadState = ReplicationIOThreadState;
    }

    public int getReplicationIOThreadState() {
        return replicationIOThreadState;
    }

    public void setHasReplicationFilters(boolean HasReplicationFilters) {
        this.hasReplicationFilters = HasReplicationFilters;
    }

    public boolean getHasReplicationFilters() {
        return hasReplicationFilters;
    }

    public void setGtidMode(String gtidMode) {
        this.gtidMode = gtidMode;
    }

    public String getGtidMode() {
        return gtidMode;
    }

    public void setSupportsOracleGTID(boolean SupportsOracleGTID) {
        this.supportsOracleGTID = SupportsOracleGTID;
    }

    public boolean getSupportsOracleGTID() {
        return supportsOracleGTID;
    }

    public void setUsingOracleGTID(boolean UsingOracleGTID) {
        this.usingOracleGTID = UsingOracleGTID;
    }

    public boolean getUsingOracleGTID() {
        return usingOracleGTID;
    }

    public void setUsingMariaDBGTID(boolean UsingMariaDBGTID) {
        this.usingMariaDBGTID = UsingMariaDBGTID;
    }

    public boolean getUsingMariaDBGTID() {
        return usingMariaDBGTID;
    }

    public void setUsingPseudoGTID(boolean UsingPseudoGTID) {
        this.usingPseudoGTID = UsingPseudoGTID;
    }

    public boolean getUsingPseudoGTID() {
        return usingPseudoGTID;
    }

    public void setReadBinlogCoordinates(ReadBinlogCoordinates ReadBinlogCoordinates) {
        this.readBinlogCoordinates = ReadBinlogCoordinates;
    }

    public ReadBinlogCoordinates getReadBinlogCoordinates() {
        return readBinlogCoordinates;
    }

    public void setExecBinlogCoordinates(ExecBinlogCoordinates ExecBinlogCoordinates) {
        this.execBinlogCoordinates = ExecBinlogCoordinates;
    }

    public ExecBinlogCoordinates getExecBinlogCoordinates() {
        return execBinlogCoordinates;
    }

    public void setIsDetached(boolean IsDetached) {
        this.isDetached = IsDetached;
    }

    public boolean getIsDetached() {
        return isDetached;
    }

    public void setRelaylogCoordinates(RelaylogCoordinates RelaylogCoordinates) {
        this.relaylogCoordinates = RelaylogCoordinates;
    }

    public RelaylogCoordinates getRelaylogCoordinates() {
        return relaylogCoordinates;
    }

    public void setLastSQLError(String LastSQLError) {
        this.LastSQLError = LastSQLError;
    }

    public String getLastSQLError() {
        return LastSQLError;
    }

    public void setLastIOError(String LastIOError) {
        this.lastIOError = LastIOError;
    }

    public String getLastIOError() {
        return lastIOError;
    }

    public void setSecondsBehindMaster(SecondsBehindMaster SecondsBehindMaster) {
        this.secondsBehindMaster = SecondsBehindMaster;
    }

    public SecondsBehindMaster getSecondsBehindMaster() {
        return secondsBehindMaster;
    }

    public void setSqlDelay(int sqlDelay) {
        this.sqlDelay = sqlDelay;
    }

    public int getSqlDelay() {
        return sqlDelay;
    }

    public void setExecutedGtidSet(String ExecutedGtidSet) {
        this.executedGtidSet = ExecutedGtidSet;
    }

    public String getExecutedGtidSet() {
        return executedGtidSet;
    }

    public void setGtidPurged(String GtidPurged) {
        this.gtidPurged = GtidPurged;
    }

    public String getGtidPurged() {
        return gtidPurged;
    }

    public void setGtidErrant(String GtidErrant) {
        this.gtidErrant = GtidErrant;
    }

    public String getGtidErrant() {
        return gtidErrant;
    }

    public void setSlaveLagSeconds(SlaveLagSeconds SlaveLagSeconds) {
        this.slaveLagSeconds = SlaveLagSeconds;
    }

    public SlaveLagSeconds getSlaveLagSeconds() {
        return slaveLagSeconds;
    }

    public void setReplicationLagSeconds(ReplicationLagSeconds ReplicationLagSeconds) {
        this.replicationLagSeconds = ReplicationLagSeconds;
    }

    public ReplicationLagSeconds getReplicationLagSeconds() {
        return replicationLagSeconds;
    }

    public void setSlaveHosts(List<SlaveHosts> SlaveHosts) {
        this.slaveHosts = SlaveHosts;
    }

    public List<SlaveHosts> getSlaveHosts() {
        return slaveHosts;
    }

    public void setReplicas(List<Replicas> Replicas) {
        this.replicas = Replicas;
    }

    public List<Replicas> getReplicas() {
        return replicas;
    }

    public void setClusterName(String ClusterName) {
        this.clusterName = ClusterName;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setSuggestedClusterAlias(String SuggestedClusterAlias) {
        this.suggestedClusterAlias = SuggestedClusterAlias;
    }

    public String getSuggestedClusterAlias() {
        return suggestedClusterAlias;
    }

    public void setDataCenter(String DataCenter) {
        this.dataCenter = DataCenter;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setRegion(String Region) {
        this.region = Region;
    }

    public String getRegion() {
        return region;
    }

    public void setPhysicalEnvironment(String PhysicalEnvironment) {
        this.physicalEnvironment = PhysicalEnvironment;
    }

    public String getPhysicalEnvironment() {
        return physicalEnvironment;
    }

    public void setReplicationDepth(int ReplicationDepth) {
        this.replicationDepth = ReplicationDepth;
    }

    public int getReplicationDepth() {
        return replicationDepth;
    }

    public void setIsCoMaster(boolean IsCoMaster) {
        this.isCoMaster = IsCoMaster;
    }

    public boolean getIsCoMaster() {
        return isCoMaster;
    }

    public void setHasReplicationCredentials(boolean HasReplicationCredentials) {
        this.hasReplicationCredentials = HasReplicationCredentials;
    }

    public boolean getHasReplicationCredentials() {
        return hasReplicationCredentials;
    }

    public void setReplicationCredentialsAvailable(boolean ReplicationCredentialsAvailable) {
        this.replicationCredentialsAvailable = ReplicationCredentialsAvailable;
    }

    public boolean getReplicationCredentialsAvailable() {
        return replicationCredentialsAvailable;
    }

    public void setSemiSyncAvailable(boolean SemiSyncAvailable) {
        this.semiSyncAvailable = SemiSyncAvailable;
    }

    public boolean getSemiSyncAvailable() {
        return semiSyncAvailable;
    }

    public void setSemiSyncPriority(int SemiSyncPriority) {
        this.semiSyncPriority = SemiSyncPriority;
    }

    public int getSemiSyncPriority() {
        return semiSyncPriority;
    }

    public void setSemiSyncMasterEnabled(boolean SemiSyncMasterEnabled) {
        this.semiSyncMasterEnabled = SemiSyncMasterEnabled;
    }

    public boolean getSemiSyncMasterEnabled() {
        return semiSyncMasterEnabled;
    }

    public void setSemiSyncReplicaEnabled(boolean SemiSyncReplicaEnabled) {
        this.semiSyncReplicaEnabled = SemiSyncReplicaEnabled;
    }

    public boolean getSemiSyncReplicaEnabled() {
        return semiSyncReplicaEnabled;
    }

    public void setSemiSyncMasterTimeout(int SemiSyncMasterTimeout) {
        this.semiSyncMasterTimeout = SemiSyncMasterTimeout;
    }

    public int getSemiSyncMasterTimeout() {
        return semiSyncMasterTimeout;
    }

    public void setSemiSyncMasterWaitForReplicaCount(int SemiSyncMasterWaitForReplicaCount) {
        this.semiSyncMasterWaitForReplicaCount = SemiSyncMasterWaitForReplicaCount;
    }

    public int getSemiSyncMasterWaitForReplicaCount() {
        return semiSyncMasterWaitForReplicaCount;
    }

    public void setSemiSyncMasterStatus(boolean SemiSyncMasterStatus) {
        this.semiSyncMasterStatus = SemiSyncMasterStatus;
    }

    public boolean getSemiSyncMasterStatus() {
        return semiSyncMasterStatus;
    }

    public void setSemiSyncMasterClients(int SemiSyncMasterClients) {
        this.semiSyncMasterClients = SemiSyncMasterClients;
    }

    public int getSemiSyncMasterClients() {
        return semiSyncMasterClients;
    }

    public void setSemiSyncReplicaStatus(boolean SemiSyncReplicaStatus) {
        this.semiSyncReplicaStatus = SemiSyncReplicaStatus;
    }

    public boolean getSemiSyncReplicaStatus() {
        return semiSyncReplicaStatus;
    }

    public void setLastSeenTimestamp(String LastSeenTimestamp) {
        this.lastSeenTimestamp = LastSeenTimestamp;
    }

    public String getLastSeenTimestamp() {
        return lastSeenTimestamp;
    }

    public void setIsLastCheckValid(boolean IsLastCheckValid) {
        this.isLastCheckValid = IsLastCheckValid;
    }

    public boolean getIsLastCheckValid() {
        return isLastCheckValid;
    }

    public void setIsUpToDate(boolean IsUpToDate) {
        this.isUpToDate = IsUpToDate;
    }

    public boolean getIsUpToDate() {
        return isUpToDate;
    }

    public void setIsRecentlyChecked(boolean IsRecentlyChecked) {
        this.isRecentlyChecked = IsRecentlyChecked;
    }

    public boolean getIsRecentlyChecked() {
        return isRecentlyChecked;
    }

    public void setSecondsSinceLastSeen(SecondsSinceLastSeen SecondsSinceLastSeen) {
        this.secondsSinceLastSeen = SecondsSinceLastSeen;
    }

    public SecondsSinceLastSeen getSecondsSinceLastSeen() {
        return secondsSinceLastSeen;
    }

    public void setCountMySQLSnapshots(int CountMySQLSnapshots) {
        this.countMySQLSnapshots = CountMySQLSnapshots;
    }

    public int getCountMySQLSnapshots() {
        return countMySQLSnapshots;
    }

    public void setIsCandidate(boolean IsCandidate) {
        this.isCandidate = IsCandidate;
    }

    public boolean getIsCandidate() {
        return isCandidate;
    }

    public void setPromotionRule(String PromotionRule) {
        this.promotionRule = PromotionRule;
    }

    public String getPromotionRule() {
        return promotionRule;
    }

    public void setIsDowntimed(boolean IsDowntimed) {
        this.isDowntimed = IsDowntimed;
    }

    public boolean getIsDowntimed() {
        return isDowntimed;
    }

    public void setDowntimeReason(String DowntimeReason) {
        this.downtimeReason = DowntimeReason;
    }

    public String getDowntimeReason() {
        return downtimeReason;
    }

    public void setDowntimeOwner(String DowntimeOwner) {
        this.downtimeOwner = DowntimeOwner;
    }

    public String getDowntimeOwner() {
        return downtimeOwner;
    }

    public void setDowntimeEndTimestamp(String DowntimeEndTimestamp) {
        this.downtimeEndTimestamp = DowntimeEndTimestamp;
    }

    public String getDowntimeEndTimestamp() {
        return downtimeEndTimestamp;
    }

    public void setElapsedDowntime(int ElapsedDowntime) {
        this.elapsedDowntime = ElapsedDowntime;
    }

    public int getElapsedDowntime() {
        return elapsedDowntime;
    }

    public void setUnresolvedHostname(String UnresolvedHostname) {
        this.unresolvedHostname = UnresolvedHostname;
    }

    public String getUnresolvedHostname() {
        return unresolvedHostname;
    }

    public void setAllowTLS(boolean AllowTLS) {
        this.allowTLS = AllowTLS;
    }

    public boolean getAllowTLS() {
        return allowTLS;
    }

    public void setProblems(List<String> Problems) {
        this.problems = Problems;
    }

    public List<String> getProblems() {
        return problems;
    }

    public void setLastDiscoveryLatency(long LastDiscoveryLatency) {
        this.lastDiscoveryLatency = LastDiscoveryLatency;
    }

    public long getLastDiscoveryLatency() {
        return lastDiscoveryLatency;
    }

    public void setReplicationGroupName(String ReplicationGroupName) {
        this.replicationGroupName = ReplicationGroupName;
    }

    public String getReplicationGroupName() {
        return replicationGroupName;
    }

    public void setReplicationGroupIsSinglePrimary(boolean ReplicationGroupIsSinglePrimary) {
        this.replicationGroupIsSinglePrimary = ReplicationGroupIsSinglePrimary;
    }

    public boolean getReplicationGroupIsSinglePrimary() {
        return replicationGroupIsSinglePrimary;
    }

    public void setReplicationGroupMemberState(String ReplicationGroupMemberState) {
        this.replicationGroupMemberState = ReplicationGroupMemberState;
    }

    public String getReplicationGroupMemberState() {
        return replicationGroupMemberState;
    }

    public void setReplicationGroupMemberRole(String ReplicationGroupMemberRole) {
        this.replicationGroupMemberRole = ReplicationGroupMemberRole;
    }

    public String getReplicationGroupMemberRole() {
        return replicationGroupMemberRole;
    }

    public void setReplicationGroupMembers(List<String> ReplicationGroupMembers) {
        this.replicationGroupMembers = ReplicationGroupMembers;
    }

    public List<String> getReplicationGroupMembers() {
        return replicationGroupMembers;
    }

    public void setReplicationGroupPrimaryInstanceKey(ReplicationGroupPrimaryInstanceKey ReplicationGroupPrimaryInstanceKey) {
        this.replicationGroupPrimaryInstanceKey = ReplicationGroupPrimaryInstanceKey;
    }

    public ReplicationGroupPrimaryInstanceKey getReplicationGroupPrimaryInstanceKey() {
        return replicationGroupPrimaryInstanceKey;
    }

    public MysqlInstanceInfo() {
    }

    public MysqlInstanceInfo(com.atom.orchestrator.model.Key key, String instanceAlias, long uptime, int serverID, String serverUUID, String version, String versionComment, String flavorName, boolean readOnly, String binlogFormat, String binlogRowImage, boolean logBinEnabled, boolean logSlaveUpdatesEnabled, boolean logReplicationUpdatesEnabled, com.atom.orchestrator.model.SelfBinlogCoordinates selfBinlogCoordinates, com.atom.orchestrator.model.MasterKey masterKey, String masterUUID, String ancestryUUID, boolean isDetachedMaster, boolean slave_SQL_Running, boolean replicationSQLThreadRunning, boolean slave_IO_Running, boolean replicationIOThreadRuning, int replicationSQLThreadState, int replicationIOThreadState, boolean hasReplicationFilters, String GTIDMode, boolean supportsOracleGTID, boolean usingOracleGTID, boolean usingMariaDBGTID, boolean usingPseudoGTID, com.atom.orchestrator.model.ReadBinlogCoordinates readBinlogCoordinates, com.atom.orchestrator.model.ExecBinlogCoordinates execBinlogCoordinates, boolean isDetached, com.atom.orchestrator.model.RelaylogCoordinates relaylogCoordinates, String lastSQLError, String lastIOError, com.atom.orchestrator.model.SecondsBehindMaster secondsBehindMaster, int SQLDelay, String executedGtidSet, String gtidPurged, String gtidErrant, com.atom.orchestrator.model.SlaveLagSeconds slaveLagSeconds, com.atom.orchestrator.model.ReplicationLagSeconds replicationLagSeconds, List<com.atom.orchestrator.model.SlaveHosts> slaveHosts, List<com.atom.orchestrator.model.Replicas> replicas, String clusterName, String suggestedClusterAlias, String dataCenter, String region, String physicalEnvironment, int replicationDepth, boolean isCoMaster, boolean hasReplicationCredentials, boolean replicationCredentialsAvailable, boolean semiSyncAvailable, int semiSyncPriority, boolean semiSyncMasterEnabled, boolean semiSyncReplicaEnabled, int semiSyncMasterTimeout, int semiSyncMasterWaitForReplicaCount, boolean semiSyncMasterStatus, int semiSyncMasterClients, boolean semiSyncReplicaStatus, String lastSeenTimestamp, boolean isLastCheckValid, boolean isUpToDate, boolean isRecentlyChecked, com.atom.orchestrator.model.SecondsSinceLastSeen secondsSinceLastSeen, int countMySQLSnapshots, boolean isCandidate, String promotionRule, boolean isDowntimed, String downtimeReason, String downtimeOwner, String downtimeEndTimestamp, int elapsedDowntime, String unresolvedHostname, boolean allowTLS, List<String> problems, long lastDiscoveryLatency, String replicationGroupName, boolean replicationGroupIsSinglePrimary, String replicationGroupMemberState, String replicationGroupMemberRole, List<String> replicationGroupMembers, com.atom.orchestrator.model.ReplicationGroupPrimaryInstanceKey replicationGroupPrimaryInstanceKey) {
        this.key = key;
        this.instanceAlias = instanceAlias;
        this.uptime = uptime;
        this.serverID = serverID;
        this.serverUUID = serverUUID;
        this.version = version;
        this.versionComment = versionComment;
        this.flavorName = flavorName;
        this.readOnly = readOnly;
        this.binlogFormat = binlogFormat;
        this.binlogRowImage = binlogRowImage;
        this.logBinEnabled = logBinEnabled;
        this.logSlaveUpdatesEnabled = logSlaveUpdatesEnabled;
        this.logReplicationUpdatesEnabled = logReplicationUpdatesEnabled;
        this.selfBinlogCoordinates = selfBinlogCoordinates;
        this.masterKey = masterKey;
        this.masterUUID = masterUUID;
        this.ancestryUUID = ancestryUUID;
        this.isDetachedMaster = isDetachedMaster;
        slaveSQLRunning = slave_SQL_Running;
        this.replicationSQLThreadRunning = replicationSQLThreadRunning;
        slaveIORunning = slave_IO_Running;
        this.replicationIOThreadRunning = replicationIOThreadRuning;
        this.replicationSQLThreadState = replicationSQLThreadState;
        this.replicationIOThreadState = replicationIOThreadState;
        this.hasReplicationFilters = hasReplicationFilters;
        this.gtidMode = GTIDMode;
        this.supportsOracleGTID = supportsOracleGTID;
        this.usingOracleGTID = usingOracleGTID;
        this.usingMariaDBGTID = usingMariaDBGTID;
        this.usingPseudoGTID = usingPseudoGTID;
        this.readBinlogCoordinates = readBinlogCoordinates;
        this.execBinlogCoordinates = execBinlogCoordinates;
        this.isDetached = isDetached;
        this.relaylogCoordinates = relaylogCoordinates;
        LastSQLError = lastSQLError;
        this.lastIOError = lastIOError;
        this.secondsBehindMaster = secondsBehindMaster;
        this.sqlDelay = SQLDelay;
        this.executedGtidSet = executedGtidSet;
        this.gtidPurged = gtidPurged;
        this.gtidErrant = gtidErrant;
        this.slaveLagSeconds = slaveLagSeconds;
        this.replicationLagSeconds = replicationLagSeconds;
        this.slaveHosts = slaveHosts;
        this.replicas = replicas;
        this.clusterName = clusterName;
        this.suggestedClusterAlias = suggestedClusterAlias;
        this.dataCenter = dataCenter;
        this.region = region;
        this.physicalEnvironment = physicalEnvironment;
        this.replicationDepth = replicationDepth;
        this.isCoMaster = isCoMaster;
        this.hasReplicationCredentials = hasReplicationCredentials;
        this.replicationCredentialsAvailable = replicationCredentialsAvailable;
        this.semiSyncAvailable = semiSyncAvailable;
        this.semiSyncPriority = semiSyncPriority;
        this.semiSyncMasterEnabled = semiSyncMasterEnabled;
        this.semiSyncReplicaEnabled = semiSyncReplicaEnabled;
        this.semiSyncMasterTimeout = semiSyncMasterTimeout;
        this.semiSyncMasterWaitForReplicaCount = semiSyncMasterWaitForReplicaCount;
        this.semiSyncMasterStatus = semiSyncMasterStatus;
        this.semiSyncMasterClients = semiSyncMasterClients;
        this.semiSyncReplicaStatus = semiSyncReplicaStatus;
        this.lastSeenTimestamp = lastSeenTimestamp;
        this.isLastCheckValid = isLastCheckValid;
        this.isUpToDate = isUpToDate;
        this.isRecentlyChecked = isRecentlyChecked;
        this.secondsSinceLastSeen = secondsSinceLastSeen;
        this.countMySQLSnapshots = countMySQLSnapshots;
        this.isCandidate = isCandidate;
        this.promotionRule = promotionRule;
        this.isDowntimed = isDowntimed;
        this.downtimeReason = downtimeReason;
        this.downtimeOwner = downtimeOwner;
        this.downtimeEndTimestamp = downtimeEndTimestamp;
        this.elapsedDowntime = elapsedDowntime;
        this.unresolvedHostname = unresolvedHostname;
        this.allowTLS = allowTLS;
        this.problems = problems;
        this.lastDiscoveryLatency = lastDiscoveryLatency;
        this.replicationGroupName = replicationGroupName;
        this.replicationGroupIsSinglePrimary = replicationGroupIsSinglePrimary;
        this.replicationGroupMemberState = replicationGroupMemberState;
        this.replicationGroupMemberRole = replicationGroupMemberRole;
        this.replicationGroupMembers = replicationGroupMembers;
        this.replicationGroupPrimaryInstanceKey = replicationGroupPrimaryInstanceKey;
    }

    @Override
    public String toString() {
        return "MysqlInstanceInfo{" +
                "Key=" + key +
                ", InstanceAlias='" + instanceAlias + '\'' +
                ", Uptime=" + uptime +
                ", ServerID=" + serverID +
                ", ServerUUID='" + serverUUID + '\'' +
                ", Version='" + version + '\'' +
                ", VersionComment='" + versionComment + '\'' +
                ", FlavorName='" + flavorName + '\'' +
                ", ReadOnly=" + readOnly +
                ", Binlog_format='" + binlogFormat + '\'' +
                ", BinlogRowImage='" + binlogRowImage + '\'' +
                ", LogBinEnabled=" + logBinEnabled +
                ", LogSlaveUpdatesEnabled=" + logSlaveUpdatesEnabled +
                ", LogReplicationUpdatesEnabled=" + logReplicationUpdatesEnabled +
                ", SelfBinlogCoordinates=" + selfBinlogCoordinates +
                ", MasterKey=" + masterKey +
                ", MasterUUID='" + masterUUID + '\'' +
                ", AncestryUUID='" + ancestryUUID + '\'' +
                ", IsDetachedMaster=" + isDetachedMaster +
                ", Slave_SQL_Running=" + slaveSQLRunning +
                ", ReplicationSQLThreadRuning=" + replicationSQLThreadRunning +
                ", Slave_IO_Running=" + slaveIORunning +
                ", ReplicationIOThreadRuning=" + replicationIOThreadRunning +
                ", ReplicationSQLThreadState=" + replicationSQLThreadState +
                ", ReplicationIOThreadState=" + replicationIOThreadState +
                ", HasReplicationFilters=" + hasReplicationFilters +
                ", GTIDMode='" + gtidMode + '\'' +
                ", SupportsOracleGTID=" + supportsOracleGTID +
                ", UsingOracleGTID=" + usingOracleGTID +
                ", UsingMariaDBGTID=" + usingMariaDBGTID +
                ", UsingPseudoGTID=" + usingPseudoGTID +
                ", ReadBinlogCoordinates=" + readBinlogCoordinates +
                ", ExecBinlogCoordinates=" + execBinlogCoordinates +
                ", IsDetached=" + isDetached +
                ", RelaylogCoordinates=" + relaylogCoordinates +
                ", LastSQLError='" + LastSQLError + '\'' +
                ", LastIOError='" + lastIOError + '\'' +
                ", SecondsBehindMaster=" + secondsBehindMaster +
                ", SQLDelay=" + sqlDelay +
                ", ExecutedGtidSet='" + executedGtidSet + '\'' +
                ", GtidPurged='" + gtidPurged + '\'' +
                ", GtidErrant='" + gtidErrant + '\'' +
                ", SlaveLagSeconds=" + slaveLagSeconds +
                ", ReplicationLagSeconds=" + replicationLagSeconds +
                ", SlaveHosts=" + slaveHosts +
                ", Replicas=" + replicas +
                ", ClusterName='" + clusterName + '\'' +
                ", SuggestedClusterAlias='" + suggestedClusterAlias + '\'' +
                ", DataCenter='" + dataCenter + '\'' +
                ", Region='" + region + '\'' +
                ", PhysicalEnvironment='" + physicalEnvironment + '\'' +
                ", ReplicationDepth=" + replicationDepth +
                ", IsCoMaster=" + isCoMaster +
                ", HasReplicationCredentials=" + hasReplicationCredentials +
                ", ReplicationCredentialsAvailable=" + replicationCredentialsAvailable +
                ", SemiSyncAvailable=" + semiSyncAvailable +
                ", SemiSyncPriority=" + semiSyncPriority +
                ", SemiSyncMasterEnabled=" + semiSyncMasterEnabled +
                ", SemiSyncReplicaEnabled=" + semiSyncReplicaEnabled +
                ", SemiSyncMasterTimeout=" + semiSyncMasterTimeout +
                ", SemiSyncMasterWaitForReplicaCount=" + semiSyncMasterWaitForReplicaCount +
                ", SemiSyncMasterStatus=" + semiSyncMasterStatus +
                ", SemiSyncMasterClients=" + semiSyncMasterClients +
                ", SemiSyncReplicaStatus=" + semiSyncReplicaStatus +
                ", LastSeenTimestamp=" + lastSeenTimestamp +
                ", IsLastCheckValid=" + isLastCheckValid +
                ", IsUpToDate=" + isUpToDate +
                ", IsRecentlyChecked=" + isRecentlyChecked +
                ", SecondsSinceLastSeen=" + secondsSinceLastSeen +
                ", CountMySQLSnapshots=" + countMySQLSnapshots +
                ", IsCandidate=" + isCandidate +
                ", PromotionRule='" + promotionRule + '\'' +
                ", IsDowntimed=" + isDowntimed +
                ", DowntimeReason='" + downtimeReason + '\'' +
                ", DowntimeOwner='" + downtimeOwner + '\'' +
                ", DowntimeEndTimestamp='" + downtimeEndTimestamp + '\'' +
                ", ElapsedDowntime=" + elapsedDowntime +
                ", UnresolvedHostname='" + unresolvedHostname + '\'' +
                ", AllowTLS=" + allowTLS +
                ", Problems=" + problems +
                ", LastDiscoveryLatency=" + lastDiscoveryLatency +
                ", ReplicationGroupName='" + replicationGroupName + '\'' +
                ", ReplicationGroupIsSinglePrimary=" + replicationGroupIsSinglePrimary +
                ", ReplicationGroupMemberState='" + replicationGroupMemberState + '\'' +
                ", ReplicationGroupMemberRole='" + replicationGroupMemberRole + '\'' +
                ", ReplicationGroupMembers=" + replicationGroupMembers +
                ", ReplicationGroupPrimaryInstanceKey=" + replicationGroupPrimaryInstanceKey +
                '}';
    }
}
