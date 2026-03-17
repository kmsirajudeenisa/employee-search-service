Prerequisites:
1. Ensure Docker is installed and running.
2. Start Elasticsearch using Docker Compose:

docker compose up -d

Run the Application:
a. Start the employee-search-service:
./gradlew clean bootRun

b. Test the API
http://localhost:8080/api/employees

API Endpoints

  ┌────────┬────────────────────────────────────┬───────────────────────┐
  │ Method │                URL                 │      Description      │
  ├────────┼────────────────────────────────────┼───────────────────────┤
  │ POST   │ /api/employees                     │ Create employee       │
  ├────────┼────────────────────────────────────┼───────────────────────┤
  │ GET    │ /api/employees                     │ Get all employees     │
  ├────────┼────────────────────────────────────┼───────────────────────┤
  │ GET    │ /api/employees/{id}                │ Get by ID             │
  ├────────┼────────────────────────────────────┼───────────────────────┤
  │ PUT    │ /api/employees/{id}                │ Update employee       │
  ├────────┼────────────────────────────────────┼───────────────────────┤
  │ DELETE │ /api/employees/{id}                │ Delete employee       │
  ├────────┼────────────────────────────────────┼───────────────────────┤
  │ GET    │ /api/employees/search?name=xxx     │ Search by name        │
  ├────────┼────────────────────────────────────┼───────────────────────┤
  │ GET    │ /api/employees/department/{dept}   │ Filter by department  │
  ├────────┼────────────────────────────────────┼───────────────────────┤
  │ GET    │ /api/employees/designation/{desig} │ Filter by designation │
  └────────┴────────────────────────────────────┴───────────────────────┘