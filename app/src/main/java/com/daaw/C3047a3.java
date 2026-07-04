package com.daaw;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3047a3 implements InterfaceC2999Zs {
    public final InterfaceC2999Zs a;
    public final float b;

    public C3047a3(float f, InterfaceC2999Zs interfaceC2999Zs) {
        while (interfaceC2999Zs instanceof C3047a3) {
            interfaceC2999Zs = ((C3047a3) interfaceC2999Zs).a;
            f += ((C3047a3) interfaceC2999Zs).b;
        }
        this.a = interfaceC2999Zs;
        this.b = f;
    }

    @Override // com.daaw.InterfaceC2999Zs
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3047a3)) {
            return false;
        }
        C3047a3 c3047a3 = (C3047a3) obj;
        return this.a.equals(c3047a3.a) && this.b == c3047a3.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
