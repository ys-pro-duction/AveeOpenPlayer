package com.daaw;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Zo3 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public Zo3(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == Zo3.class) {
            Zo3 zo3 = (Zo3) obj;
            if (TextUtils.equals(this.a, zo3.a) && this.b == zo3.b && this.c == zo3.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true != this.c ? 1237 : 1231);
    }
}
