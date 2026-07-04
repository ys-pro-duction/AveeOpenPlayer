package com.daaw;

import android.database.Cursor;

/* JADX INFO: renamed from: com.daaw.ez0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4421ez0 implements InterfaceC4142dz0 {
    public final QJ0 a;
    public final WG b;

    /* JADX INFO: renamed from: com.daaw.ez0$a */
    public class a extends WG {
        public a(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // com.daaw.WG
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(NZ0 nz0, C3864cz0 c3864cz0) {
            String str = c3864cz0.a;
            if (str == null) {
                nz0.z0(1);
            } else {
                nz0.w(1, str);
            }
            Long l = c3864cz0.b;
            if (l == null) {
                nz0.z0(2);
            } else {
                nz0.S(2, l.longValue());
            }
        }
    }

    public C4421ez0(QJ0 qj0) {
        this.a = qj0;
        this.b = new a(qj0);
    }

    @Override // com.daaw.InterfaceC4142dz0
    public void a(C3864cz0 c3864cz0) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(c3864cz0);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.InterfaceC4142dz0
    public Long b(String str) {
        TJ0 tj0D = TJ0.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        Long lValueOf = null;
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }
}
