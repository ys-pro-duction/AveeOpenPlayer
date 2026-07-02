package com.daaw;

import com.daaw.B60;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.im0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5486im0 extends C9937yg0 implements Map.Entry, B60.a {
    public final C2588Vt0 D;
    public Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5486im0(C2588Vt0 c2588Vt0, Object obj, Object obj2) {
        super(obj, obj2);
        G10.g(c2588Vt0, "parentIterator");
        this.D = c2588Vt0;
        this.E = obj2;
    }

    public void b(Object obj) {
        this.E = obj;
    }

    @Override // com.daaw.C9937yg0, java.util.Map.Entry
    public Object getValue() {
        return this.E;
    }

    @Override // com.daaw.C9937yg0, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        b(obj);
        this.D.d(getKey(), obj);
        return value;
    }
}
