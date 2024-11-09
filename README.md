# API - Mutant recruiter
## Content
1. [Resume](#resume)
2. [Development](#development)
3. [Technologies](#technologies)
4. [Visualization](#visualization)

## Resume

Backend API to evaluate potential candidates by Magneto to be part of the team to fight agains X-mens.

API that can be visualized by any user and tested with an online database, including only two end-points: check a possible mutant and check statistics.


## Development

Implemented as only the backend part of the distributed architecture. The content of the same is:
 * **Data Base**: which stores the mentioned data [aquí](https://github.com/alainmelendez/MELI_test_db).
 * **Backend**: API developed in Java/Springboot [aquí](https://github.com/alainmelendez/MELI_test).


### BackEnd

This repo include all the backend API. Developed in Java/Springboot with Maven and using 6 dependencies as shown in the figure:

![image](https://github.com/user-attachments/assets/c24010aa-6d55-4bb9-88e9-b9628c04a9aa)

The deployment was made in **Render**.


## Technologies

Technologies used are:
* [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html), Versión 17
* [Netbeans](https://netbeans.apache.org/download/nb17/), Versión 17
* [Render](https://render.com/)
* [Aiven Console](https://console.aiven.io/)


## Visualization

THe API can be used in Postman with the following steps:

To check the **stats** please, use: **https://meli-test-unvm.onrender.com/stats**. This is a read end-point that will result in the current statistics according to the data saved. See this example:

![image](https://github.com/user-attachments/assets/34c633e3-e038-4b49-bd48-8aca57183fbc)


To check a possible **mutant** please, use: **https://meli-test-unvm.onrender.com/mutant** and charge the data with a JSON structure. This is a create end-point in the following steps: (i) Check if the candidate is mutant, (ii) save the candidate in the database, (iii) and update the statistics. It will result only in two options:

Option 1: is mutant - HTTP 200

![image](https://github.com/user-attachments/assets/4e6682c3-0e8a-4b8a-8737-c23f75b589d8)


Option 2: is human - HTTP 403

![image](https://github.com/user-attachments/assets/e8033805-84b4-482c-af63-f31d385ec489)

