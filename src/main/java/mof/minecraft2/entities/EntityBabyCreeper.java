package mof.minecraft2.entities;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityBabyCreeper extends EntityCreeper
{
	
	private int explosionRadius = 0;
	
	public EntityBabyCreeper(World worldIn)
    {
        super(worldIn);
        this.setSize(0.6F, 1.3F);
        
        this.tasks.addTask(2, new AIBabyCreeper(this));
    }
	
	@Override
	public boolean getCanSpawnHere()
    {
		return this.rand.nextInt(150) == 0 && super.getCanSpawnHere();
    }
	public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);

        compound.setByte("ExplosionRadius", (byte)this.explosionRadius);
    }

    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);

        if (compound.hasKey("ExplosionRadius", 99))
        {
            this.explosionRadius = compound.getByte("ExplosionRadius");
        }
    }

}

