package net.oraclehisty.rejecthumanity.helpers

import net.minecraft.core.Holder
import net.minecraft.resources.ResourceLocation
import net.minecraft.resources.ResourceLocation.fromNamespaceAndPath
import net.oraclehisty.rejecthumanity.RejectHumanity

fun String.id() = fromNamespaceAndPath(RejectHumanity.ID, this)
fun <T> Holder<out T>.lazyValue(): Lazy<T> = lazy(this::value)
