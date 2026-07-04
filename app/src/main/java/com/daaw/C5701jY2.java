package com.daaw;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.jY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5701jY2 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public /* synthetic */ C5701jY2(C4017dY2 c4017dY2, AbstractC5421iY2 abstractC5421iY2) {
        this.a = new HashMap(c4017dY2.a);
        this.b = new HashMap(c4017dY2.b);
        this.c = new HashMap(c4017dY2.c);
        this.d = new HashMap(c4017dY2.d);
    }

    public final AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2) throws GeneralSecurityException {
        C4584fY2 c4584fY2 = new C4584fY2(interfaceC3738cY2.getClass(), interfaceC3738cY2.zzd(), null);
        if (this.b.containsKey(c4584fY2)) {
            return ((AbstractC4013dX2) this.b.get(c4584fY2)).a(interfaceC3738cY2, c3444bU2);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c4584fY2.toString() + " available");
    }

    public final InterfaceC3738cY2 b(MT2 mt2, Class cls) throws GeneralSecurityException {
        C5142hY2 c5142hY2 = new C5142hY2(mt2.getClass(), cls, null);
        if (this.c.containsKey(c5142hY2)) {
            return ((HX2) this.c.get(c5142hY2)).a(mt2);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + c5142hY2.toString() + " available");
    }

    public final boolean g(InterfaceC3738cY2 interfaceC3738cY2) {
        return this.b.containsKey(new C4584fY2(interfaceC3738cY2.getClass(), interfaceC3738cY2.zzd(), null));
    }
}
