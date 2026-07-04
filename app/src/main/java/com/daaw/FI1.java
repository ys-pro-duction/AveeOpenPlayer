package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FI1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        if (map.keySet().contains("start")) {
            interfaceC9334wW1.T(true);
        }
        if (map.keySet().contains("stop")) {
            interfaceC9334wW1.T(false);
        }
    }
}
