package com.daaw;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: renamed from: com.daaw.fU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4567fU1 extends TextureView implements IU1 {
    public final C8482tU1 B;
    public final JU1 C;

    public AbstractC4567fU1(Context context) {
        super(context);
        this.B = new C8482tU1();
        this.C = new JU1(context, this);
    }

    public void g(String str, String[] strArr, Integer num) {
        v(str);
    }

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract long n();

    public abstract long o();

    public abstract long p();

    public abstract String q();

    public abstract void r();

    public abstract void s();

    public abstract void t(int i);

    public abstract void u(InterfaceC4278eU1 interfaceC4278eU1);

    public abstract void v(String str);

    public abstract void w();

    public abstract void x(float f, float f2);

    public Integer y() {
        return null;
    }

    public abstract void zzn();

    public void A(int i) {
    }

    public void B(int i) {
    }

    public void a(int i) {
    }

    public void f(int i) {
    }

    public void z(int i) {
    }
}
