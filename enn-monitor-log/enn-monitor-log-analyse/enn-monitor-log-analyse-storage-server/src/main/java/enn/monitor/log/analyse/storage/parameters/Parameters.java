package enn.monitor.log.analyse.storage.parameters;

import com.beust.jcommander.Parameter;

/** Command line parameters for Config Pusher. */
public class Parameters {

    @Parameter(
        names = {"-h", "--help"},
        description = "print help message",
        required = false
    )
    public boolean help = false;
    
    @Parameter(
        names = "--workThreadNum",
        description = "work thread num",
        required = false
    )
    public int workThreadNum = 16;

    @Parameter(
    	names = "--listen_port",
        description = "Listen port of OpenTSDB",
        required = false
    )
    public int listenPort = 10000;

    @Parameter(
    	names = "--mongoUrl",
        description = "mongo url",
        required = false
    )
    public String mongoUrl = "mongodb://10.19.248.200:32017/EnnMonitorLogAnalyseStorage";
    
    @Parameter(
    	names = "--dbName",
        description = "database name",
        required = false
    )
    public String dbName = "EnnMonitorLogAnalyseStorage";
    
}
