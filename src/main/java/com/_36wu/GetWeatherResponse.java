
package com._36wu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetWeatherResult" type="{http://www.36wu.com/}ResultOfTodayWeather" minOccurs="0"/&gt;
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
    "getWeatherResult"
})
@XmlRootElement(name = "GetWeatherResponse")
public class GetWeatherResponse {

    @XmlElement(name = "GetWeatherResult")
    protected ResultOfTodayWeather getWeatherResult;

    /**
     * ��ȡgetWeatherResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfTodayWeather }
     *     
     */
    public ResultOfTodayWeather getGetWeatherResult() {
        return getWeatherResult;
    }

    /**
     * ����getWeatherResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfTodayWeather }
     *     
     */
    public void setGetWeatherResult(ResultOfTodayWeather value) {
        this.getWeatherResult = value;
    }

}
