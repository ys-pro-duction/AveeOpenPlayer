package com.daaw;

import com.daaw.AbstractC5362iK;
import com.daaw.C7106oZ;
import com.daaw.C9632xb;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.oZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7106oZ {
    public static final long f = TimeUnit.SECONDS.toMillis(15);
    public static final long g = TimeUnit.MINUTES.toMillis(1);
    public final a a;
    public final AbstractC1940Pt0 b;
    public final AZ0 c;
    public final AZ0 d;
    public int e;

    /* JADX INFO: renamed from: com.daaw.oZ$a */
    public class a implements InterfaceC8453tN0 {
        public C9632xb.b a;
        public final C9632xb b;

        public a(C9632xb c9632xb) {
            this.b = c9632xb;
        }

        public static /* synthetic */ void a(a aVar) {
            AbstractC2212Sd0.a("IndexBackfiller", "Documents written: %s", Integer.valueOf(C7106oZ.this.d()));
            aVar.b(C7106oZ.g);
        }

        public final void b(long j) {
            this.a = this.b.h(C9632xb.d.INDEX_BACKFILL, j, new Runnable() { // from class: com.daaw.nZ
                @Override // java.lang.Runnable
                public final void run() {
                    C7106oZ.a.a(this.B);
                }
            });
        }

        @Override // com.daaw.InterfaceC8453tN0
        public void start() {
            b(C7106oZ.f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7106oZ(AbstractC1940Pt0 abstractC1940Pt0, C9632xb c9632xb, final C3481bd0 c3481bd0) {
        this(abstractC1940Pt0, c9632xb, new AZ0() { // from class: com.daaw.kZ
            @Override // com.daaw.AZ0
            public final Object get() {
                return c3481bd0.r();
            }
        }, new AZ0() { // from class: com.daaw.lZ
            @Override // com.daaw.AZ0
            public final Object get() {
                return c3481bd0.v();
            }
        });
        Objects.requireNonNull(c3481bd0);
    }

    public int d() {
        return ((Integer) this.b.j("Backfill Indexes", new BZ0() { // from class: com.daaw.mZ
            @Override // com.daaw.BZ0
            public final Object get() {
                return Integer.valueOf(this.a.h());
            }
        })).intValue();
    }

    public final AbstractC5362iK.a e(AbstractC5362iK.a aVar, C1664Nc0 c1664Nc0) {
        Iterator it = c1664Nc0.c().iterator();
        AbstractC5362iK.a aVar2 = aVar;
        while (it.hasNext()) {
            AbstractC5362iK.a aVarK = AbstractC5362iK.a.k((LC) ((Map.Entry) it.next()).getValue());
            if (aVarK.compareTo(aVar2) > 0) {
                aVar2 = aVarK;
            }
        }
        return AbstractC5362iK.a.g(aVar2.n(), aVar2.l(), Math.max(c1664Nc0.b(), aVar.m()));
    }

    public a f() {
        return this.a;
    }

    public final int g(String str, int i) {
        InterfaceC7942rZ interfaceC7942rZ = (InterfaceC7942rZ) this.c.get();
        C1768Oc0 c1768Oc0 = (C1768Oc0) this.d.get();
        AbstractC5362iK.a aVarF = interfaceC7942rZ.f(str);
        C1664Nc0 c1664Nc0J = c1768Oc0.j(str, aVarF, i);
        interfaceC7942rZ.i(c1664Nc0J.c());
        AbstractC5362iK.a aVarE = e(aVarF, c1664Nc0J);
        AbstractC2212Sd0.a("IndexBackfiller", "Updating offset: %s", aVarE);
        interfaceC7942rZ.b(str, aVarE);
        return c1664Nc0J.c().size();
    }

    public final int h() {
        InterfaceC7942rZ interfaceC7942rZ = (InterfaceC7942rZ) this.c.get();
        HashSet hashSet = new HashSet();
        int iG = this.e;
        while (iG > 0) {
            String strC = interfaceC7942rZ.c();
            if (strC == null || hashSet.contains(strC)) {
                break;
            }
            AbstractC2212Sd0.a("IndexBackfiller", "Processing collection: %s", strC);
            iG -= g(strC, iG);
            hashSet.add(strC);
        }
        return this.e - iG;
    }

    public C7106oZ(AbstractC1940Pt0 abstractC1940Pt0, C9632xb c9632xb, AZ0 az0, AZ0 az02) {
        this.e = 50;
        this.b = abstractC1940Pt0;
        this.a = new a(c9632xb);
        this.c = az0;
        this.d = az02;
    }
}
