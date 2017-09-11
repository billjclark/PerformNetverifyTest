# Summary

Command-line client that can be used by prospect merchants to test NetVerify services. The tool eliminates the need for the merchant to integrate with us before they can test.

Facematch and the back of the id can be enabled by setting the flags in the config.properties file.

The token and secret must be passed in on the command line.

Most of the batch upload projects require minor changes to the Java code.  PerformNetverifyTest.java words for verifications that have really predictable file names like <transaction_id>_front, <transaction_id>_back, and <transaction_id>_face.  PerformNetverifyQuid.java works for transaction which consist of two GUIDS like <GUID 1>_<GUID 2>.jpg.

If you are running on Linux, use "nohup" and "tee" to make sure that the job finishes and the output is saved.

# Configuration

Below are the parameters that can be customized. 
When parameter value is specified both in config file and the command line, the command line value takes precedence.

Name|config.properties|command-line arg|default
---|---|---|---
pathToImageFolder |yes	|yes	|nil
enabledFields	|yes	|no	|“idNumber,idFirstName,idLastName,idDob,idExpiry,idUsState,idPersonalNumber,idAddress"
serverUrl	|yes	|yes	|https://netverify.com/api/netverify/v2
merchantReportingCriteria	|yes	|no	|“Jumio NV Test Tool”
faceImageRequired |yes |no  |true
backImageRequired |yes |no  |false
backSuffix |yes |no  |_back
faceSuffix |yes |no  |_face
token |no |yes  |null
secret  |no |yes  |null

# Running the tool

This program only requires a relatively recent version of Java to be installed.  The program is easy to run in IntelliJ (Android Studio) or Elipse but an IDE is not required.

Example:

```
java -cp PerformNetverifyTest.jar PerformNetverifyTest secret=***** token=****** pathToImageFolder=d:/imgFolder 

```

java -jar PerformNetverifyTest.jar PerformNetverifyGuid secret=***** token-****** pathToImageFolder=/Users/johnmc/Desktop/nv-test-tool-master/Imagesrc

''' Linux example
nohup java -cp PerformNetverifyTest.jar PerformNetverifyGuid secret=***** token=****| tee Output.txt


