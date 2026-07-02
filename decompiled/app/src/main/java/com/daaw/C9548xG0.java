package com.daaw;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.xG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9548xG0 implements InterfaceC2999Zs {
    public final float a;

    public C9548xG0(float f) {
        this.a = f;
    }

    public static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // com.daaw.InterfaceC2999Zs
    public float a(RectF rectF) {
        return this.a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9548xG0) && this.a == ((C9548xG0) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
