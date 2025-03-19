Ce projet illustre les principes d'injection de dépendances et de couplage faible en Java, avec une implémentation simple de deux interfaces (IDao et IMetier) et leurs implémentations.
Introduction

### Activité Pratique N°1 - Injection des dépendances

L’objectif de ce rapport est de mettre en place un système de gestion basé sur le principe de l’injection de dépendances afin de mieux organiser le code et de réduire le couplage entre les différentes classes. 
Ce concept est essentiel en programmation orientée objet, car il permet de rendre les applications plus flexibles et maintenables.

Dans cette étude, nous allons suivre plusieurs étapes pour implémenter ce principe : la création d’interfaces, l’implémentation de ces interfaces, puis l’injection des dépendances de différentes manières, notamment en utilisant le framework Spring.

**Introduction**

L’objectif de ce rapport est de mettre en place un système de gestion basé sur le principe de l’injection de dépendances afin de mieux organiser le code et de réduire le couplage entre les différentes classes. Ce concept est essentiel en programmation orientée objet, car il permet de rendre les applications plus flexibles et maintenables.

Dans cette étude, nous allons suivre plusieurs étapes pour implémenter ce principe : la création d’interfaces, l’implémentation de ces interfaces, puis l’injection des dépendances de différentes manières, notamment en utilisant le framework Spring.

---

**Partie 1 : Implémentation des interfaces et des classes**

1. **Création de l’interface IDao avec une méthode getData**
    - Cette interface définit une méthode `getData()` qui sera implémentée par une classe spécifique.
    - **Capture d’écran : Code de l’interface IDao.**

2. **Création d’une implémentation de l’interface IDao**
    - Une classe `DaoImpl` implémente l’interface IDao en retournant des données spécifiques.
    - **Capture d’écran : Code de la classe DaoImpl.**

3. **Création de l’interface IMetier avec une méthode calcul**
    - Cette interface définit une méthode `calcul()` qui utilisera les données fournies par IDao.
    - **Capture d’écran : Code de l’interface IMetier.**

4. **Création d’une implémentation de IMetier en utilisant le couplage faible**
    - Une classe `MetierImpl` implémente IMetier et utilise IDao en favorisant le couplage faible via un setter ou un constructeur.
    - **Capture d’écran : Code de la classe MetierImpl avec injection via un setter.**

---

**Partie 2 : Injection des dépendances**

1. **Injection par instanciation statique**
    - Ici, nous effectuons une instanciation manuelle des objets dans la méthode principale.
    - **Capture d’écran : Code de l’injection statique.**

2. **Injection par instanciation dynamique**
    - L’injection est réalisée en utilisant le mécanisme de réflexion pour charger dynamiquement les classes.
    - **Capture d’écran : Code de l’injection dynamique.**

3. **Injection en utilisant le framework Spring**
   a. **Version XML**
    - Configuration des beans dans un fichier XML.
    - **Capture d’écran : Fichier XML de configuration Spring.**

   b. **Version annotations**
    - Utilisation des annotations `@Component`, `@Autowired`, et `@Service`.
    - **Capture d’écran : Code avec annotations Spring.**

---

**Conclusion**

L’injection de dépendances est une technique essentielle pour améliorer la modularité et la flexibilité des applications. Nous avons exploré plusieurs méthodes pour injecter des dépendances, en passant par l’instanciation statique, dynamique et l’utilisation du framework Spring.

L’approche utilisant Spring est particulièrement efficace, car elle permet de gérer les dépendances de manière automatique, réduisant ainsi la complexité du code et facilitant la maintenance. En adoptant ces pratiques, nous nous assurons d’avoir un code plus propre, maintenable et évolutif.

---

**Résumé des captures d’écran à insérer dans le rapport :**

1. Code de l’interface IDao.
2. Code de la classe DaoImpl.
3. Code de l’interface IMetier.
4. Code de la classe MetierImpl avec injection via un setter.
5. Code de l’injection statique.
6. Code de l’injection dynamique.
7. Fichier XML de configuration Spring.
8. Code avec annotations Spring.

Ce rapport détaille toutes les étapes nécessaires pour implémenter l’injection des dépendances et fournir un projet bien structuré et maintenable.


