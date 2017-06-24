package com._36wu;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.12
 * 2017-04-02T23:45:29.711+08:00
 * Generated source version: 3.0.12
 * 
 */
@WebService(targetNamespace = "http://www.36wu.com/", name = "WeatherServiceHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WeatherServiceHttpGet {

    /**
     * <h3>支持城市列表</h3>
     */
    @WebResult(name = "ResultOfListOfArea", targetNamespace = "http://www.36wu.com/", partName = "Body")
    @WebMethod(operationName = "GetAreaList")
    public ResultOfListOfArea getAreaList(
        @WebParam(partName = "authkey", name = "authkey", targetNamespace = "http://www.36wu.com/")
        java.lang.String authkey
    );

    /**
     * <h3>生活气象指数</h3>
     */
    @WebResult(name = "ResultOfWeatherIndex", targetNamespace = "http://www.36wu.com/", partName = "Body")
    @WebMethod(operationName = "GetWeatherIndex")
    public ResultOfWeatherIndex getWeatherIndex(
        @WebParam(partName = "district", name = "district", targetNamespace = "http://www.36wu.com/")
        java.lang.String district,
        @WebParam(partName = "authkey", name = "authkey", targetNamespace = "http://www.36wu.com/")
        java.lang.String authkey
    );

    /**
     * <h3>经纬度智能地区未来一周气象</h3>
     */
    @WebResult(name = "ResultOfMoreWeather", targetNamespace = "http://www.36wu.com/", partName = "Body")
    @WebMethod(operationName = "GetMoreWeatherByLocation")
    public ResultOfMoreWeather getMoreWeatherByLocation(
        @WebParam(partName = "lat", name = "lat", targetNamespace = "http://www.36wu.com/")
        java.lang.String lat,
        @WebParam(partName = "lng", name = "lng", targetNamespace = "http://www.36wu.com/")
        java.lang.String lng,
        @WebParam(partName = "authkey", name = "authkey", targetNamespace = "http://www.36wu.com/")
        java.lang.String authkey
    );

    /**
     * <h3>经纬度智能地区实时气象</h3>
     */
    @WebResult(name = "ResultOfTodayWeather", targetNamespace = "http://www.36wu.com/", partName = "Body")
    @WebMethod(operationName = "GetWeatherByLocation")
    public ResultOfTodayWeather getWeatherByLocation(
        @WebParam(partName = "lat", name = "lat", targetNamespace = "http://www.36wu.com/")
        java.lang.String lat,
        @WebParam(partName = "lng", name = "lng", targetNamespace = "http://www.36wu.com/")
        java.lang.String lng,
        @WebParam(partName = "authkey", name = "authkey", targetNamespace = "http://www.36wu.com/")
        java.lang.String authkey
    );

    /**
     * <h3>实时气象</h3>
     */
    @WebResult(name = "ResultOfTodayWeather", targetNamespace = "http://www.36wu.com/", partName = "Body")
    @WebMethod(operationName = "GetWeather")
    public ResultOfTodayWeather getWeather(
        @WebParam(partName = "district", name = "district", targetNamespace = "http://www.36wu.com/")
        java.lang.String district,
        @WebParam(partName = "authkey", name = "authkey", targetNamespace = "http://www.36wu.com/")
        java.lang.String authkey
    );

    /**
     * <h3>IP智能地区未来一周气象</h3>
     */
    @WebResult(name = "ResultOfMoreWeather", targetNamespace = "http://www.36wu.com/", partName = "Body")
    @WebMethod(operationName = "GetMoreWeatherByIp")
    public ResultOfMoreWeather getMoreWeatherByIp(
        @WebParam(partName = "ip", name = "ip", targetNamespace = "http://www.36wu.com/")
        java.lang.String ip,
        @WebParam(partName = "authkey", name = "authkey", targetNamespace = "http://www.36wu.com/")
        java.lang.String authkey
    );

    /**
     * <h3>IP智能地区实时气象</h3>
     */
    @WebResult(name = "ResultOfTodayWeather", targetNamespace = "http://www.36wu.com/", partName = "Body")
    @WebMethod(operationName = "GetWeatherByIp")
    public ResultOfTodayWeather getWeatherByIp(
        @WebParam(partName = "ip", name = "ip", targetNamespace = "http://www.36wu.com/")
        java.lang.String ip,
        @WebParam(partName = "authkey", name = "authkey", targetNamespace = "http://www.36wu.com/")
        java.lang.String authkey
    );

    /**
     * <h3>未来一周气象</h3>
     */
    @WebResult(name = "ResultOfMoreWeather", targetNamespace = "http://www.36wu.com/", partName = "Body")
    @WebMethod(operationName = "GetMoreWeather")
    public ResultOfMoreWeather getMoreWeather(
        @WebParam(partName = "district", name = "district", targetNamespace = "http://www.36wu.com/")
        java.lang.String district,
        @WebParam(partName = "authkey", name = "authkey", targetNamespace = "http://www.36wu.com/")
        java.lang.String authkey
    );

    /**
     * <h3>历史气象查询</h3>
     */
    @WebResult(name = "ResultOfListOfHistoricalWeather", targetNamespace = "http://www.36wu.com/", partName = "Body")
    @WebMethod(operationName = "GetHistoricalWeather")
    public ResultOfListOfHistoricalWeather getHistoricalWeather(
        @WebParam(partName = "district", name = "district", targetNamespace = "http://www.36wu.com/")
        java.lang.String district,
        @WebParam(partName = "start", name = "start", targetNamespace = "http://www.36wu.com/")
        java.lang.String start,
        @WebParam(partName = "end", name = "end", targetNamespace = "http://www.36wu.com/")
        java.lang.String end,
        @WebParam(partName = "authkey", name = "authkey", targetNamespace = "http://www.36wu.com/")
        java.lang.String authkey
    );
}
