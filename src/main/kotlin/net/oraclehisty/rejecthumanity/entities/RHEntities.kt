package net.oraclehisty.rejecthumanity.entities

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.MobCategory
import net.minecraft.world.item.Item
import net.oraclehisty.rejecthumanity.helpers.SingletonRegister
import net.oraclehisty.rejecthumanity.items.RHItems.create

object RHEntities: SingletonRegister<EntityType<*>>(BuiltInRegistries.ENTITY_TYPE) {
    val GENERIC_ENTITY = create("generic_entity", ::RHGenericEntity, MobCategory.CREATURE) {

    }

    fun <E : Entity> create(
        id: String,
        factory: EntityType.EntityFactory<E>,
        category: MobCategory,
        block: EntityType.Builder<E>.() -> Unit,
    ): EntityType<E> = create(id) {
        EntityType.Builder.of(factory, category).also(block).build(id)
    }
}