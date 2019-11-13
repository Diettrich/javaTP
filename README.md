# javaTP
tout les tp de java 2ème année MSIP

voici les notes de cours:
	
	dans la classe la classe geste point dois créer les points automatiquement en fonction des arguments qui lui sont passés par la ligne de commande le nombre d argument dois être pairs

dans un premier cas les argument sont d’ordre 2
definir la méthode toStirng 

Vecteur v = new Vector(0);
v.addElement(X);  //X est un objet


la classe gestPoint elle permet de gerer a la fois des cercle et des points en fonction des arg
si l arg est egale a p systematiquement on dois dire pour construire un point si l arg est egale a c on dois lire 3 entiers pour construire le cercle, l ensemble des objet cree que se soit des point ou cercle doivent etre stocker dans le meme vecteur

------------------------------------------------------------------------------------------------------
une classe abstraite: est une classe identique a une classe normal a l exception qui ne peut pas être instantier mais il peut être hériter d une autre classe.
```
Class Abstract AT {
	int x;
	…
}
```
une classe abstraite il permet de définir des classe générique exemple:
un engin mobile.
une classe abstraite définit des méthodes éventuellement il vont définir des variables qui doivent être clairement implemanter par des sous classes
exemple voiture, vélo les deux avance et recule mais pas de la meme manière, tourne mais pas de la meme manière.

Orienté Objet stipule que l’heritage multiple est un de ses concept or meme dans le concept oriente objet l’heritage multiple est source d’ambiguïté, si la meme fonction ou variable se trouve dans plus dans plus d’une super classe son appel dans la sous classe crée une ambiguïté d appel. Cependant java permet l heritage multiple a partir d’ interface.
une interfaces une classe totalement abstraite ou les fonctions ne sont pas définit a l inverse d une class abstraite il sont juste nomme et les variables s il existe se sont des constantes.
une classe peut implantante plusieurs interfaces, ansi elle est obligé de les redéfinir. une interface permet de définir les normes de développement.
```
inteface A

class B extends C implements A, E, D
```

du faite que tout les objets sont comparable elle implantantes systématiquement la notion de comparaison mais chaque objet se implémentés ce compare de manière dessertes d ou la nécessiter d implementation de la méthode comparaison 

TP:
la classe point de implementé l interface compare et definir la methode sort() en se basant sur x e

tri de bulle est une methode qui permet de trier un tableau d object  dans les elements qui peuvent etre compare
creer une clase abstraite qui contient une methode trier cette methode a comme argument a comme tableau d objets a trier
la condition chaque objet prialablement doit implemente compare

dans la classe gestepoint instancier 10 point a stocker dans un tableau de points, faire appel a la methode trier de class tie bulle, afficher le résultat

utiliser la method system.in pour lire depuis le clavier pour creer les points
trouver le programme pour decompiler une classe en un fichier java => retrouvé le code source depuis le byte code
------------------------------------------------------------------------------------------------------
au niveau de java lorsque il ya une erreur au niveau d une fonction un objet Exception est crée (à l inverse des autres langages où c’est code d erreur qui est retourné) l’objet Exception crée contient un code et éventuellement un message mais ce qui est important c’est ni le code ni le message c’est l’objet qui nous intéressé, l’objet Exception crée suite à un incident va continuer son passage a travers toute les fonctions appelonte soi il est traité sinon c’est la JVM qui la prend en charge et provoqué un arret de l’application de maniere non conventionel.
dans tout les cas le programme doit s arreté suite a une exception la seul difference c est la maniere

```
	try {
		codes
	}
	catch (E2 e) { … }
	catch (E1 e) { … }
	catch (Exception e) { … }
	finally { … }
 ```

finally est un bloc qui sera systématiquement executer lorsqu'il y a des erreurs son objectif d arrêter des processus démarré, exemple fermeture d un fichier, d une collection base de donnée , …

	class PointException extends Exception {
		PointException(String message) {
			super(message);
		}
	}

	f(x, y) {
		if (x < min || x > max) {
			Throws new PointException(‘blabla’);
		}
	}

TP: dans la fonction deplacer un point ne peut jamais se deplacer plus de sont dixieme (10% de sa valeur actuelle)
à defaut c’est une exception
cree une class exceptiondeplacement qui est cree a chaque fois que le deplacement est anormal, traiter l’ erreur au niveau de la class point et gerer l erreur au niveau de la class gestpoint
