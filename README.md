🏢 Job App

Job App is the backend for the React CRUD UI project, providing RESTful APIs for job management.
This Spring Boot application works together with the React CRUD UI frontend to form a fully functional job application platform.
🚀 Getting Started

Follow these steps to set up and run the Job App backend locally.
✅ Prerequisites

Ensure you have the following installed on your system:

    Java 17+
    Spring Boot
    Maven
    PostgreSQL or any supported database

📥 Installation

   Job-App
1. Clone the repo
    git clone https://github.com/your-username/Job-App.git

2. Configure the database connection:

    Open the application.properties or application.yml file.
    Update the database credentials for PostgreSQL (or your preferred database).

3.Build the project:

mvn clean install

Start the application:

    mvn spring-boot:run

The backend will start on http://localhost:8080 (default port).


🖥️ Setting Up the Frontend

1. To get a fully functional application, you must clone and run the React CRUD UI frontend.

   
git clone https://github.com/Mwimar/React-Crud-UI.git
cd React-Crud-UI

2. Install dependencies:

npm install

3.Start the frontend application:

    npm start

The frontend will start on http://localhost:3000, and it will communicate with the Spring Boot backend at http://localhost:8080.
