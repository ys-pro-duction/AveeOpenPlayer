package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public class QS0 implements InterfaceC6819nX {
    public ConcurrentMap a = new ConcurrentHashMap();

    public QS0() {
        NS0.q();
    }

    @Override // com.daaw.InterfaceC6819nX
    public InterfaceC2420Ud0 a(String str) {
        InterfaceC2420Ud0 interfaceC2420Ud0 = (InterfaceC2420Ud0) this.a.get(str);
        if (interfaceC2420Ud0 != null) {
            return interfaceC2420Ud0;
        }
        NS0 ns0 = new NS0(str);
        InterfaceC2420Ud0 interfaceC2420Ud02 = (InterfaceC2420Ud0) this.a.putIfAbsent(str, ns0);
        return interfaceC2420Ud02 == null ? ns0 : interfaceC2420Ud02;
    }
}
