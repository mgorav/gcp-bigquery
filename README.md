
An application that can query BigQuery’s public BLS dataset when I POST to an endpoint.
The table is `unemployment_cps` and I want to be able to filter my results by year based on a json payload
sent to the endpoint you create. I want these results to be persisted so that I can download them later
from a different endpoint. We’ll be testing the functionality using Postman.

The results for later retrieval can be stored locally, S3, a database of your choosing, etc. Whatever you
are most comfortable with.


Table of Contents:
1) To Run
2) Api and usage
3) Enhancements
4) Tests
5) Query Limit

1) To Run
    You must have a google cloud account with Big Query Api enabled

    Missing from the application are google certs you'll need - google cloud account
    credentials json file

    Update credentials.properties to point at your credentials json file and specify your project id

    Setup your own postgres db to run on PORT 5432 - update application.properties to match
    your credentials

  

