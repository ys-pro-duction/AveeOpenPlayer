package com.daaw;

/* JADX INFO: renamed from: com.daaw.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4998h1 {
    public final String a;
    public final InterfaceC5390iR b;

    public C4998h1(String str, InterfaceC5390iR interfaceC5390iR) {
        this.a = str;
        this.b = interfaceC5390iR;
    }

    public final InterfaceC5390iR a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4998h1)) {
            return false;
        }
        C4998h1 c4998h1 = (C4998h1) obj;
        return G10.c(this.a, c4998h1.a) && G10.c(this.b, c4998h1.b);
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC5390iR interfaceC5390iR = this.b;
        return iHashCode + (interfaceC5390iR != null ? interfaceC5390iR.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
