package net.ljgram.lumpypegimus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ljgram.lumpypegimus.LumpyPegimus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item GRUB_MEAL = registerItem("grub_meal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
     public static final Item COOKED_GRUBS = registerItem("cooked_grubs",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LumpyPegimus.MOD_ID, name), item);
    }

    public static void registerModItems(){
        LumpyPegimus.LOGGER.debug("Registering Mod Items for " + LumpyPegimus.MOD_ID);
    }
}
