package net.oraclehisty.rejecthumanity.client

import net.minecraft.resources.ResourceLocation
import net.oraclehisty.rejecthumanity.entities.RHGenericEntity
import software.bernie.geckolib.model.DefaultedEntityGeoModel
import software.bernie.geckolib.model.DefaultedGeoModel
import software.bernie.geckolib.model.GeoModel

class RHGeoEntityModel(assetSubpath: ResourceLocation) : DefaultedEntityGeoModel<RHGenericEntity>(assetSubpath) {
    override fun subtype(): String? {
        TODO("Not yet implemented")
    }
}