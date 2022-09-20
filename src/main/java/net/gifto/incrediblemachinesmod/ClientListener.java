package net.gifto.incrediblemachinesmod;

import net.gifto.incrediblemachinesmod.client.renderer.tile.PrinterTileRenderer;
import net.gifto.incrediblemachinesmod.registry.TileRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = IncredibleMachinesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener {

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(TileRegistry.PRINTER_TILE.get(), PrinterTileRenderer::new);
    }
}
