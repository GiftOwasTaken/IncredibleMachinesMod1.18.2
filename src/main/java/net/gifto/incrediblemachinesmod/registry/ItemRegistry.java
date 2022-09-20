package net.gifto.incrediblemachinesmod.registry;

import net.gifto.incrediblemachinesmod.IncredibleMachinesMod;
import net.gifto.incrediblemachinesmod.item.PrinterItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, IncredibleMachinesMod.MOD_ID);

	public static final RegistryObject<Item> PRINTER_BLOCK_ITEM = ITEMS.register("printer_block",
			() -> new PrinterItem(BlockRegistry.PRINTER_BLOCK.get(),
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}