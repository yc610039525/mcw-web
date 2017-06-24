
package com._36wu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WeatherIndex complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WeatherIndex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ac_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ac_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ac_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ac_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ag_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ag_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ag_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ag_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="be_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="be_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="be_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="be_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cl_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cl_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cl_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cl_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="co_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="co_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="co_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="co_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ct_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ct_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ct_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ct_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dy_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dy_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dy_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dy_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fs_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fs_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fs_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fs_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gj_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gj_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gj_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gj_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gl_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gl_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gl_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gl_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gm_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gm_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gm_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gm_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gz_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gz_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gz_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gz_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hc_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hc_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hc_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hc_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jt_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jt_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jt_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jt_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lk_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lk_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lk_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lk_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ls_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ls_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ls_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ls_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mf_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mf_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mf_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mf_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nl_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nl_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nl_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nl_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pj_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pj_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pj_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pj_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pk_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pk_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pk_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pk_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pl_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pl_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pl_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pl_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pt_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pt_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pt_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pt_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pp_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pp_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pp_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pp_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sg_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sg_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sg_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sg_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tr_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tr_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tr_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tr_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uv_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uv_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uv_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uv_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xc_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xc_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xc_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xc_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xq_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xq_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xq_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xq_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yd_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yd_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yd_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yd_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yh_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yh_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yh_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yh_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ys_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ys_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ys_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ys_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zs_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zs_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zs_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zs_des_s" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherIndex", propOrder = {
    "areaid",
    "prov",
    "city",
    "district",
    "acName",
    "acHint",
    "acDes",
    "acDesS",
    "agName",
    "agHint",
    "agDes",
    "agDesS",
    "beName",
    "beHint",
    "beDes",
    "beDesS",
    "clName",
    "clHint",
    "clDes",
    "clDesS",
    "coName",
    "coHint",
    "coDes",
    "coDesS",
    "ctName",
    "ctHint",
    "ctDes",
    "ctDesS",
    "dyName",
    "dyHint",
    "dyDes",
    "dyDesS",
    "fsName",
    "fsHint",
    "fsDes",
    "fsDesS",
    "gjName",
    "gjHint",
    "gjDes",
    "gjDesS",
    "glName",
    "glHint",
    "glDes",
    "glDesS",
    "gmName",
    "gmHint",
    "gmDes",
    "gmDesS",
    "gzName",
    "gzHint",
    "gzDes",
    "gzDesS",
    "hcName",
    "hcHint",
    "hcDes",
    "hcDesS",
    "jtName",
    "jtHint",
    "jtDes",
    "jtDesS",
    "lkName",
    "lkHint",
    "lkDes",
    "lkDesS",
    "lsName",
    "lsHint",
    "lsDes",
    "lsDesS",
    "mfName",
    "mfHint",
    "mfDes",
    "mfDesS",
    "nlName",
    "nlHint",
    "nlDes",
    "nlDesS",
    "pjName",
    "pjHint",
    "pjDes",
    "pjDesS",
    "pkName",
    "pkHint",
    "pkDes",
    "pkDesS",
    "plName",
    "plHint",
    "plDes",
    "plDesS",
    "ptName",
    "ptHint",
    "ptDes",
    "ptDesS",
    "ppName",
    "ppHint",
    "ppDes",
    "ppDesS",
    "sgName",
    "sgHint",
    "sgDes",
    "sgDesS",
    "trName",
    "trHint",
    "trDes",
    "trDesS",
    "uvName",
    "uvHint",
    "uvDes",
    "uvDesS",
    "xcName",
    "xcHint",
    "xcDes",
    "xcDesS",
    "xqName",
    "xqHint",
    "xqDes",
    "xqDesS",
    "ydName",
    "ydHint",
    "ydDes",
    "ydDesS",
    "yhName",
    "yhHint",
    "yhDes",
    "yhDesS",
    "ysName",
    "ysHint",
    "ysDes",
    "ysDesS",
    "zsName",
    "zsHint",
    "zsDes",
    "zsDesS"
})
public class WeatherIndex {

    protected int areaid;
    protected String prov;
    protected String city;
    protected String district;
    @XmlElement(name = "ac_name")
    protected String acName;
    @XmlElement(name = "ac_hint")
    protected String acHint;
    @XmlElement(name = "ac_des")
    protected String acDes;
    @XmlElement(name = "ac_des_s")
    protected String acDesS;
    @XmlElement(name = "ag_name")
    protected String agName;
    @XmlElement(name = "ag_hint")
    protected String agHint;
    @XmlElement(name = "ag_des")
    protected String agDes;
    @XmlElement(name = "ag_des_s")
    protected String agDesS;
    @XmlElement(name = "be_name")
    protected String beName;
    @XmlElement(name = "be_hint")
    protected String beHint;
    @XmlElement(name = "be_des")
    protected String beDes;
    @XmlElement(name = "be_des_s")
    protected String beDesS;
    @XmlElement(name = "cl_name")
    protected String clName;
    @XmlElement(name = "cl_hint")
    protected String clHint;
    @XmlElement(name = "cl_des")
    protected String clDes;
    @XmlElement(name = "cl_des_s")
    protected String clDesS;
    @XmlElement(name = "co_name")
    protected String coName;
    @XmlElement(name = "co_hint")
    protected String coHint;
    @XmlElement(name = "co_des")
    protected String coDes;
    @XmlElement(name = "co_des_s")
    protected String coDesS;
    @XmlElement(name = "ct_name")
    protected String ctName;
    @XmlElement(name = "ct_hint")
    protected String ctHint;
    @XmlElement(name = "ct_des")
    protected String ctDes;
    @XmlElement(name = "ct_des_s")
    protected String ctDesS;
    @XmlElement(name = "dy_name")
    protected String dyName;
    @XmlElement(name = "dy_hint")
    protected String dyHint;
    @XmlElement(name = "dy_des")
    protected String dyDes;
    @XmlElement(name = "dy_des_s")
    protected String dyDesS;
    @XmlElement(name = "fs_name")
    protected String fsName;
    @XmlElement(name = "fs_hint")
    protected String fsHint;
    @XmlElement(name = "fs_des")
    protected String fsDes;
    @XmlElement(name = "fs_des_s")
    protected String fsDesS;
    @XmlElement(name = "gj_name")
    protected String gjName;
    @XmlElement(name = "gj_hint")
    protected String gjHint;
    @XmlElement(name = "gj_des")
    protected String gjDes;
    @XmlElement(name = "gj_des_s")
    protected String gjDesS;
    @XmlElement(name = "gl_name")
    protected String glName;
    @XmlElement(name = "gl_hint")
    protected String glHint;
    @XmlElement(name = "gl_des")
    protected String glDes;
    @XmlElement(name = "gl_des_s")
    protected String glDesS;
    @XmlElement(name = "gm_name")
    protected String gmName;
    @XmlElement(name = "gm_hint")
    protected String gmHint;
    @XmlElement(name = "gm_des")
    protected String gmDes;
    @XmlElement(name = "gm_des_s")
    protected String gmDesS;
    @XmlElement(name = "gz_name")
    protected String gzName;
    @XmlElement(name = "gz_hint")
    protected String gzHint;
    @XmlElement(name = "gz_des")
    protected String gzDes;
    @XmlElement(name = "gz_des_s")
    protected String gzDesS;
    @XmlElement(name = "hc_name")
    protected String hcName;
    @XmlElement(name = "hc_hint")
    protected String hcHint;
    @XmlElement(name = "hc_des")
    protected String hcDes;
    @XmlElement(name = "hc_des_s")
    protected String hcDesS;
    @XmlElement(name = "jt_name")
    protected String jtName;
    @XmlElement(name = "jt_hint")
    protected String jtHint;
    @XmlElement(name = "jt_des")
    protected String jtDes;
    @XmlElement(name = "jt_des_s")
    protected String jtDesS;
    @XmlElement(name = "lk_name")
    protected String lkName;
    @XmlElement(name = "lk_hint")
    protected String lkHint;
    @XmlElement(name = "lk_des")
    protected String lkDes;
    @XmlElement(name = "lk_des_s")
    protected String lkDesS;
    @XmlElement(name = "ls_name")
    protected String lsName;
    @XmlElement(name = "ls_hint")
    protected String lsHint;
    @XmlElement(name = "ls_des")
    protected String lsDes;
    @XmlElement(name = "ls_des_s")
    protected String lsDesS;
    @XmlElement(name = "mf_name")
    protected String mfName;
    @XmlElement(name = "mf_hint")
    protected String mfHint;
    @XmlElement(name = "mf_des")
    protected String mfDes;
    @XmlElement(name = "mf_des_s")
    protected String mfDesS;
    @XmlElement(name = "nl_name")
    protected String nlName;
    @XmlElement(name = "nl_hint")
    protected String nlHint;
    @XmlElement(name = "nl_des")
    protected String nlDes;
    @XmlElement(name = "nl_des_s")
    protected String nlDesS;
    @XmlElement(name = "pj_name")
    protected String pjName;
    @XmlElement(name = "pj_hint")
    protected String pjHint;
    @XmlElement(name = "pj_des")
    protected String pjDes;
    @XmlElement(name = "pj_des_s")
    protected String pjDesS;
    @XmlElement(name = "pk_name")
    protected String pkName;
    @XmlElement(name = "pk_hint")
    protected String pkHint;
    @XmlElement(name = "pk_des")
    protected String pkDes;
    @XmlElement(name = "pk_des_s")
    protected String pkDesS;
    @XmlElement(name = "pl_name")
    protected String plName;
    @XmlElement(name = "pl_hint")
    protected String plHint;
    @XmlElement(name = "pl_des")
    protected String plDes;
    @XmlElement(name = "pl_des_s")
    protected String plDesS;
    @XmlElement(name = "pt_name")
    protected String ptName;
    @XmlElement(name = "pt_hint")
    protected String ptHint;
    @XmlElement(name = "pt_des")
    protected String ptDes;
    @XmlElement(name = "pt_des_s")
    protected String ptDesS;
    @XmlElement(name = "pp_name")
    protected String ppName;
    @XmlElement(name = "pp_hint")
    protected String ppHint;
    @XmlElement(name = "pp_des")
    protected String ppDes;
    @XmlElement(name = "pp_des_s")
    protected String ppDesS;
    @XmlElement(name = "sg_name")
    protected String sgName;
    @XmlElement(name = "sg_hint")
    protected String sgHint;
    @XmlElement(name = "sg_des")
    protected String sgDes;
    @XmlElement(name = "sg_des_s")
    protected String sgDesS;
    @XmlElement(name = "tr_name")
    protected String trName;
    @XmlElement(name = "tr_hint")
    protected String trHint;
    @XmlElement(name = "tr_des")
    protected String trDes;
    @XmlElement(name = "tr_des_s")
    protected String trDesS;
    @XmlElement(name = "uv_name")
    protected String uvName;
    @XmlElement(name = "uv_hint")
    protected String uvHint;
    @XmlElement(name = "uv_des")
    protected String uvDes;
    @XmlElement(name = "uv_des_s")
    protected String uvDesS;
    @XmlElement(name = "xc_name")
    protected String xcName;
    @XmlElement(name = "xc_hint")
    protected String xcHint;
    @XmlElement(name = "xc_des")
    protected String xcDes;
    @XmlElement(name = "xc_des_s")
    protected String xcDesS;
    @XmlElement(name = "xq_name")
    protected String xqName;
    @XmlElement(name = "xq_hint")
    protected String xqHint;
    @XmlElement(name = "xq_des")
    protected String xqDes;
    @XmlElement(name = "xq_des_s")
    protected String xqDesS;
    @XmlElement(name = "yd_name")
    protected String ydName;
    @XmlElement(name = "yd_hint")
    protected String ydHint;
    @XmlElement(name = "yd_des")
    protected String ydDes;
    @XmlElement(name = "yd_des_s")
    protected String ydDesS;
    @XmlElement(name = "yh_name")
    protected String yhName;
    @XmlElement(name = "yh_hint")
    protected String yhHint;
    @XmlElement(name = "yh_des")
    protected String yhDes;
    @XmlElement(name = "yh_des_s")
    protected String yhDesS;
    @XmlElement(name = "ys_name")
    protected String ysName;
    @XmlElement(name = "ys_hint")
    protected String ysHint;
    @XmlElement(name = "ys_des")
    protected String ysDes;
    @XmlElement(name = "ys_des_s")
    protected String ysDesS;
    @XmlElement(name = "zs_name")
    protected String zsName;
    @XmlElement(name = "zs_hint")
    protected String zsHint;
    @XmlElement(name = "zs_des")
    protected String zsDes;
    @XmlElement(name = "zs_des_s")
    protected String zsDesS;

    /**
     * ��ȡareaid���Ե�ֵ��
     * 
     */
    public int getAreaid() {
        return areaid;
    }

    /**
     * ����areaid���Ե�ֵ��
     * 
     */
    public void setAreaid(int value) {
        this.areaid = value;
    }

    /**
     * ��ȡprov���Ե�ֵ��
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
     * ����prov���Ե�ֵ��
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
     * ��ȡcity���Ե�ֵ��
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
     * ����city���Ե�ֵ��
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
     * ��ȡdistrict���Ե�ֵ��
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
     * ����district���Ե�ֵ��
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
     * ��ȡacName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcName() {
        return acName;
    }

    /**
     * ����acName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcName(String value) {
        this.acName = value;
    }

    /**
     * ��ȡacHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcHint() {
        return acHint;
    }

    /**
     * ����acHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcHint(String value) {
        this.acHint = value;
    }

    /**
     * ��ȡacDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcDes() {
        return acDes;
    }

    /**
     * ����acDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcDes(String value) {
        this.acDes = value;
    }

    /**
     * ��ȡacDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcDesS() {
        return acDesS;
    }

    /**
     * ����acDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcDesS(String value) {
        this.acDesS = value;
    }

    /**
     * ��ȡagName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgName() {
        return agName;
    }

    /**
     * ����agName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgName(String value) {
        this.agName = value;
    }

    /**
     * ��ȡagHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgHint() {
        return agHint;
    }

    /**
     * ����agHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgHint(String value) {
        this.agHint = value;
    }

    /**
     * ��ȡagDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgDes() {
        return agDes;
    }

    /**
     * ����agDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgDes(String value) {
        this.agDes = value;
    }

    /**
     * ��ȡagDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgDesS() {
        return agDesS;
    }

    /**
     * ����agDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgDesS(String value) {
        this.agDesS = value;
    }

    /**
     * ��ȡbeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeName() {
        return beName;
    }

    /**
     * ����beName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeName(String value) {
        this.beName = value;
    }

    /**
     * ��ȡbeHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeHint() {
        return beHint;
    }

    /**
     * ����beHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeHint(String value) {
        this.beHint = value;
    }

    /**
     * ��ȡbeDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeDes() {
        return beDes;
    }

    /**
     * ����beDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeDes(String value) {
        this.beDes = value;
    }

    /**
     * ��ȡbeDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeDesS() {
        return beDesS;
    }

    /**
     * ����beDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeDesS(String value) {
        this.beDesS = value;
    }

    /**
     * ��ȡclName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClName() {
        return clName;
    }

    /**
     * ����clName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClName(String value) {
        this.clName = value;
    }

    /**
     * ��ȡclHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClHint() {
        return clHint;
    }

    /**
     * ����clHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClHint(String value) {
        this.clHint = value;
    }

    /**
     * ��ȡclDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClDes() {
        return clDes;
    }

    /**
     * ����clDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClDes(String value) {
        this.clDes = value;
    }

    /**
     * ��ȡclDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClDesS() {
        return clDesS;
    }

    /**
     * ����clDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClDesS(String value) {
        this.clDesS = value;
    }

    /**
     * ��ȡcoName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoName() {
        return coName;
    }

    /**
     * ����coName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoName(String value) {
        this.coName = value;
    }

    /**
     * ��ȡcoHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoHint() {
        return coHint;
    }

    /**
     * ����coHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoHint(String value) {
        this.coHint = value;
    }

    /**
     * ��ȡcoDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoDes() {
        return coDes;
    }

    /**
     * ����coDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoDes(String value) {
        this.coDes = value;
    }

    /**
     * ��ȡcoDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoDesS() {
        return coDesS;
    }

    /**
     * ����coDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoDesS(String value) {
        this.coDesS = value;
    }

    /**
     * ��ȡctName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtName() {
        return ctName;
    }

    /**
     * ����ctName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtName(String value) {
        this.ctName = value;
    }

    /**
     * ��ȡctHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtHint() {
        return ctHint;
    }

    /**
     * ����ctHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtHint(String value) {
        this.ctHint = value;
    }

    /**
     * ��ȡctDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtDes() {
        return ctDes;
    }

    /**
     * ����ctDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtDes(String value) {
        this.ctDes = value;
    }

    /**
     * ��ȡctDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtDesS() {
        return ctDesS;
    }

    /**
     * ����ctDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtDesS(String value) {
        this.ctDesS = value;
    }

    /**
     * ��ȡdyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyName() {
        return dyName;
    }

    /**
     * ����dyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyName(String value) {
        this.dyName = value;
    }

    /**
     * ��ȡdyHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyHint() {
        return dyHint;
    }

    /**
     * ����dyHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyHint(String value) {
        this.dyHint = value;
    }

    /**
     * ��ȡdyDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyDes() {
        return dyDes;
    }

    /**
     * ����dyDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyDes(String value) {
        this.dyDes = value;
    }

    /**
     * ��ȡdyDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyDesS() {
        return dyDesS;
    }

    /**
     * ����dyDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyDesS(String value) {
        this.dyDesS = value;
    }

    /**
     * ��ȡfsName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsName() {
        return fsName;
    }

    /**
     * ����fsName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsName(String value) {
        this.fsName = value;
    }

    /**
     * ��ȡfsHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsHint() {
        return fsHint;
    }

    /**
     * ����fsHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsHint(String value) {
        this.fsHint = value;
    }

    /**
     * ��ȡfsDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsDes() {
        return fsDes;
    }

    /**
     * ����fsDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsDes(String value) {
        this.fsDes = value;
    }

    /**
     * ��ȡfsDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsDesS() {
        return fsDesS;
    }

    /**
     * ����fsDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsDesS(String value) {
        this.fsDesS = value;
    }

    /**
     * ��ȡgjName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjName() {
        return gjName;
    }

    /**
     * ����gjName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjName(String value) {
        this.gjName = value;
    }

    /**
     * ��ȡgjHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjHint() {
        return gjHint;
    }

    /**
     * ����gjHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjHint(String value) {
        this.gjHint = value;
    }

    /**
     * ��ȡgjDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjDes() {
        return gjDes;
    }

    /**
     * ����gjDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjDes(String value) {
        this.gjDes = value;
    }

    /**
     * ��ȡgjDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjDesS() {
        return gjDesS;
    }

    /**
     * ����gjDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjDesS(String value) {
        this.gjDesS = value;
    }

    /**
     * ��ȡglName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlName() {
        return glName;
    }

    /**
     * ����glName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlName(String value) {
        this.glName = value;
    }

    /**
     * ��ȡglHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlHint() {
        return glHint;
    }

    /**
     * ����glHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlHint(String value) {
        this.glHint = value;
    }

    /**
     * ��ȡglDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlDes() {
        return glDes;
    }

    /**
     * ����glDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlDes(String value) {
        this.glDes = value;
    }

    /**
     * ��ȡglDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlDesS() {
        return glDesS;
    }

    /**
     * ����glDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlDesS(String value) {
        this.glDesS = value;
    }

    /**
     * ��ȡgmName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmName() {
        return gmName;
    }

    /**
     * ����gmName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmName(String value) {
        this.gmName = value;
    }

    /**
     * ��ȡgmHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmHint() {
        return gmHint;
    }

    /**
     * ����gmHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmHint(String value) {
        this.gmHint = value;
    }

    /**
     * ��ȡgmDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmDes() {
        return gmDes;
    }

    /**
     * ����gmDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmDes(String value) {
        this.gmDes = value;
    }

    /**
     * ��ȡgmDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmDesS() {
        return gmDesS;
    }

    /**
     * ����gmDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmDesS(String value) {
        this.gmDesS = value;
    }

    /**
     * ��ȡgzName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGzName() {
        return gzName;
    }

    /**
     * ����gzName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGzName(String value) {
        this.gzName = value;
    }

    /**
     * ��ȡgzHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGzHint() {
        return gzHint;
    }

    /**
     * ����gzHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGzHint(String value) {
        this.gzHint = value;
    }

    /**
     * ��ȡgzDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGzDes() {
        return gzDes;
    }

    /**
     * ����gzDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGzDes(String value) {
        this.gzDes = value;
    }

    /**
     * ��ȡgzDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGzDesS() {
        return gzDesS;
    }

    /**
     * ����gzDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGzDesS(String value) {
        this.gzDesS = value;
    }

    /**
     * ��ȡhcName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcName() {
        return hcName;
    }

    /**
     * ����hcName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcName(String value) {
        this.hcName = value;
    }

    /**
     * ��ȡhcHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcHint() {
        return hcHint;
    }

    /**
     * ����hcHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcHint(String value) {
        this.hcHint = value;
    }

    /**
     * ��ȡhcDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcDes() {
        return hcDes;
    }

    /**
     * ����hcDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcDes(String value) {
        this.hcDes = value;
    }

    /**
     * ��ȡhcDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcDesS() {
        return hcDesS;
    }

    /**
     * ����hcDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcDesS(String value) {
        this.hcDesS = value;
    }

    /**
     * ��ȡjtName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtName() {
        return jtName;
    }

    /**
     * ����jtName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtName(String value) {
        this.jtName = value;
    }

    /**
     * ��ȡjtHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtHint() {
        return jtHint;
    }

    /**
     * ����jtHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtHint(String value) {
        this.jtHint = value;
    }

    /**
     * ��ȡjtDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtDes() {
        return jtDes;
    }

    /**
     * ����jtDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtDes(String value) {
        this.jtDes = value;
    }

    /**
     * ��ȡjtDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtDesS() {
        return jtDesS;
    }

    /**
     * ����jtDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtDesS(String value) {
        this.jtDesS = value;
    }

    /**
     * ��ȡlkName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkName() {
        return lkName;
    }

    /**
     * ����lkName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkName(String value) {
        this.lkName = value;
    }

    /**
     * ��ȡlkHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkHint() {
        return lkHint;
    }

    /**
     * ����lkHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkHint(String value) {
        this.lkHint = value;
    }

    /**
     * ��ȡlkDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkDes() {
        return lkDes;
    }

    /**
     * ����lkDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkDes(String value) {
        this.lkDes = value;
    }

    /**
     * ��ȡlkDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkDesS() {
        return lkDesS;
    }

    /**
     * ����lkDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkDesS(String value) {
        this.lkDesS = value;
    }

    /**
     * ��ȡlsName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsName() {
        return lsName;
    }

    /**
     * ����lsName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsName(String value) {
        this.lsName = value;
    }

    /**
     * ��ȡlsHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsHint() {
        return lsHint;
    }

    /**
     * ����lsHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsHint(String value) {
        this.lsHint = value;
    }

    /**
     * ��ȡlsDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsDes() {
        return lsDes;
    }

    /**
     * ����lsDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsDes(String value) {
        this.lsDes = value;
    }

    /**
     * ��ȡlsDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsDesS() {
        return lsDesS;
    }

    /**
     * ����lsDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsDesS(String value) {
        this.lsDesS = value;
    }

    /**
     * ��ȡmfName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfName() {
        return mfName;
    }

    /**
     * ����mfName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfName(String value) {
        this.mfName = value;
    }

    /**
     * ��ȡmfHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfHint() {
        return mfHint;
    }

    /**
     * ����mfHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfHint(String value) {
        this.mfHint = value;
    }

    /**
     * ��ȡmfDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfDes() {
        return mfDes;
    }

    /**
     * ����mfDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfDes(String value) {
        this.mfDes = value;
    }

    /**
     * ��ȡmfDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfDesS() {
        return mfDesS;
    }

    /**
     * ����mfDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfDesS(String value) {
        this.mfDesS = value;
    }

    /**
     * ��ȡnlName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlName() {
        return nlName;
    }

    /**
     * ����nlName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlName(String value) {
        this.nlName = value;
    }

    /**
     * ��ȡnlHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlHint() {
        return nlHint;
    }

    /**
     * ����nlHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlHint(String value) {
        this.nlHint = value;
    }

    /**
     * ��ȡnlDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlDes() {
        return nlDes;
    }

    /**
     * ����nlDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlDes(String value) {
        this.nlDes = value;
    }

    /**
     * ��ȡnlDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlDesS() {
        return nlDesS;
    }

    /**
     * ����nlDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlDesS(String value) {
        this.nlDesS = value;
    }

    /**
     * ��ȡpjName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjName() {
        return pjName;
    }

    /**
     * ����pjName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjName(String value) {
        this.pjName = value;
    }

    /**
     * ��ȡpjHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjHint() {
        return pjHint;
    }

    /**
     * ����pjHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjHint(String value) {
        this.pjHint = value;
    }

    /**
     * ��ȡpjDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjDes() {
        return pjDes;
    }

    /**
     * ����pjDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjDes(String value) {
        this.pjDes = value;
    }

    /**
     * ��ȡpjDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjDesS() {
        return pjDesS;
    }

    /**
     * ����pjDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjDesS(String value) {
        this.pjDesS = value;
    }

    /**
     * ��ȡpkName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkName() {
        return pkName;
    }

    /**
     * ����pkName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkName(String value) {
        this.pkName = value;
    }

    /**
     * ��ȡpkHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkHint() {
        return pkHint;
    }

    /**
     * ����pkHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkHint(String value) {
        this.pkHint = value;
    }

    /**
     * ��ȡpkDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkDes() {
        return pkDes;
    }

    /**
     * ����pkDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkDes(String value) {
        this.pkDes = value;
    }

    /**
     * ��ȡpkDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkDesS() {
        return pkDesS;
    }

    /**
     * ����pkDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkDesS(String value) {
        this.pkDesS = value;
    }

    /**
     * ��ȡplName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlName() {
        return plName;
    }

    /**
     * ����plName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlName(String value) {
        this.plName = value;
    }

    /**
     * ��ȡplHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlHint() {
        return plHint;
    }

    /**
     * ����plHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlHint(String value) {
        this.plHint = value;
    }

    /**
     * ��ȡplDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlDes() {
        return plDes;
    }

    /**
     * ����plDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlDes(String value) {
        this.plDes = value;
    }

    /**
     * ��ȡplDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlDesS() {
        return plDesS;
    }

    /**
     * ����plDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlDesS(String value) {
        this.plDesS = value;
    }

    /**
     * ��ȡptName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtName() {
        return ptName;
    }

    /**
     * ����ptName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtName(String value) {
        this.ptName = value;
    }

    /**
     * ��ȡptHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtHint() {
        return ptHint;
    }

    /**
     * ����ptHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtHint(String value) {
        this.ptHint = value;
    }

    /**
     * ��ȡptDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtDes() {
        return ptDes;
    }

    /**
     * ����ptDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtDes(String value) {
        this.ptDes = value;
    }

    /**
     * ��ȡptDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtDesS() {
        return ptDesS;
    }

    /**
     * ����ptDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtDesS(String value) {
        this.ptDesS = value;
    }

    /**
     * ��ȡppName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpName() {
        return ppName;
    }

    /**
     * ����ppName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpName(String value) {
        this.ppName = value;
    }

    /**
     * ��ȡppHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpHint() {
        return ppHint;
    }

    /**
     * ����ppHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpHint(String value) {
        this.ppHint = value;
    }

    /**
     * ��ȡppDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpDes() {
        return ppDes;
    }

    /**
     * ����ppDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpDes(String value) {
        this.ppDes = value;
    }

    /**
     * ��ȡppDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpDesS() {
        return ppDesS;
    }

    /**
     * ����ppDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpDesS(String value) {
        this.ppDesS = value;
    }

    /**
     * ��ȡsgName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgName() {
        return sgName;
    }

    /**
     * ����sgName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgName(String value) {
        this.sgName = value;
    }

    /**
     * ��ȡsgHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgHint() {
        return sgHint;
    }

    /**
     * ����sgHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgHint(String value) {
        this.sgHint = value;
    }

    /**
     * ��ȡsgDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgDes() {
        return sgDes;
    }

    /**
     * ����sgDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgDes(String value) {
        this.sgDes = value;
    }

    /**
     * ��ȡsgDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgDesS() {
        return sgDesS;
    }

    /**
     * ����sgDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgDesS(String value) {
        this.sgDesS = value;
    }

    /**
     * ��ȡtrName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrName() {
        return trName;
    }

    /**
     * ����trName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrName(String value) {
        this.trName = value;
    }

    /**
     * ��ȡtrHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrHint() {
        return trHint;
    }

    /**
     * ����trHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrHint(String value) {
        this.trHint = value;
    }

    /**
     * ��ȡtrDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrDes() {
        return trDes;
    }

    /**
     * ����trDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrDes(String value) {
        this.trDes = value;
    }

    /**
     * ��ȡtrDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrDesS() {
        return trDesS;
    }

    /**
     * ����trDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrDesS(String value) {
        this.trDesS = value;
    }

    /**
     * ��ȡuvName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvName() {
        return uvName;
    }

    /**
     * ����uvName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvName(String value) {
        this.uvName = value;
    }

    /**
     * ��ȡuvHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvHint() {
        return uvHint;
    }

    /**
     * ����uvHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvHint(String value) {
        this.uvHint = value;
    }

    /**
     * ��ȡuvDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvDes() {
        return uvDes;
    }

    /**
     * ����uvDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvDes(String value) {
        this.uvDes = value;
    }

    /**
     * ��ȡuvDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvDesS() {
        return uvDesS;
    }

    /**
     * ����uvDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvDesS(String value) {
        this.uvDesS = value;
    }

    /**
     * ��ȡxcName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcName() {
        return xcName;
    }

    /**
     * ����xcName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcName(String value) {
        this.xcName = value;
    }

    /**
     * ��ȡxcHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcHint() {
        return xcHint;
    }

    /**
     * ����xcHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcHint(String value) {
        this.xcHint = value;
    }

    /**
     * ��ȡxcDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcDes() {
        return xcDes;
    }

    /**
     * ����xcDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcDes(String value) {
        this.xcDes = value;
    }

    /**
     * ��ȡxcDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcDesS() {
        return xcDesS;
    }

    /**
     * ����xcDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcDesS(String value) {
        this.xcDesS = value;
    }

    /**
     * ��ȡxqName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXqName() {
        return xqName;
    }

    /**
     * ����xqName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXqName(String value) {
        this.xqName = value;
    }

    /**
     * ��ȡxqHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXqHint() {
        return xqHint;
    }

    /**
     * ����xqHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXqHint(String value) {
        this.xqHint = value;
    }

    /**
     * ��ȡxqDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXqDes() {
        return xqDes;
    }

    /**
     * ����xqDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXqDes(String value) {
        this.xqDes = value;
    }

    /**
     * ��ȡxqDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXqDesS() {
        return xqDesS;
    }

    /**
     * ����xqDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXqDesS(String value) {
        this.xqDesS = value;
    }

    /**
     * ��ȡydName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdName() {
        return ydName;
    }

    /**
     * ����ydName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdName(String value) {
        this.ydName = value;
    }

    /**
     * ��ȡydHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdHint() {
        return ydHint;
    }

    /**
     * ����ydHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdHint(String value) {
        this.ydHint = value;
    }

    /**
     * ��ȡydDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdDes() {
        return ydDes;
    }

    /**
     * ����ydDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdDes(String value) {
        this.ydDes = value;
    }

    /**
     * ��ȡydDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdDesS() {
        return ydDesS;
    }

    /**
     * ����ydDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdDesS(String value) {
        this.ydDesS = value;
    }

    /**
     * ��ȡyhName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYhName() {
        return yhName;
    }

    /**
     * ����yhName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYhName(String value) {
        this.yhName = value;
    }

    /**
     * ��ȡyhHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYhHint() {
        return yhHint;
    }

    /**
     * ����yhHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYhHint(String value) {
        this.yhHint = value;
    }

    /**
     * ��ȡyhDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYhDes() {
        return yhDes;
    }

    /**
     * ����yhDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYhDes(String value) {
        this.yhDes = value;
    }

    /**
     * ��ȡyhDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYhDesS() {
        return yhDesS;
    }

    /**
     * ����yhDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYhDesS(String value) {
        this.yhDesS = value;
    }

    /**
     * ��ȡysName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsName() {
        return ysName;
    }

    /**
     * ����ysName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsName(String value) {
        this.ysName = value;
    }

    /**
     * ��ȡysHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsHint() {
        return ysHint;
    }

    /**
     * ����ysHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsHint(String value) {
        this.ysHint = value;
    }

    /**
     * ��ȡysDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsDes() {
        return ysDes;
    }

    /**
     * ����ysDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsDes(String value) {
        this.ysDes = value;
    }

    /**
     * ��ȡysDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsDesS() {
        return ysDesS;
    }

    /**
     * ����ysDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsDesS(String value) {
        this.ysDesS = value;
    }

    /**
     * ��ȡzsName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsName() {
        return zsName;
    }

    /**
     * ����zsName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsName(String value) {
        this.zsName = value;
    }

    /**
     * ��ȡzsHint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsHint() {
        return zsHint;
    }

    /**
     * ����zsHint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsHint(String value) {
        this.zsHint = value;
    }

    /**
     * ��ȡzsDes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsDes() {
        return zsDes;
    }

    /**
     * ����zsDes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsDes(String value) {
        this.zsDes = value;
    }

    /**
     * ��ȡzsDesS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsDesS() {
        return zsDesS;
    }

    /**
     * ����zsDesS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsDesS(String value) {
        this.zsDesS = value;
    }

}
