package com.hollowfall.config;

import net.neoforged.neoforge.common.ModConfigSpec;

/**
 * Configuracion COMMON de Hollowfall (archivo hollowfall-common.toml).
 * Los valores se leen en tiempo de ejecucion con .get(), nunca al cargar la clase.
 */
public final class HorrorConfig {
    private static final ModConfigSpec.Builder B = new ModConfigSpec.Builder();

    // ---- General ----
    public static final ModConfigSpec.EnumValue<HorrorDifficulty> DIFFICULTY;

    // ---- Cordura ----
    public static final ModConfigSpec.BooleanValue SANITY_ENABLED;
    public static final ModConfigSpec.DoubleValue SANITY_DRAIN_MULTIPLIER;
    public static final ModConfigSpec.DoubleValue SANITY_RECOVERY_MULTIPLIER;

    // ---- Eventos ----
    public static final ModConfigSpec.BooleanValue EVENTS_ENABLED;
    public static final ModConfigSpec.DoubleValue EVENT_FREQUENCY_MULTIPLIER;
    public static final ModConfigSpec.IntValue EVENT_MIN_INTERVAL_SECONDS;

    // ---- Entidades ----
    public static final ModConfigSpec.BooleanValue ENTITIES_ENABLED;
    public static final ModConfigSpec.DoubleValue ENTITY_SPAWN_MULTIPLIER;

    // ---- Audio ----
    public static final ModConfigSpec.DoubleValue HORROR_VOLUME;

    // ---- Efectos visuales ----
    public static final ModConfigSpec.BooleanValue VISUAL_EFFECTS_ENABLED;
    public static final ModConfigSpec.DoubleValue EFFECT_INTENSITY;

    // ---- Accesibilidad ----
    public static final ModConfigSpec.BooleanValue NO_JUMPSCARES;
    public static final ModConfigSpec.BooleanValue DISABLE_HALLUCINATIONS;
    public static final ModConfigSpec.BooleanValue REDUCE_CAMERA_MOTION;
    public static final ModConfigSpec.BooleanValue SOUND_SUBTITLES;

    // ---- Rendimiento ----
    public static final ModConfigSpec.IntValue ENTITY_RENDER_DISTANCE;
    public static final ModConfigSpec.BooleanValue REDUCED_PARTICLES;

    // ---- Objetos ----
    public static final ModConfigSpec.DoubleValue BANDAGE_HEAL;

    public static final ModConfigSpec SPEC;

    static {
        B.push("general");
        DIFFICULTY = B.comment("Dificultad del mod: EXPLORATION, SURVIVAL, NIGHTMARE o EXTREME")
                .defineEnum("difficulty", HorrorDifficulty.SURVIVAL);
        B.pop();

        B.push("sanity");
        SANITY_ENABLED = B.comment("Activa el sistema de cordura")
                .define("enabled", true);
        SANITY_DRAIN_MULTIPLIER = B.comment("Multiplicador de perdida de cordura")
                .defineInRange("drainMultiplier", 1.0, 0.0, 5.0);
        SANITY_RECOVERY_MULTIPLIER = B.comment("Multiplicador de recuperacion de cordura")
                .defineInRange("recoveryMultiplier", 1.0, 0.0, 5.0);
        B.pop();

        B.push("events");
        EVENTS_ENABLED = B.comment("Activa los eventos paranormales")
                .define("enabled", true);
        EVENT_FREQUENCY_MULTIPLIER = B.comment("Multiplicador de frecuencia de eventos")
                .defineInRange("frequencyMultiplier", 1.0, 0.0, 5.0);
        EVENT_MIN_INTERVAL_SECONDS = B.comment("Segundos minimos entre dos eventos para el mismo jugador")
                .defineInRange("minIntervalSeconds", 90, 5, 3600);
        B.pop();

        B.push("entities");
        ENTITIES_ENABLED = B.comment("Permite que aparezcan las entidades del mod")
                .define("enabled", true);
        ENTITY_SPAWN_MULTIPLIER = B.comment("Multiplicador de aparicion de entidades")
                .defineInRange("spawnMultiplier", 1.0, 0.0, 5.0);
        B.pop();

        B.push("audio");
        HORROR_VOLUME = B.comment("Volumen de los sonidos de terror (0.0 a 1.0)")
                .defineInRange("horrorVolume", 1.0, 0.0, 1.0);
        B.pop();

        B.push("effects");
        VISUAL_EFFECTS_ENABLED = B.comment("Activa los efectos visuales (vineta, distorsion, etc.)")
                .define("enabled", true);
        EFFECT_INTENSITY = B.comment("Intensidad de los efectos visuales (0.0 a 1.0)")
                .defineInRange("intensity", 1.0, 0.0, 1.0);
        B.pop();

        B.push("accessibility");
        NO_JUMPSCARES = B.comment("Modo sin sustos repentinos")
                .define("noJumpscares", false);
        DISABLE_HALLUCINATIONS = B.comment("Desactiva las alucinaciones por baja cordura")
                .define("disableHallucinations", false);
        REDUCE_CAMERA_MOTION = B.comment("Reduce el movimiento de camara de los efectos")
                .define("reduceCameraMotion", false);
        SOUND_SUBTITLES = B.comment("Muestra subtitulos para los sonidos importantes")
                .define("soundSubtitles", true);
        B.pop();

        B.push("performance");
        ENTITY_RENDER_DISTANCE = B.comment("Distancia maxima de renderizado de entidades del mod (bloques)")
                .defineInRange("entityRenderDistance", 64, 16, 256);
        REDUCED_PARTICLES = B.comment("Reduce las particulas del mod")
                .define("reducedParticles", false);
        B.pop();

        B.push("items");
        BANDAGE_HEAL = B.comment("Vida que cura el vendaje (2.0 = un corazon)")
                .defineInRange("bandageHeal", 4.0, 0.5, 20.0);
        B.pop();

        SPEC = B.build();
    }

    private HorrorConfig() {}
}
