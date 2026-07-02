package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DI1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            interfaceC9334wW1.zzbj();
        } else if ("resume".equals(str)) {
            interfaceC9334wW1.zzbk();
        }
    }
}
