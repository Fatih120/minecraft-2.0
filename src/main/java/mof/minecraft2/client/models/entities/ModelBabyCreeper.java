package mof.minecraft2.client.models.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBabyCreeper extends ModelBase {
	
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	
	public ModelBabyCreeper() {
		
		this.textureWidth = 64;
		this.textureHeight = 32;
		
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-4.0F, 2.0F, -4.0F, 8, 8, 8);
		this.head.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotationPoint(this.head, 0.0F, 0.0F, 0.0F);
		
		this.body = new ModelRenderer(this, 16, 16);
		this.body.addBox(-4.0F, 10.0F, -2.0F, 8, 6, 4);
		this.body.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotationPoint(this.body, 0.0F, 0.0F, 0.0F);
		
		this.leg1 = new ModelRenderer(this, 0, 16);
		this.leg1.addBox(-2.0F, 4.0F, -2.0F, 4, 4, 4);
		this.leg1.setRotationPoint(-2.0F, 20.0F, 2.0F);
		this.leg1.setTextureSize(64, 32);
		this.leg1.mirror = true;
		this.setRotationPoint(this.leg1, 0.0F, 0.0F, 0.0F);
		
		this.leg2 = new ModelRenderer(this, 0, 16);
		this.leg2.addBox(-2.0F, 4.0F, -2.0F, 4, 4, 4);
		this.leg2.setRotationPoint(2.0F, 20.0F, 2.0F);
		this.leg2.setTextureSize(64, 32);
		this.leg2.mirror = true;
		this.setRotationPoint(this.leg2, 0.0F, 0.0F, 0.0F);
		
		this.leg3 = new ModelRenderer(this, 0, 16);
		this.leg3.addBox(-2.0F, 4.0F, -2.0F, 4, 4, 4);
		this.leg3.setRotationPoint(-2.0F, 20.0F, -2.0F);
		this.leg3.setTextureSize(64, 32);
		this.leg3.mirror = true;
		this.setRotationPoint(this.leg3, 0.0F, 0.0F, 0.0F);
		
		this.leg4 = new ModelRenderer(this, 0, 16);
		this.leg4.addBox(-2.0F, 4.0F, -2.0F, 4, 4, 4);
		this.leg4.setRotationPoint(2.0F, 20.0F, -2.0F);
		this.leg4.setTextureSize(64, 32);
		this.leg4.mirror = true;
		this.setRotationPoint(this.leg4, 0.0F, 0.0F, 0.0F);
		
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.head.render(f5);
		this.body.render(f5);
		this.leg1.render(f5);
		this.leg2.render(f5);
		this.leg3.render(f5);
		this.leg4.render(f5);	
	}

	private void setRotationPoint(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void setRotationAngles(float f1, float f2, float f3, float f4, float f5, float f6, Entity f7E)
	{
		this.head.rotateAngleY = f4 / 57.29578F;
		this.head.rotateAngleX = f5 / 57.29578F;
		this.leg1.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 1.4F * f2;
		this.leg2.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float) Math.PI) * 1.4F * f2;
		this.leg3.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float) Math.PI) * 1.4F * f2;
		this.leg4.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 1.4F * f2;
	}

}
