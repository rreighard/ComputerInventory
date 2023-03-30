package partInv.mvc;


import partInv.Inventory;

public class InventoryController {

    private InventoryViewEdit viewEdit;
    private InventoryView view;
    private InventoryViewFull viewFull;
    private InventoryViewIndividual viewIndividual;
    private RecentLogModel recLogModel;

    public InventoryController(InventoryViewEdit viewEdit, InventoryView view, InventoryViewFull viewFull, InventoryViewIndividual viewIndividual, RecentLogModel recLogModel,
                               Inventory inv) {
        this.viewEdit = viewEdit;
        this.view = view;
        this.viewFull = viewFull;
        this.viewIndividual = viewIndividual;
        this.recLogModel = recLogModel;


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

        viewEdit.invFormEdit().getInfoToChangeTextField().addActionListener(a -> {

        });
    }
}
