package com.daaw;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.l62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6152l62 implements J72, InterfaceC7552q72 {
    public final Context B;
    public final C4498fF2 C;
    public final C8737uO1 D;

    public C6152l62(Context context, C4498fF2 c4498fF2, C8737uO1 c8737uO1) {
        this.B = context;
        this.C = c4498fF2;
        this.D = c8737uO1;
    }

    @Override // com.daaw.J72
    public final void zzr() {
        C9023vO1 c9023vO1 = this.C.f0;
        if (c9023vO1 == null || !c9023vO1.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.C.f0.b.isEmpty()) {
            return;
        }
        arrayList.add(this.C.f0.b);
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void a(Context context) {
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void e(Context context) {
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void o(Context context) {
    }
}
