package net.oraclehisty.rejecthumanity.helpers

import net.minecraft.resources.ResourceLocation
import net.minecraft.resources.ResourceLocation.fromNamespaceAndPath
import net.oraclehisty.rejecthumanity.RejectHumanity

fun String.id() = fromNamespaceAndPath(RejectHumanity.ID, this)
