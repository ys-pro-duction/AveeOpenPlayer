package com.daaw;

import com.daaw.C6607ml;
import com.daaw.InterfaceC10072z80;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.nV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6812nV0 {
    public static final C6812nV0 a = new C6812nV0();
    public static final Set b;
    public static final C6607ml c;

    static {
        List listN = AbstractC1599Mm.n(B40.a, B40.l, B40.m, B40.d, B40.f, B40.i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C6607ml.a aVar = C6607ml.d;
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.c((AP) it.next()));
        }
        b = linkedHashSet;
        C6607ml.a aVar2 = C6607ml.d;
        AP ap = B40.j;
        G10.f(ap, "REPEATABLE_ANNOTATION");
        c = aVar2.c(ap);
    }

    public final C6607ml a() {
        return c;
    }

    public final Set b() {
        return b;
    }

    public final boolean c(InterfaceC10072z80 interfaceC10072z80) {
        G10.g(interfaceC10072z80, "klass");
        C5620jF0 c5620jF0 = new C5620jF0();
        interfaceC10072z80.c(new a(c5620jF0), null);
        return c5620jF0.B;
    }

    /* JADX INFO: renamed from: com.daaw.nV0$a */
    public static final class a implements InterfaceC10072z80.c {
        public final /* synthetic */ C5620jF0 a;

        public a(C5620jF0 c5620jF0) {
            this.a = c5620jF0;
        }

        @Override // com.daaw.InterfaceC10072z80.c
        public InterfaceC10072z80.a c(C6607ml c6607ml, RU0 ru0) {
            G10.g(c6607ml, "classId");
            G10.g(ru0, "source");
            if (!G10.c(c6607ml, C10052z40.a.a())) {
                return null;
            }
            this.a.B = true;
            return null;
        }

        @Override // com.daaw.InterfaceC10072z80.c
        public void a() {
        }
    }
}
