
#Integrating Food Assistance Resource Hackathon Project Athenahealth 

A simple Spring Boot REST API for managing SDOH (social determinant of health) factors.
This project includes the frameworks for a frontend and  backend that allows you to create, read, and delete food resources.

Project Proposal:
https://docs.google.com/presentation/d/1XHd75_ruo-YQwBnqf4UF9hL2EryKeD-edgepYa8HMb8/edit?usp=sharing 
## Features

- List all food items  
- Get a food item by ID  
- Add a new food item  
- Delete a food item by ID  

## Running the Application

1. Make sure you have Java and Maven installed.
2. Clone the repository.
3. Run the app using Maven:

   ```bash
   ./mvnw spring-boot:run
   ```

4. The API will be available at: `http://localhost:8080/api/food`

## API Endpoints

| Method | Endpoint           | Description              |
|--------|--------------------|--------------------------|
| GET    | `/api/food`        | List all food items      |
| GET    | `/api/food/{id}`   | Get food item by ID      |
| POST   | `/api/food`        | Add a new food item      |
| DELETE | `/api/food/{id}`   | Delete food item by ID   |

## Sample JSON for POST

```json
{
  "name": "Apple",
  "calories": 95
}
```

## Notes

- This project uses an in-memory H2 database by default.
- You can access the H2 console at `http://localhost:8080/h2-console` (if enabled).

---

Created by Fehintoluwa Benson, Ermithe Tilusca, Farah Shousha, Fegor Uwuseba 
