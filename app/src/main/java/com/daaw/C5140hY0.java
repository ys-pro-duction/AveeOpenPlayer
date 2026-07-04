package com.daaw;

/* JADX INFO: renamed from: com.daaw.hY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5140hY0 implements InterfaceC4484fC0 {
    public final String a;

    public C5140hY0(String str) {
        G10.g(str, "value");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5140hY0) && G10.c(this.a, ((C5140hY0) obj).a);
    }

    @Override // com.daaw.InterfaceC4484fC0
    public String getValue() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return getValue();
    }
}
