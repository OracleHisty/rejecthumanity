package net.oraclehisty.rejecthumanity

import net.minecraft.world.entity.LivingEntity
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent
import net.neoforged.neoforge.common.NeoForge
import net.neoforged.neoforge.event.RegisterCommandsEvent
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent
import net.oraclehisty.rejecthumanity.entities.RHEntities
import net.oraclehisty.rejecthumanity.helpers.execute
import net.oraclehisty.rejecthumanity.helpers.literal
import net.oraclehisty.rejecthumanity.helpers.register
import net.oraclehisty.rejecthumanity.items.RHItems
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

@Mod(RejectHumanity.ID)
object RejectHumanity {
    const val ID = "rejecthumanity"
    val bus = MOD_BUS
    val LOGGER: Logger = LogManager.getLogger(ID)

    init {
        MOD_BUS.addListener(::onCommonSetup)
        NeoForge.EVENT_BUS.addListener<RegisterCommandsEvent> { event -> event.dispatcher.register("rh"){ literal("testCommand"){ execute { LOGGER.info("Test Command executed")
                    1 }
            }
        } }

        MOD_BUS.addListener<EntityAttributeCreationEvent> { event -> event.put(RHEntities.GENERIC_ENTITY, LivingEntity.createLivingAttributes().build())}

        RHItems.register()
    }

    private fun onCommonSetup(event: FMLCommonSetupEvent) {
        LOGGER.info("Reject humanity, NeoForge is Live! (Kotlin {})", KotlinVersion.CURRENT)
    }
}

