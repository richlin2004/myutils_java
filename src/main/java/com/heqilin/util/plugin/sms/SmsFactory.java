package com.heqilin.util.plugin.sms;

import com.heqilin.util.core.PropUtil;
import com.heqilin.util.core.StringUtil;
import com.heqilin.util.core.SystemUtil;

/**
 *
 * @author heqilin
 * date 2019/04/23
 */
public class SmsFactory {
    public static final String SMS_TYPE = PropUtil.getProp(SystemUtil.getMyUtilConfigPath())
            .getProperty("my.util.smsutil.smsType");

    private SmsFactory(){
        throw new AssertionError();
    }

    public  static ISms newInstance(String smsTypeIfNullReadConfigValue){
        if(StringUtil.isEmpty(smsTypeIfNullReadConfigValue))
            smsTypeIfNullReadConfigValue= SMS_TYPE;

        switch (smsTypeIfNullReadConfigValue){
            case "default":
                return new JuheSmsImpl();
            case "juhe":
                return new JuheSmsImpl();
            case "aliyun":
                return  new AliyunSmsImpl();
            default:
                return null;
        }
    }
}
