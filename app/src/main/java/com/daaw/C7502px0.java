package com.daaw;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.px0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7502px0 {
    public final Map a = new LinkedHashMap();

    /* JADX INFO: renamed from: com.daaw.px0$a */
    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;
        public final int d;

        public /* synthetic */ a(long j, long j2, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
            this(j, j2, z, i);
        }

        public final boolean a() {
            return this.c;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.a;
        }

        public a(long j, long j2, boolean z, int i) {
            this.a = j;
            this.b = j2;
            this.c = z;
            this.d = i;
        }
    }

    public final void a() {
        this.a.clear();
    }

    public final C7241p10 b(C8059rx0 c8059rx0, InterfaceC1956Px0 interfaceC1956Px0) {
        long jI;
        boolean zA;
        long jN;
        G10.g(c8059rx0, "pointerInputEvent");
        G10.g(interfaceC1956Px0, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(c8059rx0.b().size());
        List listB = c8059rx0.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            C8338sx0 c8338sx0 = (C8338sx0) listB.get(i);
            a aVar = (a) this.a.get(C6944nx0.a(c8338sx0.c()));
            if (aVar == null) {
                jI = c8338sx0.i();
                jN = c8338sx0.e();
                zA = false;
            } else {
                long jC = aVar.c();
                jI = jC;
                zA = aVar.a();
                jN = interfaceC1956Px0.n(aVar.b());
            }
            linkedHashMap.put(C6944nx0.a(c8338sx0.c()), new C7223ox0(c8338sx0.c(), c8338sx0.i(), c8338sx0.e(), c8338sx0.a(), jI, jN, zA, false, c8338sx0.h(), c8338sx0.b(), c8338sx0.g(), (AbstractC2911Yw) null));
            if (c8338sx0.a()) {
                this.a.put(C6944nx0.a(c8338sx0.c()), new a(c8338sx0.i(), c8338sx0.f(), c8338sx0.a(), c8338sx0.h(), null));
            } else {
                this.a.remove(C6944nx0.a(c8338sx0.c()));
            }
        }
        return new C7241p10(linkedHashMap, c8059rx0);
    }
}
