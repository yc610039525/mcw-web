
package com._36wu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MoreWeather complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MoreWeather"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temp_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weather_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wind_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fl_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temp_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weather_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wind_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fl_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temp_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weather_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wind_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fl_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temp_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weather_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wind_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fl_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temp_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weather_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wind_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fl_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temp_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weather_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wind_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fl_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="img_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="index_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoreWeather", propOrder = {
    "areaid",
    "prov",
    "city",
    "district",
    "temp1",
    "weather1",
    "wind1",
    "fl1",
    "img1",
    "img2",
    "temp2",
    "weather2",
    "wind2",
    "fl2",
    "img3",
    "img4",
    "temp3",
    "weather3",
    "wind3",
    "fl3",
    "img5",
    "img6",
    "temp4",
    "weather4",
    "wind4",
    "fl4",
    "img7",
    "img8",
    "temp5",
    "weather5",
    "wind5",
    "fl5",
    "img9",
    "img10",
    "temp6",
    "weather6",
    "wind6",
    "fl6",
    "img11",
    "img12",
    "indexD"
})
public class MoreWeather {

    protected int areaid;
    protected String prov;
    protected String city;
    protected String district;
    @XmlElement(name = "temp_1")
    protected String temp1;
    @XmlElement(name = "weather_1")
    protected String weather1;
    @XmlElement(name = "wind_1")
    protected String wind1;
    @XmlElement(name = "fl_1")
    protected String fl1;
    @XmlElement(name = "img_1")
    protected String img1;
    @XmlElement(name = "img_2")
    protected String img2;
    @XmlElement(name = "temp_2")
    protected String temp2;
    @XmlElement(name = "weather_2")
    protected String weather2;
    @XmlElement(name = "wind_2")
    protected String wind2;
    @XmlElement(name = "fl_2")
    protected String fl2;
    @XmlElement(name = "img_3")
    protected String img3;
    @XmlElement(name = "img_4")
    protected String img4;
    @XmlElement(name = "temp_3")
    protected String temp3;
    @XmlElement(name = "weather_3")
    protected String weather3;
    @XmlElement(name = "wind_3")
    protected String wind3;
    @XmlElement(name = "fl_3")
    protected String fl3;
    @XmlElement(name = "img_5")
    protected String img5;
    @XmlElement(name = "img_6")
    protected String img6;
    @XmlElement(name = "temp_4")
    protected String temp4;
    @XmlElement(name = "weather_4")
    protected String weather4;
    @XmlElement(name = "wind_4")
    protected String wind4;
    @XmlElement(name = "fl_4")
    protected String fl4;
    @XmlElement(name = "img_7")
    protected String img7;
    @XmlElement(name = "img_8")
    protected String img8;
    @XmlElement(name = "temp_5")
    protected String temp5;
    @XmlElement(name = "weather_5")
    protected String weather5;
    @XmlElement(name = "wind_5")
    protected String wind5;
    @XmlElement(name = "fl_5")
    protected String fl5;
    @XmlElement(name = "img_9")
    protected String img9;
    @XmlElement(name = "img_10")
    protected String img10;
    @XmlElement(name = "temp_6")
    protected String temp6;
    @XmlElement(name = "weather_6")
    protected String weather6;
    @XmlElement(name = "wind_6")
    protected String wind6;
    @XmlElement(name = "fl_6")
    protected String fl6;
    @XmlElement(name = "img_11")
    protected String img11;
    @XmlElement(name = "img_12")
    protected String img12;
    @XmlElement(name = "index_d")
    protected String indexD;

    /**
     * 获取areaid属性的值。
     * 
     */
    public int getAreaid() {
        return areaid;
    }

    /**
     * 设置areaid属性的值。
     * 
     */
    public void setAreaid(int value) {
        this.areaid = value;
    }

    /**
     * 获取prov属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProv() {
        return prov;
    }

    /**
     * 设置prov属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProv(String value) {
        this.prov = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取district属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置district属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * 获取temp1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemp1() {
        return temp1;
    }

    /**
     * 设置temp1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemp1(String value) {
        this.temp1 = value;
    }

    /**
     * 获取weather1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather1() {
        return weather1;
    }

    /**
     * 设置weather1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather1(String value) {
        this.weather1 = value;
    }

    /**
     * 获取wind1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind1() {
        return wind1;
    }

    /**
     * 设置wind1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind1(String value) {
        this.wind1 = value;
    }

    /**
     * 获取fl1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFl1() {
        return fl1;
    }

    /**
     * 设置fl1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFl1(String value) {
        this.fl1 = value;
    }

    /**
     * 获取img1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg1() {
        return img1;
    }

    /**
     * 设置img1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg1(String value) {
        this.img1 = value;
    }

    /**
     * 获取img2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg2() {
        return img2;
    }

    /**
     * 设置img2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg2(String value) {
        this.img2 = value;
    }

    /**
     * 获取temp2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemp2() {
        return temp2;
    }

    /**
     * 设置temp2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemp2(String value) {
        this.temp2 = value;
    }

    /**
     * 获取weather2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather2() {
        return weather2;
    }

    /**
     * 设置weather2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather2(String value) {
        this.weather2 = value;
    }

    /**
     * 获取wind2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind2() {
        return wind2;
    }

    /**
     * 设置wind2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind2(String value) {
        this.wind2 = value;
    }

    /**
     * 获取fl2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFl2() {
        return fl2;
    }

    /**
     * 设置fl2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFl2(String value) {
        this.fl2 = value;
    }

    /**
     * 获取img3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg3() {
        return img3;
    }

    /**
     * 设置img3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg3(String value) {
        this.img3 = value;
    }

    /**
     * 获取img4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg4() {
        return img4;
    }

    /**
     * 设置img4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg4(String value) {
        this.img4 = value;
    }

    /**
     * 获取temp3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemp3() {
        return temp3;
    }

    /**
     * 设置temp3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemp3(String value) {
        this.temp3 = value;
    }

    /**
     * 获取weather3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather3() {
        return weather3;
    }

    /**
     * 设置weather3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather3(String value) {
        this.weather3 = value;
    }

    /**
     * 获取wind3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind3() {
        return wind3;
    }

    /**
     * 设置wind3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind3(String value) {
        this.wind3 = value;
    }

    /**
     * 获取fl3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFl3() {
        return fl3;
    }

    /**
     * 设置fl3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFl3(String value) {
        this.fl3 = value;
    }

    /**
     * 获取img5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg5() {
        return img5;
    }

    /**
     * 设置img5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg5(String value) {
        this.img5 = value;
    }

    /**
     * 获取img6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg6() {
        return img6;
    }

    /**
     * 设置img6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg6(String value) {
        this.img6 = value;
    }

    /**
     * 获取temp4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemp4() {
        return temp4;
    }

    /**
     * 设置temp4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemp4(String value) {
        this.temp4 = value;
    }

    /**
     * 获取weather4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather4() {
        return weather4;
    }

    /**
     * 设置weather4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather4(String value) {
        this.weather4 = value;
    }

    /**
     * 获取wind4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind4() {
        return wind4;
    }

    /**
     * 设置wind4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind4(String value) {
        this.wind4 = value;
    }

    /**
     * 获取fl4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFl4() {
        return fl4;
    }

    /**
     * 设置fl4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFl4(String value) {
        this.fl4 = value;
    }

    /**
     * 获取img7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg7() {
        return img7;
    }

    /**
     * 设置img7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg7(String value) {
        this.img7 = value;
    }

    /**
     * 获取img8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg8() {
        return img8;
    }

    /**
     * 设置img8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg8(String value) {
        this.img8 = value;
    }

    /**
     * 获取temp5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemp5() {
        return temp5;
    }

    /**
     * 设置temp5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemp5(String value) {
        this.temp5 = value;
    }

    /**
     * 获取weather5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather5() {
        return weather5;
    }

    /**
     * 设置weather5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather5(String value) {
        this.weather5 = value;
    }

    /**
     * 获取wind5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind5() {
        return wind5;
    }

    /**
     * 设置wind5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind5(String value) {
        this.wind5 = value;
    }

    /**
     * 获取fl5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFl5() {
        return fl5;
    }

    /**
     * 设置fl5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFl5(String value) {
        this.fl5 = value;
    }

    /**
     * 获取img9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg9() {
        return img9;
    }

    /**
     * 设置img9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg9(String value) {
        this.img9 = value;
    }

    /**
     * 获取img10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg10() {
        return img10;
    }

    /**
     * 设置img10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg10(String value) {
        this.img10 = value;
    }

    /**
     * 获取temp6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemp6() {
        return temp6;
    }

    /**
     * 设置temp6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemp6(String value) {
        this.temp6 = value;
    }

    /**
     * 获取weather6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather6() {
        return weather6;
    }

    /**
     * 设置weather6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather6(String value) {
        this.weather6 = value;
    }

    /**
     * 获取wind6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind6() {
        return wind6;
    }

    /**
     * 设置wind6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind6(String value) {
        this.wind6 = value;
    }

    /**
     * 获取fl6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFl6() {
        return fl6;
    }

    /**
     * 设置fl6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFl6(String value) {
        this.fl6 = value;
    }

    /**
     * 获取img11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg11() {
        return img11;
    }

    /**
     * 设置img11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg11(String value) {
        this.img11 = value;
    }

    /**
     * 获取img12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg12() {
        return img12;
    }

    /**
     * 设置img12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg12(String value) {
        this.img12 = value;
    }

    /**
     * 获取indexD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexD() {
        return indexD;
    }

    /**
     * 设置indexD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexD(String value) {
        this.indexD = value;
    }

}
