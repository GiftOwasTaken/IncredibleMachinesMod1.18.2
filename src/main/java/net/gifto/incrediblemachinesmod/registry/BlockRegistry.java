package net.gifto.incrediblemachinesmod.registry;

import net.gifto.incrediblemachinesmod.IncredibleMachinesMod;
import net.gifto.incrediblemachinesmod.block.PrinterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, IncredibleMachinesMod.MOD_ID);

	public static final RegistryObject<PrinterBlock> PRINTER_BLOCK = BLOCKS.register("printer_block",
					PrinterBlock::new);



	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}