package partInv.mvc;

import partInv.Inventory;

public class RecentLogModel {
    private String recLogs;

    public RecentLogModel(String logs){
        recLogs = logs.isEmpty() ? "Default Value" : logs;
    }

    public String getRecLogs() { return recLogs; }

    public void setRecLogs(Inventory inv){

        recLogs = inv.logsToString();
    }
}
