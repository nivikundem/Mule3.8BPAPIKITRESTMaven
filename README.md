# Mule3.8BPAPIKITRESTMaven
Using Mule3.8 features APIKIT, RAML, dataweave, REST webservice, MAVEN 
Mule Demo for using - 3.8 Creating RAML Using Mule API designer, Creating API KIt and REST operations - Get {all} / Get by id/ Delete/ Post{insert} using Maven
--------------
Mule Demo for using - 3.8 Creating RAML Using Mule API designer, Creating API KIt and REST operations - Get {all} / Get by id/ Delete/ Post{insert} using Maven


This project 
---------
Using rest webservice{APIKIT router} calls invokes corresponding rest methods GET/POST as shown example below

  http://127.0.0.1:8081/api/bp/TR2/bpDetails
  
  http://127.0.0.1:8081/api/bp/TR5/Delete
  
  http://127.0.0.1:8081/api/postOperation?TransactionRef=200&TransactionType=A200&Amount=5000.00


Mule components
---------
  1. Dataweave
  2. APIKIT router
  3. Context property place folders
  4. Message Properties transformer
  5. VM Inbound/Outbound
  6. REST webservice
  7. Exception Strategies




To Run
-------
Run as mule server or deploy into the mule sever as Mule Deployable Archive war,  by copy into the mule-standalone/apps


Technologies
---------
- J2E
- MySQL
- MULE ESB 3.8{APIKIT included}
- Maven
