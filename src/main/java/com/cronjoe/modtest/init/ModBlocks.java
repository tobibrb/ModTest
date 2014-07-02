package com.cronjoe.modtest.init;

import com.cronjoe.modtest.blocks.BlockEE;
import com.cronjoe.modtest.blocks.DirtBlock;
import com.cronjoe.modtest.reference.BlockNames;
import com.cronjoe.modtest.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockEE firstBlock = new DirtBlock();

    public static void init()
    {
        GameRegistry.registerBlock(firstBlock, BlockNames.FIRST_BLOCK);
    }
}
