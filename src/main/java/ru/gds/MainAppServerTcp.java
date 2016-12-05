package ru.gds;


import org.apache.log4j.Logger;
import ru.gds.entity.AistXmlEntity;

import javax.xml.bind.JAXB;
import java.io.StringReader;

public class MainAppServerTcp {


    final static Logger logger = Logger.getLogger(MainAppServerTcp.class);

    public static void main(String[] args) throws Throwable {
//        startServer();
//    }
//
//    public static void startServer() throws Throwable {
//        logger.debug("START!");
//        ServerSocket serverSocket = new ServerSocket(3333);
//        new Thread(() -> {
//            while (true) {
//                Socket socket = null;
//                try {
//                    socket = serverSocket.accept();
//                    new Thread(new ru.gds.ServerTcp.SocketRunnable(socket)).start();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }).start();

        String s = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><aist><state>4</state></aist>";

        AistXmlEntity aistXmlEntity = JAXB.unmarshal(new StringReader(s), AistXmlEntity.class);
        System.out.println(aistXmlEntity.getState());

       // logger.debug(s.substring(s.indexOf("value=" + 1), s.indexOf("/>")));

    }

}
