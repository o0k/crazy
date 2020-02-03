package cn.zhp.thread.chatroom;

import cn.zhp.thread.chatroom.server.ChatRoomServer;

import java.io.IOException;

import static cn.zhp.thread.chatroom.common.Constants.SERVER_PORT;

public class ChatRoomServerAppMain {
    public static void main(String[] args) throws IOException {
        ChatRoomServer server = new ChatRoomServer(SERVER_PORT);
        server.start();
    }
}
