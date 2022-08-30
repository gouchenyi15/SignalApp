package stu.bupt.Client;

import stu.bupt.util.DeviceRecordBase;
import stu.bupt.util.RSAKeyPair;

public class SelfDeviceRecord extends DeviceRecordBase {
    int owner_uid;
    String device_name;
    RSAKeyPair keys;
    String key_sig;

}
