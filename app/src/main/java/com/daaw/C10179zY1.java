package com.daaw;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.zY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10179zY1 extends GA2 {
    public final C7849rB2 a;
    public final HY1 b;
    public final C10179zY1 c = this;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;
    public final InterfaceC8394t83 i;
    public final InterfaceC8394t83 j;
    public final InterfaceC8394t83 k;
    public final InterfaceC8394t83 l;
    public final InterfaceC8394t83 m;
    public final InterfaceC8394t83 n;

    public /* synthetic */ C10179zY1(HY1 hy1, C7849rB2 c7849rB2, AbstractC9900yY1 abstractC9900yY1) {
        this.b = hy1;
        this.a = c7849rB2;
        C8407tB2 c8407tB2 = new C8407tB2(c7849rB2);
        this.d = c8407tB2;
        InterfaceC8394t83 interfaceC8394t83B = C4469f83.b(C3791cj2.a());
        this.e = interfaceC8394t83B;
        InterfaceC8394t83 interfaceC8394t83B2 = C4469f83.b(C3234aj2.a());
        this.f = interfaceC8394t83B2;
        InterfaceC8394t83 interfaceC8394t83B3 = C4469f83.b(C4348ej2.a());
        this.g = interfaceC8394t83B3;
        InterfaceC8394t83 interfaceC8394t83B4 = C4469f83.b(C4916gj2.a());
        this.h = interfaceC8394t83B4;
        C5593j83 c5593j83B = C5875k83.b(4);
        c5593j83B.b(SH2.GMS_SIGNALS, interfaceC8394t83B);
        c5593j83B.b(SH2.BUILD_URL, interfaceC8394t83B2);
        c5593j83B.b(SH2.HTTP, interfaceC8394t83B3);
        c5593j83B.b(SH2.PRE_PROCESS, interfaceC8394t83B4);
        C5875k83 c5875k83C = c5593j83B.c();
        this.i = c5875k83C;
        InterfaceC8394t83 interfaceC8394t83B5 = C4469f83.b(new C5195hj2(c8407tB2, hy1.h, C7316pH2.a(), c5875k83C));
        this.j = interfaceC8394t83B5;
        C7558q83 c7558q83A = C7836r83.a(0, 1);
        c7558q83A.a(interfaceC8394t83B5);
        C7836r83 c7836r83C = c7558q83A.c();
        this.k = c7836r83C;
        C3396bI2 c3396bI2 = new C3396bI2(c7836r83C);
        this.l = c3396bI2;
        this.m = C4469f83.b(new C3117aI2(C7316pH2.a(), hy1.n, c3396bI2));
        this.n = C4469f83.b(new UI2(hy1.H));
    }

    @Override // com.daaw.GA2
    public final C1758Nz2 a() {
        Context contextA = this.b.b.a();
        AbstractC7000o83.b(contextA);
        C4559fS1 c4559fS1 = new C4559fS1();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        C6176lB2 c6176lB2 = new C6176lB2(c4559fS1, ps2, AbstractC8128sB2.a(this.a));
        AbstractC7000o83.b(ps2);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.n.zzb();
        TI2 ti2 = (TI2) this.n.zzb();
        C1071Hj2 c1071Hj2 = (C1071Hj2) this.b.a0.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new C1754Ny2(c6176lB2, 0L, scheduledExecutorService));
        return new C1758Nz2(contextA, ps2, hashSet, ti2, c1071Hj2);
    }

    @Override // com.daaw.GA2
    public final YH2 b() {
        return (YH2) this.m.zzb();
    }
}
