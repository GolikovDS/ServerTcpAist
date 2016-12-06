package ru.gds.ServerTcp;


import org.apache.log4j.Logger;
import ru.gds.entity.AIST;
import ru.gds.entity.AistXmlEntity;

import javax.xml.bind.JAXB;
import java.io.*;
import java.net.Socket;

public class SocketRunnable implements Runnable, Serializable {

    final static Logger LOGGER = Logger.getLogger(SocketRunnable.class);


    private Socket socket;
    private static AIST aist = new AIST();

    public static String getStateAist() {
        return aist.toString();
    }


    public SocketRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            socket.setSoTimeout(3000);

            while (true) {

                AistXmlEntity aistXmlEntity = JAXB.unmarshal(new StringReader(bufferedReader.readLine()), AistXmlEntity.class);
                aist = aist.getAistState(aistXmlEntity.getState());
                LOGGER.debug(aist.toString() + "--------->" + Thread.currentThread().getName());
                bufferedWriter.write("<fromServer/>\n");
                Thread.sleep(1500);
                bufferedWriter.flush();
            }
        } catch (Throwable throwable) {
            System.err.println("Нет соеденения - " + throwable.getMessage());
            aist.getAistState((byte) 0x00);
        }
    }

    private int getValue(String data) {
        return Integer.parseInt("1");
    }

}
