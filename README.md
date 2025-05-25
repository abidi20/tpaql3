# tpaql3
# TP3 - Tests d’Intégration (Partie 1)

## Objectif
Réaliser des tests d’intégration entre modules, avec base de données simulée, et des appels API externes.

---

## Exercices

### Exercice 1
- Implémentation de `UserService` et `UserRepository`.
- Utilisation de Mockito pour mocker `UserRepository`.
- Test JUnit validant l’interaction.

### Exercice 2
- Implémentation de `OrderController`, `OrderService`, `OrderDao`.
- Mock du `OrderDao`, vérification des appels en cascade via `OrderService`.

### Exercice 3
- `ProductService` dépendant d’une API externe simulée par `ProductApiClient`.
- Tests pour :
  - Succès
  - Format invalide
  - API en échec

---

## Changements

- Aucune erreur détectée dans la logique des classes proposées.
- Tous les tests sont ajoutés avec `Mockito` + `JUnit 5`.
- Respect des principes de test unitaire et intégration isolée.

---

## Dépendances

```xml
<!-- pom.xml -->
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
