package com.daaw;

import com.daaw.AbstractC1969Qa1;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.zM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10131zM1 {
    public final InterfaceC1483Li2 a;
    public final Executor b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();

    public C10131zM1(InterfaceC1483Li2 interfaceC1483Li2, Executor executor) {
        this.a = interfaceC1483Li2;
        this.b = executor;
    }

    public final /* synthetic */ void a(C8987vF1 c8987vF1) {
        final AtomicReference atomicReference = this.d;
        c8987vF1.c(new AbstractC1969Qa1.b() { // from class: com.daaw.NH1
            @Override // com.daaw.AbstractC1969Qa1.b
            public final void a(InterfaceC2263Sq interfaceC2263Sq) {
                atomicReference.set(interfaceC2263Sq);
            }
        }, new AbstractC1969Qa1.a() { // from class: com.daaw.tI1
            @Override // com.daaw.AbstractC1969Qa1.a
            public final void b(C4824gP c4824gP) {
                "Failed to load and cache a form, error=".concat(String.valueOf(c4824gP.b()));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.daaw.uB1, java.lang.Object] */
    public final void b(AbstractC1969Qa1.b bVar, AbstractC1969Qa1.a aVar) {
        AbstractC5295i42.a();
        JN1 jn1 = (JN1) this.c.get();
        if (jn1 == null) {
            aVar.b(new C4304ea3(3, "No available form can be built.").a());
            return;
        }
        ?? Zzb = this.a.zzb();
        Zzb.a(jn1);
        Zzb.zzb().zza().c(bVar, aVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.daaw.uB1, java.lang.Object] */
    public final void c() {
        JN1 jn1 = (JN1) this.c.get();
        if (jn1 == null) {
            return;
        }
        ?? Zzb = this.a.zzb();
        Zzb.a(jn1);
        final C8987vF1 c8987vF1Zza = Zzb.zzb().zza();
        c8987vF1Zza.m = true;
        AbstractC5295i42.a.post(new Runnable() { // from class: com.daaw.ZI1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.a(c8987vF1Zza);
            }
        });
    }

    public final void d(JN1 jn1) {
        this.c.set(jn1);
    }
}
