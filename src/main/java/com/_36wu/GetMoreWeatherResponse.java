
package com._36wu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetMoreWeatherResult" type="{http://www.36wu.com/}ResultOfMoreWeather" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMoreWeatherResult"
})
@XmlRootElement(name = "GetMoreWeatherResponse")
public class GetMoreWeatherResponse {

    @XmlElement(name = "GetMoreWeatherResult")
    protected ResultOfMoreWeather getMoreWeatherResult;

    /**
     * 获取getMoreWeatherResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResultOfMoreWeather }
     *     
     */
    public ResultOfMoreWeather getGetMoreWeatherResult() {
        return getMoreWeatherResult;
    }

    /**
     * 设置getMoreWeatherResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfMoreWeather }
     *     
     */
    public void setGetMoreWeatherResult(ResultOfMoreWeather value) {
        this.getMoreWeatherResult = value;
    }

}
