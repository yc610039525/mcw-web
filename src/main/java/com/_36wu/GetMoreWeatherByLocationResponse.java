
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
 *         &lt;element name="GetMoreWeatherByLocationResult" type="{http://www.36wu.com/}ResultOfMoreWeather" minOccurs="0"/&gt;
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
    "getMoreWeatherByLocationResult"
})
@XmlRootElement(name = "GetMoreWeatherByLocationResponse")
public class GetMoreWeatherByLocationResponse {

    @XmlElement(name = "GetMoreWeatherByLocationResult")
    protected ResultOfMoreWeather getMoreWeatherByLocationResult;

    /**
     * ��ȡgetMoreWeatherByLocationResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfMoreWeather }
     *     
     */
    public ResultOfMoreWeather getGetMoreWeatherByLocationResult() {
        return getMoreWeatherByLocationResult;
    }

    /**
     * ����getMoreWeatherByLocationResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfMoreWeather }
     *     
     */
    public void setGetMoreWeatherByLocationResult(ResultOfMoreWeather value) {
        this.getMoreWeatherByLocationResult = value;
    }

}
