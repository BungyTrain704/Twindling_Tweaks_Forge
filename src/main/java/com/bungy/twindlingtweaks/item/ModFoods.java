package com.bungy.twindlingtweaks.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties LETTUCE = (new FoodProperties.Builder().nutrition(1).saturationMod(.4F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 2), 0.9F).fast().build());

    public static final FoodProperties ORANGE = (new FoodProperties.Builder().nutrition(3).saturationMod(.6F).effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 0.5F).fast().build());

    public static final FoodProperties SALAD = (new FoodProperties.Builder().nutrition(6).saturationMod(.9F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 4), 1.0F).build());

    public static final FoodProperties DRIED_MUD_BALL = (new FoodProperties.Builder().nutrition(2).saturationMod(.2F).effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 1), 0.8F).build());

    public static final FoodProperties CROUTON = (new FoodProperties.Builder().nutrition(1).saturationMod(.1F).build());

    public static final FoodProperties TOMATO = (new FoodProperties.Builder().nutrition(4).saturationMod(.5F).build());

    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder().nutrition(5).saturationMod(.8F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1), 0.8F).build());

    public static final FoodProperties ROUGH_SUGAR = (new FoodProperties.Builder().nutrition(1).saturationMod(.1F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), 0.8F).build());
}
