# About

Reproducer showing how IntelliJ runner fails compiling Gradle script plugins, with the following error:

```
Kotlin: Unresolved reference: plugins
```

# How to reproduce

- In IntelliJ configure Gradle to use the IntelliJ runner
- Reload Gradle projects
- Rebuild project in IntelliJ. Build should faiil.
- Building with the Gradle runner works.


