
package com._36wu;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.0.12
 * 2017-04-02T23:45:29.602+08:00
 * Generated source version: 3.0.12
 * 
 */
public final class WeatherServiceSoap_WeatherServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://www.36wu.com/", "WeatherService");

    private WeatherServiceSoap_WeatherServiceSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WeatherService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        WeatherService ss = new WeatherService(wsdlURL, SERVICE_NAME);
        WeatherServiceSoap port = ss.getWeatherServiceSoap12();  
        
        {
        System.out.println("Invoking getAreaList...");
        java.lang.String _getAreaList_authkey = "";
        com._36wu.ResultOfListOfArea _getAreaList__return = port.getAreaList(_getAreaList_authkey);
        System.out.println("getAreaList.result=" + _getAreaList__return);


        }
        {
        System.out.println("Invoking getWeatherIndex...");
        java.lang.String _getWeatherIndex_district = "";
        java.lang.String _getWeatherIndex_authkey = "";
        com._36wu.ResultOfWeatherIndex _getWeatherIndex__return = port.getWeatherIndex(_getWeatherIndex_district, _getWeatherIndex_authkey);
        System.out.println("getWeatherIndex.result=" + _getWeatherIndex__return);


        }
        {
        System.out.println("Invoking getMoreWeatherByLocation...");
        float _getMoreWeatherByLocation_lat = 0.0f;
        float _getMoreWeatherByLocation_lng = 0.0f;
        java.lang.String _getMoreWeatherByLocation_authkey = "";
        com._36wu.ResultOfMoreWeather _getMoreWeatherByLocation__return = port.getMoreWeatherByLocation(_getMoreWeatherByLocation_lat, _getMoreWeatherByLocation_lng, _getMoreWeatherByLocation_authkey);
        System.out.println("getMoreWeatherByLocation.result=" + _getMoreWeatherByLocation__return);


        }
        {
        System.out.println("Invoking getWeatherByLocation...");
        float _getWeatherByLocation_lat = 0.0f;
        float _getWeatherByLocation_lng = 0.0f;
        java.lang.String _getWeatherByLocation_authkey = "";
        com._36wu.ResultOfTodayWeather _getWeatherByLocation__return = port.getWeatherByLocation(_getWeatherByLocation_lat, _getWeatherByLocation_lng, _getWeatherByLocation_authkey);
        System.out.println("getWeatherByLocation.result=" + _getWeatherByLocation__return);


        }
        {
        System.out.println("Invoking getWeather...");
        java.lang.String _getWeather_district = "";
        java.lang.String _getWeather_authkey = "";
        com._36wu.ResultOfTodayWeather _getWeather__return = port.getWeather(_getWeather_district, _getWeather_authkey);
        System.out.println("getWeather.result=" + _getWeather__return);


        }
        {
        System.out.println("Invoking getMoreWeatherByIp...");
        java.lang.String _getMoreWeatherByIp_ip = "";
        java.lang.String _getMoreWeatherByIp_authkey = "";
        com._36wu.ResultOfMoreWeather _getMoreWeatherByIp__return = port.getMoreWeatherByIp(_getMoreWeatherByIp_ip, _getMoreWeatherByIp_authkey);
        System.out.println("getMoreWeatherByIp.result=" + _getMoreWeatherByIp__return);


        }
        {
        System.out.println("Invoking getWeatherByIp...");
        java.lang.String _getWeatherByIp_ip = "";
        java.lang.String _getWeatherByIp_authkey = "";
        com._36wu.ResultOfTodayWeather _getWeatherByIp__return = port.getWeatherByIp(_getWeatherByIp_ip, _getWeatherByIp_authkey);
        System.out.println("getWeatherByIp.result=" + _getWeatherByIp__return);


        }
        {
        System.out.println("Invoking getMoreWeather...");
        java.lang.String _getMoreWeather_district = "";
        java.lang.String _getMoreWeather_authkey = "";
        com._36wu.ResultOfMoreWeather _getMoreWeather__return = port.getMoreWeather(_getMoreWeather_district, _getMoreWeather_authkey);
        System.out.println("getMoreWeather.result=" + _getMoreWeather__return);


        }
        {
        System.out.println("Invoking getHistoricalWeather...");
        java.lang.String _getHistoricalWeather_district = "";
        java.lang.String _getHistoricalWeather_start = "";
        java.lang.String _getHistoricalWeather_end = "";
        java.lang.String _getHistoricalWeather_authkey = "";
        com._36wu.ResultOfListOfHistoricalWeather _getHistoricalWeather__return = port.getHistoricalWeather(_getHistoricalWeather_district, _getHistoricalWeather_start, _getHistoricalWeather_end, _getHistoricalWeather_authkey);
        System.out.println("getHistoricalWeather.result=" + _getHistoricalWeather__return);


        }

        System.exit(0);
    }

}
