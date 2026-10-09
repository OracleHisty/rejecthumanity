package net.oraclehisty.rejecthumanity.client

import net.neoforged.api.distmarker.Dist.CLIENT
import net.neoforged.fml.common.Mod
import net.neoforged.neoforge.client.event.EntityRenderersEvent
import net.neoforged.neoforge.common.NeoForge
import net.oraclehisty.rejecthumanity.RejectHumanity
import net.oraclehisty.rejecthumanity.entities.RHEntities
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

@Mod(RejectHumanity.ID, dist = [CLIENT])
object RHClient {
    init {
        MOD_BUS.addListener(::registerEntityRenderers)
    }
    fun registerEntityRenderers(event: EntityRenderersEvent.RegisterRenderers) {
        event.registerEntityRenderer(RHEntities.GENERIC_ENTITY, ::RHGenericEntityRenderer)
    }
}