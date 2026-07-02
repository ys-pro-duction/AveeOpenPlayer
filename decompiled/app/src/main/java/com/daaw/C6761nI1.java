package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.nI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6761nI1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        try {
            C9574xM2.k(interfaceC9334wW1.getContext()).l();
            C9853yM2.j(interfaceC9334wW1.getContext()).k();
        } catch (IOException e) {
            zzt.zzo().u(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
