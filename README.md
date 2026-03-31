
# Lab4- FragmentsLab - Android Studio (Java)

Ce projet est une application Android éducative démontrant l'utilisation des Fragments pour créer une interface utilisateur dynamique et modulaire. L'application permet de basculer entre deux écrans (fragments) au sein d'une seule activité.

## Fonctionnalités

•Navigation Dynamique : Passage entre deux fragments via des boutons sans recharger l'activité.

•Fragment One : Interaction simple avec un bouton qui modifie un texte.

•Fragment Two : Utilisation d'une SeekBar pour mettre à jour une valeur en temps réel.

•Gestion du BackStack : Possibilité de revenir au fragment précédent avec le bouton "Retour" du téléphone.

## Étapes de Configuration


### Étape 1 : Interface Principale (activity_main.xml)

Le layout utilise un LinearLayout vertical contenant une barre de boutons et un FrameLayout qui sert de conteneur vide pour les fragments.

<img width="285" height="327" alt="image" src="https://github.com/user-attachments/assets/c7d6812e-2bff-4349-a910-2dce45569efe" />

### Étape 2 : Contrôleur Principal (MainActivity.java)

Gère les clics sur les boutons et utilise le FragmentManager pour effectuer les transactions.

<img width="544" height="113" alt="image" src="https://github.com/user-attachments/assets/6b367e21-b0b9-4d9e-a913-6954f2ba46a5" />

### Étape 3 : Fragments et Logique

1.FragmentOne :

◦ Vue : Un TextView et un Button.

◦ Logique : Change le texte lors du clic sur le bouton.

2.FragmentTwo :

◦ Vue : Un TextView et une SeekBar.

◦ Logique : Utilise onProgressChanged pour afficher la valeur de la barre de défilement (0 à 100).

## Structure du Projet

<img width="311" height="313" alt="image" src="https://github.com/user-attachments/assets/992ed171-f498-40ca-9342-2e1c5658746a" />

## 📺 Démonstration Vidéo

https://github.com/user-attachments/assets/eae8735b-2227-44f8-be75-0ed9c63e96f9



