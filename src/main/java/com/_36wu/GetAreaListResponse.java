
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
     * ��ȡgetAreaListResult���Ե�ֵ��
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
     * ����getAreaListResult���Ե�ֵ��
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
