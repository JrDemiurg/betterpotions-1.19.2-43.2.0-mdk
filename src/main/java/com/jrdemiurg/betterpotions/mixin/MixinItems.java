// 
// Decompiled by Procyon v0.5.36
// 

package com.jrdemiurg.betterpotions.mixin;

import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ Items.class })
public abstract class MixinItems
{
    @ModifyArg(method = { "<clinit>" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/Item$Properties;stacksTo(I)Lnet/minecraft/world/item/Item$Properties;", ordinal = 0), slice = @Slice(from = @At(value = "NEW", target = "Lnet/minecraft/world/item/PotionItem;")))
    private static int onPotion(final int old) {
        return 3;
    }
    
    @ModifyArg(method = { "<clinit>" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/Item$Properties;stacksTo(I)Lnet/minecraft/world/item/Item$Properties;", ordinal = 0), slice = @Slice(from = @At(value = "NEW", target = "Lnet/minecraft/world/item/SplashPotionItem;")))
    private static int onSplashPotion(final int old) {
        return 3;
    }
    
    @ModifyArg(method = { "<clinit>" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/Item$Properties;stacksTo(I)Lnet/minecraft/world/item/Item$Properties;", ordinal = 0), slice = @Slice(from = @At(value = "NEW", target = "Lnet/minecraft/world/item/LingeringPotionItem;")))
    private static int onLingeringPotion(final int old) {
        return 3;
    }
}
