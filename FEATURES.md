# Hollowfall — Registro de características

Objetivo: NeoForge 1.21.1 · Java 21 · Minecraft Java Edition

## FASE 1 — Fundamentos (SIN COMPILAR TODAVÍA: compilar en GitHub Actions)
Implementado:
- [x] Proyecto Gradle (ModDevGradle) + workflow de GitHub Actions
- [x] neoforge.mods.toml
- [x] Clase principal y clase de cliente (pantalla de config en Mods > Hollowfall)
- [x] Configuración COMMON: dificultad, cordura, eventos, entidades, audio, efectos, accesibilidad, rendimiento
- [x] 4 dificultades con multiplicadores (EXPLORATION / SURVIVAL / NIGHTMARE / EXTREME)
- [x] 6 bloques: hormigón deteriorado, baldosas antiguas, plancha oxidada, bloque de carne, bloque corrupto, lámpara de emergencia
- [x] 2 objetos: batería, vendaje (funcional: cura vida, usa config)
- [x] Pestaña creativa, texturas originales, modelos, blockstates, loot tables, tags, 4 recetas, traducciones en/es
- [x] Estructura de paquetes de la sección 22

Pendiente (fases siguientes):
- [ ] Fase 2: entidades The Watcher, The Mimic, The Crawler (modelos, IA, sonidos, animaciones)
- [ ] Fase 3: cordura, eventos paranormales, detección, audio dinámico, efectos visuales
- [ ] Fase 4: estructuras, documentos, lore, objetos de investigación, loot propio
- [ ] Fase 5: HUD, inventario de investigación, radio, detectores, menú de configuración propio
- [ ] Fase 6: multijugador, progresión, logros, entidades especiales, eventos legendarios
- [ ] Fase 7: optimización, pruebas, jar final
- [ ] Datagen (por ahora los JSON están escritos a mano)

Puntos a verificar en el primer build:
- neo_version en gradle.properties (última 21.1.x) y versión del plugin net.neoforged.moddev en build.gradle
- ConfigurationScreen / IConfigScreenFactory en HollowfallClient
