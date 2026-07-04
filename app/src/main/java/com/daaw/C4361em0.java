package com.daaw;

/* JADX INFO: renamed from: com.daaw.em0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4361em0 {
    public int a;

    public C4361em0(int i) {
        this.a = i;
    }

    public void a() {
        this.a++;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((C4361em0) obj).a;
    }

    public int hashCode() {
        return 31 + this.a;
    }
}
