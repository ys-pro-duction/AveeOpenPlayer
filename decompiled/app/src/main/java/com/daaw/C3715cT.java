package com.daaw;

import android.content.Context;
import com.daaw.InterfaceC4204eC;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.daaw.cT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3715cT {
    public final Context a;
    public KG b;
    public InterfaceC1883Pf c;
    public InterfaceC6319lj0 d;
    public ExecutorService e;
    public ExecutorService f;
    public EnumC0591Cw g;
    public InterfaceC4204eC.a h;

    public C3715cT(Context context) {
        this.a = context.getApplicationContext();
    }

    public WS a() {
        if (this.e == null) {
            this.e = new C9842yK(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f == null) {
            this.f = new C9842yK(1);
        }
        C9394wj0 c9394wj0 = new C9394wj0(this.a);
        if (this.c == null) {
            this.c = new C8809uf0(c9394wj0.a());
        }
        if (this.d == null) {
            this.d = new C0845Ff0(c9394wj0.c());
        }
        if (this.h == null) {
            this.h = new C4431f10(this.a);
        }
        if (this.b == null) {
            this.b = new KG(this.d, this.h, this.f, this.e);
        }
        if (this.g == null) {
            this.g = EnumC0591Cw.E;
        }
        return new WS(this.b, this.d, this.c, this.a, this.g);
    }
}
