package com.cronjoe.modtest.blocks;

import com.cronjoe.modtest.reference.BlockNames;
import net.minecraft.block.material.Material;

public class DirtBlock extends BlockEE {

    public DirtBlock()
    {
        super(Material.ground);
        this.setHardness(2.5f);
        this.setBlockName(BlockNames.FIRST_BLOCK);
    }

}
