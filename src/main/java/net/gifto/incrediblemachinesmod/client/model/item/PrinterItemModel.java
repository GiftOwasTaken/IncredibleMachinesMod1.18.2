package net.gifto.incrediblemachinesmod.client.model.item;

import net.gifto.incrediblemachinesmod.IncredibleMachinesMod;
import net.gifto.incrediblemachinesmod.block.tile.PrinterTileEntity;
import net.gifto.incrediblemachinesmod.item.PrinterItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PrinterItemModel extends AnimatedGeoModel<PrinterItem> {
    @Override
    public ResourceLocation getAnimationFileLocation(PrinterItem animatable) {
        return new ResourceLocation(IncredibleMachinesMod.MOD_ID, "animations/printer.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(PrinterItem object) {
        return new ResourceLocation(IncredibleMachinesMod.MOD_ID, "geo/printer.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PrinterItem object) {
        return new ResourceLocation(IncredibleMachinesMod.MOD_ID + ":textures/block/printer.png");
    }
}