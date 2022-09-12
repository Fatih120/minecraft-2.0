package mof.minecraft2.client.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mof.minecraft2.entities.EntityBabyCreeper;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderBabyCreeper extends RenderLiving
{
    private static final ResourceLocation TEXTURE = new ResourceLocation("minecraft2", "textures/entities/baby_creeper.png");
    protected ResourceLocation BabyCreeperTexture;
    public RenderBabyCreeper(ModelBase par1ModelBase, float parShadowSize) //RenderManager renderManagerIn)
    {
        //super(new ModelBabyCreeper(), 0.5F);
        super(par1ModelBase, parShadowSize);
        setEntityTexture();
        //this.addLayer(new LayerCreeperCharge(this));
    }

    protected void preRenderCallback(Entity entitylivingbaseIn, float partialTickTime)
    {
        float f = ((EntityBabyCreeper)entitylivingbaseIn).getCreeperFlashIntensity(partialTickTime);
        float f1 = 1.0F + MathHelper.sin(f * 100.0F) * f * 0.01F;
        f = MathHelper.clamp_float(f, 0.0F, 1.0F);
        f = f * f;
        f = f * f;
        float f2 = (1.0F + f * 0.4F) * f1;
        float f3 = (1.0F + f * 0.1F) / f1;
        GL11.glScalef(f2, f3, f2);
    }

    protected int getColorMultiplier(Entity entitylivingbaseIn, float lightBrightness, float partialTickTime)
    {
        float f = ((EntityBabyCreeper)entitylivingbaseIn).getCreeperFlashIntensity(partialTickTime);

        if ((int)(f * 10.0F) % 2 == 0)
        {
            return 0;
        }
        else
        {
            int i = (int)(f * 0.2F * 255.0F);
            i = MathHelper.clamp_int(i, 0, 255);
            return i << 24 | 822083583;
        }
    }

    protected void setEntityTexture()
    {
        BabyCreeperTexture = new ResourceLocation("minecraft2:textures/entities/BabyCreeper.png");

    }


    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return TEXTURE;
    }
}