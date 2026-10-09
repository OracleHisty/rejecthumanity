package net.oraclehisty.rejecthumanity.entities

import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.EquipmentSlot
import net.minecraft.world.entity.HumanoidArm
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.item.ItemStack
import software.bernie.geckolib.animatable.GeoEntity
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache
import software.bernie.geckolib.animation.AnimatableManager
import software.bernie.geckolib.util.GeckoLibUtil

class RHGenericEntity(entityType: EntityType<out RHGenericEntity> = RHEntities.GENERIC_ENTITY, level: net.minecraft.world.level.Level): LivingEntity(
    entityType, level), GeoEntity {
    val geoCache =  GeckoLibUtil.createInstanceCache(this)

    override fun getArmorSlots(): Iterable<ItemStack> = emptyList() //remind me to use listOf instead later.

    override fun getItemBySlot(slot: EquipmentSlot): ItemStack = ItemStack.EMPTY

    override fun setItemSlot(
        slot: EquipmentSlot,
        stack: ItemStack
    ) {}

    override fun getMainArm(): HumanoidArm = HumanoidArm.RIGHT

    override fun registerControllers(registrar: AnimatableManager.ControllerRegistrar) {}

    override fun getAnimatableInstanceCache(): AnimatableInstanceCache = geoCache

}