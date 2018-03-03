# SpringBootBatchResponse


**Example 1: http://localhost:8080/example1/customer**

    [
        {
            "status": 200,
            "body": {
                "id": "id1",
                "firstName": "firstName1",
                "lastName": "lastName1",
                "company": "company1"
            }
        },
        {
            "status": 400,
            "body": {
                "status": 400,
                "type": "Some type",
                "message": "Issue With Customer 2",
                "moreInfo": "http://www.error.com"
            }
        },
        {
            "status": 200,
            "body": {
                "id": "id3",
                "firstName": "firstName3",
                "lastName": "lastName3",
                "company": "company3"
            }
        }
    ]


**Example 2: http://localhost:8080/example2/customer**


    [
        {
            "headers": {},
            "body": {
                "id": "id1",
                "firstName": "firstName1",
                "lastName": "lastName1",
                "company": "company1"
            },
            "statusCode": "OK",
            "statusCodeValue": 200
        },
        {
            "headers": {},
            "body": {
                "status": 400,
                "type": "Some type",
                "message": "Issue With Customer 2",
                "moreInfo": "http://www.error.com"
            },
            "statusCode": "BAD_REQUEST",
            "statusCodeValue": 400
        },
        {
            "headers": {},
            "body": {
                "id": "id3",
                "firstName": "firstName3",
                "lastName": "lastName3",
                "company": "company3"
            },
            "statusCode": "OK",
            "statusCodeValue": 200
        }
    ]
    


**Exemple 3: http://localhost:8080/example3/customer**


    [
        {
            "status": 200,
            "body": {
                "id": "id1",
                "firstName": "firstName1",
                "lastName": "lastName1",
                "company": "company1"
            }
        },
        {
            "status": 400,
            "error": {
                "status": 400,
                "type": "Some type",
                "message": "Issue With Customer 2",
                "moreInfo": "http://www.error.com"
            }
        },
        {
            "status": 200,
            "body": {
                "id": "id3",
                "firstName": "firstName3",
                "lastName": "lastName3",
                "company": "company3"
            }
        }
    ]
    
    
**Exemple 4: http://localhost:8080/example4/customer**  

  
    [
        {
            "status": 200,
            "body": {
                "data": {
                    "id": "id1",
                    "firstName": "firstName1",
                    "lastName": "lastName1",
                    "company": "company1"
                }
            }
        },
        {
            "status": 400,
            "body": {
                "error": {
                    "status": 400,
                    "type": "Some type",
                    "message": "Issue With Customer 2",
                    "moreInfo": "http://www.error.com"
                }
            }
        },
        {
            "status": 200,
            "body": {
                "data": {
                    "id": "id3",
                    "firstName": "firstName3",
                    "lastName": "lastName3",
                    "company": "company3"
                }
            }
        }
    ]