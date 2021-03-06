# ♨ TP4 Java - Appel à une API et parsing de .json
Programme exécutable via la ligne de commande permettant d'afficher la météo actuelle d'une ville donnée en argument.

Les informations météorologiques sont fournies par https://openweathermap.org/.

## ✨ Installation
Télécharger le projet ou cloner le dépôt en local.
Il suffit ensuite de l'importer dans IntelliJ ou d'ouvrir un terminal pour l'utiliser.

## 🚀 Utilisation
### Lancement du programme
Il faut compiler le projet puis l'éxécuter à l'aide de l'interface graphique d'IntelliJ.
Dans un terminal, à l'intérieur du projet, taper la commande : 
```
/usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -classpath /mnt/c/Users/axrem/Documents/ZZ3/Java/TP4/out/production/TP4:/mnt/c/Users/axrem/Documents/ZZ3/Java/TP4/lib/gson-2.8.8.jar main.Main city_name
```

### Lancement des tests
Après avoir compiler le projet, faire un clic droit sur le dossier de test puis séléctionner "Run All Tests".

![](C:\Users\axrem\Documents\ZZ3\Java\TP4\resources\img.png)


## 📝 Détails sur le programme
### Utilité des classes
**Main.java** : lance le programme et récupère le nom de ville donné en argument pour en afficher la météo.<br/>
**WeatherFetcher.java** : interroge l'API de OpenWeatherMap pour récupérer les données de météo.<br/>
**CityWeather.java** : modélise l'objet construit suite au parsing des informations météorologiques récupérées.<br/>
**GeneralWeather.java, Temperature.java and Wind.java** : permettent de gérer la hiérarchie des tableaux du .json reprenant les informations météo.





