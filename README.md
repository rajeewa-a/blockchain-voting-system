# blockchain-voting-system
An electronic voting system based on Blockchain technology for the Presidential Election of Sri Lanka.

## Overview
There are 3 users of the system.
 - Election Commissioner
 - Election Official
 - Voter
 
 The functions of each user are as follows.
 
 **Election Commissioner-**
 - Candidate Registration/Management
 - Official Registration/Management
 - Get Election Results
 
 **Election Official-**
 - Voter Registration
 - Start Election Server
 - Join Election Server

 **Voter-**
 - Login
 - Cast Vote


**The main focus of this system is the voting process. The voting process integrates Blockchain technology to securely store the votes. The central MySQL database stores all the user data (voter details, official details, candidate details). The votes are verified using the NIC of the voter and then encrypted and stored in the Blockchain. A copy of the Blockchain is written to the storage of each client connected to the Blockchain Network at the end of an election. An overview diagram of the voting process is shown below.**


![blockchainvoting](https://user-images.githubusercontent.com/70063725/170988514-e8e4eb83-30e4-4c00-9daa-72624d03008c.jpg)


## Development Environment

 - Apache NetBeans IDE 12.0
 - JDK-8
 - MySQL

## Database Configuration
Import the database file 'slelection2022.sql' from MySQL.

Edit the connection string in blockchainvotingsystem/SqlConn.java (line 21).

        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/slelection2022?useLegacyDatetimeCode=false&serverTimezone=UTC","root",""); //Connection String
            return conn;
        }
  
## Screenshots
![login](https://user-images.githubusercontent.com/70063725/170942832-89e14280-515b-42fb-8e4e-d5fa5f5be9e8.PNG)
![off_menu](https://user-images.githubusercontent.com/70063725/170942856-87751230-7f21-4feb-b577-5dff4b368809.PNG)
![comm_menu](https://user-images.githubusercontent.com/70063725/170942890-d831f6c1-341d-47a9-bdda-47c693495995.PNG)
![comm_results](https://user-images.githubusercontent.com/70063725/170942924-f3a2f436-00c1-400c-a585-23f9bfe78be7.PNG)
![comm_mancand](https://user-images.githubusercontent.com/70063725/170942934-c8468380-5aad-4543-bcb7-26ef62971bf7.PNG)
![comm_regcand](https://user-images.githubusercontent.com/70063725/170942939-421a5d47-f488-4578-86a7-e02876cbd437.PNG)
![off_joinsv](https://user-images.githubusercontent.com/70063725/170942956-af71b82b-e83f-4a4e-a6f8-f62df019afe8.PNG)
![off_startsv](https://user-images.githubusercontent.com/70063725/170942966-72b0d4e0-c93a-4860-b508-7ddf7203fec0.PNG)
![vote1](https://user-images.githubusercontent.com/70063725/170942971-ffbfec6b-f633-464a-845d-f1e3c4ada65a.PNG)
![vote2](https://user-images.githubusercontent.com/70063725/170942951-48d710a2-15e0-4f75-9604-14d762f09669.PNG)


**Credits -** [pystone](https://github.com/pystone/ProcessMigration), [hvudeshi](https://github.com/hvudeshi/Blockchain-based_E-Voting)
