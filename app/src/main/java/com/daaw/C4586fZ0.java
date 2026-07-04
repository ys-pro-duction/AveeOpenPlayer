package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: renamed from: com.daaw.fZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4586fZ0 implements InterfaceC2420Ud0 {
    public final String B;
    public volatile InterfaceC2420Ud0 C;
    public Boolean D;
    public Method E;
    public VH F;
    public final Queue G;
    public final boolean H;

    public C4586fZ0(String str, Queue queue, boolean z) {
        this.B = str;
        this.G = queue;
        this.H = z;
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean a() {
        return h().a();
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean b() {
        return h().b();
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean c() {
        return h().c();
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean d() {
        return h().d();
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean e() {
        return h().e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.B.equals(((C4586fZ0) obj).B);
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean f(EnumC9633xb0 enumC9633xb0) {
        return h().f(enumC9633xb0);
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public void g(String str, Throwable th) {
        h().g(str, th);
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public String getName() {
        return this.B;
    }

    public InterfaceC2420Ud0 h() {
        return this.C != null ? this.C : this.H ? C1704Nm0.B : i();
    }

    public int hashCode() {
        return this.B.hashCode();
    }

    public final InterfaceC2420Ud0 i() {
        if (this.F == null) {
            this.F = new VH(this, this.G);
        }
        return this.F;
    }

    public boolean j() {
        Boolean bool = this.D;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.E = this.C.getClass().getMethod("log", InterfaceC2836Yd0.class);
            this.D = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.D = Boolean.FALSE;
        }
        return this.D.booleanValue();
    }

    public boolean k() {
        return this.C instanceof C1704Nm0;
    }

    public boolean l() {
        return this.C == null;
    }

    public void m(InterfaceC2836Yd0 interfaceC2836Yd0) {
        if (j()) {
            try {
                this.E.invoke(this.C, interfaceC2836Yd0);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void n(InterfaceC2420Ud0 interfaceC2420Ud0) {
        this.C = interfaceC2420Ud0;
    }
}
