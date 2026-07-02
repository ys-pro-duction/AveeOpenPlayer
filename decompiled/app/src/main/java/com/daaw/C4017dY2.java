package com.daaw;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.dY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4017dY2 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public C4017dY2() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public final C4017dY2 a(AbstractC4013dX2 abstractC4013dX2) throws GeneralSecurityException {
        C4584fY2 c4584fY2 = new C4584fY2(abstractC4013dX2.d(), abstractC4013dX2.c(), null);
        if (!this.b.containsKey(c4584fY2)) {
            this.b.put(c4584fY2, abstractC4013dX2);
            return this;
        }
        AbstractC4013dX2 abstractC4013dX22 = (AbstractC4013dX2) this.b.get(c4584fY2);
        if (abstractC4013dX22.equals(abstractC4013dX2) && abstractC4013dX2.equals(abstractC4013dX22)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c4584fY2.toString()));
    }

    public final C4017dY2 b(AbstractC5138hX2 abstractC5138hX2) throws GeneralSecurityException {
        C5142hY2 c5142hY2 = new C5142hY2(abstractC5138hX2.b(), abstractC5138hX2.c(), null);
        if (!this.a.containsKey(c5142hY2)) {
            this.a.put(c5142hY2, abstractC5138hX2);
            return this;
        }
        AbstractC5138hX2 abstractC5138hX22 = (AbstractC5138hX2) this.a.get(c5142hY2);
        if (abstractC5138hX22.equals(abstractC5138hX2) && abstractC5138hX2.equals(abstractC5138hX22)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c5142hY2.toString()));
    }

    public final C4017dY2 c(DX2 dx2) throws GeneralSecurityException {
        C4584fY2 c4584fY2 = new C4584fY2(dx2.c(), dx2.b(), null);
        if (!this.d.containsKey(c4584fY2)) {
            this.d.put(c4584fY2, dx2);
            return this;
        }
        DX2 dx22 = (DX2) this.d.get(c4584fY2);
        if (dx22.equals(dx2) && dx2.equals(dx22)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(c4584fY2.toString()));
    }

    public final C4017dY2 d(HX2 hx2) throws GeneralSecurityException {
        C5142hY2 c5142hY2 = new C5142hY2(hx2.c(), hx2.d(), null);
        if (!this.c.containsKey(c5142hY2)) {
            this.c.put(c5142hY2, hx2);
            return this;
        }
        HX2 hx22 = (HX2) this.c.get(c5142hY2);
        if (hx22.equals(hx2) && hx2.equals(hx22)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c5142hY2.toString()));
    }

    public C4017dY2(C5701jY2 c5701jY2) {
        this.a = new HashMap(c5701jY2.a);
        this.b = new HashMap(c5701jY2.b);
        this.c = new HashMap(c5701jY2.c);
        this.d = new HashMap(c5701jY2.d);
    }
}
