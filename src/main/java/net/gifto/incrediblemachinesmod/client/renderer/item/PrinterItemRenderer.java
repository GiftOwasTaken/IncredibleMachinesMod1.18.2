package net.gifto.incrediblemachinesmod.client.renderer.item;

import net.gifto.incrediblemachinesmod.client.model.item.PrinterItemModel;
import net.gifto.incrediblemachinesmod.item.PrinterItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class PrinterItemRenderer extends GeoItemRenderer<PrinterItem> {
    public PrinterItemRenderer() {
        super(new PrinterItemModel());
    }
}