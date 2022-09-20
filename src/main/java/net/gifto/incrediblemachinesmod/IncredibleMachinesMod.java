package net.gifto.incrediblemachinesmod;

import net.gifto.incrediblemachinesmod.registry.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

@Mod(IncredibleMachinesMod.MOD_ID)
public class IncredibleMachinesMod {
    public static final String MOD_ID = "incrediblemachinesmod";

    public IncredibleMachinesMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GeckoLib.initialize();
        ItemRegistry.register(eventBus);
        BlockRegistry.register(eventBus);
        TileRegistry.register(eventBus);
        EntityRegistry.register(eventBus);
        SoundRegistry.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}