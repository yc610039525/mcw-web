
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
 *         &lt;element name="GetHistoricalWeatherResult" type="{http://www.36wu.com/}ResultOfListOfHistoricalWeather" minOccurs="0"/&gt;
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
    "getHistoricalWeatherResult"
})
@XmlRootElement(name = "GetHistoricalWeatherResponse")
public class GetHistoricalWeatherResponse {

    @XmlElement(name = "GetHistoricalWeatherResult")
    protected ResultOfListOfHistoricalWeather getHistoricalWeatherResult;

    /**
     * ��ȡgetHistoricalWeatherResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfHistoricalWeather }
     *     
     */
    public ResultOfListOfHistoricalWeather getGetHistoricalWeatherResult() {
        return getHistoricalWeatherResult;
    }

    /**
     * ����getHistoricalWeatherResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfHistoricalWeather }
     *     
     */
    public void setGetHistoricalWeatherResult(ResultOfListOfHistoricalWeather value) {
        this.getHistoricalWeatherResult = value;
    }

}
