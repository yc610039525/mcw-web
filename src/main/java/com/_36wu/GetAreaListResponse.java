
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
 *         &lt;element name="GetAreaListResult" type="{http://www.36wu.com/}ResultOfListOfArea" minOccurs="0"/&gt;
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
    "getAreaListResult"
})
@XmlRootElement(name = "GetAreaListResponse")
public class GetAreaListResponse {

    @XmlElement(name = "GetAreaListResult")
    protected ResultOfListOfArea getAreaListResult;

    /**
     * 获取getAreaListResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResultOfListOfArea }
     *     
     */
    public ResultOfListOfArea getGetAreaListResult() {
        return getAreaListResult;
    }

    /**
     * 设置getAreaListResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfListOfArea }
     *     
     */
    public void setGetAreaListResult(ResultOfListOfArea value) {
        this.getAreaListResult = value;
    }

}
