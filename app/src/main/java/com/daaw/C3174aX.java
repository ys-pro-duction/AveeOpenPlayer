package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.aX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3174aX {
    public String a;
    public ArrayList b = new ArrayList();

    public C3174aX(String str) {
        this.a = str;
    }

    public void a(ZW zw) {
        this.b.add(zw);
    }

    public void b() {
        this.b.clear();
    }

    public List c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3174aX c3174aX = (C3174aX) obj;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            if (c3174aX.b != null) {
                return false;
            }
        } else if (!arrayList.equals(c3174aX.b)) {
            return false;
        }
        String str = this.a;
        if (str == null) {
            if (c3174aX.a != null) {
                return false;
            }
        } else if (!str.equals(c3174aX.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        ArrayList arrayList = this.b;
        int iHashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return this.a + ": " + this.b.size();
    }
}
