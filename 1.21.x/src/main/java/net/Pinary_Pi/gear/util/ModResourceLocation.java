package net.Pinary_Pi.gear.util;

import net.minecraft.resources.ResourceLocation;

public class ModResourceLocation {

    public static ResourceLocation create(String resourceName) {
        return ResourceLocation.parse(addModNamespace(resourceName));
    }
    
    private static String addModNamespace(String resourceName) {
        if (resourceName.contains(":")) {
            return resourceName;
        }
        return "coloredbricks:" + resourceName;
    }
}
