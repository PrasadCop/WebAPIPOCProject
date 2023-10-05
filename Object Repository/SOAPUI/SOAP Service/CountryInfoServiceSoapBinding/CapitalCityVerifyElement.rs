<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CapitalCityVerifyElement</name>
   <tag></tag>
   <elementGuidId>0eaa5b85-e196-4f2f-8fa3-59af19c472b3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/xml; charset=utf-8</value>
      <webElementGuid>3fcd8120-553f-4aea-8ac5-b1ac0e59f0c3</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.6</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:web=&quot;http://www.oorsprong.org/websamples.countryinfo&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;web:CapitalCity>
         &lt;web:sCountryISOCode>IN&lt;/web:sCountryISOCode>
      &lt;/web:CapitalCity>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso</soapServiceEndpoint>
   <soapServiceFunction>CapitalCity</soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyElementText(response, 'CapitalCityResponse.CapitalCityResult', 'Delhi')


assertThat(response.getResponseText()).isEqualTo(&quot;Delhi&quot;)</verificationScript>
   <wsdlAddress>http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL</wsdlAddress>
</WebServiceRequestEntity>
