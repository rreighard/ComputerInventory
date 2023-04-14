package partInv.mvc;


import partInv.Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryController {

    private InventoryViewEdit viewEdit;
    private InventoryView view;
    private InventoryViewFull viewFull;
    private InventoryViewIndividual viewIndividual;
    private RecentLogModel recLogModel;
    private List<String> invList;
    private String curKey;
    private int num;

    public InventoryController(InventoryViewEdit viewEdit, InventoryView view, InventoryViewFull viewFull, InventoryViewIndividual viewIndividual, RecentLogModel recLogModel,
                               Inventory inv, String curKey, List<String> invList) {
        this.viewEdit = viewEdit;
        this.view = view;
        this.viewFull = viewFull;
        this.viewIndividual = viewIndividual;
        this.recLogModel = recLogModel;
        this.invList = invList;
        this.curKey = curKey;
        this.num = num;

        recLogModel.setRecLogs(inv);
        view.invForm().getLogArea().setText(recLogModel.getRecLogs());

        view.invForm().getEditBtn().addActionListener(a -> {
            view.setVisible(false);
            viewEdit.setVisible(true);
        });

        view.invForm().getViewFullBtn().addActionListener(a -> {
            view.setVisible(false);
            viewFull.setVisible(true);
        });

        view.invForm().getViewIndividualBtn().addActionListener(a -> {
            view.setVisible(false);
            viewIndividual.setVisible(true);
        });

        viewEdit.invFormEdit().getInfoArea().setText(inv.display(curKey));

        viewEdit.invFormEdit().getConfirmChange().addActionListener(a -> {
            inv.editPartHashMap(viewEdit.invFormEdit().getInfoToChangeTextField().getText(), viewEdit.invFormEdit().getDesiredChange().getText(), curKey);
            viewEdit.invFormEdit().getInfoArea().setText(inv.display(curKey));
        });

        viewEdit.invFormEdit().getNextBtn().addActionListener(a -> {
            num = (invList.indexOf(this.curKey) + 1) % invList.size();
            this.curKey = invList.get(num);
            viewEdit.invFormEdit().parseInvEditForm(inv, invList.get(num));
        });

        viewEdit.invFormEdit().getPrevBtn().addActionListener(a -> {
            num = (invList.indexOf(this.curKey) - 1) < 0 ? invList.size() -1 : this.num -1;
            this.curKey = invList.get(num);
            viewEdit.invFormEdit().parseInvEditForm(inv, invList.get(num));
        });

        viewEdit.invFormEdit().getQuitBtn().addActionListener(a -> {
            System.exit(0);
        });

        viewEdit.invFormEdit().getMainPage().addActionListener(a -> {
            viewEdit.setVisible(false);
            view.setVisible(true);
        });

        viewEdit.invFormEdit().getViewFull().addActionListener(a -> {
            viewEdit.setVisible(false);
            viewFull.setVisible(true);
        });

        viewEdit.invFormEdit().getViewIndividual().addActionListener(a -> {
            viewEdit.setVisible(false);
            viewIndividual.setVisible(true);
        });

        viewIndividual.invFormIndividual().getPartInfo().setText(inv.display(curKey));

        viewIndividual.invFormIndividual().getNextBtnInd().addActionListener(a -> {
            num = (invList.indexOf(this.curKey) + 1) % invList.size();
            this.curKey = invList.get(num);
            viewEdit.invFormEdit().parseInvEditForm(inv, invList.get(num));
        });

        viewIndividual.invFormIndividual().getPrevBtnInd().addActionListener(a -> {
            num = (invList.indexOf(this.curKey) - 1) < 0 ? invList.size() -1 : this.num - 1;
            this.curKey = invList.get(num);
            viewIndividual.invFormIndividual().parseInvIndForm(inv, invList.get(num));
        });

        viewIndividual.invFormIndividual().getQuitBtnInd().addActionListener(a -> {
            System.exit(0);
        });

        viewIndividual.invFormIndividual().getMainPage().addActionListener(a -> {
            viewIndividual.setVisible(false);
            view.setVisible(true);
        });

        viewIndividual.invFormIndividual().getEditPage().addActionListener(a -> {
            viewIndividual.setVisible(false);
            viewEdit.setVisible(true);
        });

        viewIndividual.invFormIndividual().getViewFull().addActionListener(a -> {
            viewIndividual.setVisible(false);
            viewFull.setVisible(true);
        });

        viewFull.invFormFull().getApplyFilterBtn().addActionListener(a -> {
            List<String> info = new ArrayList<String>();

            if(viewFull.invFormFull().getCaseFilterBtn().isSelected()){
                info.add("Case");
            }
            if(viewFull.invFormFull().getCpuFilterBtn().isSelected()){
                info.add("CPU");
            }
            if(viewFull.invFormFull().getGpuFilterBtn().isSelected()){
                info.add("GPU");
            }
            if(viewFull.invFormFull().getMotherboardFilterBtn().isSelected()){
                info.add("Motherboard");
            }
            if(viewFull.invFormFull().getRamFilterBtn().isSelected()){
                info.add("Ram");
            }
            if(viewFull.invFormFull().getFanFilterBtn().isSelected()){
                info.add("Fan");
            }
            if(viewFull.invFormFull().getPowerSupplyFilterBtn().isSelected()){
                info.add("Power Supply");
            }
            String temp = "";
            if(!info.isEmpty()) {
                for (String x : invList) {
                    for (int y = 0; y < info.size(); y++) {
                        if (x.contains(info.get(y))) {
                            temp += inv.display(x) + "\n";
                        }
                    }
                }
            }
            else{
                for(String k : invList){
                    temp += inv.display(k) +"\n";
                }
            }

            viewFull.invFormFull().getInfoTextArea().setText(temp);
        });

        viewFull.invFormFull().getMainPageBtn().addActionListener(a -> {
            viewFull.setVisible(false);
            view.setVisible(true);
        });

        viewFull.invFormFull().getEditPageBtn().addActionListener(a -> {
            viewFull.setVisible(false);
            viewEdit.setVisible(true);
        });

        viewFull.invFormFull().getViewIndividualBtn().addActionListener(a -> {
            viewFull.setVisible(false);
            viewIndividual.setVisible(true);
        });
    }

    public int getCurrentKey(){
        return num;
    }
}
