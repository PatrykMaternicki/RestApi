# RestApi
Do testów można użyć następującego kodu JSON.
```
{
	"name" : "Pan Tadeusz",
	"description" : "Pan tadeusz",
	"comments" : [
		"Dobry film polecam",
		"Matura zdana"
		]
}
```
Pokaz wszystko:
```
GET localhost:8080/samplerestapp/rest/movies
```
Wstaw obiekt:

```
POST localhost:8080/samplerestapp/rest/movies
```
Aktualizuj dane, filmu o id:

```
PUT GET localhost:8080/samplerestapp/rest/movies/2
```
Usuń dany film,  o id:

```
DELETE localhost:8080/samplerestapp/rest/movies/2
```
Weż komentarze z filmu o id:

```
GET localhost:8080/samplerestapp/rest/movies/2/get/comments

```

Dodaj komentarz do filmu o id:

```

PUT GET localhost:8080/samplerestapp/rest/movies/2/add/comments

```

Usuń komentarz o id z filmu o id:

```

DELETE localhost:8080/samplerestapp/rest/movies/2/remove/comments/3

```

Dodaj ocenę do filmu:

```

PUT localhost:8080/samplerestapp/rest/movies/2/add/rating/2

```









