package com.daaw;

import android.content.Context;
import android.os.Handler;
import com.daaw.avee.comp.playback.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Km0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1393Km0 extends AbstractC1332Jx {
    public e.b d;
    public IX e;
    public int f;

    public C1393Km0(e.b bVar, IX ix, int i, Context context, int i2) {
        super(context, i2);
        this.d = bVar;
        this.e = ix;
        this.f = i;
    }

    @Override // com.daaw.AbstractC1332Jx
    public void c(Context context, InterfaceC7580qE interfaceC7580qE, InterfaceC2827Yb[] interfaceC2827YbArr, Handler handler, InterfaceC2931Zb interfaceC2931Zb, int i, ArrayList arrayList) {
        arrayList.add(new C1289Jm0(this.e, this.f, new WeakReference(null), context, InterfaceC4909gi0.a, interfaceC7580qE, true, handler, interfaceC2931Zb, C2201Sb.a(context), interfaceC2827YbArr));
    }
}
