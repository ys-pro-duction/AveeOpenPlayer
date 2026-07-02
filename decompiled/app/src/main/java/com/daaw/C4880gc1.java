package com.daaw;

import android.opengl.GLES20;

/* JADX INFO: renamed from: com.daaw.gc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4880gc1 extends AbstractC3987dR0 {
    public C6102kw j;

    public C4880gc1(String str, String str2) {
        super(str, str2);
        this.j = new C6102kw();
    }

    public final /* synthetic */ Boolean C() {
        return Boolean.valueOf(this.a == 0);
    }

    public void D(int i, boolean z, float[] fArr) {
        GLES20.glUniformMatrix4fv(i, 1, z, fArr, 0);
    }

    public void E(String str, boolean z, float[] fArr) {
        D(l(str), z, fArr);
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.j.a(new KQ() { // from class: com.daaw.fc1
            @Override // com.daaw.KQ
            public final Object a() {
                return this.a.C();
            }
        });
    }
}
