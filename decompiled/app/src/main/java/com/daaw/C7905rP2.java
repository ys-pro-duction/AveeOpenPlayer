package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.rP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7905rP2 extends AbstractC4259eP2 {
    public final Object B;
    public int C;
    public final /* synthetic */ C9586xP2 D;

    public C7905rP2(C9586xP2 c9586xP2, int i) {
        this.D = c9586xP2;
        Object[] objArr = c9586xP2.D;
        objArr.getClass();
        this.B = objArr[i];
        this.C = i;
    }

    public final void a() {
        int i = this.C;
        if (i != -1 && i < this.D.size()) {
            Object obj = this.B;
            C9586xP2 c9586xP2 = this.D;
            int i2 = this.C;
            Object[] objArr = c9586xP2.D;
            objArr.getClass();
            if (AbstractC3977dO2.a(obj, objArr[i2])) {
                return;
            }
        }
        this.C = this.D.u(this.B);
    }

    @Override // com.daaw.AbstractC4259eP2, java.util.Map.Entry
    public final Object getKey() {
        return this.B;
    }

    @Override // com.daaw.AbstractC4259eP2, java.util.Map.Entry
    public final Object getValue() {
        Map mapK = this.D.k();
        if (mapK != null) {
            return mapK.get(this.B);
        }
        a();
        int i = this.C;
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.D.E;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapK = this.D.k();
        if (mapK != null) {
            return mapK.put(this.B, obj);
        }
        a();
        int i = this.C;
        if (i == -1) {
            this.D.put(this.B, obj);
            return null;
        }
        Object[] objArr = this.D.E;
        objArr.getClass();
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
