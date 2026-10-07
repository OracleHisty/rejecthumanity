package net.oraclehisty.rejecthumanity.helpers

import net.minecraft.core.Registry
import net.neoforged.neoforge.registries.DeferredRegister
import net.oraclehisty.rejecthumanity.RejectHumanity
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

open class SingletonRegister<T>(registry: Registry<T>) {
    val deferredRegister = DeferredRegister.create<T>(registry, RejectHumanity.ID).apply { register(MOD_BUS) }

    fun <C:T>create(name: String, supplier: () -> C): C {
        val value = deferredRegister.register(name, supplier)
        val realvalue:C by lazy { value.value() }
        return realvalue
    }

    fun register(){}
}