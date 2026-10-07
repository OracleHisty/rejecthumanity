package net.oraclehisty.rejecthumanity.client

import net.minecraft.client.renderer.entity.EntityRendererProvider
import net.oraclehisty.rejecthumanity.entities.RHGenericEntity
import net.oraclehisty.rejecthumanity.helpers.id
import software.bernie.geckolib.model.DefaultedEntityGeoModel
import software.bernie.geckolib.model.DefaultedGeoModel
import software.bernie.geckolib.renderer.GeoEntityRenderer

class RHGenericEntityRenderer(context: EntityRendererProvider.Context) : GeoEntityRenderer<RHGenericEntity>(context,
    DefaultedEntityGeoModel<RHGenericEntity>("genericelf".id())
) {

}