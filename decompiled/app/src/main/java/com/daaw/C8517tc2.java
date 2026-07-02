package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.tc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8517tc2 {
    public final InterfaceC3761cd2 a;
    public final InterfaceC9334wW1 b;

    public C8517tc2(InterfaceC3761cd2 interfaceC3761cd2, InterfaceC9334wW1 interfaceC9334wW1) {
        this.a = interfaceC3761cd2;
        this.b = interfaceC9334wW1;
    }

    public static final C0623Db2 h(BI2 bi2) {
        return new C0623Db2(bi2, AbstractC9322wT1.f);
    }

    public static final C0623Db2 i(C5165hd2 c5165hd2) {
        return new C0623Db2(c5165hd2, AbstractC9322wT1.f);
    }

    public final View a() {
        InterfaceC9334wW1 interfaceC9334wW1 = this.b;
        if (interfaceC9334wW1 == null) {
            return null;
        }
        return interfaceC9334wW1.j();
    }

    public final View b() {
        InterfaceC9334wW1 interfaceC9334wW1 = this.b;
        if (interfaceC9334wW1 != null) {
            return interfaceC9334wW1.j();
        }
        return null;
    }

    public final InterfaceC9334wW1 c() {
        return this.b;
    }

    public final C0623Db2 d(Executor executor) {
        final InterfaceC9334wW1 interfaceC9334wW1 = this.b;
        return new C0623Db2(new P92() { // from class: com.daaw.mc2
            @Override // com.daaw.P92
            public final void zza() {
                zzl zzlVarC;
                InterfaceC9334wW1 interfaceC9334wW12 = interfaceC9334wW1;
                if (interfaceC9334wW12 == null || (zzlVarC = interfaceC9334wW12.c()) == null) {
                    return;
                }
                zzlVarC.zzb();
            }
        }, executor);
    }

    public final InterfaceC3761cd2 e() {
        return this.a;
    }

    public Set f(C5305i62 c5305i62) {
        return Collections.singleton(new C0623Db2(c5305i62, AbstractC9322wT1.f));
    }

    public Set g(C5305i62 c5305i62) {
        return Collections.singleton(new C0623Db2(c5305i62, AbstractC9322wT1.f));
    }
}
