package com.hollowfall.config;

/**
 * Dificultades del mod (seccion 16 de la especificacion).
 * Los multiplicadores se usaran desde las fases siguientes.
 */
public enum HorrorDifficulty {
    EXPLORATION(0.5, 0.5, 1.5, 1.5),
    SURVIVAL(1.0, 1.0, 1.0, 1.0),
    NIGHTMARE(1.75, 1.5, 0.6, 0.6),
    EXTREME(2.5, 2.0, 0.3, 0.4);

    /** Multiplicador de frecuencia de eventos paranormales. */
    public final double eventFrequency;
    /** Multiplicador de agresividad / frecuencia de entidades. */
    public final double entityAggression;
    /** Multiplicador de abundancia de recursos. */
    public final double resourceAbundance;
    /** Multiplicador de recuperacion de cordura. */
    public final double sanityRecovery;

    HorrorDifficulty(double eventFrequency, double entityAggression,
                     double resourceAbundance, double sanityRecovery) {
        this.eventFrequency = eventFrequency;
        this.entityAggression = entityAggression;
        this.resourceAbundance = resourceAbundance;
        this.sanityRecovery = sanityRecovery;
    }
}
