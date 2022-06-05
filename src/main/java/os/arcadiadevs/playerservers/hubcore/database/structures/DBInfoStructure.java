package os.arcadiadevs.playerservers.hubcore.database.structures;

import lombok.Getter;

@Getter
public class DBInfoStructure {

    private final String UUID;
    private final String serverId;
    private final String serverName;
    private final String playerName;
    private final String node;

    private final int port;

    public DBInfoStructure(String UUID, String ServerID, int Port, String ServerName, String PlayerName, String node) {
        this.UUID = UUID;
        this.serverId = ServerID;
        this.port = Port;
        this.serverName = ServerName;
        this.playerName = PlayerName;
        this.node = node;
    }

}
