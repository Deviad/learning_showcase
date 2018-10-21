### STEP 1

Use ```docker compose up -d``` to start the docker container and load a MongoDB instance

### STEP 2

Open your favourite browser and go to ```http://localhost:8085```
Create two databases named *springbootdemo* and *springbootdemotest* respectively.


### STEP 3

The app is available at `http://localhost:5050`
To play around with the app you can use postman and use POST and GET on the `/people` endpoint

### STEP 4

To run the tests you should activate the test profile in your IDE of choice or execute a spring boot instance with 
```-dspring.profiles.active=test``` or use ```export spring_profiles_active=test```

Once the application has been started with the test profile, then you can run the tests.


