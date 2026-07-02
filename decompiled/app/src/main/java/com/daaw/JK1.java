package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class JK1 implements HI1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ C3407bL1 b;
    public final /* synthetic */ InterfaceC8442tK1 c;
    public final /* synthetic */ C3685cL1 d;

    public JK1(C3685cL1 c3685cL1, long j, C3407bL1 c3407bL1, InterfaceC8442tK1 interfaceC8442tK1) {
        this.d = c3685cL1;
        this.a = j;
        this.b = c3407bL1;
        this.c = interfaceC8442tK1;
    }

    @Override // com.daaw.HI1
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (zzt.zzB().a() - this.a) + " ms.");
        synchronized (this.d.a) {
            try {
                if (this.b.a() != -1 && this.b.a() != 1) {
                    this.d.i = 0;
                    InterfaceC8442tK1 interfaceC8442tK1 = this.c;
                    interfaceC8442tK1.g0("/log", GI1.g);
                    interfaceC8442tK1.g0("/result", GI1.o);
                    this.b.d(this.c);
                    this.d.h = this.b;
                    zze.zza("Successfully loaded JS Engine.");
                }
            } finally {
            }
        }
    }
}
