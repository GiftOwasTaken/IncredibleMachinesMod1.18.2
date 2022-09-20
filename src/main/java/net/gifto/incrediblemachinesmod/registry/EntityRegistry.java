package net.gifto.incrediblemachinesmod.registry;

import net.gifto.incrediblemachinesmod.IncredibleMachinesMod;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import software.bernie.geckolib3.GeckoLib;

public class EntityRegistry {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			IncredibleMachinesMod.MOD_ID);

	public static <T extends Entity> RegistryObject<EntityType<T>> buildEntity(EntityType.EntityFactory<T> entity,
			Class<T> entityClass, float width, float height) {
		String name = entityClass.getSimpleName().toLowerCase();
		return ENTITIES.register(name,
				() -> EntityType.Builder.of(entity, MobCategory.CREATURE).sized(width, height).build(name));
	}

	public static void register(IEventBus eventBus) {
		ENTITIES.register(eventBus);
	}
}
