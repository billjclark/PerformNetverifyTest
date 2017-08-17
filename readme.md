# Summary

Command-line client that can be used by prospect merchants to test NetVerify services. The tool eliminates the need for the merchant to integrate with us before they can test.

:exclamation: facematch is not supported. Do not include it in the enabled fields


# Configuration

Below are the parameters that can be customized. 
When parameter value is specified both in config file and the command line, the command line value takes precedence.

Name|config.properties|command-line arg|default
---|---|---|---
pathToImageFolder |yes	|yes	|nil
token	|yes	|no	|nil
API secret	|no	|yes	|nil
enabledFields	|yes	|no	|“idNumber,idFirstName,idLastName,idDob,idExpiry,idUsState,idPersonalNumber,idAddress"
serverUrl	|yes	|yes	|https://netverify.com/api/netverify/v2
merchantReportingCriteria	|yes	|no	|“Jumio NV Test Tool”

# Running the tool

Example:

```
java -jar PerformNetverifyTest.jar secret=***** pathToImageFolder=d:/imgFolder 

```

java -jar PerformNetverifyTest.jar secret=xKEzev7YdbQnCLcu2UuwhEQbl186wpoG pathToImageFolder=/Users/johnmc/Desktop/nv-test-tool-master/Imagesrc

