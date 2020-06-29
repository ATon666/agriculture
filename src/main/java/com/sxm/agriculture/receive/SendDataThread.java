/*
package com.sxm.agriculture.receive;

*/
/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/14 18:04
 * @description 专门用来发送数据的线程
 *//*



public class SendDataThread implements Runnable {

    private UdpReceiver udpReceiver;
    private SendData sendData;

    public SendDataThread() {
        init();
    }

    private void init() {
        udpReceiver = new UdpReceiver();
        sendData = new SendData();
    }

    @Override
    public void run() {
        while (true) {
            String dataHex = udpReceiver.getDataHex();
            if (dataHex != null) {
                sendData.send(dataHex);
            }
        }
    }
}
*/

package com.sxm.agriculture.receive;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author 780013490@qq.com  孙小明
 * @version 1.0
 * @date 2020/6/14 18:04
 * @description 专门用来发送数据的线程
 */

@Component
public class SendDataThread {

    private UdpReceiver udpReceiver;
    private SendData sendData;


    public void init() {
        udpReceiver = new UdpReceiver();
        sendData = new SendData();
    }

    @Async
    public void run() {
        while (true) {
            String dataHex = udpReceiver.getDataHex();
            if (dataHex != null) {
                sendData.send(dataHex);
            }
        }
    }
}

