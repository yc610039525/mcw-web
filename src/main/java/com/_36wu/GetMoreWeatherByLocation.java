
package com._36wu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="lng" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="authkey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "lat",
    "lng",
    "authkey"
})
@XmlRootElement(name = "GetMoreWeatherByLocation")
public class GetMoreWeatherByLocation {

    protected float lat;
    protected float lng;
    protected String authkey;

    /**
     * 获取lat属性的值。
     * 
     */
    public float getLat() {
        return lat;
    }

    /**
     * 设置lat属性的值。
     * 
     */
    public void setLat(float value) {
        this.lat = value;
    }

    /**
     * 获取lng属性的值。
     * 
     */
    public float getLng() {
        return lng;
    }

    /**
     * 设置lng属性的值。
     * 
     */
    public void setLng(float value) {
        this.lng = value;
    }

    /**
     * 获取authkey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthkey() {
        return authkey;
    }

    /**
     * 设置authkey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthkey(String value) {
        this.authkey = value;
    }

}
