package com.daaw;

import com.daaw.X80;

/* JADX INFO: loaded from: classes3.dex */
public class V80 extends Z80 {
    public int e;

    public V80(Object obj, Object obj2, X80 x80, X80 x802) {
        super(obj, obj2, x80, x802);
        this.e = -1;
    }

    @Override // com.daaw.X80
    public boolean f() {
        return false;
    }

    @Override // com.daaw.Z80
    public Z80 k(Object obj, Object obj2, X80 x80, X80 x802) {
        if (obj == null) {
            obj = getKey();
        }
        if (obj2 == null) {
            obj2 = getValue();
        }
        if (x80 == null) {
            x80 = a();
        }
        if (x802 == null) {
            x802 = d();
        }
        return new V80(obj, obj2, x80, x802);
    }

    @Override // com.daaw.Z80
    public X80.a m() {
        return X80.a.BLACK;
    }

    @Override // com.daaw.X80
    public int size() {
        if (this.e == -1) {
            this.e = a().size() + 1 + d().size();
        }
        return this.e;
    }

    @Override // com.daaw.Z80
    public void t(X80 x80) {
        if (this.e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.t(x80);
    }
}
