package Server;

import stu.bupt.util.TimeStamp;

public class Mail {
    int sid;
    int from_uid;//主要是在群组聊天中区分
    int type;//文件、音频、纯文字
    TimeStamp sent_time;
    String encrypted_msg;//可以是文件地址
}
