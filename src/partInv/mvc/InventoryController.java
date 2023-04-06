package partInv.mvc;


import partInv.Inventory;

import java.util.List;

public class InventoryController {

    private InventoryViewEdit viewEdit;
    private InventoryView view;
    private InventoryViewFull viewFull;
    private InventoryViewIndividual viewIndividual;
    private RecentLogModel recLogModel;
    private List<String> invList;

    public InventoryController(InventoryViewEdit viewEdit, InventoryView view, InventoryViewFull viewFull, InventoryViewIndividual viewIndividual, RecentLogModel recLogModel,
                               Inventory inv, List<String> invList) {
        this.viewEdit = viewEdit;
        this.view = view;
        this.viewFull = viewFull;
        this.viewIndividual = viewIndividual;
        this.recLogModel = recLogModel;
        this.invList = invList;


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

        viewEdit.invFormEdit().getInfoArea().setText(inv.getFirst());

        viewEdit.invFormEdit().getConfirmChange().addActionListener(a -> {
            inv.editPartHashMap(viewEdit.invFormEdit().getInfoToChangeTextField(), viewEdit.invFormEdit().getDesiredChange(), );
        });
    }
}
