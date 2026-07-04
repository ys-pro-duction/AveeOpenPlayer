package com.daaw;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class I33 extends EP2 {
    public final Map B;

    public I33(Map map) {
        this.B = map;
    }

    @Override // com.daaw.FP2
    public final /* synthetic */ Object c() {
        return this.B;
    }

    @Override // com.daaw.EP2, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.l(obj);
    }

    @Override // com.daaw.EP2, java.util.Map
    public final Set entrySet() {
        return QQ2.b(this.B.entrySet(), new InterfaceC5661jO2() { // from class: com.daaw.A23
            @Override // com.daaw.InterfaceC5661jO2
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.m(obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.B.get(obj);
    }

    @Override // com.daaw.EP2
    public final Map h() {
        return this.B;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.k();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.B.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return QQ2.b(this.B.keySet(), new InterfaceC5661jO2() { // from class: com.daaw.e33
            @Override // com.daaw.InterfaceC5661jO2
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.daaw.EP2, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
