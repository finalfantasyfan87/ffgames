# https-finalfantasyguru87-bitbucket.org-finalfantasyguru87-webservicegame

The application uses Spring Rest Controller which returns a list of games. 
The games are stored in a MongoDB NoSQL  database.  
A game can be deleted and the change will be reflected in the database. 
Currently there is no front end because I am currently looking into which recent front end technology I'd like to implement.
I deployed this application to Heroku's cloud platform.

The current urls are:
/games -returns a list of all games
https://webservicegamesweb.herokuapp.com/games

/games/{gameId}-returns a specific game based on its id
https://webservicegamesweb.herokuapp.com/games/5b374acb3a40fb3c7841a588



/games/delete/{gameId}--deleted game. I simulate this functionality using Postman
