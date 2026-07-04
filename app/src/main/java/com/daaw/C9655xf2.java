package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9655xf2 implements InterfaceC6244lS2 {
    public final /* synthetic */ C9934yf2 a;

    public C9655xf2(C9934yf2 c9934yf2) {
        this.a = c9934yf2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        zzt.zzo().u(th, "omid native display exp");
    }

    @Override // com.daaw.InterfaceC6244lS2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(List list) {
        try {
            InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) list.get(0);
            if (interfaceC9334wW1 != null) {
                this.a.b(interfaceC9334wW1);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            zzt.zzo().u(e, "omid native display exp");
        }
    }
}
