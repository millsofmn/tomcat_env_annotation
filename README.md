# tomcat_env_annotation
Determine what config to load based on TOMCATENV environment variable.

This annotation is used to find out which environment the project is running in. It could be LOCAL, DEV, INT, or PROD.

See the test code for examples on how to use it. There is duplicate code for testing two different environmental variables because I found JUnit didn't remove the previous inialtized classes so the next test failed. To get them to pass I needed change the config file and let Spring initalize a new set of classes.
