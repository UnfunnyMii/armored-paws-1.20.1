package com.unfunnymii.entity;

import com.unfunnymii.ArmadilloBackport;
import com.unfunnymii.entity.armadillo.ArmadilloEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<ArmadilloEntity> ARMADILLO = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(ArmadilloBackport.MOD_ID, "armadillo"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ArmadilloEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());



    public static void init() {
        ArmadilloBackport.LOGGER.info("Registering Entities for " + ArmadilloBackport.MOD_ID);
    }
}