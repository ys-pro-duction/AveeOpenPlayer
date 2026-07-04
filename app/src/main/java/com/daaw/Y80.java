package com.daaw;

import com.daaw.X80;

/* JADX INFO: loaded from: classes3.dex */
public class Y80 extends Z80 {
    public Y80(Object obj, Object obj2) {
        super(obj, obj2, W80.i(), W80.i());
    }

    @Override // com.daaw.X80
    public boolean f() {
        return true;
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
        return new Y80(obj, obj2, x80, x802);
    }

    @Override // com.daaw.Z80
    public X80.a m() {
        return X80.a.RED;
    }

    @Override // com.daaw.X80
    public int size() {
        return a().size() + 1 + d().size();
    }

    public Y80(Object obj, Object obj2, X80 x80, X80 x802) {
        super(obj, obj2, x80, x802);
    }
}
