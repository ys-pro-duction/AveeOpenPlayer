package com.daaw;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class MZ2 {
    public ArrayList a = new ArrayList();
    public JZ2 b = JZ2.b;
    public Integer c = null;

    public final MZ2 a(C10160zT2 c10160zT2, int i, String str, String str2) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new OZ2(c10160zT2, i, str, str2, null));
        return this;
    }

    public final MZ2 b(JZ2 jz2) {
        if (this.a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.b = jz2;
        return this;
    }

    public final MZ2 c(int i) {
        if (this.a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.c = Integer.valueOf(i);
        return this;
    }

    public final QZ2 d() throws GeneralSecurityException {
        if (this.a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int iA = ((OZ2) arrayList.get(i)).a();
                i++;
                if (iA == iIntValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        QZ2 qz2 = new QZ2(this.b, DesugarCollections.unmodifiableList(this.a), this.c, null);
        this.a = null;
        return qz2;
    }
}
