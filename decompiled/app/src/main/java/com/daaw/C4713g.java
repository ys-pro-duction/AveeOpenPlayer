package com.daaw;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4713g implements InterfaceC2999Zs {
    public final float a;

    public C4713g(float f) {
        this.a = f;
    }

    @Override // com.daaw.InterfaceC2999Zs
    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4713g) && this.a == ((C4713g) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
