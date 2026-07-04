package com.daaw;

/* JADX INFO: renamed from: com.daaw.cX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3732cX0 implements InterfaceC6258lW0 {
    public final Object B;

    public C3732cX0(Object obj) {
        this.B = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3732cX0) && G10.c(getValue(), ((C3732cX0) obj).getValue());
    }

    @Override // com.daaw.InterfaceC6258lW0
    public Object getValue() {
        return this.B;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}
