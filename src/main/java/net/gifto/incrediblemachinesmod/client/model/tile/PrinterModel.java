package net.gifto.incrediblemachinesmod.client.model.tile;

import net.gifto.incrediblemachinesmod.IncredibleMachinesMod;
import net.gifto.incrediblemachinesmod.block.tile.PrinterTileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PrinterModel extends AnimatedGeoModel<PrinterTileEntity> {
    @Override
    public ResourceLocation getAnimationFileLocation(PrinterTileEntity animatable) {
        return new ResourceLocation(IncredibleMachinesMod.MOD_ID, "animations/printer.animation.json");
    }

    @Override
    public ResourceLocation getModelLocation(PrinterTileEntity animatable) {
        return new ResourceLocation(IncredibleMachinesMod.MOD_ID, "geo/printer.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PrinterTileEntity entity) {
        return new ResourceLocation(IncredibleMachinesMod.MOD_ID + ":textures/block/printer.png");
    }
}