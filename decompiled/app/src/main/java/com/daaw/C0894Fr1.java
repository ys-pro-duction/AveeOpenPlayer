package com.daaw;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Fr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0894Fr1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 d = new InterfaceC1813On1() { // from class: com.daaw.Er1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C0894Fr1()};
        }
    };
    public InterfaceC1398Kn1 a;
    public AbstractC1725Nr1 b;
    public boolean c;

    public final boolean a(InterfaceC1190In1 interfaceC1190In1) {
        C1102Hr1 c1102Hr1 = new C1102Hr1();
        if (c1102Hr1.b(interfaceC1190In1, true) && (c1102Hr1.a & 2) == 2) {
            int iMin = Math.min(c1102Hr1.e, 8);
            C5900kE2 c5900kE2 = new C5900kE2(iMin);
            ((C9694xn1) interfaceC1190In1).h(c5900kE2.i(), 0, iMin, false);
            c5900kE2.g(0);
            if (c5900kE2.j() >= 5 && c5900kE2.u() == 127 && c5900kE2.C() == 1179402563) {
                this.b = new C0686Dr1();
            } else {
                c5900kE2.g(0);
                if (AbstractC10257zo1.d(1, c5900kE2, true)) {
                    this.b = new C1933Pr1();
                } else {
                    c5900kE2.g(0);
                    if (C1310Jr1.j(c5900kE2)) {
                        this.b = new C1310Jr1();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        AbstractC1725Nr1 abstractC1725Nr1 = this.b;
        if (abstractC1725Nr1 != null) {
            abstractC1725Nr1.i(j, j2);
        }
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) {
        try {
            return a(interfaceC1190In1);
        } catch (QT1 unused) {
            return false;
        }
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.a = interfaceC1398Kn1;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final int n(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) throws QT1 {
        AbstractC6048km2.b(this.a);
        if (this.b == null) {
            if (!a(interfaceC1190In1)) {
                throw QT1.a("Failed to determine bitstream type", null);
            }
            interfaceC1190In1.zzj();
        }
        if (!this.c) {
            InterfaceC8576to1 interfaceC8576to1O = this.a.o(0, 1);
            this.a.b();
            this.b.g(this.a, interfaceC8576to1O);
            this.c = true;
        }
        return this.b.d(interfaceC1190In1, c6057ko1);
    }
}
