package net.oraclehisty.rejecthumanity.items

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.oraclehisty.rejecthumanity.RejectHumanity.bus
import net.oraclehisty.rejecthumanity.helpers.SingletonRegister

object RHItems: SingletonRegister<Item>(BuiltInRegistries.ITEM) {
    val GENERIC by create("generic") {
        Item(Item.Properties())
    }
}