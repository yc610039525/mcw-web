
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
 *         &lt;element name="GetMoreWeatherByIpResult" type="{http://www.36wu.com/}ResultOfMoreWeather" minOccurs="0"/&gt;
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
    "getMoreWeatherByIpResult"
})
@XmlRootElement(name = "GetMoreWeatherByIpResponse")
public class GetMoreWeatherByIpResponse {

    @XmlElement(name = "GetMoreWeatherByIpResult")
    protected ResultOfMoreWeather getMoreWeatherByIpResult;

    /**
     * ��ȡgetMoreWeatherByIpResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfMoreWeather }
     *     
     */
    public ResultOfMoreWeather getGetMoreWeatherByIpResult() {
        return getMoreWeatherByIpResult;
    }

    /**
     * ����getMoreWeatherByIpResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfMoreWeather }
     *     
     */
    public void setGetMoreWeatherByIpResult(ResultOfMoreWeather value) {
        this.getMoreWeatherByIpResult = value;
    }

}
