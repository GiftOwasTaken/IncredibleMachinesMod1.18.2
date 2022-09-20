package net.gifto.incrediblemachinesmod.registry;

import jdk.jfr.FlightRecorder;
import net.gifto.incrediblemachinesmod.IncredibleMachinesMod;
import net.gifto.incrediblemachinesmod.block.tile.PrinterTileEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TileRegistry {
	public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister
			.create(ForgeRegistries.BLOCK_ENTITIES, IncredibleMachinesMod.MOD_ID);

	public static final RegistryObject<BlockEntityType<PrinterTileEntity>> PRINTER_TILE =
			TILES.register("printer_block", () ->
					BlockEntityType.Builder.of(PrinterTileEntity::new,
							BlockRegistry.PRINTER_BLOCK.get()).build(null));

	public static void register(IEventBus eventBus) {TILES.register(eventBus);}
}

