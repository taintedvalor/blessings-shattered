package blessing.blessing.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import blessing.blessing.Blessingsshattered;

public class ModItems {


    // blessing shard Item
    public static final Item blessing_shard = registerItem("blessing_shard", new Item(new FabricItemSettings().maxCount(16)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Blessingsshattered.MOD_ID, name), item);
    }

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(blessing_shard);
    }


    public static void registerModItems() {
        Blessingsshattered.LOGGER.info("Registering Mod Items for " + Blessingsshattered.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
