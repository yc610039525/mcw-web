
package com._36wu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
     * ��ȡlat���Ե�ֵ��
     * 
     */
    public float getLat() {
        return lat;
    }

    /**
     * ����lat���Ե�ֵ��
     * 
     */
    public void setLat(float value) {
        this.lat = value;
    }

    /**
     * ��ȡlng���Ե�ֵ��
     * 
     */
    public float getLng() {
        return lng;
    }

    /**
     * ����lng���Ե�ֵ��
     * 
     */
    public void setLng(float value) {
        this.lng = value;
    }

    /**
     * ��ȡauthkey���Ե�ֵ��
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
     * ����authkey���Ե�ֵ��
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
