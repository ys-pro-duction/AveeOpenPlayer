package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.g32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4732g32 {
    public final InterfaceC3891d42 a;
    public final View b;
    public final C4787gF2 c;
    public final InterfaceC9334wW1 d;

    public C4732g32(View view, InterfaceC9334wW1 interfaceC9334wW1, InterfaceC3891d42 interfaceC3891d42, C4787gF2 c4787gF2) {
        this.b = view;
        this.d = interfaceC9334wW1;
        this.a = interfaceC3891d42;
        this.c = c4787gF2;
    }

    public static final C0623Db2 f(final Context context, final zzcaz zzcazVar, final C4498fF2 c4498fF2, final FF2 ff2) {
        return new C0623Db2(new J72() { // from class: com.daaw.e32
            @Override // com.daaw.J72
            public final void zzr() {
                zzt.zzs().zzn(context, zzcazVar.B, c4498fF2.E.toString(), ff2.f);
            }
        }, AbstractC9322wT1.f);
    }

    public static final Set g(U32 u32) {
        return Collections.singleton(new C0623Db2(u32, AbstractC9322wT1.f));
    }

    public static final C0623Db2 h(S32 s32) {
        return new C0623Db2(s32, AbstractC9322wT1.e);
    }

    public final View a() {
        return this.b;
    }

    public final InterfaceC9334wW1 b() {
        return this.d;
    }

    public final InterfaceC3891d42 c() {
        return this.a;
    }

    public H72 d(Set set) {
        return new H72(set);
    }

    public final C4787gF2 e() {
        return this.c;
    }
}
