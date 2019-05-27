
package org.easydarwin.easyrtmp_rtsp;

/**
 * 类Config的实现描述：
 */
public class Config {
    public static final String RTSP_URL = "RTSPUrl";
    public static final String DEFAULT_RTSP_URL = "rtsp://admin:zljk@12345@221.226.220.38:5504/Streaming/Channels/102";

    public static final String SERVER_URL = "serverUrl";
    public static final String DEFAULT_SERVER_URL = "rtmp://demo.liveqing.com:10085/hls/stream_"+String.valueOf((int) (Math.random() * 1000000 + 100000));

}
