package Server;

import stu.bupt.util.TimeStamp;

import java.util.List;

public class MailBox {
    List<Mail> income;
    public  getMail(int sid, TimeStamp time);
    public delMail(int sid, TimeStamp time);//设置成public是因为如果get到就delete可能传输失败，为了确保传输成功后再删除
}
