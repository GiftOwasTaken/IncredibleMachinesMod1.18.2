package net.gifto.incrediblemachinesmod.registry;

import net.gifto.incrediblemachinesmod.IncredibleMachinesMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.geckolib3.GeckoLib;

public class SoundRegistry {
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
			IncredibleMachinesMod.MOD_ID);

	public static void register(IEventBus eventBus) {
		SOUNDS.register(eventBus);
	}
}
