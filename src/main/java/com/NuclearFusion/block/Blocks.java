package com.NuclearFusion.block;

import com.NuclearFusion.block.crop.Belladonna;
import com.NuclearFusion.block.crop.Chilipepper;
import com.NuclearFusion.block.crop.Datura;
import com.NuclearFusion.block.crop.Skyfaery;
import com.NuclearFusion.naturalistia;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, naturalistia.MOD_ID);

    public static final RegistryObject<Block> crucible_made_of_plants = BLOCKS.register("crucible_made_of_plants", CrucibleMadeOfPlants::new);
    //作物
    public static final RegistryObject<Block> belladonna = BLOCKS.register("belladonna", Belladonna::new);
    public static final RegistryObject<Block> chilipepper = BLOCKS.register("chilipepper", Chilipepper::new);
    public static final RegistryObject<Block> datura = BLOCKS.register("datura", Datura::new);
    public static final RegistryObject<Block> skyfaery = BLOCKS.register("skyfaery", Skyfaery::new);

    /**
     * 用于获取mod所注册的所有方块
     *
     * @return 已注册方块的数组
     */
    public static ArrayList<RegistryObject<Block>> getBlocks() {
        return new ArrayList<>(BLOCKS.getEntries());
    }

    /**
     * 方块构造方法
     */
    public static AbstractBlock.Properties defaultBuilder(Material material) {
        return AbstractBlock.Properties.create(material);
    }

    /**
     * 矿物构造方法
     */
    public static AbstractBlock.Properties defaultBuilder() {
        return AbstractBlock.Properties.create(Material.STRUCTURE_VOID)
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(3F);
    }
}
