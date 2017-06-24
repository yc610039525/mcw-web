
package com._36wu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WeatherIndex complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取acName属性的值。
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
     * 设置acName属性的值。
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
     * 获取acHint属性的值。
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
     * 设置acHint属性的值。
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
     * 获取acDes属性的值。
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
     * 设置acDes属性的值。
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
     * 获取acDesS属性的值。
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
     * 设置acDesS属性的值。
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
     * 获取agName属性的值。
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
     * 设置agName属性的值。
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
     * 获取agHint属性的值。
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
     * 设置agHint属性的值。
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
     * 获取agDes属性的值。
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
     * 设置agDes属性的值。
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
     * 获取agDesS属性的值。
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
     * 设置agDesS属性的值。
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
     * 获取beName属性的值。
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
     * 设置beName属性的值。
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
     * 获取beHint属性的值。
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
     * 设置beHint属性的值。
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
     * 获取beDes属性的值。
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
     * 设置beDes属性的值。
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
     * 获取beDesS属性的值。
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
     * 设置beDesS属性的值。
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
     * 获取clName属性的值。
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
     * 设置clName属性的值。
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
     * 获取clHint属性的值。
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
     * 设置clHint属性的值。
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
     * 获取clDes属性的值。
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
     * 设置clDes属性的值。
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
     * 获取clDesS属性的值。
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
     * 设置clDesS属性的值。
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
     * 获取coName属性的值。
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
     * 设置coName属性的值。
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
     * 获取coHint属性的值。
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
     * 设置coHint属性的值。
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
     * 获取coDes属性的值。
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
     * 设置coDes属性的值。
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
     * 获取coDesS属性的值。
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
     * 设置coDesS属性的值。
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
     * 获取ctName属性的值。
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
     * 设置ctName属性的值。
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
     * 获取ctHint属性的值。
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
     * 设置ctHint属性的值。
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
     * 获取ctDes属性的值。
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
     * 设置ctDes属性的值。
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
     * 获取ctDesS属性的值。
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
     * 设置ctDesS属性的值。
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
     * 获取dyName属性的值。
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
     * 设置dyName属性的值。
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
     * 获取dyHint属性的值。
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
     * 设置dyHint属性的值。
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
     * 获取dyDes属性的值。
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
     * 设置dyDes属性的值。
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
     * 获取dyDesS属性的值。
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
     * 设置dyDesS属性的值。
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
     * 获取fsName属性的值。
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
     * 设置fsName属性的值。
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
     * 获取fsHint属性的值。
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
     * 设置fsHint属性的值。
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
     * 获取fsDes属性的值。
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
     * 设置fsDes属性的值。
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
     * 获取fsDesS属性的值。
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
     * 设置fsDesS属性的值。
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
     * 获取gjName属性的值。
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
     * 设置gjName属性的值。
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
     * 获取gjHint属性的值。
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
     * 设置gjHint属性的值。
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
     * 获取gjDes属性的值。
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
     * 设置gjDes属性的值。
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
     * 获取gjDesS属性的值。
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
     * 设置gjDesS属性的值。
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
     * 获取glName属性的值。
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
     * 设置glName属性的值。
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
     * 获取glHint属性的值。
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
     * 设置glHint属性的值。
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
     * 获取glDes属性的值。
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
     * 设置glDes属性的值。
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
     * 获取glDesS属性的值。
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
     * 设置glDesS属性的值。
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
     * 获取gmName属性的值。
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
     * 设置gmName属性的值。
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
     * 获取gmHint属性的值。
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
     * 设置gmHint属性的值。
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
     * 获取gmDes属性的值。
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
     * 设置gmDes属性的值。
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
     * 获取gmDesS属性的值。
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
     * 设置gmDesS属性的值。
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
     * 获取gzName属性的值。
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
     * 设置gzName属性的值。
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
     * 获取gzHint属性的值。
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
     * 设置gzHint属性的值。
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
     * 获取gzDes属性的值。
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
     * 设置gzDes属性的值。
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
     * 获取gzDesS属性的值。
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
     * 设置gzDesS属性的值。
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
     * 获取hcName属性的值。
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
     * 设置hcName属性的值。
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
     * 获取hcHint属性的值。
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
     * 设置hcHint属性的值。
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
     * 获取hcDes属性的值。
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
     * 设置hcDes属性的值。
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
     * 获取hcDesS属性的值。
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
     * 设置hcDesS属性的值。
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
     * 获取jtName属性的值。
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
     * 设置jtName属性的值。
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
     * 获取jtHint属性的值。
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
     * 设置jtHint属性的值。
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
     * 获取jtDes属性的值。
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
     * 设置jtDes属性的值。
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
     * 获取jtDesS属性的值。
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
     * 设置jtDesS属性的值。
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
     * 获取lkName属性的值。
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
     * 设置lkName属性的值。
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
     * 获取lkHint属性的值。
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
     * 设置lkHint属性的值。
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
     * 获取lkDes属性的值。
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
     * 设置lkDes属性的值。
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
     * 获取lkDesS属性的值。
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
     * 设置lkDesS属性的值。
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
     * 获取lsName属性的值。
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
     * 设置lsName属性的值。
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
     * 获取lsHint属性的值。
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
     * 设置lsHint属性的值。
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
     * 获取lsDes属性的值。
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
     * 设置lsDes属性的值。
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
     * 获取lsDesS属性的值。
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
     * 设置lsDesS属性的值。
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
     * 获取mfName属性的值。
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
     * 设置mfName属性的值。
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
     * 获取mfHint属性的值。
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
     * 设置mfHint属性的值。
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
     * 获取mfDes属性的值。
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
     * 设置mfDes属性的值。
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
     * 获取mfDesS属性的值。
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
     * 设置mfDesS属性的值。
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
     * 获取nlName属性的值。
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
     * 设置nlName属性的值。
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
     * 获取nlHint属性的值。
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
     * 设置nlHint属性的值。
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
     * 获取nlDes属性的值。
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
     * 设置nlDes属性的值。
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
     * 获取nlDesS属性的值。
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
     * 设置nlDesS属性的值。
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
     * 获取pjName属性的值。
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
     * 设置pjName属性的值。
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
     * 获取pjHint属性的值。
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
     * 设置pjHint属性的值。
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
     * 获取pjDes属性的值。
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
     * 设置pjDes属性的值。
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
     * 获取pjDesS属性的值。
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
     * 设置pjDesS属性的值。
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
     * 获取pkName属性的值。
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
     * 设置pkName属性的值。
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
     * 获取pkHint属性的值。
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
     * 设置pkHint属性的值。
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
     * 获取pkDes属性的值。
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
     * 设置pkDes属性的值。
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
     * 获取pkDesS属性的值。
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
     * 设置pkDesS属性的值。
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
     * 获取plName属性的值。
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
     * 设置plName属性的值。
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
     * 获取plHint属性的值。
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
     * 设置plHint属性的值。
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
     * 获取plDes属性的值。
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
     * 设置plDes属性的值。
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
     * 获取plDesS属性的值。
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
     * 设置plDesS属性的值。
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
     * 获取ptName属性的值。
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
     * 设置ptName属性的值。
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
     * 获取ptHint属性的值。
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
     * 设置ptHint属性的值。
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
     * 获取ptDes属性的值。
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
     * 设置ptDes属性的值。
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
     * 获取ptDesS属性的值。
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
     * 设置ptDesS属性的值。
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
     * 获取ppName属性的值。
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
     * 设置ppName属性的值。
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
     * 获取ppHint属性的值。
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
     * 设置ppHint属性的值。
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
     * 获取ppDes属性的值。
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
     * 设置ppDes属性的值。
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
     * 获取ppDesS属性的值。
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
     * 设置ppDesS属性的值。
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
     * 获取sgName属性的值。
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
     * 设置sgName属性的值。
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
     * 获取sgHint属性的值。
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
     * 设置sgHint属性的值。
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
     * 获取sgDes属性的值。
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
     * 设置sgDes属性的值。
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
     * 获取sgDesS属性的值。
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
     * 设置sgDesS属性的值。
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
     * 获取trName属性的值。
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
     * 设置trName属性的值。
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
     * 获取trHint属性的值。
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
     * 设置trHint属性的值。
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
     * 获取trDes属性的值。
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
     * 设置trDes属性的值。
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
     * 获取trDesS属性的值。
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
     * 设置trDesS属性的值。
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
     * 获取uvName属性的值。
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
     * 设置uvName属性的值。
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
     * 获取uvHint属性的值。
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
     * 设置uvHint属性的值。
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
     * 获取uvDes属性的值。
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
     * 设置uvDes属性的值。
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
     * 获取uvDesS属性的值。
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
     * 设置uvDesS属性的值。
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
     * 获取xcName属性的值。
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
     * 设置xcName属性的值。
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
     * 获取xcHint属性的值。
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
     * 设置xcHint属性的值。
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
     * 获取xcDes属性的值。
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
     * 设置xcDes属性的值。
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
     * 获取xcDesS属性的值。
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
     * 设置xcDesS属性的值。
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
     * 获取xqName属性的值。
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
     * 设置xqName属性的值。
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
     * 获取xqHint属性的值。
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
     * 设置xqHint属性的值。
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
     * 获取xqDes属性的值。
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
     * 设置xqDes属性的值。
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
     * 获取xqDesS属性的值。
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
     * 设置xqDesS属性的值。
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
     * 获取ydName属性的值。
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
     * 设置ydName属性的值。
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
     * 获取ydHint属性的值。
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
     * 设置ydHint属性的值。
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
     * 获取ydDes属性的值。
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
     * 设置ydDes属性的值。
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
     * 获取ydDesS属性的值。
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
     * 设置ydDesS属性的值。
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
     * 获取yhName属性的值。
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
     * 设置yhName属性的值。
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
     * 获取yhHint属性的值。
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
     * 设置yhHint属性的值。
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
     * 获取yhDes属性的值。
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
     * 设置yhDes属性的值。
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
     * 获取yhDesS属性的值。
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
     * 设置yhDesS属性的值。
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
     * 获取ysName属性的值。
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
     * 设置ysName属性的值。
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
     * 获取ysHint属性的值。
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
     * 设置ysHint属性的值。
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
     * 获取ysDes属性的值。
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
     * 设置ysDes属性的值。
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
     * 获取ysDesS属性的值。
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
     * 设置ysDesS属性的值。
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
     * 获取zsName属性的值。
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
     * 设置zsName属性的值。
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
     * 获取zsHint属性的值。
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
     * 设置zsHint属性的值。
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
     * 获取zsDes属性的值。
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
     * 设置zsDes属性的值。
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
     * 获取zsDesS属性的值。
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
     * 设置zsDesS属性的值。
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
