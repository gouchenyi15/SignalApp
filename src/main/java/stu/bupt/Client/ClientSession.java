package stu.bupt.Client;

import stu.bupt.util.TimeStamp;

import java.util.List;

public class ClientSession {
    int sid;
    TimeStamp last_activated;//每次收到消息都要更新
    public void TextMsgSave(String msg);
    public void FileMsgSave();
    public void PullMsg();
}
