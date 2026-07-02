package com.daaw;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FT2 {
    public final List a = new ArrayList();
    public final JZ2 b = JZ2.b;
    public boolean c = false;

    public final FT2 a(DT2 dt2) {
        if (dt2.f != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (dt2.a) {
            d();
        }
        dt2.f = this;
        this.a.add(dt2);
        return this;
    }

    public final IT2 b() throws GeneralSecurityException {
        int i;
        if (this.c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.c = true;
        List list = this.a;
        C13 c13O = F13.O();
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            if (((DT2) list.get(i2)).e == ET2.a && ((DT2) list.get(i3)).e != ET2.a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (DT2 dt2 : this.a) {
            C10160zT2 unused = dt2.b;
            if (dt2.e == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i4 = 3;
            if (dt2.e == ET2.a) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i5 = 0;
                    while (i5 == 0) {
                        secureRandom.nextBytes(bArr);
                        i5 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i = i5;
                }
            } else {
                ET2 unused2 = dt2.e;
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            DT2.a(dt2);
            MT2 mt2 = dt2.d;
            C10160zT2 c10160zT2C = dt2.c();
            C10160zT2 c10160zT2 = C10160zT2.b;
            if (!c10160zT2.equals(c10160zT2C)) {
                if (C10160zT2.c.equals(c10160zT2C)) {
                    i4 = 4;
                } else {
                    if (!C10160zT2.d.equals(c10160zT2C)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            YX2 yx2 = (YX2) C10176zX2.b().c(mt2, YX2.class);
            C6965o13 c6965o13A = AbstractC3165aU2.a(yx2.b());
            D13 d13O = E13.O();
            d13O.o(i);
            d13O.r(i4);
            d13O.n(c6965o13A);
            d13O.p(yx2.b().P());
            c13O.n((E13) d13O.j());
            if (dt2.a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (dt2.b != c10160zT2) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        c13O.o(num.intValue());
        return IT2.b((F13) c13O.j(), this.b);
    }

    public final void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((DT2) it.next()).a = false;
        }
    }
}
