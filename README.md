# TesteDesenvolvedor

### Request

`http://localhost:8085/api/drivers`

### Response

[{"driverId":1,"driverRef":"hamilton","number":"44","code":"HAM","forename":"Lewis","surname":"Hamilton","dob":"1985-01-07","nationality":"British","url":"http://en.wikipedia.org/wiki/Lewis_Hamilton"}, ...

### Request

`http://localhost:8085/api/drivers/winning`

### Response

[{"wins":"1","driverId":"Cannoc","nationality":"Canadian","givenName":"John","familyName":"Cannon","dateOfBirth":"1933-06-21"}, ...

### Request

`http://localhost:8085/api/drivers/teams`

### Response

[{"constructors":"[BRM]","driverId":"Cannoc","nationality":"Canadian","givenName":"John","familyName":"Cannon","dateOfBirth":"1933-06-21"}, ...

### Request

`http://localhost:8085/api/drivers/nationalities/wins`

### Response

[{"wins":"5771","nationality":"British"} ...

### Request

`http://localhost:8085/api/drivers/races/{season}/{round}`

### Response

[{"nationality":"British","givenName":"Jenson","familyName":"Button","constructor":"Brawn","dateOfBirth":"1980-01-19"}, ...

