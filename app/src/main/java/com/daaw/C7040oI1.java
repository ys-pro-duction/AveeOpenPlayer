package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.oI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7040oI1 implements HI1 {
    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        try {
            String str = (String) map.get("enabled");
            if (!ON2.c("true", str) && !ON2.c("false", str)) {
                return;
            }
            C9853yM2.j(interfaceC9334wW1.getContext()).n(Boolean.parseBoolean(str));
        } catch (IOException e) {
            zzt.zzo().u(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
