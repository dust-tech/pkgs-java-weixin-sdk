package weixin.popular.bean.paymch;

import weixin.popular.util.JsonUtil;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class MicropayPromotionDetailXmlAdapter extends XmlAdapter<String, MicropayPromotionDetail> {

    @Override
    public MicropayPromotionDetail unmarshal(String v) throws Exception {
        return JsonUtil.parseObject(v, MicropayPromotionDetail.class);
    }

    @Override
    public String marshal(MicropayPromotionDetail v) throws Exception {
        return "<![CDATA[" + JsonUtil.toJSONString(v) + "]]>";
    }

}
