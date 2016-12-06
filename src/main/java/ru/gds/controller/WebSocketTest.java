package ru.gds.controller;

import org.apache.log4j.Logger;
import ru.gds.ServerTcp.SocketRunnable;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/websocket")
public class WebSocketTest {

    final static Logger logger = Logger.getLogger(WebSocketTest.class);
    private Session session;


    @OnMessage
    public void onMessage(String message, Session session) throws IOException,
            InterruptedException {
        logger.debug("message");
        while (true) {
            session.getBasicRemote().sendText(SocketRunnable.getStateAist());
            Thread.sleep(1000);
        }
    }

    @OnOpen
    public void onOpen(Session session) throws InterruptedException {
        this.session = session;
        logger.debug("Client connected");

        try {
            while (true) {
                session.getBasicRemote().sendText(SocketRunnable.getStateAist());
                Thread.sleep(1000);
                logger.debug("message send " + SocketRunnable.getStateAist());
            }
        } catch (IOException e) {
            logger.debug(e.getMessage());
        }


    }

    @OnClose
    public void onClose() {
        logger.debug("Connect is close");
    }


}
