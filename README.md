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
 * **Data Base**: which stores the mentioned data [aquí]([xxx](https://github.com/alainmelendez/MELI_test_db)).
 * **Backend**: API developed in Java/Springboot [aquí](https://github.com/alainmelendez/MELI_test).


### BackEnd

This repo include all the backend API. Developed in Java/Springboot with Maven and using 6 dependencies as shown in the figure:

![image](https://github.com/user-attachments/assets/c24010aa-6d55-4bb9-88e9-b9628c04a9aa)

The deployment was made in **Render**.


## Technologies

Technologies used are:
* [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html), Versión 17
* [Netbeans](https://netbeans.apache.org/download/nb17/), Versión 17


## Visualization

THe API can be used in Postman with the following steps:

To check the **stats** please, use: XXX. This is a read end-point that will result in the current statistics according to the data saved. See this example:
FOTOOOOOOOOOOOOOOOOOOOOO

To check a possible **mutant** please, use: XXX and charge the data with a JSON structure. This is a create end-point in the following steps: (i) Check if the candidate is mutant, (ii) save the candidate in the database, (iii) and update the statistics. It will result only in two options:

Option 1: is mutant - HTTP 200
FOTOOOOOOOOOOOOOOOOOOOOO

Option 2: is human - HTTP 403
FOTOOOOOOOOOOOOOOOOOOOOO
