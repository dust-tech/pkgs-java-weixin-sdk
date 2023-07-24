package weixin.popular.bean.paymch;

import weixin.popular.util.JsonUtil;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class PromotionDetailXmlAdapter extends XmlAdapter<String, List<PromotionDetail>> {

    @Override
    public List<PromotionDetail> unmarshal(String v) throws Exception {
        String a = JsonUtil.parseObject(v).get("promotion_detail").asText();
        return JsonUtil.parseArray(a, PromotionDetail.class);
    }

    @Override
    public String marshal(List<PromotionDetail> v) throws Exception {
        return "<![CDATA[" + JsonUtil.toJSONString(v) + "]]>";
    }
}
