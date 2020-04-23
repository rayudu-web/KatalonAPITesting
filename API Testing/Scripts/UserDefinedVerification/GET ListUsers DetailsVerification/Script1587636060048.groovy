import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper

//def jsonSlurper = new JsonSlurper()
//String idValue = parsedJson.data.id
//log.logInfo("idValue :" + idValue)

Response = WS.sendRequest(findTestObject('GET List Users'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyResponseStatusCodeInRange(Response, 150, 201)

WS.verifyElementPropertyValue(Response, 'data[0].first_name', 'Michael')

WS.verifyElementsCount(Response, 'data', 6)

