package com.daaw;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Us3 implements InterfaceC2850Yg2 {
    public final InterfaceC1483Li2 a;
    public final InterfaceC1483Li2 b;
    public final InterfaceC1483Li2 c;
    public final InterfaceC1483Li2 d;
    public final InterfaceC1483Li2 e;
    public final InterfaceC1483Li2 f;
    public final InterfaceC1483Li2 g;
    public final InterfaceC1483Li2 h;
    public final InterfaceC1483Li2 i;

    public Us3(InterfaceC1483Li2 interfaceC1483Li2, InterfaceC1483Li2 interfaceC1483Li22, InterfaceC1483Li2 interfaceC1483Li23, InterfaceC1483Li2 interfaceC1483Li24, InterfaceC1483Li2 interfaceC1483Li25, InterfaceC1483Li2 interfaceC1483Li26, InterfaceC1483Li2 interfaceC1483Li27, InterfaceC1483Li2 interfaceC1483Li28, InterfaceC1483Li2 interfaceC1483Li29) {
        this.a = interfaceC1483Li2;
        this.b = interfaceC1483Li22;
        this.c = interfaceC1483Li23;
        this.d = interfaceC1483Li24;
        this.e = interfaceC1483Li25;
        this.f = interfaceC1483Li26;
        this.g = interfaceC1483Li27;
        this.h = interfaceC1483Li28;
        this.i = interfaceC1483Li29;
    }

    @Override // com.daaw.InterfaceC1483Li2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3280as3 zzb() {
        Application application = (Application) this.a.zzb();
        C6071kp1 c6071kp1 = (C6071kp1) this.b.zzb();
        Handler handler = AbstractC5295i42.a;
        AbstractC4911gi2.a(handler);
        Executor executor = AbstractC5295i42.b;
        AbstractC4911gi2.a(executor);
        return new C3280as3(application, c6071kp1, handler, executor, (C0814Ex1) this.e.zzb(), (C10131zM1) this.f.zzb(), ((C7453pm3) this.g).zzb(), ((C0457Bo1) this.h).zzb(), (DS2) this.i.zzb());
    }
}
